package com.example.ishpreetkaur.customtoastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customToast();
            }
        });
    }

    public void customToast()
    {
        Toast toast=new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        LayoutInflater layoutInflater=getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toast_layout));
        ImageView imageView=findViewById(R.id.image);
        TextView textView=findViewById(R.id.text);
        toast.setView(view);
        toast.show();
    }
}
