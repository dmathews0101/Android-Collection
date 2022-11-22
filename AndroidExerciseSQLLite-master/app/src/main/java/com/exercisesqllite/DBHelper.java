/*
package com.exercisesqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static String userDatabase = "UserDatabase.db";
    String userTable = "userTable";
    String firstname = "firstname";

    public DBHelper(Context context){
        super(context, userDatabase, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL("create table contacts" + "(id integer primary key, name text, phone text, email text, street text, place text)");
        db.execSQL("create table userTable" + "(firstname text primary key, lastname text, phonenumber text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

*/
/*    public boolean insertDetails(String name){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        sqLiteDatabase.insert(detailsTableName,null,contentValues);
        return true;
    }*//*


    public boolean addData(String firstname,String lastname, String phonenumber){
        SQLiteDatabase sqlite = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("firstname",firstname);
        cv.put("lastname",lastname);
        cv.put("phonenumber",phonenumber);
        sqlite.insert(userTable,null,cv);
        sqlite.close();
        return true;
    }



*/
/*
    public ArrayList<String> getAllDetails(){
        ArrayList<String> al_detail = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery("select * from details", null);
        res.moveToFirst();

        while (res.isAfterLast()==false){
            al_detail.add(res.getString(res.getColumnIndex(name)));
            res.moveToNext();
        }
        return al_detail;
    }
*//*


    public ArrayList<User> getData(){
        ArrayList<User> al_detail = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery("select * from details", null);
        res.moveToFirst();

        while (res.isAfterLast()==false){


            String str_firstname = res.getString(res.getColumnIndex(firstname));
            String str_lastname = res.getString(res.getColumnIndex(firstname));
            String str_phonenumber = res.getString(res.getColumnIndex(firstname));
            al_detail.add(new User(str_firstname,str_lastname,str_phonenumber));
            res.moveToNext();
        }
        return al_detail; //al_details , size =12
    }
}
*/
