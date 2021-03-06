package com.meizu.code.app.test;

import android.view.View;

import com.meizu.code.frame.base.annotations.RequireBeamView;
import com.meizu.code.frame.base.frame.mvp.BaseMvpActivity;

/**
 * 测试Activity
 * <p>
 * Created by mxm on 12/11/17.
 */
@RequireBeamView(TestView.class)
public class TestActicity extends BaseMvpActivity<TestView> {

    @Override
    protected TestView createBeamView() {
        return new TestView();
    }
}
