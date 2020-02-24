package com.ravi.customadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ListView lv2 = findViewById(R.id.a3);
        final ArrayList<word> list = new ArrayList<>();
        list.add(new word("Black", "Karuppa",R.drawable.color_black,R.raw.black1));
        list.add(new word("White", "Vella",R.drawable.color_white,R.raw.white));
        list.add(new word("Gray", "Chara niram",R.drawable.color_gray,R.raw.grey));
        list.add(new word("Red", "Chumappu",R.drawable.color_red,R.raw.red));
        list.add(new word("Blue", "Neela",R.drawable.color_dusty_yellow,R.raw.blue));
        list.add(new word("Yellow","Manja",R.drawable.color_mustard_yellow,R.raw.yellow));
        list.add(new word("Brown","Kapi poddi niram",R.drawable.color_brown,R.raw.brown));
        customadapter adpter=new customadapter(Main4Activity.this,list);
        lv2.setAdapter(adpter);
       /* lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word w=list.get(i);
                MediaPlayer mp=MediaPlayer.create(Main4Activity.this,w.getSound());
                mp.start();
            }
        });*/
    }
}
