package com.skanderjabouzi.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class PersonDataSource {

	// Database fields
	private SQLiteDatabase database;
	private DBHelper dbHelper;

	public PersonDataSource(Context context) {
		dbHelper = new DBHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
		Log.i("PersonDataSource", "open");
	}
	
	public boolean isOpen()
	{
		if (database == null) return false;
		return database.isOpen();
	} 

	public void close() {
		dbHelper.close();
	}

	void addPerson(Person person) {
//		ContentValues values = new ContentValues();
//		values.put("id", person.getId());
//		values.put("firtname", person.getFirstname());
//		values.put("longitude", person.getLastname());
//		values.put("age", person.getAge());

		database.insert("person", null, setPerspnDate(person));
		database.close();
	}

	// Getting single Person
	Person getPerson(int id) {
		Cursor cursor = database.query("person", new String[] { "id",	"firstname", "lastname", "age"}," id = ?",
				new String[] { String.valueOf(id) }, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		Person person = new Person();
		person.setId((int) cursor.getLong(0));
		person.setFirstname(cursor.getString(1));
		person.setLastname(cursor.getString(2));
		person.setAge(Integer.parseInt(cursor.getString(3)));
		cursor.close();
		
		// return Person
		return person;
	}

	// Updating single Person
	public int updatePerson(Person person) {
//		ContentValues values = new ContentValues();
//		values.put("id", person.getId());
//		values.put("firtname", person.getFirstname());
//		values.put("longitude", person.getLastname());
//		values.put("age", person.getAge());

		// updating row
		return database.update("person", setPerspnDate(person)," id = ?",
				new String[] { String.valueOf(person.getId()) });
	}

	// Deleting single Person
	public void deletePerson(Person person) {
		database.delete("person"," id = ?",
				new String[] { String.valueOf(person.getId()) });
		database.close();
	}

	// Getting Person Count
	public List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<Person>();
		String countQuery = "SELECT  * FROM " + "person";
		Cursor cursor = database.rawQuery(countQuery, null);
		if (cursor.moveToFirst()) {
			while (!cursor.isAfterLast()) {
				Person person = new Person();
				person.setId((int) cursor.getLong(0));
				person.setFirstname(cursor.getString(1));
				person.setLastname(cursor.getString(2));
				person.setAge(Integer.parseInt(cursor.getString(3)));
				Log.e("person", person.toString());
				persons.add(person);
				cursor.moveToNext();
			}
		}
		cursor.close();

		// return count
		return persons;
	}

	// Getting Person Count
	public int getPersonCount() {
		String countQuery = "SELECT  * FROM " + "person";
		Cursor cursor = database.rawQuery(countQuery, null);
		int count = cursor.getCount();
		cursor.close();

		// return count
		return count;
	}

	private ContentValues setPerspnDate(Person person) {
		ContentValues values = new ContentValues();
		values.put("id", person.getId());
		values.put("firstname", person.getFirstname());
		values.put("lastname", person.getLastname());
		values.put("age", person.getAge());

		return values;
	}
}
