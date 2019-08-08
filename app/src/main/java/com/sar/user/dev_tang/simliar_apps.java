package com.sar.user.dev_tang;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class simliar_apps extends AppCompatActivity {
 Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simliar_apps);
        final Button button30=findViewById(R.id.button30);
        button30.setBackground(getDrawable(R.drawable.button_style_click));
        button30.setTextColor(Color.parseColor("#ffffff"));

        dialog=new Dialog(this,R.style.AlertDialogCustom);
        dialog.setContentView(R.layout.share);
        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
        wmlp.gravity = Gravity.TOP | Gravity.RIGHT;
        wmlp.x = 120;   //x position
        wmlp.y = 150;

        final Button button20=findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(simliar_apps.this,MainActivity.class));
                overridePendingTransition(R.anim.right_ , R.anim.right_to );
            }
        });
    }
    public void share(View view){
        //dialog.show();

    }
}
