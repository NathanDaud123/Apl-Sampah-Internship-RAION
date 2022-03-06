package user.example.sampah

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var waktu_loading = 4000

    //4000=4 detik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            var pindah = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(pindah)
            finish()
        }, waktu_loading.toLong())
    }
}