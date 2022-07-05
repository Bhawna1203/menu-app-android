package com.example.menucardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MenuData[] menuData = new MenuData[]{
                new MenuData("Margherita Pizza", "A hugely popular margherita, with a deliciously tangy single cheese topping.", "Rs. 129", R.drawable.margherit),
                new MenuData("Double Cheese Margherita Pizza", "The ever-popular Margherita loaded with extra cheese.", "Rs. 239", R.drawable.doublecheesemargherita),
                new MenuData("Farm House Pizza", "A pizza that goes ballistic on veggies! Overloaded with crunchy, crisp capsicum, succulent mushrooms and fresh tomatoes.", "Rs. 399", R.drawable.farmhouse),
                new MenuData("Peppy Paneer Pizza", "Chunky paneer with crisp capsicum and spicy red pepper.", "Rs. 479", R.drawable.peppypaneer),
                new MenuData("Mexican Green Wave Pizza", "Loaded with crunchy onions, crisp capsicum, juicy tomatoes and jalapeno with exotic Mexican herbs.", "Rs. 629", R.drawable.mexicangreenwave),
                new MenuData("Veg Extravaganza Pizza", "Overloaded with corn, black olives, onions, capsicum, mushrooms, tomatoes, jalapeno and extra cheese.", "Rs. 799", R.drawable.vegextravaganz),
                new MenuData("Indi Tandoori Pizza", "It is hot. It is spicy. It is oh-so-Indian. Tandoori paneer with capsicum, red paprika, mint & mayo.", "Rs. 900", R.drawable.indiantandooripaneer)
        };
        MenuCardAdaptor menuCardAdaptor = new MenuCardAdaptor(menuData,MainActivity.this);
        recyclerView.setAdapter(menuCardAdaptor);
    }
}