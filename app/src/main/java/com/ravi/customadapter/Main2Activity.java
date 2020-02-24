package com.ravi.customadapter;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ListView lv=findViewById(R.id.a1);
        final ArrayList<word>list=new ArrayList<>();
        list.add(new word("one","On-nuh", R.drawable.number_one,R.raw.one));
        list.add(new word("Two","rrann-duh",R.drawable.number_two,R.raw.two));
        list.add(new word("Three","moon-uh",R.drawable.number_three,R.raw.three));
        list.add(new word("Four","naal-lu",R.drawable.number_four,R.raw.four));
        list.add(new word("Five","anj-uh",R.drawable.number_five,R.raw.fivr));
        list.add(new word("Six","aarr-uh",R.drawable.number_six,R.raw.six));
        list.add(new word("Seven","yeh-rruh",R.drawable.number_seven,R.raw.seven));
        list.add(new word("Eight","et-duh",R.drawable.number_eight,R.raw.eight));
        list.add(new word("Nine","onpa-duh",R.drawable.number_nine,R.raw.nine));
        list.add(new word("Ten","pat-duh",R.drawable.number_ten,R.raw.ten));
        customadapter adapter=new customadapter(Main2Activity.this,list);
        lv.setAdapter(adapter);


    }
}
