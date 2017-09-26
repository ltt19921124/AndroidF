package com.bignerdranch.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ltt19 on 2017/9/25.
 */

public class SoundViewModel extends BaseObservable{
    private Sound mSound;

    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox mBeatBox) {
        this.mBeatBox = mBeatBox;
    }

    public Sound getmSound() {
        return mSound;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void setmSound(Sound mSound) {
        this.mSound = mSound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
