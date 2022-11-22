package com.skanderjabouzi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "person.db";
	private static final int DATABASE_VERSION = 1;

	private static final String CREATE_PERSON =
	"CREATE TABLE person (id integer, firstname string, lastname string, age int); ";
	Context dBcontext;

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		dBcontext = context;
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(CREATE_PERSON);
		Log.i("DBHelper", "DB Created");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(DBHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");

		dBcontext.deleteDatabase("person.db");
		db.execSQL("DROP TABLE IF EXISTS person;");
		onCreate(db);
	}
}
