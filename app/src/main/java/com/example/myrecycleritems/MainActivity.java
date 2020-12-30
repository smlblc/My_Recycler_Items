package com.example.myrecycleritems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        createPeopleList();
        PersonListAdapter personListAdapter = new PersonListAdapter(people);
        //GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 3);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personListAdapter);



    }

    public void createPeopleList(){

        for (int i = 0; i <10 ; i++) {
            people.add(new Person("Omer Faruk" + " " +i));
            people.add(new Person("Hasan" + " " +i));
            people.add(new Person("John Lennon" + " " +i));
            people.add(new Person("Bluesss" + " " +i));
            people.add(new Person("Pink Floyd" + " " +i));

        }
    }
}