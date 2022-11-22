package com.skanderjabouzi.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText age;
    Button save;
    Boolean editPage = false;
    PersonDataSource personDataSource;
    Person person;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        age = findViewById(R.id.age);
        save = findViewById(R.id.save);
        personDataSource = new PersonDataSource(this);
        if (!personDataSource.isOpen()) personDataSource.open();

        Intent intent = getIntent();
        id = intent.getIntExtra("ID", 0);
        Log.e("POS", ""+ id);
        if (id > 0 ) {
            editPage = true;
            invalidateOptionsMenu();
            person = personDataSource.getPerson(id);
            firstname.setText(person.getFirstname());
            lastname.setText(person.getLastname());
            age.setText(String.valueOf(person.getAge()));
        } else {
            person = new Person();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!personDataSource.isOpen()) personDataSource.open();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail_menu, menu);
        MenuItem item = menu.findItem(R.id.delete);
        item.setVisible(editPage);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.delete) {
            personDataSource.deletePerson(person);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void save(View view) {
        person.setFirstname(firstname.getText().toString());
        person.setLastname(lastname.getText().toString());
        person.setAge(Integer.parseInt(age.getText().toString()));
        if (!editPage) {
            person.setId(personDataSource.getPersonCount() + 1);
            personDataSource.addPerson(person);
        } else {
            personDataSource.updatePerson(person);
        }
        finish();
    }
}
