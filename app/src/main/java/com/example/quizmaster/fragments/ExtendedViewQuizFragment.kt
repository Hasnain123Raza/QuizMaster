package com.example.quizmaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizmaster.R
import com.example.quizmaster.databinding.FragmentExtendedViewQuizBinding

class ExtendedViewQuizFragment : Fragment() {
    private var _binding: FragmentExtendedViewQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExtendedViewQuizBinding.inflate(inflater, container, false)

        binding.fragmentExtendedViewQuizTakeQuizButton.setOnClickListener {
            findNavController().navigate(
                    R.id.action_extendedViewQuizFragment_to_takeQuizFragment
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}