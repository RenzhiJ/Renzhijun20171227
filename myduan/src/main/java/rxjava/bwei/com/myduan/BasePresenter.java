package rxjava.bwei.com.myduan;

import okhttp3.MultipartBody;

/**
 * Created by Zhijun on 2018/1/11.
 */

public interface BasePresenter {
    void getData(String uid, MultipartBody.Part file);

}
