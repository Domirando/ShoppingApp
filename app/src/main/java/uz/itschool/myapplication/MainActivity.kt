package uz.itschool.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(this@MainActivity, ShoppingActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}