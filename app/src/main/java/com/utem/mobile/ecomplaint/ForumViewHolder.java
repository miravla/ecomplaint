package com.utem.mobile.ecomplaint;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utem.mobile.ecomplaint.model.Complaint;

public class ForumViewHolder extends RecyclerView.ViewHolder {

    private final TextView id, time;

    public ForumViewHolder(@NonNull View itemView) {
        super(itemView);
        id=itemView.findViewById(R.id.id);
        time =itemView.findViewById(R.id.time);
    }

    public void setComplaint (Complaint complaint){
        id.setText(complaint.getComplaintID());
        time.setText(complaint.getComplaintDateTime());

    }
}