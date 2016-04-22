package com.example.sangwan.popular_movie_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Forecast extends AppCompatActivity {

    private ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        imageView = (ImageView)findViewById(R.id.imageView);
        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(imageView);

    }

}
