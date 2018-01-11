package rxjava.bwei.com.myduan;

import io.reactivex.Flowable;
import okhttp3.MultipartBody;

/**
 * Created by Zhijun on 2018/1/11.
 */

public class NewModel {
    private NewsPresenter presenter;

    public NewModel(NewsPresenter presenter) {
        this.presenter = presenter;
    }
    public void getData(String uid , MultipartBody.Part file){
        Flowable<MessageBean> flowable = RetrofitUtils.getInstance().getService().getMusicList(uid, file);
        presenter.getNews(flowable);
    }
}
