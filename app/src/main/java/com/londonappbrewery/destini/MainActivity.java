package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mText;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mText = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        mStoryIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T1_Ans1)) {
                    mText.setText(getResources().getString(R.string.T3_Story));
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                } else if (mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T3_Ans1)) {
                    mText.setText(getResources().getString(R.string.T6_End));
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 6;
                } else if (mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T2_Ans1)) {
                    mText.setText(getResources().getString(R.string.T3_Story));
                    mButtonTop.setText(getResources().getString(R.string.T3_Ans1));
                    mButtonBottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                } else {
                    mStoryIndex = 1;
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T1_Ans2)) {
                    mText.setText(getResources().getString(R.string.T2_Story));
                    mButtonBottom.setText(getResources().getString(R.string.T2_Ans2));
                    mButtonTop.setText(getResources().getString(R.string.T2_Ans1));
                    mStoryIndex = 2;
                } else if (mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T2_Ans2)) {
                    mText.setText(getResources().getString(R.string.T4_End));
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                    mStoryIndex = 4;
                } else if (mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T3_Ans2)) {
                    mText.setText(getResources().getString(R.string.T5_End));
                    mButtonBottom.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                    mStoryIndex = 5;
                }  else {
                    mStoryIndex = 1;
                }

            }
        });


    }
}
