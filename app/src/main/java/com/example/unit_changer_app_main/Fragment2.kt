package com.example.unit_changer_app_main
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment


class Fragment2 : Fragment(R.layout.fragment2){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val Convertbtn2 = view.findViewById<Button>(R.id.ConvertVolumeBtn)
        val GallonOutput = view.findViewById<TextView>(R.id.GallonTextViewOutput)
        val QuartOutput = view.findViewById<TextView>(R.id.QuartTextViewOutput)
        val LiterOutput = view.findViewById<TextView>(R.id.LiterTextViewOutput)
        val Gallonbtn = view.findViewById<RadioButton>(R.id.Gallonbtn)
        val Literbtn = view.findViewById<RadioButton>(R.id.Literbtn)
        val Quartbtn = view.findViewById<RadioButton>(R.id.Quartbtn)
        val numinput = view.findViewById<EditText>(R.id.VolumeNumberInput)
        var hold = 0.0

        Convertbtn2.setOnClickListener(){
            if (Gallonbtn.isChecked){
                hold = (numinput.text.toString().toDouble())
                GallonOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())*3.7854
                LiterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())*4
                QuartOutput.text = hold.toString()


            }
            else if (Literbtn.isChecked){
                hold = (numinput.text.toString().toDouble())/3.7854
                GallonOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())
                LiterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())*1.057
                QuartOutput.text = hold.toString()

            }
            else if (Quartbtn.isChecked){
                hold = (numinput.text.toString().toDouble())/4
                GallonOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/1.057
                LiterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())
                QuartOutput.text = hold.toString()


            }
        }

    }
}