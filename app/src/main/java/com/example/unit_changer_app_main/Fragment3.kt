package com.example.unit_changer_app_main
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment


class Fragment3 : Fragment(R.layout.fragment3){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val Convertbtn3 = view.findViewById<Button>(R.id.ConvertWeightBtn)
        val GramOutput = view.findViewById<TextView>(R.id.GramTextViewOutput)
        val PoundOutput = view.findViewById<TextView>(R.id.PoundTextViewOutput)
        val OunceOutput = view.findViewById<TextView>(R.id.OunceTextViewOutput)
        val Grambtn = view.findViewById<RadioButton>(R.id.Grambtn)
        val Ouncebtn = view.findViewById<RadioButton>(R.id.Ouncebtn)
        val Poundbtn = view.findViewById<RadioButton>(R.id.Poundbtn)
        val numinput = view.findViewById<EditText>(R.id.WeightNumberInput)
        var hold = 0.0

        Convertbtn3.setOnClickListener(){
            if (Grambtn.isChecked){
                hold = (numinput.text.toString().toDouble())
                GramOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/28.35
                OunceOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/454
                PoundOutput.text = hold.toString()


            }
            else if (Ouncebtn.isChecked){
                hold = (numinput.text.toString().toDouble())*28.35
                GramOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())
                OunceOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())/16
                PoundOutput.text = hold.toString()

            }
            else if (Poundbtn.isChecked){
                hold = (numinput.text.toString().toDouble())*454
                GramOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())*16
                OunceOutput.text = hold.toString()
                hold = (numinput.text.toString().toDouble())
                PoundOutput.text = hold.toString()


            }
        }

    }
}