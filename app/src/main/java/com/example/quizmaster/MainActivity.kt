package com.example.quizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import com.example.quizmaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.fragment)

        navController.addOnDestinationChangedListener {
            controller, destination, arguments ->

            title = when (destination.id) {
                R.id.welcomeFragment -> "QuizMaster"
                R.id.profileFragment -> "Profile"
                R.id.viewQuizFragment -> "Quiz Title"
                R.id.takeQuizFragment -> "Quiz Title"
                R.id.quizResultFragment -> "Quiz Title"
                R.id.aboutFragment -> "About"
                else -> "QuizMaster"
            }
        }
    }
}