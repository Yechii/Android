package com.example.dell.multiplespantallas;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment2 obj = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (obj != null) {
        } else  {
            Fragment2 obj2 = new Fragment2();
            FragmentManager obMan = getSupportFragmentManager();
            FragmentTransaction obTran =  obMan.beginTransaction();
            obTran.add(R.id.contenedor,obj2,"");
            obTran.commit();

        }
    }


}
