package com.listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Person John = new Person("John", "03-12-1994","Male");
        Person Katy = new Person("Katy", "05-04-1994","Female");
        Person Peter = new Person("Peter", "06-07-1994","Male");
        Person Huang = new Person("Huang", "02-08-1994","Male");
        Person July = new Person("July", "03-04-1994","Female");
        Person April = new Person("April", "04-12-1994","Male");
        Person Mathew = new Person("Mathew", "09-12-1994","Male");
        Person Phil = new Person("Phil", "03-11-1994","Male");
        Person Josh = new Person("Josh", "03-12-1994","Male");
        Person Mitch = new Person("Mitch", "03-12-1994","Male");
        Person Rose = new Person("Rose", "03-12-1994","Female");
        Person Harry = new Person("Harry", "03-12-1994","Male");
        Person Sherlock = new Person("Sherlock", "03-12-1994","Male");
        Person Holmes = new Person("Holmes", "03-12-1994","Male");
        Person Wilson = new Person("Wilson", "03-12-1994","Male");

        //Add the Person Objects to the ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(John);
        peopleList.add(Katy);
        peopleList.add(Peter);
        peopleList.add(Huang);
        peopleList.add(July);
        peopleList.add(April);
        peopleList.add(Mathew);
        peopleList.add(Phil);
        peopleList.add(Josh);
        peopleList.add(Mitch);
        peopleList.add(Rose);
        peopleList.add(Harry);
        peopleList.add(Sherlock);
        peopleList.add(Holmes);
        peopleList.add(Wilson);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}
