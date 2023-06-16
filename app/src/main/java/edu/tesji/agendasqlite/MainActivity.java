package edu.tesji.agendasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.tesji.agendasqlite.baseDeDatos.DbHelper;

public class MainActivity extends AppCompatActivity {
    private Button btnCrearBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrearBD = findViewById(R.id.btCrearBD);

        btnCrearBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper dbHelper = new DbHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if (db != null) {
                    Toast.makeText(getApplicationContext(),"BASE DE DATOS CREADA",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"ERROR AL CREAR LA BASE DE DATOS",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}