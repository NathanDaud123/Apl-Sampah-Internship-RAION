package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class KonfirmasiPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_page)

        val back = findViewById<ImageButton>(R.id.back)
        back.setOnClickListener {
            var intent = Intent(this,DetailAturJadwal::class.java)
            startActivity(intent)
        }

        val lanjut = findViewById<ImageButton>(R.id.rec_lanjut)
        lanjut.setOnClickListener {
            var intent = Intent(this,PickUpBerhasil::class.java)
            startActivity(intent)
        }
    }
}