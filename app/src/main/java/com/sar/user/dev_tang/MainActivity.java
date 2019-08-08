package com.sar.user.dev_tang;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    Dialog dialog;
    @RequiresApi(api = Build.VERSION_CODES.M)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


        String text="Buildcard (Step 4/4)";

        SpannableString ss=new SpannableString(text);
        ForegroundColorSpan fcs=new ForegroundColorSpan(Color.parseColor("#D3D3D3"));
        ss.setSpan(fcs,9,20,SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);

        getSupportActionBar().setTitle(ss);
        final android.support.v7.app.ActionBar actionBar=getSupportActionBar();

        View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.share,null);

        dialog=new Dialog(this);
        dialog.setContentView(view);
        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();

        wmlp.gravity =Gravity.TOP| Gravity.RIGHT;
        wmlp.x = 120;
        wmlp.y = 120;

        final Button button2=findViewById(R.id.button2);
        button2.setBackground(getDrawable(R.drawable.button_style_click));
        button2.setTextColor(Color.parseColor("#ffffff"));

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        final Button button3=findViewById(R.id.button3);
        final Button startproject=findViewById(R.id.button60);
        startproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog_start=new BottomSheetDialog(MainActivity.this);
                View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.start_project,null);


                dialog_start.setContentView(view);

                overridePendingTransition(R.anim.side_left , R.anim.out );
                dialog_start.show();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,simliar_apps.class));
                overridePendingTransition(R.anim.side_left , R.anim.out );


            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void share(View view){
        // dialog.show();

    }
}
