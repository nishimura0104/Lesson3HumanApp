package jp.techacademy.rei.nishimura.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("たろう",13,"野球")
        human1.say()
        human1.think()

        val human2 = Human("じろう",10,"サッカー")
        human2.say()
        human2.think()

    }
}