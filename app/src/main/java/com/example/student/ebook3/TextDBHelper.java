package com.example.student.ebook3;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TextDBHelper extends SQLiteOpenHelper {

    private static final String name = "text.sqlite3";
    private static final int version = 2;


    public TextDBHelper(Context ctx) {
        super(ctx, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE text (" +
                "_id integer primary key autoincrement," +
                "title text not null," +
                "priority integer default 0);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS course;";
        db.execSQL(sql);
        this.onCreate(db);
    }
}