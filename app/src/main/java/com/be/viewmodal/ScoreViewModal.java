package com.be.viewmodal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModal extends ViewModel {
    private MutableLiveData<Integer> score ;

    public MutableLiveData<Integer> getScore()
    {
        if (score==null)
        {
            score = new MutableLiveData<>();

        }
        score.setValue(0);

        return score;
    }

    public void setScore() {
        if (score.getValue()!=null)
        {
            score.setValue(score.getValue()+1);
        }
    }
}
