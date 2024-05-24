import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.Appointment
import com.example.myapplication.databinding.FragmentAppointmentBinding

class AppointmentAdapter(val appointments: List<Appointment>) :
    RecyclerView.Adapter<AppointmentAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: FragmentAppointmentBinding) : RecyclerView.ViewHolder(binding.root) {
        private val textView: TextView = binding.textView8

        fun bind(appointment: Appointment) {
            textView.text = appointment.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentAppointmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(appointments[position])
    }

    override fun getItemCount(): Int {
        return appointments.size
    }
}
