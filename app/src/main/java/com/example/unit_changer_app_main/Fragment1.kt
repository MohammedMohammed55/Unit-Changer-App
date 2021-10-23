package com.example.unit_changer_app_main
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment


class Fragment1 : Fragment(R.layout.fragment1){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val Convertbtn = view.findViewById<Button>(R.id.ConvertLengthBtn)
        val InchOutput = view.findViewById<TextView>(R.id.InchTextViewOutput)
        val FootOutput = view.findViewById<TextView>(R.id.FootTextViewOutput)
        val MeterOutput = view.findViewById<TextView>(R.id.MeterTextViewOutput)
        val Inchbtn = view.findViewById<RadioButton>(R.id.Inchbtn)
        val Meterbtn = view.findViewById<RadioButton>(R.id.Meterbtn)
        val Footbtn = view.findViewById<RadioButton>(R.id.Footbtn)
        val numinput = view.findViewById<EditText>(R.id.LengthNumberInput)
        var hold = 0.0

        Convertbtn.setOnClickListener(){
            if (Inchbtn.isChecked){
                hold = (numinput.text.toString().toDouble())
                InchOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/39.37
                MeterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/12
                FootOutput.text = hold.toString()


            }
            else if (Meterbtn.isChecked){
                hold = (numinput.text.toString().toDouble())*39.37
                InchOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())
                MeterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())*3.281
                FootOutput.text = hold.toString()

            }
            else if (Footbtn.isChecked){
                hold = (numinput.text.toString().toDouble())*12
                InchOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/3
                MeterOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/3.281
                FootOutput.text = hold.toString()


            }
        }

    }
}






