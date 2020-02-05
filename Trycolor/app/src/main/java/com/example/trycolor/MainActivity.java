package com.example.trycolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private View windowView;
private Button Trymebutton;
private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Array of color
        colors= new int[]{Color.RED,Color.GRAY,Color.GREEN,Color.BLACK,Color.LTGRAY,Color.CYAN,Color.YELLOW,Color.DKGRAY,Color.MAGENTA,Color.TRANSPARENT,Color.WHITE};

        windowView= findViewById(R.id.windowViewid);


        Trymebutton=(Button) findViewById(R.id.trymeid);
        //button on click listener
        Trymebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorArraylength = colors.length;
                //random color object created
                Random random = new Random();
                int randomnum = random.nextInt(colorArraylength);

                windowView.setBackgroundColor(colors[randomnum]);


                Log.d("Test","Tap");
            }
        });




    }
}
