package org.example.sudoku;

//import org.example.sudoku.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class ViewPictures extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpictures);
        startActivity(new Intent(ViewPictures.this, image.class));
            
    }
}