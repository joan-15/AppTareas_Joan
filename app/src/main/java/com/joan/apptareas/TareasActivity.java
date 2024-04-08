package com.joan.apptareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TareasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas);

        Button buttonTarea1 = findViewById(R.id.buttonTarea1);
        buttonTarea1.setOnClickListener(v -> startActivity(new Intent(TareasActivity.this, Tarea1Activity.class)));

        Button buttonTarea2 = findViewById(R.id.buttonTarea2);
        buttonTarea2.setOnClickListener(v -> startActivity(new Intent(TareasActivity.this, Tarea2Activity.class)));

        Button buttonTarea3 = findViewById(R.id.buttonTarea3);
        buttonTarea3.setOnClickListener(v -> startActivity(new Intent(TareasActivity.this, Tarea3Activity.class)));

        Button buttonTarea4 = findViewById(R.id.buttonTarea4);
        buttonTarea4.setOnClickListener(v -> startActivity(new Intent(TareasActivity.this, Tarea4Activity.class)));
    }
}
