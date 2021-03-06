package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.criminalintent.CrimeDbSchema.CrimeTable;

/**
 * Created by ltt19 on 2017/9/20.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATEBASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context,DATEBASE_NAME,null,VERSION);
}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + CrimeTable.NAME + "(" +
                "_id integer primary key autoincrement," +
                CrimeTable.Cols.UUID + ", " +
                CrimeTable.Cols.TITLE  + ", " +
                CrimeTable.Cols.DATE + ", " +
                CrimeTable.Cols.SOLVED + ", " +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
