package edu.tesji.agendasqlite.baseDeDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {


    private static final int database_version = 1;
    private static final String database_nombre = "agenda.db";
    public static final String tabla_contactos = "t_contactos";


    public DbHelper(@Nullable Context context) {
        super(context, database_nombre, null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + tabla_contactos + "(" + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nombre TEXT NOT NULL," + "telefono TEXT NOT NULL," + "correo_electronico TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + tabla_contactos);
        onCreate(db);
    }
}
