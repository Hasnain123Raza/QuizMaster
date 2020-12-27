package com.example.quizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
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

            invalidateOptionsMenu()

            title = when (destination.id) {
                R.id.welcomeFragment -> "QuizMaster"
                R.id.quizBankFragment -> "Quiz Bank"
                R.id.extendedViewQuizFragment -> "Quiz Title"
                R.id.takeQuizFragment -> "Quiz Title"
                R.id.quizResultFragment -> "Quiz Title"
                R.id.aboutFragment -> "About"
                else -> "QuizMaster"
            }
        }

        val appBarConfiguration = AppBarConfiguration(
                setOf(R.id.welcomeFragment, R.id.quizBankFragment)
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var currentDestinationId = findNavController(R.id.fragment).currentDestination?.id
        if (currentDestinationId != null) {
            if ((currentDestinationId == R.id.welcomeFragment) || (currentDestinationId == R.id.aboutFragment)) {
                return super.onCreateOptionsMenu(menu)
            } else {
                menuInflater.inflate(R.menu.mainactivity_navigation_menu, menu)
                return true
            }
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.fragment)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment).navigateUp()
    }
}