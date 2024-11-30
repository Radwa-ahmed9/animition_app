package com.example.animition_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter  extends ArrayAdapter<String> {

    private final Context context;
    private final String[] quotes;
    private final int[] images;

    public ListViewAdapter(Context context, String[] quotes, int[] images) {
        super(context, R.layout.fragment_list_view, quotes);
        this.context = context;
        this.quotes = quotes;
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.fragment_list_view, null, true);

        TextView quoteTextView = rowView.findViewById(R.id.detail_quote);
        ImageView imageView = rowView.findViewById(R.id.detail_image);

        quoteTextView.setText(quotes[position]);
        imageView.setImageResource(images[position]);

        return rowView;
    }
}