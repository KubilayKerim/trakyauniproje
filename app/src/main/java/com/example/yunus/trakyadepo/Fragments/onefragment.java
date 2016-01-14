package com.example.yunus.trakyadepo.Fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yunus.trakyadepo.Adapter.RecyclerAdapter;
import com.example.yunus.trakyadepo.R;

import java.util.ArrayList;

import butterknife.Bind;

/**
 * Created by yunus on 11.01.2016.
 */
public class onefragment extends Fragment {
    private View view;
    private ImageView image;
    private String title;//String for tab title

    private static RecyclerView recyclerView;

    public onefragment() {
        image.setImageResource(R.drawable.trakya);
    }

    public onefragment(String title) {
        this.title = title;//Setting tab title
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.onefragment, container, false);

        setRecyclerView();
        return view;

    }
    //Setting recycler view
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items


        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(title+" Items " + i);//Adding items to recycler view
        }
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview

    }
}