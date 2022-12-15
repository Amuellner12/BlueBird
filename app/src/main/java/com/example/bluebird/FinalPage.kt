package com.example.bluebird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FinalPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_page)



        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.FinalPage)
            btn1 = findViewById(R.id.tricep_button)
            btn2 = findViewById(R.id.bicep_button)
            btn3 = findViewById(R.id.chest_button)
            btn4 = findViewById(R.id.back_button)

            public void onClick(View v) {
                biceptext.setVisibility(View.VISIBLE)
            }
        })

        btn2.setOnClickListener(new View.OnCLickListener(){
            public void onClick(View v) {
                tricptext.setVisiblity(View.INVISIBLE)
            }

            btn3.setOnClickListener(new View.OnCLickListener(){
                public void onClick(View v) {
                    chesttext.setVisiblity(View.INVISIBLE)
                }
                btn4.setOnClickListener(new View.OnCLickListener(){
                    public void onClick(View v) {
                        backbutton.setVisiblity(View.INVISIBLE)
                    }

