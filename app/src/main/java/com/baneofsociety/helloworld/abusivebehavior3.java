package com.baneofsociety.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class abusivebehavior3 extends ActionBarActivity {

    private boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abusivebehavior3);
    }

    public void clicked1(View view){ isChecked = true;}

    public void clicked2(View view){ isChecked = true;}

    public void clicked3(View view){ isChecked = true;}

    public void clicked4(View view){ isChecked = true;}

    public void transition(View view){

        if(isChecked){
            Intent intent = new Intent(this, yeschecked3.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, nonechecked3.class);
            startActivity(intent);
        }

    }

}
