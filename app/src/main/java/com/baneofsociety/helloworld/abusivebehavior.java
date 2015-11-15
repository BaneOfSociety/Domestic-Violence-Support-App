package com.baneofsociety.helloworld;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;

public class abusivebehavior extends ActionBarActivity {

    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior);
    }

    public void clicked1(View view){ isChecked = true;}

    public void clicked2(View view){ isChecked = true;}

    public void clicked3(View view){ isChecked = true;}

    public void clicked4(View view){ isChecked = true;}

    public void transition(View view){

        if (isChecked) {
            Intent intent = new Intent(this, yeschecked.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, nonechecked.class);
            startActivity(intent);
        }

    }

}
