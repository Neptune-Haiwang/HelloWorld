package com.example.helloworld.gridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context mContext){
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHodler{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHodler hodler = null;
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_grid_item, null);
            hodler = new ViewHodler();
            hodler.imageView = view.findViewById(R.id.iv_grid);
            hodler.textView = view.findViewById(R.id.tv_title);
            view.setTag(hodler);
        }else{
            hodler = (ViewHodler) view.getTag();
        }
        //赋值
        hodler.textView.setText("花");
        Glide.with(mContext).load("https://pic4.zhimg.com/50/v2-131886257b1b9c4042e6b42a05dacb6f_hd.jpg").into(hodler.imageView);

        return view;
    }
}
