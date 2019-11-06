package com.rk.rk_sep11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeacall(View v)
    {
        text = findViewById(R.id.number);
        String s = text.getText().toString();
        Intent in = new Intent(Intent.ACTION_DIAL);
        in.setData(Uri.parse("tel:"+s));
        startActivity(in);
    }
    public void opencamera(View v)
    {
        Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(in);
    }
}
