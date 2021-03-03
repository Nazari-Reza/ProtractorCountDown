package mandegarcode.protractorcountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProtractorCountdown protractorCountDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        protractorCountDown =  findViewById(R.id.protractorCountDown);

        protractorCountDown.CountTimeSet(90);

        protractorCountDown.setOnProtractorCountDownTimerListener(new ProtractorCountdown.OnProtractorCountDownTimerListener() {
            @Override
            public void onEndProtractorCountDownTimer(boolean endedTimer) {
                if (endedTimer)
                {
                    Toast.makeText(getApplicationContext(),"TimeEnded",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}