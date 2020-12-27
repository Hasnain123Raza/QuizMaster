package com.example.quizmaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizmaster.R
import com.example.quizmaster.adapters.QuizBankRecyclerViewAdapter
import com.example.quizmaster.adapters.TakeQuizRecyclerViewAdapter
import com.example.quizmaster.databinding.FragmentTakeQuizBinding


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

        val recyclerView = binding.fragmentTakeQuizNavigationRecyclerView

        recyclerView.adapter = TakeQuizRecyclerViewAdapter(10)
        recyclerView.layoutManager = LinearLayoutManager(
                activity,
                LinearLayoutManager.HORIZONTAL,
                false
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}