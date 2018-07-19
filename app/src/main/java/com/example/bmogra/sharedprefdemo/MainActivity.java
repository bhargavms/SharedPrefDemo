package com.example.bmogra.sharedprefdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.security.SecureRandom;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private SharedPreferences preferences;
    private final Random random = new SecureRandom();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.add_stuff).setOnClickListener(this);

        findViewById(R.id.read_random).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long start = System.currentTimeMillis();
                String val = preferences.getString(String.valueOf(random.nextInt(7)), "");
                Log.d("Profile", "readTime = " + val + " " + (System.currentTimeMillis() - start));
            }
        });

        long start = System.currentTimeMillis();
        preferences = getSharedPreferences("blah", Context.MODE_PRIVATE);
        Log.d("Profile", "getSharedPrefExecutionTime = " + (System.currentTimeMillis() - start));
    }

    @Override
    public void onClick(View v) {
        long start = System.currentTimeMillis();
        preferences.edit()
                .putString("1", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("2", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("3", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("4", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("5", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("6", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .putString("7", "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklgaslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg" +
                        "aslkglksdhlkslkhsdlkhfklsdfglksdklg")
                .commit();
        Log.d("Profile", "write = " + (System.currentTimeMillis() - start));
    }
}
