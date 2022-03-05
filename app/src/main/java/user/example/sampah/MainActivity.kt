package user.example.sampah

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import user.example.sampah.ui.login.activity_main3


class MainActivity : AppCompatActivity() {
    private val waktu_loading = 4000

    //4000=4 detik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val home = Intent(this@MainActivity,activity_main3::class.java)
            startActivity(home)
            finish()
        }, waktu_loading.toLong())
    }
}