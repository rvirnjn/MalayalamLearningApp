package com.ravi.customadapter;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAVIRANJAN KUMAR on 10-03-2018.
 */

public class customadapter extends ArrayAdapter<word> {
    Context context;
    ArrayList<word> list;
private static   MediaPlayer mp;

    public customadapter(@NonNull Context context, @NonNull ArrayList objects)  {
        super(context, 0, objects);
        this.context=context;
        list=objects;


    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Nullable
    @Override
    public word getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
         convertView= LayoutInflater.from(context).inflate(R.layout.custom,parent,false);
      final word w= list.get(position);
    final TextView t1= convertView.findViewById(R.id.txt1);
    final   TextView t2= convertView.findViewById(R.id.txt2);
        LinearLayout ll = convertView.findViewById(R.id.linlay);
       ImageView im=convertView.findViewById(R.id.image1);
       final ImageView img = convertView.findViewById(R.id.image2);
      im.setImageResource(w.getImgage());
       t1.setText(w.getEnglish());
       t2.setText(w.getMalayalam());
       img.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
        mp=MediaPlayer.create(context ,w.getSound());

           mp=MediaPlayer.create(context,w.getSound());
        img.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
       img.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (mp.isPlaying()==false)
               {
                   mp=MediaPlayer.create(context,w.getSound());
                   mp.start();
               }
               if (mp.isPlaying()){
                   img.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);

               }
               mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                   @Override
                   public void onCompletion(MediaPlayer mediaPlayer) {
                       img.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                   }
               });

           }
       });



        /*else{
            mp.start();
            im.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
        }*/
          ll.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String s = t1.getText().toString();t1.setText(t2.getText().toString());t2.setText(s);

}});
        if(w.imgage==R.drawable.color_green)
        {im.setVisibility(View.GONE);}
        return convertView;

    }


}
