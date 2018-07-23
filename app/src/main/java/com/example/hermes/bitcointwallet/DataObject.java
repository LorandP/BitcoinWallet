package com.example.hermes.bitcointwallet;

/**
 * Created by Hermes on 26/05/2017.
 *
 * This class is used to hold the data tipes that will be used to set the data to the views in the list.
 */

public class DataObject {
    private String mTime;
    private String mValue;
    private String mHashString;
    private String mNotes;
    private String mDots;
    private String mDotsGreen;
    private String mValueRed;

    public String getmDotsGreen() {
        return mDotsGreen;
    }

    public void setmDotsGreen(String mDotsGreen) {
        this.mDotsGreen = mDotsGreen;
    }

    public String getmValueRed() {
        return mValueRed;
    }

    public void setmValueRed(String mValueRed) {
        this.mValueRed = mValueRed;
    }

    public String getmDots() {
        return mDots;
    }

    public void setmDots(String mDots) {
        this.mDots = mDots;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmValue() {
        return mValue;
    }

    public void setmValue(String mValue) {
        this.mValue = mValue;
    }

    public String getmHashString() {
        return mHashString;
    }

    public void setmHashString(String mHashString) {
        this.mHashString = mHashString;
    }

    public String getmNotes() {
        return mNotes;
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }
}
