package com.abhayjeet.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import com.CustomAdapter;

public class MainActivity extends AppCompatActivity {
//    ArrayList name= new ArrayList<>(Arrays.asList("name1","name2","name3","name4"));
//    ArrayList image= new ArrayList<>(Arrays.asList(R.drawable.music1,R.drawable.music1,R.drawable.music1));
//     RecyclerView r;

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.review);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
//        r.setLayoutManager(linearLayoutManager);
//
//        show();
        data();
        init();



    }

//    public void show(){
//        CustomAdapter s = new CustomAdapter(MainActivity.this, name,image);
//        r.setAdapter(s);
//    }

    private void init(){
        recyclerView=findViewById(R.id.review);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);

    }
    private void data(){
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.music1,"rohit"));
    }
}