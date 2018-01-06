package text.bwei.com.gowuche180106.model;

import java.util.List;

import io.reactivex.Flowable;
import text.bwei.com.gowuche180106.bean.DatasBean;
import text.bwei.com.gowuche180106.bean.MessageBean;
import text.bwei.com.gowuche180106.presenter.NewsPresenter;
import text.bwei.com.gowuche180106.utils.RetrofitUtils;


public class NewsModel implements IModel {
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter){
        this.presenter = (NewsPresenter) presenter;

    }
    @Override
    public void getData(String uid,String pid) {
        Flowable<MessageBean<List<DatasBean>>> flowable = RetrofitUtils.getInstance().getApiService().getDatas(uid);
        presenter.getNews(flowable);

    }
}