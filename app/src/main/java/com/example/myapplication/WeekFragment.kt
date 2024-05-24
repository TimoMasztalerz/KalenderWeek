package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentWeekBinding


class WeekFragment : Fragment() {
    private lateinit var binding: FragmentWeekBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeekBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var weekdays = listOf(
            R.id.tv_monday,
            R.id.tv_tuesday,
            R.id.tv_wednesday,
            R.id.tv_thursday,
            R.id.tv_friday,
            R.id.tv_saturday,
            R.id.tv_sunday
        )


        weekdays.forEach { id ->
            val tv = binding.root.findViewById<TextView>(id)
            val stringDays: String = tv.text.toString()
            Log.e("weekday", stringDays)
            binding.root.findViewById<View>(id).setOnClickListener {
                findNavController().navigate(
                    WeekFragmentDirections.actionWeekFragmentToAppointmentFragment(
                        stringDays

                    )
                )




            }
        }
    }
}


