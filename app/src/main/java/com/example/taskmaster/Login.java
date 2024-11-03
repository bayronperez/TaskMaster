package com.example.taskmaster;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.taskmaster.Base_De_Datos.ScriptSqLite;

public class Login extends AppCompatActivity {

    private Button btnLogin;
    private TextView tvRegister;
    private EditText editTextEmail, editTextPassword;
    private ScriptSqLite dbHelper;

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

        dbHelper = new ScriptSqLite(this);

        // Inicializar vistas
        btnLogin = findViewById(R.id.btnLogin);
        tvRegister = findViewById(R.id.tvRegister);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);

        // Configurar botón de inicio de sesión
        btnLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (dbHelper.isValidUser(email, password)) {
                // Si las credenciales son correctas, ir a la actividad principal
                Intent intent = new Intent(Login.this, MenuPrincipal.class);
                startActivity(intent);
                finish();
            } else {
                // Si las credenciales no coinciden, mostrar un mensaje de alerta
                showAlert("Credenciales incorrectas", "Correo o contraseña incorrectos. Inténtalo de nuevo.");
            }
        });

        // Configurar enlace de registro
        tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Registro.class);
            startActivity(intent);
        });
    }

    private void showAlert(String title, String message) {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Aceptar", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
