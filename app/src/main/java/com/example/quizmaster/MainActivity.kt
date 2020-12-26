package com.example.quizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
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
                R.id.extendedViewQuizFragment -> "Quiz Title"
                R.id.takeQuizFragment -> "Quiz Title"
                R.id.quizResultFragment -> "Quiz Title"
                R.id.aboutFragment -> "About"
                else -> "QuizMaster"
            }
        }

        val appBarConfiguration = AppBarConfiguration(
                setOf(R.id.welcomeFragment, R.id.profileFragment)
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment).navigateUp()
    }
}