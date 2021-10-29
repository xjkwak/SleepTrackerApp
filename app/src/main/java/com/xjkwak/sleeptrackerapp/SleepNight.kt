package com.xjkwak.sleeptrackerapp

data class SleepNight (
    val id: Long = 1L,
    val startTimeMilli: Long = System.currentTimeMillis(),
    val endTimeMilli: Long = startTimeMilli,
    val quality: Int = -1
)