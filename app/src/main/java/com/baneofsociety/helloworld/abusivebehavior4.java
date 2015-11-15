package com.baneofsociety.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class abusivebehavior4 extends ActionBarActivity {

    private boolean isChecked = false;

    public void clicked1(View view){ isChecked = true;}

    public void clicked2(View view){ isChecked = true;}

    public void clicked3(View view){ isChecked = true;}

    public void clicked4(View view){ isChecked = true;}

    public void transition(View view) {

        if (isChecked) {
            Intent intent = new Intent(this, yeschecked4.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, nonechecked4.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior4);
    }
}
