package com.example.yunus.trakyadepo.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yunus.trakyadepo.R;

import java.util.ArrayList;

/**
 * Created by yunus on 14.01.2016.
 */
public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<String> arrayList;
    private Context context;
    ImageView View;

    public RecyclerAdapter(Context context,
                                ArrayList<String> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }


    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder,
                                 int position) {


        final RecyclerViewHolder mainHolder = (RecyclerViewHolder) holder;
        //Setting text over textview
        mainHolder.title.setText(arrayList.get(position));
        mainHolder.image.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(
            ViewGroup viewGroup, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.list, viewGroup, false);
        RecyclerViewHolder mainHolder = new RecyclerViewHolder(mainGroup) {
            @Override
            public String toString() {
                return super.toString();
            }
        };


        return mainHolder;

    }
}