package com.example.hermes.bitcointwallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hermes on 26/05/2017.
 *
 * This class implements the view holder pattern
 */

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ArrayList<DataObject> mDataObjectArray;
    private int mLayoutId;

    public CustomAdapter(Context mContext, int mLayoutId, ArrayList<DataObject> mDataObjectArray) {
        this.mContext = mContext;
        this.mDataObjectArray = mDataObjectArray;
        this.mLayoutId = mLayoutId;
    }

    @Override
    public int getCount() {
        return mDataObjectArray.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataObjectArray.indexOf(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder mViewHolder = null;

        if (convertView == null){
            mLayoutInflater = LayoutInflater.from(mContext);
            mViewHolder = new ViewHolder();
            convertView = mLayoutInflater.inflate(R.layout.items_for_list, null, false);
            mViewHolder.mTime = (TextView)convertView.findViewById(R.id.time_tv);
            mViewHolder.mHashString = (TextView)convertView.findViewById(R.id.hashString_tv);
            mViewHolder.mBTCValue = (TextView)convertView.findViewById(R.id.BTCvalue_tv);
            mViewHolder.mBTCValueRed = (TextView)convertView.findViewById(R.id.BTCvalue_tv_rosu);
            mViewHolder.mNote = (TextView)convertView.findViewById(R.id.note_tv);
            mViewHolder.mVerticalLine = (ImageView)convertView.findViewById(R.id.verticalLine_tv);
            mViewHolder.mDots = (TextView)convertView.findViewById(R.id.stars_tv);
            mViewHolder.mDotsGreen = (TextView)convertView.findViewById(R.id.stars_tv_green);

            convertView.setBackground(mContext.getDrawable(R.drawable.rounded_list_corners));
            convertView.setPadding(40,30,30,0);

            convertView.setTag(mViewHolder);
        }
        else
            mViewHolder = (ViewHolder)convertView.getTag();

        DataObject dataToObject = mDataObjectArray.get(position);
        mViewHolder.mTime.setText(dataToObject.getmTime());
        mViewHolder.mHashString.setText(dataToObject.getmHashString());
        mViewHolder.mNote.setText(dataToObject.getmNotes());
        mViewHolder.mBTCValue.setText(dataToObject.getmValue());
        mViewHolder.mBTCValueRed.setText(dataToObject.getmValueRed());
        mViewHolder.mDotsGreen.setText(dataToObject.getmDotsGreen());

        if (dataToObject.getmNotes() == null || dataToObject.getmNotes().equals("")) {
            mViewHolder.mNote.setVisibility(View.GONE);
            mViewHolder.mHashString.setPadding(0,50,0,0);
        }
        else {
            mViewHolder.mNote.setVisibility(View.VISIBLE);
            mViewHolder.mHashString.setPadding(0,0,0,0);

        }

        return convertView;
    }
}
