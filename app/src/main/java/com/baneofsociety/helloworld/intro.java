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



public class intro extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }

    public void transition(View view){
        Intent intent = new Intent(this, abusivebehavior.class);
        startActivity(intent);
    }



}
