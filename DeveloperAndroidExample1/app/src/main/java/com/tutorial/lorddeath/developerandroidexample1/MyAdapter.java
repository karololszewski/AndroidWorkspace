package com.tutorial.lorddeath.developerandroidexample1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by k.olszewski on 2016-07-05.
 */
public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, ArrayList<String> values) {
        super(context, R.layout.row_layout1, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());

        View theView = inflater.inflate(R.layout.row_layout1, parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(tvShow);

        ImageView imageView = (ImageView) theView.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.dot);

        return theView;
    }
}
