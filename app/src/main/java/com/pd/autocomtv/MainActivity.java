package com.pd.autocomtv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // String[]  langname = {"Android","Android1.1", "Flutter", "C","Java","javascript","Swift"};

    Integer[] name = new Integer[]{12, 45, 14, 11, 145, 142};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //  ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, langname);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>( this, android.R.layout.select_dialog_item, name );
        AutoCompleteTextView Atv = (AutoCompleteTextView) findViewById( R.id.Ac_tv );
        Atv.setThreshold( 1 );
        Atv.setAdapter( adapter );
        Atv.setTextColor( Color.BLUE );

        ImageButton Img_btn = (ImageButton) findViewById( R.id.imgbtn );
        Img_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Download is Completed", Toast.LENGTH_SHORT ).show();
                Log.i( "INfo", "Successful" );
            }
        } );
    }
}