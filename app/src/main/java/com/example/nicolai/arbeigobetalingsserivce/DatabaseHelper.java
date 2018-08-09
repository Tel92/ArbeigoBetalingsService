package com.example.nicolai.arbeigobetalingsserivce;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tomas on 22-11-2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="opgave.db";
    public static final String TABLE_NAME="opgave_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "";
    public static final String COL_3 = "ID";
    public static final String COL_4 = "ID";


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
