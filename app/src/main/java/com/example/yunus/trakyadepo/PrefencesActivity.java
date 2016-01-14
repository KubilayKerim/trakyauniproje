package com.example.yunus.trakyadepo;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by yunus on 11.01.2016.
 */
public class PrefencesActivity extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PreferenceManager pm=getPreferenceManager();
        pm.setSharedPreferencesName("notifPref");
        addPreferencesFromResource(R.xml.prefs);
    }


}



