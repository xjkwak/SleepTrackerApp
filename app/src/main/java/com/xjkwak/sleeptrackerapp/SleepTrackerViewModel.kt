package com.xjkwak.sleeptrackerapp

import android.util.Log
import androidx.lifecycle.ViewModel

class SleepTrackerViewModel : ViewModel() {

    fun startTracking() {
        Log.i("SleepTrackerViewModel", "Let's start tracking!!");
    }
}