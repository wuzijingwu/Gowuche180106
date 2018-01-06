package text.bwei.com.gowuche180106.model;

import io.reactivex.Flowable;
import text.bwei.com.gowuche180106.presenter.DelPresenter;
import text.bwei.com.gowuche180106.bean.MessageBean;
import text.bwei.com.gowuche180106.utils.RetrofitUtils;



public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}