package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Mendeklarasikan dan Melakukan Inisialisasi variable nama dengan Label Nama dari Layout MainActivity
        TextView nama = findViewById(R.id.tv_namaMain);

//         mengatur nilai Label Nama dengan data user sedang login dari Preferences
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));

//        Mengatur Status dan User yang sedang login menjadi default atau kosong di data Preferences dan Kemudian menuju ke LoginActivity
        findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Menghapus Status login dan kembali ke Login Activity
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new Intent(getBaseContext(), ActivityLogin.class));
                finish();
            }
        });
    }
}
