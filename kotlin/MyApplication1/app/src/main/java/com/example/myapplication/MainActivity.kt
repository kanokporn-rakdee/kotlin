package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val w = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val e = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val r = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val t = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        buttonOK.setOnClickListener(){
            if (this.idText.text.toString() == "" || this.passW.text.toString() == "" || this.PassW.text.toString() == ""){
            r.show()
        }
            else{
            if (this.idText.text.toString() == this.passW.text.toString() || this.idText.text.toString() == this.PassW.text.toString()||
            this.idText.text.toString() == this.passW.text.toString() && this.idText.text.toString() == this.PassW.text.toString()){
            w.show()
        }
            else
                if (this.passW.text.toString() == this.PassW.text.toString()){
            t.show()
        }
        else{
            e.show()
        }
        }
        }

        buttonCLEAR.setOnClickListener(){
            idText.setText(null)
            passW.setText(null)
            PassW.setText(null)
        }
    }
}