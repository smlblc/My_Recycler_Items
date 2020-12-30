package com.example.myrecycleritems;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {


    public TextView textView;
    public ImageView imageView;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_person_name);
        imageView = itemView.findViewById(R.id.image_person);
    }



}
