package com.be.viewmodal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button add_score;
    private TextView textView;
    int score=0;
    private ScoreViewModal scoreViewModal ;
    private ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.total_score);
        add_score = findViewById(R.id.total_score_btn);
        scoreViewModal = ViewModelProviders.of(this).get(ScoreViewModal.class);
//        scoreViewModal.getScore();
//        textView.setText(String.valueOf(scoreViewModal.getScore()));
        scoreViewModal.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                 textView.setText(String.valueOf(integer));
            }
        });



        add_score.setOnClickListener(v -> {
            scoreViewModal.setScore();
                    });
    }
}