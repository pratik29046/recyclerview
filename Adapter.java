package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList){
        this.userList=userList;
    }

    @NonNull
    @NotNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter.ViewHolder h, int position) {
        int img =userList.get(position).getImg();
        String name=userList.get(position).getName();

        h.setData(img,name);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView n1;
        private ImageView i1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            n1 = itemView.findViewById(R.id.text1);
            i1 =itemView.findViewById(R.id.img);

        }

        public void setData(int img, String name) {
            i1.setImageResource(img);
            n1.setText(name);


        }
    }
}
