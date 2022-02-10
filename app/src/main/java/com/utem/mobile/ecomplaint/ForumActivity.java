package com.utem.mobile.ecomplaint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Filterable;
import android.widget.Toast;

import com.utem.mobile.ecomplaint.model.Complaint;

import java.util.ArrayList;
import java.util.List;

public class ForumActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    // vars    private ArrayList<Complaint> mNotes = new ArrayList<>();
    private ForumRecyclerViewAdapter mNoteRecyclerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        mRecyclerView = findViewById(R.id.forum);


        initRecyclerView();



    }




    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
               new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(mRecyclerView);
        mNoteRecyclerAdapter = new ForumRecyclerViewAdapter( this);
        mRecyclerView.setAdapter(mNoteRecyclerAdapter);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ForumDetailActivity.class);
        startActivity(intent);
    }


    ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

        }

    };
}
