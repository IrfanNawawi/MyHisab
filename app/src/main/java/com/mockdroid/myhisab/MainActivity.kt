package com.mockdroid.myhisab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener {

        }

        btn_plus.setOnClickListener {
            if (tv_number_1.text.toString().isEmpty() || tv_number_2.text.toString().isEmpty()) {
                Toast.makeText(this, "Please insert Number", Toast.LENGTH_SHORT).show()
            } else {
                val a = tv_number_1.text.toString().toDouble()
                val c = tv_number_2.text.toString().toDouble()

                val d = this.tambah(a, c)
                tv_operator.setText(d.toString())
            }
        }

        btn_minus.setOnClickListener {
            if (tv_number_1.text.toString().isEmpty() || tv_number_2.text.toString().isEmpty()) {
                Toast.makeText(this, "Please insert Number", Toast.LENGTH_SHORT).show()
            } else {
                val a = tv_number_1.text.toString().toDouble()
                val c = tv_number_2.text.toString().toDouble()

                val d = this.kurang(a, c)
                tv_operator.setText(d.toString())
            }
        }

        btn_kali.setOnClickListener {
            if (tv_number_1.text.toString().isEmpty() || tv_number_2.text.toString().isEmpty()) {
                Toast.makeText(this, "Please insert Number", Toast.LENGTH_SHORT).show()
            } else {
                val a = tv_number_1.text.toString().toDouble()
                val c = tv_number_2.text.toString().toDouble()

                val d = this.kali(a, c)
                tv_operator.setText(d.toString())
            }
        }

        btn_bagi.setOnClickListener {
            if (tv_number_1.text.toString().isEmpty() || tv_number_2.text.toString().isEmpty()) {
                Toast.makeText(this, "Please insert Number", Toast.LENGTH_SHORT).show()
            } else {
                val a = tv_number_1.text.toString().toDouble()
                val c = tv_number_2.text.toString().toDouble()

                val d = this.bagi(a, c)
                tv_operator.setText(d.toString())
            }
        }
    }

    fun tambah(a: Double, c: Double): Double {
        return a + c
    }

    fun kurang(a: Double, c: Double): Double {
        return a - c
    }

    fun kali(a: Double, c: Double): Double {
        return a * c
    }

    fun bagi(a: Double, c: Double): Double {
        return a / c
    }
}