package com.exercisesqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog.Builder;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
/*
    DBHelper dbHelper;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn);

        dbHelper = new DBHelper(getApplicationContext()) ;

        ArrayList<String> arrayList = dbHelper.getData();

        Log.e("jkjkh","jhgjg");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.addData();
            }
        });

    }*/

    EditText fname, lname, pnumber;
    Button add,view,viewall,Show1,delete,modify;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.firstName);
        lname=(EditText)findViewById(R.id.lastName);
        pnumber=(EditText)findViewById(R.id.phoneNumber);

        add=(Button)findViewById(R.id.addbtn);
        view=(Button)findViewById(R.id.viewbtn);
        viewall=(Button)findViewById(R.id.viewallbtn);
        delete=(Button)findViewById(R.id.deletebtn);
        Show1=(Button)findViewById(R.id.showbtn);
        modify=(Button)findViewById(R.id.modifybtn);

        db=openOrCreateDatabase("User_manage", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS user(firstname VARCHAR,lastname VARCHAR,phonenumber INTEGER);");


        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(fname.getText().toString().trim().length()==0||
                        lname.getText().toString().trim().length()==0||
                        pnumber.getText().toString().trim().length()==0)
                {
                    showMessage("Error", "Please enter all values");
                    return;
                }
                db.execSQL("INSERT INTO user VALUES('"+fname.getText()+"','"+lname.getText()+
                        "','"+pnumber.getText()+"');");
                showMessage("Success", "Record added successfully");
                clearText();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(fname.getText().toString().trim().length()==0)
                {
                    showMessage("Error", "Please enter FirstName");
                    return;
                }
                Cursor c=db.rawQuery("SELECT * FROM user WHERE firstname='"+fname.getText()+"'", null);
                if(c.moveToFirst())
                {
                    db.execSQL("DELETE FROM user WHERE firstname='"+fname.getText()+"'");
                    showMessage("Success", "Record Deleted");
                }
                else
                {
                    showMessage("Error", "Invalid First Name");
                }
                clearText();
            }
        });

        modify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(fname.getText().toString().trim().length()==0)
                {
                    showMessage("Error", "Please enter FirstName");
                    return;
                }
                Cursor c=db.rawQuery("SELECT * FROM user WHERE firstname='"+fname.getText()+"'", null);
                if(c.moveToFirst())
                {
                    db.execSQL("UPDATE user SET lastname='"+lname.getText()+"',phonenumber='"+pnumber.getText()+
                            "' WHERE firstname='"+fname.getText()+"'");
                    showMessage("Success", "Record Modified");
                }
                else
                {
                    showMessage("Error", "Invalid firstname");
                }
                clearText();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(fname.getText().toString().trim().length()==0)
                {
                    showMessage("Error", "Please enter firstname");
                    return;
                }
                Cursor c=db.rawQuery("SELECT * FROM user WHERE firstname='"+fname.getText()+"'", null);
                if(c.moveToFirst())
                {
                    lname.setText(c.getString(1));
                    pnumber.setText(c.getString(2));
                }
                else
                {
                    showMessage("Error", "Invalid FirstName");
                    clearText();
                }
            }
        });

        viewall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Cursor c=db.rawQuery("SELECT * FROM user", null);
                if(c.getCount()==0)
                {
                    showMessage("Error", "No records found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(c.moveToNext())
                {
                    buffer.append("FirstName: "+c.getString(0)+"\n");
                    buffer.append("LastName: "+c.getString(1)+"\n");
                    buffer.append("PhoneNumber: "+c.getString(2)+"\n\n");
                }
                showMessage("User Details", buffer.toString());
            }
        });
        Show1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showMessage("Add / Delete User ", "Android Exercise");
            }
        });

    }
    public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void clearText()
    {
        fname.setText("");
        lname.setText("");
        pnumber.setText("");
        fname.requestFocus();
    }

}
