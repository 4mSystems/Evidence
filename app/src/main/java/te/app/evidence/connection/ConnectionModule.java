package te.app.evidence.connection;

import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.session.LanguagesHelper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;



@Module
public class ConnectionModule {

    private Retrofit retrofit = null;

    @Singleton
    @Provides
    public Api webService() {
        if (retrofit == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(120, TimeUnit.SECONDS);
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            okHttpClientBuilder.addInterceptor(logging);
            okHttpClientBuilder.addInterceptor(chain -> {
                Request request = chain.request();
                Request.Builder newRequest = request.newBuilder();
                if (LanguagesHelper.getJwt() != null) {
                    newRequest.header("api_token", LanguagesHelper.getJwt());
                }
                newRequest.addHeader("lang", LanguagesHelper.getCurrentLanguage());
                return chain.proceed(newRequest.build());
            });

            retrofit = new Retrofit.Builder()
                    .baseUrl(URLS.BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClientBuilder.build())
                    .build();
        }
        return retrofit.create(Api.class);
    }
}
