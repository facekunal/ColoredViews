package com.example.coloredviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun setListeners() {
        val viewList: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout)
        for(item in viewList) {
            item.setOnClickListener(this::changeColor)
        }
    }

    fun changeColor(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
