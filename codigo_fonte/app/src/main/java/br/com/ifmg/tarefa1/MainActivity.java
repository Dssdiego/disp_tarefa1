package br.com.ifmg.tarefa1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Busca o contexto da activity
        context = this;

        final Button btnCodigo = findViewById(R.id.btnCodigo);
        btnCodigo.setOnClickListener(v -> {
            Intent intent = new Intent(this, CodigoActivity.class);
            startActivity(intent);
        });

        Button btnXml = findViewById(R.id.btnXml);
        btnXml.setOnClickListener(v -> {
            Intent intent = new Intent(this, XMLActivity.class);
            startActivity(intent);
        });

        Button btnDragDrop = findViewById(R.id.btnDragDrop);
        btnDragDrop.setOnClickListener(v -> {
            Intent intent = new Intent(this, DragDropActivity.class);
            startActivity(intent);
        });
    }
}