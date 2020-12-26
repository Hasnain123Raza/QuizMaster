package com.example.quizmaster

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.quizmaster.databinding.FragmentQuizBankBinding
import com.example.quizmaster.databinding.FragmentWelcomeBinding

class QuizBankFragment : Fragment() {
    private var _binding: FragmentQuizBankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizBankBinding.inflate(inflater, container, false)

        binding.fragmentQuizBankContinueButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_profileFragment_to_viewQuizFragment
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}