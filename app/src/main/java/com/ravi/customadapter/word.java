package com.ravi.customadapter;

/**
 * Created by RAVIRANJAN KUMAR on 10-03-2018.
 */

public class word {
    String english;
    String malayalam;
    int imgage;
    int sound;

    public word(String english,String malayalam ,int image,int sound){
        this.english = english;
        this.malayalam = malayalam;
        this.imgage=image;
        this.sound=sound;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setMalayalam(String malayalam) {
        this.malayalam = malayalam;
    }

    public void setImgage(int imgage){this.imgage=imgage;}

    public void setSound(int sound){this.sound=sound;}

    public String getEnglish() {
        return english;
    }

    public String getMalayalam() {
        return malayalam;
    }

    public int getImgage(){return imgage;}

    public int getSound(){return sound;}



    
}
