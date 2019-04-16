package in.vipul.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

        rolbut = findViewById(R.id.roll_button);
        diceleft = findViewById(R.id.image_diceLeft);
        diceright = findViewById(R.id.image_diceRight);

        rolbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Working fine bruh");
                Random genRandomeNum = new Random();
                int number = genRandomeNum.nextInt(6);
                Log.d("Dicee", "Random number is: "+number);

                diceleft.setImageResource(imageArray[number]);

                number = genRandomeNum.nextInt(6);
                diceright.setImageResource(imageArray[number]);
            }
        });
    }
}
