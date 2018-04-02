package com.example.vibrant.instascroll;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

//https://android.jlelse.eu/scrolling-behavior-for-appbars-in-android-41aff9c5c468
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter adapter = new adapter(50);

        RecyclerView rv = findViewById(R.id.recyclerView);
        final View main_content = findViewById(R.id.main_content);
        rv.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar
                        .make(main_content, "Welcome to SnackBar", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });


    }
}
