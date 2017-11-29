package com.bignerdranch.android.servicebestpractice2;

import android.os.AsyncTask;

/**
 * Created by ltt19 on 2017/11/27.
 */

public class DownloadeTask extends AsyncTask<String,Integer,Integer> {
    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCLED = 3;

    private DownloadeListener listener;

    @Override
    protected Integer doInBackground(String... strings) {

        

        return null;
    }
}
