package com.example.unit_changer_app_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unit_changer_app_main.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener(){
            replaceFragment(Fragment1())
            binding.textView4.text = ""


        }
        binding.btn2.setOnClickListener(){
            replaceFragment(Fragment2())
            binding.textView4.text = ""

        }
        binding.btn3.setOnClickListener(){
            replaceFragment(Fragment3())
            binding.textView4.text = ""

        }

    }
    private fun replaceFragment(fragment : Fragment){
        val fragman = supportFragmentManager
        val fragtrans = fragman.beginTransaction()
        fragtrans.replace(R.id.con,fragment)
        fragtrans.commit()


    }
}