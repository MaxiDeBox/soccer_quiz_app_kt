package ru.proweb63.soccerquizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ru.proweb63.soccerquizapp.databinding.FragmentBallFeaturesBinding

class BallFeaturesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_ball_features, container, false)

        val binding = DataBindingUtil.inflate<FragmentBallFeaturesBinding>(
            inflater,
            R.layout.fragment_ball_features,
            container,
            false
        )

        (activity as AppCompatActivity).supportActionBar?.title = "Features ball"

        return binding.root
    }
}