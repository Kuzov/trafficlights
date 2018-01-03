package info.kuzinonline.trafficlights;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);

        Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor, null));
            }
        });

    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.redColor, null));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(getResources().getColor(R.color.greenColor, null));
    }
}
