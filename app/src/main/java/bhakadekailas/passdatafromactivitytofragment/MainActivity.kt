package bhakadekailas.passdatafromactivitytofragment

import MyFragment
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val myFragment = MyFragment()

        button = findViewById(R.id.btnSendData)
        editText = findViewById(R.id.editText)

        button!!.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("message", editText!!.text.toString())
            Log.e("Kailas", ": " + bundle.getString("message"))
            myFragment.arguments = bundle
            fragmentTransaction.add(R.id.frameLayout, myFragment).commit()
        }
    }
}