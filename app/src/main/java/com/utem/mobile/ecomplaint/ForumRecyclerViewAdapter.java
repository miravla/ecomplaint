package com.utem.mobile.ecomplaint;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utem.mobile.ecomplaint.model.Complaint;

import java.util.ArrayList;
import java.util.List;

public class ForumRecyclerViewAdapter extends RecyclerView.Adapter <ForumViewHolder>{

    private final LayoutInflater layoutInflater;
    private List<Complaint> complaint;

    public ForumRecyclerViewAdapter (Context context){
        layoutInflater = LayoutInflater.from(context);
    }

    // get data from activity
    public void setComplaint (List<Complaint> complaint){
        this.complaint =complaint;
        notifyDataSetChanged();
    }

    // create new viewholder object
    @NonNull
    @Override
    public ForumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ForumViewHolder(layoutInflater.inflate(R.layout.activity_forum_row, parent,false ));
    }

    @Override
    // insert data into viewholder
    public void onBindViewHolder(@NonNull ForumViewHolder holder, int position) {
        if (complaint!=null)
            holder.setComplaint(complaint.indexOf());

    }

    @Override
    public int getItemCount()
    {
        return complaint == null? 0 : complaint.size();
    }




}


