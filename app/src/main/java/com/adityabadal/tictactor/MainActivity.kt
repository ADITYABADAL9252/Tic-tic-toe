package com.adityabadal.tictactor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    private var flag = 0
    private var count = 0
    private lateinit var btnnewgame: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)
        btn4 = findViewById<Button>(R.id.btn4)
        btn5 = findViewById<Button>(R.id.btn5)
        btn6 = findViewById<Button>(R.id.btn6)
        btn7 = findViewById<Button>(R.id.btn7)
        btn8 = findViewById<Button>(R.id.btn8)
        btn9 = findViewById<Button>(R.id.btn9)
        btnnewgame = findViewById<Button>(R.id.btnnewgame).apply {

            setText("New Game")

        }
        btnnewgame.setOnClickListener {

                newgame()
                btnnewgame.visibility = View.INVISIBLE
            }
        }



    fun check(view: View) {
        val btncurrent = view as Button

        if (btncurrent.text == "") {
            count++
        }
        if (flag == 0) {
            btncurrent.text = "X"
            flag = 1
        } else {
            btncurrent.text = "O"
            flag = 0
        }

        btn1.text.toString()
        btn2.text.toString()
        btn3.text.toString()
        btn4.text.toString()
        btn5.text.toString()
        btn6.text.toString()
        btn7.text.toString()
        btn8.text.toString()
        btn9.text.toString()


        if (btn1.text == btn2.text && btn2.text == btn3.text && btn3.text.isNotBlank()) {
            Toast.makeText(this, "winner is ${btn1.text}", Toast.LENGTH_LONG).show()
            newgame()
        } else if (btn4.text == btn5.text && btn5.text == btn6.text && btn6.text != "") {
            Toast.makeText(this, "winner is ${btn4.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn7.text == btn8.text && btn8.text == btn9.text && btn9.text != "") {
            Toast.makeText(this, "winner is ${btn7.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn1.text == btn4.text && btn4.text == btn7.text && btn7.text != "") {
            Toast.makeText(this, "winner is ${btn1.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn2.text == btn5.text && btn5.text == btn8.text && btn8.text != "") {
            Toast.makeText(this, "winner is ${btn2.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn3.text == btn6.text && btn6.text == btn9.text && btn9.text != "") {
            Toast.makeText(this, "winner is ${btn3.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn1.text == btn5.text && btn5.text == btn9.text && btn9.text != "") {
            Toast.makeText(this, "winner is ${btn1.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        } else if (btn3.text == btn5.text && btn5.text == btn7.text && btn7.text != "") {
            Toast.makeText(this, "winner is ${btn3.text}", Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE

        } else if(count==9) {
             Toast.makeText(this,"match Tie",Toast.LENGTH_LONG).show()
            btnnewgame.visibility = View.VISIBLE
        }
    }
    fun newgame() {
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        flag = 0
        count = 0
    }

}