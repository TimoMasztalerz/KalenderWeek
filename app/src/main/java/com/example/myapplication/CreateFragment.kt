package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.data.Appointment
import com.example.myapplication.data.Datasource
import com.example.myapplication.databinding.FragmentCreateBinding

class CreateFragment : Fragment() {
    private lateinit var binding: FragmentCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButton.setOnClickListener {
            findNavController().navigate(R.id.appointmentFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.weekFragment)
            val description = binding.editTextText.text.toString()
            val time = binding.editTextTime.text.toString()
            Datasource.singleData(Appointment( description = description, time = time, wochentag = "Mo"))
        }

    }}
