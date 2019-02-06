package com.medicheckproject.medicheck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ASUS on 8/11/2016.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_page);
    }
    public void onImageButtonClick(View v)
    {
        if(v.getId() == R.id.imageButton )
        {
            Intent log_in = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(log_in);
        }
    }

}
