package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView isaac = findViewById(R.id.cakeview);
        CakeController foo = new CakeController(isaac);


        Button blow = findViewById(R.id.buttonB);
        blow.setOnClickListener(foo);

        Switch sCandles = findViewById(R.id.candlesSwitch);
        sCandles.setOnCheckedChangeListener(foo);

        SeekBar candlesNum = findViewById(R.id.candlesSeek);
        candlesNum.setOnSeekBarChangeListener(foo);

    }


    public void goodbye(View button) {
        System.out.println("Goodbye");
    }


}
