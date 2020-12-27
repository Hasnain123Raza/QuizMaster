package com.example.quizmaster.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizmaster.R

class QuizBankRecyclerViewAdapter(private val totalQuizzes: Int) :
        RecyclerView.Adapter<QuizBankRecyclerViewAdapter.QuizBankRecyclerViewViewHolder>() {

    class QuizBankRecyclerViewViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        init {

        }

        fun bindData(position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizBankRecyclerViewViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return QuizBankRecyclerViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuizBankRecyclerViewViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return totalQuizzes
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.fragment_quiz_bank_recyclerview_item
    }
}