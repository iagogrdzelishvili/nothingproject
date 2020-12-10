package com.example.project.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.project.R

class notificationFragment : Fragment(R.layout.fragment_notifications) {

    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView2)
        textView.text = notificationFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }

}