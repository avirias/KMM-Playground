package me.avirias.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import me.avirias.shared.Greeting
import android.widget.TextView
import me.avirias.shared.helloWorld

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        Log.d(TAG, "onCreate: ${helloWorld()}")

    }


    companion object {
        private const val TAG = "MainActivity"
    }
}
