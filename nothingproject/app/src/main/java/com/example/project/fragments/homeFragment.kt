package com.example.project.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.project.R

class homeFragment : Fragment(R.layout.fragment_home){
    private lateinit var navController: NavController
    private lateinit var edditText: EditText
    private lateinit var button: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        edditText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            val amount = editText.Text.toString().toInt()
            val action = homeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)
            navController.navigate(action)
        }
    }

}