package com.xjkwak.sleeptrackerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.xjkwak.sleeptrackerapp.databinding.FragmentSleepTrackerBinding


/**
 * A simple [Fragment] subclass.
 * Use the [SleepTrackerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SleepTrackerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSleepTrackerBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_tracker, container, false)

        val viewModel = ViewModelProvider(this).get(SleepTrackerViewModel::class.java)

        // Enviando la referencia de nuestro viewModel al Layout
        binding.viewModel = viewModel

        val data = arrayOf(SleepNight(1000), SleepNight(2000), SleepNight(3000),
            SleepNight(1000), SleepNight(2000), SleepNight(3000),
            SleepNight(1000), SleepNight(2000), SleepNight(3000),
            SleepNight(1000), SleepNight(2000), SleepNight(3000))

        val adapter = SleepNightAdapter(data)

        binding.sleepList.adapter = adapter

        return binding.root
    }

}