package com.medicheckproject.medicheck;

import android.app.Activity;

/**
 * Created by ASUS on 8/12/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public  void onButtonClickHere(View v)
    {



        if(v.getId() == R.id.bKit)
        {

            Intent j = new Intent(IndexActivity.this,First_Aid_Kit.class);
            startActivity(j);
        }

        if(v.getId() == R.id.bTraining)
        {

            Intent j = new Intent(IndexActivity.this,First_Aid_Training.class);
            startActivity(j);
        }

        if(v.getId() == R.id.bDisease)
        {

            Intent j = new Intent(IndexActivity.this,GeneralDiseaseActivity.class);
            startActivity(j);
        }

        if(v.getId() == R.id.bDrug)
        {

            Intent j = new Intent(IndexActivity.this,DrugActivity.class);
            startActivity(j);
        }
    }
}
