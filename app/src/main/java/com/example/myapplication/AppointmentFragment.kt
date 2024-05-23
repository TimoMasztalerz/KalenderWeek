package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentAppointmentBinding

class AppointmentFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAppointmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve the selected weekday from the arguments bundle
        val selectedWeekday = arguments?.getString("weekday").toString()

        // Update the tvwochentag TextView with the selected weekday
        binding.tvwochentag.text = selectedWeekday
        binding.buttonPlus.setOnClickListener {
            findNavController().navigate(R.id.createFragment)    }


}}

