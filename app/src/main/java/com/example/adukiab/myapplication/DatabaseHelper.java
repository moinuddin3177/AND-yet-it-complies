package com.example.adukiab.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adukiab on 7/31/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="cdk.db";
    public static final String TABLE_NAME="Register_table";
    public static final String COLUMN_1="EmpID";
    public static final String COLUMN_2="CdkID";
    public static final String COLUMN_3="Name";
    public static final String COLUMN_4="Email";
    public static final String COLUMN_5="Password";


    public DatabaseHelper(Context context){
        super(context,DB_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table "+ TABLE_NAME + ("ID INTEGER AUTOINCREMENT, LoginID TEXT PRIMARY KEY, Name TEXT,Email TEXT,Password Text"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP table IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String loginId, String name, String email, String pwd) {
        SQLiteDatabase sdb=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(COLUMN_2,loginId);
        cv.put(COLUMN_3,name);
        cv.put(COLUMN_4,email);
        cv.put(COLUMN_5,pwd);
        long x=sdb.insert(TABLE_NAME,null,cv);
        if(x==-1)
            return false;
        else
            return true;
    }
}
