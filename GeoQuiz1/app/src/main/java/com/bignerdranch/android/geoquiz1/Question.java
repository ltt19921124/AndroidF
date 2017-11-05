package com.bignerdranch.android.geoquiz1;

/**
 * Created by ltt19 on 2017/10/20.
 */

public class Question {


    private int mTextResid;
    private boolean mAnswerTrue;

    public Question(int textResid, boolean answerTrue) {
        mTextResid = textResid;
        mAnswerTrue = answerTrue;
    }

    public int getTextResid() {
        return mTextResid;
    }

    public void setTextResid(int textResid) {
        mTextResid = textResid;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
