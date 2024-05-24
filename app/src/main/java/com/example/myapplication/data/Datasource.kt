package com.example.myapplication.data

object Datasource {
    val listAppointment = mutableListOf(
        Appointment(description = "Beschreibung", time = "11:00", wochentag = "Mo")
    )


    fun getData(): List<Appointment> {
        return listAppointment
    }

    fun singleData(value: Appointment) {
        listAppointment.add(value)
    }

}