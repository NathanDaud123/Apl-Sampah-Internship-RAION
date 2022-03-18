package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PickUpKatKertas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up_kat_kertas)


        var lanjut = findViewById<ImageButton>(R.id.PickKertasLanjutButton)

        lanjut.setOnClickListener {
            var pindah = Intent(this, HomePage::class.java)
            startActivity(pindah)
        }
    }
}