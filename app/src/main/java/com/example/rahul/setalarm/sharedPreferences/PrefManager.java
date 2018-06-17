package com.example.rahul.setalarm.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rahul on 17/6/18.
 */

public class PrefManager {

    Context context;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    int PRIVATE_MODE=0;

    private static final String PREF_NAME="setAlarm";
    private static final String isFirstTimeLaunch="IsFirstTimeLaunch";


    public PrefManager(Context context) {
        this.context = context;
        pref=context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor=pref.edit();
    }

    public void saveString(String key, String data)
    {
        editor.putString(key,data);
        editor.commit();
    }

    public void saveBoolean(String key, Boolean val)
    {
        editor.putBoolean(key,val);
        editor.commit();
    }

    public Boolean getBoolean(String key)
    {
        return pref.getBoolean(key,false);
    }

    public String getString(String key)
    {
        return pref.getString(key,null);
    }

}
