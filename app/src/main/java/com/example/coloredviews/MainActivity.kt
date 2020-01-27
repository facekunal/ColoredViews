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
        val viewList: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text,
            box_five_text, constraint_layout, red_button, green_button, yellow_button)
        for(item in viewList) {
            item.setOnClickListener(this::changeColor)
        }
    }

    fun changeColor(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.red)
            R.id.green_button -> box_four_text.setBackgroundResource(R.color.green)
            R.id.yellow_button -> box_five_text.setBackgroundResource(R.color.yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
