package com.bignerdranch.android.geoquiz;

/**
 *
 * Created by lenovo on 2017/7/16.
 *
 */

public class Question {

    private int mTextResId;
    private boolean mAnswertrue;
    
    public Question(int textResId, boolean answertrue) {
        mTextResId = textResId;
        mAnswertrue = answertrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswertrue() {
        return mAnswertrue;
    }

    public void setAnswertrue(boolean answertrue) {
        mAnswertrue = answertrue;
    }
}
