package te.app.evidence.connection;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import te.app.evidence.model.base.Mutable;
import te.app.evidence.model.base.StatusMessage;
import te.app.evidence.utils.Constants;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;


@Singleton
public class ConnectionHelper {
    @Inject
    public Api api;

    public MutableLiveData<Mutable> liveData;

    public Gson gson;


    @Inject
    public ConnectionHelper(Api api) {
        this.api = api;
    }

    @Inject
    public void init() {
        gson = new Gson();
    }


    public Disposable requestApi(String url, final Object requestData,
                                 final List<FileObject> fileObjects, final Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Map<String, String> map = getParameters(requestData);
        Flowable<JsonObject> call = null;
        MultipartBody.Part file;
        if (fileObjects != null && fileObjects.size() > 0) {
            List<MultipartBody.Part> images = new ArrayList<>();
            for (FileObject fileObject : fileObjects) {
                File myFile = fileObject.getFile();
                RequestBody mFile;
                if (fileObject.getFileType() == Constants.FILE_TYPE_IMAGE) {
                    mFile = RequestBody.create(MediaType.parse("image/*"), myFile);
                } else {
                    mFile = RequestBody.create(MediaType.parse("video/*"), myFile);
                }
                file = MultipartBody.Part.createFormData(fileObject.getParamName(), myFile.getName(), mFile);
                images.add(file);
                call = api.post(url, map, images);
            }
        } else {
            call = api.post(url, map);
        }
        if (showProgress) {
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }
        return Objects.requireNonNull(call).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        String jsonString = gson.toJson(response);
                        StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                        try {
                            if (statusMessage.code == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.code == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else
                                liveData.setValue(new Mutable(Constants.ERROR, statusMessage.mMessage));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        t.printStackTrace();
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });
    }

    public Disposable requestApi(int method, String url, Object requestData, Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Flowable<JsonObject> call;
        Map<String, String> map = getParameters(requestData);
        if (method == Constants.POST_REQUEST) {
            call = api.post(url, requestData);
        } else if (method == Constants.GET_REQUEST) {
            call = api.get(url, map);
        } else if (method == Constants.DELETE_REQUEST) {
            call = api.delete(url, map);
        } else
            call = api.get(url, map);
        if (showProgress) {
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }

        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        String jsonString = gson.toJson(response);
                        try {
                            StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                            if (statusMessage.code == Constants.RESPONSE_SUCCESS || statusMessage.codes == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.code == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else if (statusMessage.code == Constants.RESPONSE_404)
                                liveData.setValue(new Mutable(Constants.ERROR_NOT_FOUND, statusMessage.mMessage));
                            else if (statusMessage.code == Constants.RESPONSE_NOT_VERIFIED)
                                liveData.setValue(new Mutable(Constants.NOT_VERIFIED, statusMessage.mMessage));
                            else if (statusMessage.code == Constants.PAYMENT_REQUIRED_CODE) {
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            } else
                                liveData.setValue(new Mutable(Constants.ERROR, statusMessage.mMessage));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });

    }

    private void hideProgress(boolean showProgress) {
        if (showProgress)
            liveData.setValue(new Mutable(Constants.HIDE_PROGRESS));
    }


    private Map<String, String> getParameters(final Object requestData) {
        Map<String, String> params = new HashMap<>();
        try {
            JSONObject jsonObject = new JSONObject(gson.toJson(requestData));
            for (int i = 0; i < Objects.requireNonNull(jsonObject.names()).length(); i++) {
                if (jsonObject.get(Objects.requireNonNull(jsonObject.names()).getString(i)) instanceof JSONArray) {
                    JSONArray jsonArray = (JSONArray) jsonObject.get(Objects.requireNonNull(jsonObject.names()).getString(i));
                    for (int j = 0; j < jsonArray.length(); j++) {
                        {
                            String name = Objects.requireNonNull(jsonObject.names()).getString(i) + "[" + j + "]";
                            params.put(name, jsonArray.get(j) + "");
                        }
                    }
                } else
                    params.put(Objects.requireNonNull(jsonObject.names()).getString(i), jsonObject.get(Objects.requireNonNull(jsonObject.names()).getString(i)) + "");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return params;
    }

}
