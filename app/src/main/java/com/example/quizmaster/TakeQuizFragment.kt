package com.example.quizmaster

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizmaster.databinding.FragmentTakeQuizBinding
import com.example.quizmaster.databinding.FragmentViewQuizBinding


class TakeQuizFragment : Fragment() {
    private var _binding: FragmentTakeQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTakeQuizBinding.inflate(inflater, container, false)

        binding.fragmentTakeQuizSubmitButton.setOnClickListener {
            findNavController().navigate(
                    R.id.action_takeQuizFragment_to_quizResultFragment
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}