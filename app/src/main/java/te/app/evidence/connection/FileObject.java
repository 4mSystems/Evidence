package te.app.evidence.connection;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import te.app.evidence.utils.Constants;

public class FileObject implements Serializable {
    private String filePath = "", paramName;
    private int fileType;
    Uri uri;
    private File file;
    Bitmap bitmap;

    public FileObject(String paramName, String filePath, int fileType) {
        this.paramName = paramName;
        this.filePath = filePath;
        this.fileType = fileType;
        this.file = new File(filePath);
        compressImage();
    }

    public FileObject() {
    }

    public Bitmap getResizedBitmap(File file) {
        int maxSize = 400;
        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
        Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), bmOptions);

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        float bitmapRatio = (float) width / (float) height;
        if (bitmapRatio > 1) {
            width = maxSize;
            height = (int) (width / bitmapRatio);
        } else {
            height = maxSize;
            width = (int) (height * bitmapRatio);
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    public void compressImage() {
        if (fileType == Constants.FILE_TYPE_IMAGE) {
            File imageFile = new File(getFilePath());
            Bitmap bitmap = getResizedBitmap(imageFile);
            setBitmap(bitmap);
            OutputStream os;
            try {
                os = new FileOutputStream(imageFile);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, os);
                os.flush();
                os.close();
            } catch (Exception e) {
                Log.e("err_compress_image", e.getMessage());
            }
            setFilePath(imageFile.getAbsolutePath());
            setFile(imageFile);
            setBitmap(bitmap);
        }
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }


    public int getFileType() {
        return fileType;
    }

    public String getParamName() {
        return paramName;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}
