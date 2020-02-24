package com.ravi.customadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ListView lv3=findViewById(R.id.a4);
        final ArrayList<word>list=new ArrayList<>();
        list.add(new word("Welcomn","Swagatam",R.drawable.color_green,R.raw.welcome));
        list.add(new word("I heartily thank everyone","ellavarakum ente manasniranjan nanni",R.drawable.color_green,R.raw.a2));
        list.add(new word("What is your name","Ninge lude perenthana",R.drawable.color_green,R.raw.a1));
        list.add(new word("Hello","Namaskaram",R.drawable.color_green,R.raw.a4));
        list.add(new word("I'm fine","enika sukhmanu",R.drawable.color_green,R.raw.a5));
        list.add(new word("I don't know","enikku ariyilla",R.drawable.color_green,R.raw.a6));
        list.add(new word("good morning","suprabhatham",R.drawable.color_green,R.raw.a7));
        list.add(new word("How are you","Ningalkku sukhamano",R.drawable.color_green,R.raw.howru));
        list.add(new word("Happy Birthday","janmadinashamsakal",R.drawable.color_green,R.raw.aaaaaa));
        list.add(new word("Did you understand?","Ningalkku mannassialo",R.drawable.color_green,R.raw.a8));
        customadapter adapter=new customadapter(Main5Activity.this,list);
        lv3.setAdapter(adapter);
        /*lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word w=list.get(i);
                MediaPlayer mp=MediaPlayer.create(Main5Activity.this,w.getSound());
                mp.start();
            }

        });*/



    }
}
