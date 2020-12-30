package com.example.myrecycleritems;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonListAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private ArrayList<Person> people = new ArrayList<>();

    public PersonListAdapter(ArrayList<Person> people) {
        this.people = people;
    }

    public PersonListAdapter(){
    }

    public void setListPeople(ArrayList<Person> people){
        this.people = people;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        if (position == 0){
            holder.textView.setTextColor(holder.itemView.getResources().getColor(R.color.purple_200));
        }else{
            holder.textView.setTextColor(holder.itemView.getResources().getColor(R.color.white));

        }
        holder.textView.setText(people.get(position).fullName);
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        Log.d("MyApp", "Binding the ViewHolder on Position: "+ position);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
