package com.ravi.customadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView lv1=findViewById(R.id.a2);
        final ArrayList<word>list= new ArrayList<>();
        list.add(new word("Father","Achan",R.drawable.family_father,R.raw.father));
        list.add(new word("Mother","Amma",R.drawable.family_mother,R.raw.mother));
        list.add(new word("brother","cheta",R.drawable.family_older_brother,R.raw.eldrbrother));
        list.add(new word("sister","Sahodhri",R.drawable.family_younger_sister,R.raw.sister));
        list.add(new word("younger brother","Sahodharan",R.drawable.family_younger_brother,R.raw.brother));
        list.add(new word("Son","Maghan",R.drawable.family_son,R.raw.son));
        list.add(new word("Daughter","Maghal",R.drawable.family_daughter,R.raw.daughter));
        list.add(new word("grandfather","aapupan",R.drawable.family_grandfather,R.raw.grandfather));
        list.add(new word("grandmother","aamumaa",R.drawable.family_grandmother,R.raw.grandmother));
        customadapter adapter=new customadapter(Main3Activity.this,list);
        lv1.setAdapter(adapter);
       /* lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               word w=list.get(i);
                MediaPlayer mp=MediaPlayer.create(Main3Activity.this,w.getSound());
                mp.start();
            }
        });*/
    }
}
