package com.be.viewmodal;

import androidx.lifecycle.ViewModel;

public class ScoreViewModal extends ViewModel {
    private int score ;

    public int getScore()
    {
        return score;
    }

    public void setScore() {
        score=score+1;
    }
}
