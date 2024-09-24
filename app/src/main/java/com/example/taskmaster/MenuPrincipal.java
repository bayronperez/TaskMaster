package com.example.taskmaster;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipal extends AppCompatActivity {

    private Button btnNotifications, btnCalendar, btnProfile, btnTaskList;
    private FloatingActionButton floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_principal);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Encontrar los botones en el layout
        btnNotifications = findViewById(R.id.btnNotifications);
        btnCalendar = findViewById(R.id.btnCalendar);
        btnProfile = findViewById(R.id.btnProfile);
        btnTaskList = findViewById(R.id.btnTaskList);
        floatingActionButton2 = findViewById(R.id.floatingActionButton2);

        // Listener para el botón de Notificaciones
        btnNotifications.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPrincipal.this, Notificacion.class);
            startActivity(intent);
        });

        // Listener para el botón de Calendario
        btnCalendar.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPrincipal.this, Calendario.class);
            startActivity(intent);
        });

        // Listener para el botón de Perfil
        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPrincipal.this, Perfil.class);
            startActivity(intent);
        });

        // Listener para el botón de Mis Tareas (Lista de tareas)
        btnTaskList.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPrincipal.this, ListaTareas.class);
            startActivity(intent);  // Inicia la actividad de TaskListActivity
        });

        // Listener para el botón flotante (Agregar nueva tarea)
        floatingActionButton2.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPrincipal.this, DetalleTareas.class);
            startActivity(intent);  // Inicia la actividad de TaskDetailActivity
        });
    }
}
