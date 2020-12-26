package com.example.quizmaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizmaster.R
import com.example.quizmaster.databinding.FragmentQuizResultBinding

class QuizResultFragment : Fragment() {
    private var _binding: FragmentQuizResultBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizResultBinding.inflate(inflater, container, false)

        binding.fragmentQuizResultContinueButton.setOnClickListener {
            findNavController().navigate(
                    R.id.action_quizResultFragment_to_profileFragment
            )
        }

        binding.fragmentQuizResultRetryButton.setOnClickListener {
            findNavController().navigate(
                    R.id.action_quizResultFragment_to_extendedViewQuizFragment
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}