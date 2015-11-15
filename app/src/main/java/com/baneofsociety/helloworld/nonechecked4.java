package com.baneofsociety.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class nonechecked4 extends ActionBarActivity {

    public void transition(View view) {
        Intent intent = new Intent(this, Final.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonechecked4);
    }

}