package com.patda9.neramit;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button newWishButton;
    Button learnMoreButton;

    public void openLearnMore(){
        Intent intent = new Intent(this, LearnMoreActivity.class);
        startActivity(intent);
    }

    ConstraintLayout upperWelcome;
    ConstraintLayout lowerWelcome;

    Animation upToDown;
    Animation downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        newWishButton = (Button)findViewById(R.id.new_wish_button);
        learnMoreButton = (Button) findViewById(R.id.learn_more_button);

        learnMoreButton.setOnClickListener(this);

        upperWelcome = (ConstraintLayout) findViewById(R.id.upper_welcome);
        lowerWelcome = (ConstraintLayout) findViewById(R.id.lower_welcome);
        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        upperWelcome.setAnimation(upToDown);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);
        lowerWelcome.setAnimation(downToUp);
    }

    @Override
    public void onClick(View v) {
        if (v == learnMoreButton){
            startActivity(new Intent(this, LearnMoreActivity.class));
        }
    }
}
