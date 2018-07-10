package com.example.mohamed_abdelsamad.circlemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
 String Arrayname[]={ "Android","Gmail","FaceBook","SoundCloud","Spoofy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circle=(CircleMenu)findViewById(R.id.circlemen);
        circle.setMainMenu(Color.BLACK,R.drawable.add,R.drawable.index)
                .addSubMenu(Color.BLUE,R.drawable.ph1)
                .addSubMenu(Color.RED,R.drawable.ph2)
                .addSubMenu(Color.CYAN
                        ,R.drawable.ph3)
                .addSubMenu(Color.GRAY
                        ,R.drawable.sound)
                .addSubMenu(Color.GREEN,R.drawable.ph4).setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {

                Toast.makeText(MainActivity.this,"  You Selected "+Arrayname[i],Toast.LENGTH_SHORT).show();
            }
        })
       ;
    }
}
