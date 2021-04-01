import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import bhakadekailas.passdatafromactivitytofragment.R

class MyFragment : Fragment() {
    var textView: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.fragment_my, container, false)
        textView = view.findViewById(R.id.textView)
        val bundle : Bundle? = arguments!!
        textView!!.text = bundle!!.getString("message")
        return view
    }
}