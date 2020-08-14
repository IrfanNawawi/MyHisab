package com.mockdroid.myhisab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Number Button
        btn_0.setOnClickListener { appendNumber("0", true) }
        btn_1.setOnClickListener { appendNumber("1", true) }
        btn_2.setOnClickListener { appendNumber("2", true) }
        btn_3.setOnClickListener { appendNumber("3", true) }
        btn_4.setOnClickListener { appendNumber("4", true) }
        btn_5.setOnClickListener { appendNumber("5", true) }
        btn_6.setOnClickListener { appendNumber("6", true) }
        btn_7.setOnClickListener { appendNumber("7", true) }
        btn_8.setOnClickListener { appendNumber("8", true) }
        btn_9.setOnClickListener { appendNumber("9", true) }

        // Operator Button
        btn_plus.setOnClickListener { appendNumber("+", true) }
        btn_minus.setOnClickListener { appendNumber("-", true) }
        btn_kali.setOnClickListener { appendNumber("*", true) }
        btn_bagi.setOnClickListener { appendNumber("/", true) }
        btn_ac.setOnClickListener {
            tv_number.text = ""
            tv_result.text = ""
        }

        // Calculate
        btn_equals.setOnClickListener {
            val number = tv_number.text.toString()
            val calc = ExpressionBuilder(number).build()

            val result = calc.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                tv_result.text = longResult.toString()
            } else {
                tv_result.text = result.toString()
            }
        }
    }

    fun appendNumber(string: String, canClear: Boolean) {
        if(canClear) {
            tv_result.text = ""
            tv_number.append(string)
        } else {
            tv_number.append(tv_result.text)
            tv_number.append(string)
            tv_result.text = ""
        }
    }
}