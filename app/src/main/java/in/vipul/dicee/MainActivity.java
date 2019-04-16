package in.vipul.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Variables declarations
    Button rolbut;
    ImageView diceleft, diceright;
    final int[] imageArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link layout elements to java
        rolbut = findViewById(R.id.roll_button);
        diceleft = findViewById(R.id.image_diceLeft);
        diceright = findViewById(R.id.image_diceRight);

        //Add click on rolbut button
        rolbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Working fine bruh");
                //creating object that will generate random number
                Random genRandomeNum = new Random();
                //stores the randomly generated number in case of left dice
                int number = genRandomeNum.nextInt(6);
                Log.d("Dicee", "Random number is: "+number);
                //Set image on left dice according to randomly generated number
                diceleft.setImageResource(imageArray[number]);
                //stores the randomly generated number in case of right dice
                number = genRandomeNum.nextInt(6);
                //Set image on right dice according to randomly generated number
                diceright.setImageResource(imageArray[number]);
            }
        });
    }
}
