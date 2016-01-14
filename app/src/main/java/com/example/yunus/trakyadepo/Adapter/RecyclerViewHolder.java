package com.example.yunus.trakyadepo.Adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yunus.trakyadepo.R;

/**
 * Created by yunus on 14.01.2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    ImageView image;
    public RecyclerViewHolder(View itemView) {
        super(itemView);

        this.title = (TextView) itemView.findViewById(R.id.person_name);
        this.image = (ImageView) itemView.findViewById(R.id.person_photo);

    }
}