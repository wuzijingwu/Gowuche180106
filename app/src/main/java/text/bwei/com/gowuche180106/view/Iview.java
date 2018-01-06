package text.bwei.com.gowuche180106.view;

import text.bwei.com.gowuche180106.bean.MessageBean;


public interface Iview {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}
