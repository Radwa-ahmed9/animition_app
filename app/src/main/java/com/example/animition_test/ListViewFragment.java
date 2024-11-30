package com.example.animition_test;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.widget.AdapterView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListViewFragment extends Fragment {

    private String[] quotes = {
            "Don’t watch the clock; do what it does. Keep going.",
            "Dream big and dare to fail.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Your only limit is your mind.",
            "Success is not the key to happiness. Happiness is the key to success.",
            "You don’t have to be great to start, but you have to start to be great.",
            "Challenges are what make life interesting. Overcoming them is what makes life meaningful.",
            "You are never too old to set another goal or to dream a new dream.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "It always seems impossible until it’s done."
    };

    private int[] images = {
            R.drawable.edward,
            R.drawable.blogroll,
            R.drawable.goku,
            R.drawable.light,
            R.drawable.mikasa,
            R.drawable.monkey,
            R.drawable.naruto,
            R.drawable.sailor,
            R.drawable.animmmi,
            R.drawable.anime,
    };

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);

        // Set up the ListView and its adapter
        ListView listView = view.findViewById(R.id.listView) ;
        ListViewAdapter adapter = new ListViewAdapter(getContext(), quotes, images);
        listView.setAdapter(adapter);

        // Handle ListView item clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("quote", quotes[position]);
                intent.putExtra("image", images[position]);
                startActivity(intent);
            }
        });

        // Set up the "Join Us" button and its click event
//        Button joinUsButton = view.findViewById(R.id.join_us_button);
//        joinUsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), .class);
//                startActivity(intent);
//            }
//        });

        return view;
    }
}
