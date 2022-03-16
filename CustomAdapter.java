package com.abhayjeet.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter{
    ArrayList names;
    ArrayList images;
    Context context;
    public CustomAdapter(Context context, ArrayList name, ArrayList image) {
        this.context = context;
        this.names = name;
        this.images = image;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }


   @Override
    public void onBindViewHolder(RecyclerView.ViewHolder h, final int position) {
//        h.n1.setText(names.get(position));
//        h.i1.setImageResource( images.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView n1;
        ImageView i1;
        public MyViewHolder(View itemView) {
            super(itemView);
            n1 = itemView.findViewById(R.id.text1);
            i1 =itemView.findViewById(R.id.img);
        }
    }
}

