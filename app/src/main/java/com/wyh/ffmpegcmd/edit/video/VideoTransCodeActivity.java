package com.wyh.ffmpegcmd.edit.video;

import android.view.Menu;

import com.wyh.ffmpegcmd.edit.EditMediaListActivity;

/**
 * Created by wyh on 2019/3/20.
 */
public class VideoTransCodeActivity extends EditMediaListActivity {

    public static final String TITLE = "视频转码";


    @Override
    protected String getEditTitle() {
        return TITLE;
    }

    @Override
    protected void createOptionsMenu(Menu menu) {
        menu.add("选择视频");
        menu.add("删除");
        menu.add("开始");
    }

    @Override
    protected void onMenuClick(int order) {

    }
}
