package com.example.myapplication

import AppointmentAdapter
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.data.Appointment
import com.example.myapplication.databinding.FragmentAppointmentBinding

class AppointmentFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentBinding
    private lateinit var appointmentsAdapter: AppointmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAppointmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val selectedWeekday = arguments?.getString("weekday")
        binding.tvwochentag.text = selectedWeekday

        binding.appointmentRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        setupRecyclerView()

        binding.buttonPlus.setOnClickListener {
            val appointmentsList = appointmentsAdapter.appointments

            for (appointment in appointmentsList) {
                Log.d("Termin", appointment.description)
            }

            findNavController().navigate(R.id.createFragment)
        }
    }

    private fun setupRecyclerView() {
        val appointments = listOf(
            Appointment("Turnen", "16:00","Montag"),
            Appointment("Handwerker", "08:30","Dienstag"),
            Appointment("Einladung Mama", "19:00","Freitag")
        )
        appointmentsAdapter = AppointmentAdapter(appointments)
        binding.appointmentRecyclerView.adapter = appointmentsAdapter
    }
}
