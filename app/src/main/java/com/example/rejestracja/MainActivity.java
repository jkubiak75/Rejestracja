package com.example.rejestracja;

import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText haslo;
    private EditText haslo2;
    private Button zatwierdz;
    private TextView tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        haslo2 = findViewById(R.id.haslo2);
        zatwierdz = findViewById(R.id.zatwierdz);
        tekst = findViewById(R.id.tekst);

            zatwierdz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String emaill = email.getText().toString().trim();
                    String hasloo = haslo.getText().toString().trim();
                    String powtorzHasloo = haslo2.getText().toString().trim();

                    if (!emaill.contains("@"))
                    {tekst.setText("Nieprawidłowy adres e-mail");
                    }
                    else if (!hasloo.equals(powtorzHasloo))
                    {tekst.setText("Hasła się różnią");
                    }
                    else
                    {tekst.setText("Witaj " + emaill);}
                }
            });

        haslo.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        haslo2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        }
    }