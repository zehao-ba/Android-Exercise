package com.example.zehao.timer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by zehao on 9/28/2017.
 */

public class CustomGridAdapter extends BaseAdapter {

    private Context contxt;
    private String[] items;
    LayoutInflater inflater;

    public CustomGridAdapter(Context contxt, String[] items){
        this.contxt = contxt;
        this.items = items;
        inflater = (LayoutInflater) this.contxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // get the number of sub view
    @Override
    public int getCount() {
        return items.length;
    }

    // get the position of sub view
    @Override
    public Object getItem(int i) {
        return null;
    }

    // get the item id, which is decided by item
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    //getView: get a view that displays the data at the specific position in the data set
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = inflater.inflate(R.layout.cell,null);
        }
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(items[i]);
        return view;
    }
}
