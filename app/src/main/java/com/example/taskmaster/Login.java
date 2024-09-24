package com.example.taskmaster;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    private Button btnLogin;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Ajustes de diseño
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Encontrar el botón de iniciar sesión
        btnLogin = findViewById(R.id.btnLogin);

        // Al presionar el botón de iniciar sesión, se redirige al Menú Principal
        btnLogin.setOnClickListener(v -> {
            // Crear un Intent para ir al Menú Principal
            Intent intent = new Intent(Login.this, MenuPrincipal.class);
            startActivity(intent);  // Inicia la actividad del Menú Principal
            finish();  // Cierra la actividad de Login para no regresar a ella
        });

        // Encontrar el texto de "Regístrate aquí"
        tvRegister = findViewById(R.id.tvRegister);

        // Al presionar el texto de registro, se redirige a la pantalla de Registro
        tvRegister.setOnClickListener(v -> {
            // Crear un Intent para ir a la actividad de Registro
            Intent intent = new Intent(Login.this, Registro.class);
            startActivity(intent);  // Inicia la actividad de Registro
        });
    }
}
