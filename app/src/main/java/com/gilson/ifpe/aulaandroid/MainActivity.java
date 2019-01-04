package com.gilson.ifpe.aulaandroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView botaoListView;
    private TextView botaoWebView;
    private TextView botaoCalendario;
    private TextView botaoImageView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        botaoListView = (TextView)findViewById(R.id.listViewId);
        botaoWebView = findViewById(R.id.webViewId);
        botaoCalendario = findViewById(R.id.calendarioViewId);
        botaoImageView = findViewById(R.id.imageViewId);


        botaoListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent(MainActivity.this,ListViewActivity.class));
            }
        });

        botaoWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,WebViewActivity.class));
            }
        });

        botaoCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CalendarioActivity.class));
            }
        });

        botaoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ImageActivity.class));
            }
        });


    }
}
