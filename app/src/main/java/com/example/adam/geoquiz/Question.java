package com.example.adam.geoquiz;

/**
 * Created by Adam on 9/23/2015.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;


    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    //public void setUserCheat(boolean cheaterQuestion){mUserCheat = cheaterQuestion;}

    //public boolean isCheater() {return mUserCheat;}
}
