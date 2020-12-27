package com.example.quizmaster.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.quizmaster.R

class TakeQuizRecyclerViewAdapter(private val totalQuestions: Int) :
        RecyclerView.Adapter<TakeQuizRecyclerViewAdapter.TakeQuizRecyclerViewViewHolder>() {

    class TakeQuizRecyclerViewViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

        private var button: Button =
                view.findViewById(R.id.fragment_take_quiz_recyclerview_item_button)

        fun bindData(position: Int) {
            button.text = position.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TakeQuizRecyclerViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)

        return TakeQuizRecyclerViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: TakeQuizRecyclerViewViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return totalQuestions
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.fragment_take_quiz_recyclerview_item
    }

}