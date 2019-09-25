package com.example.scoreboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupClicks()
    }


    fun setupClicks() {
        btn_penalty_1.setOnClickListener {
            tv_penalty1.text = (tv_penalty1.text.toString().toInt() + 1).toString()
        }
        btn_penalty_2.setOnClickListener {
            tv_penalty2.text = (tv_penalty2.text.toString().toInt() + 1).toString()
        }
        btn_score_1.setOnClickListener {
            tv_goal_1.text = (tv_goal_1.text.toString().toInt() + 1).toString()
        }
        btn_score_2.setOnClickListener {
            tv_goal_2.text = (tv_goal_2.text.toString().toInt() + 1).toString()
        }
        btn_reset.setOnClickListener {
            tv_penalty1.text = "0"
            tv_penalty2.text = "0"
            tv_goal_1.text = "0"
            tv_goal_2.text = "0"
        }

    }


}
