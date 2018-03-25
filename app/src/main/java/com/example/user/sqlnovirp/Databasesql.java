package com.example.user.sqlnovirp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



/**
 * Created by waski on 24/03/2018.
 */

public class Databasesql extends SQLiteOpenHelper {
    public Databasesql(Context context) {
        super(context, "todolist.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase query) {
        final String SQL_CREATE_TABLE = "CREATE TABLE "
                + TodoPointer.TodoEntry.TABLE_NAME+" ("
                + TodoPointer.TodoEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TodoPointer.TodoEntry.COLUMN_NAMA_+" TEXT NOT NULL, "
                + TodoPointer.TodoEntry.COLUMN_DESKRIPSI+" TEXT NOT NULL, "
                + TodoPointer.TodoEntry.COLUMN_PRIOTIRTY+" INTEGER NOT NULL);";
        query.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase query, int i, int i1) {
        query.execSQL("DROP TABLE IF EXISTS "+ TodoPointer.TodoEntry.TABLE_NAME);
        onCreate(query);
    }
}
