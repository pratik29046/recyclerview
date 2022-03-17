package com.example.recycleview;

import  androidx.appcompat.app.AppCompatActivity;
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
//        show();



        data();
        adp();
    }

//    public void show(){
//        CustomAdapter s = new CustomAdapter(MainActivity.this, name,image);
//        r.setAdapter(s);
//    }
    public void adp(){
        recyclerView=findViewById(R.id.review);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);

    }
   public void data(){
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.music1,"Aaj Se Teri"));
        userList.add(new ModelClass(R.drawable.music1,"Tere Mere"));
        userList.add(new ModelClass(R.drawable.music1,"Main Tere Kabil Hoon"));
        userList.add(new ModelClass(R.drawable.music1,"Enna Sona"));
        userList.add(new ModelClass(R.drawable.music1,"Humsafar"));
        userList.add(new ModelClass(R.drawable.music1,"Lambiyaan Si Judaiyan"));
        userList.add(new ModelClass(R.drawable.music1,"Ban Ja Rani"));
        userList.add(new ModelClass(R.drawable.music1,"Nazm Nazm"));
        userList.add(new ModelClass(R.drawable.music1,"Aa Jao Meri Tamanna"));
        userList.add(new ModelClass(R.drawable.music1,"Aaj Din Chadheya"));

    }
}