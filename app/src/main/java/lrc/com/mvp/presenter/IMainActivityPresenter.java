package lrc.com.mvp.presenter;

import android.content.Context;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.List;

/**
 * Created by LRC on 2017/7/19.
 */

public interface IMainActivityPresenter {
    void submitData(Context context , List<EditText> editList, ProgressBar progressBar);
    void initData(List<EditText> editList);
}
