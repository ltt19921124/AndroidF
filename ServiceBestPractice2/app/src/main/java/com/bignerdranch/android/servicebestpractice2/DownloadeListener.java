package com.bignerdranch.android.servicebestpractice2;

/**
 * Created by ltt19 on 2017/11/27.
 */

public interface DownloadeListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCancled();

}
