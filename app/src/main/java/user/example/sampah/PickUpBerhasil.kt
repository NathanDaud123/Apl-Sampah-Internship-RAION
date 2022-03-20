package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PickUpBerhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up_berhasil)

        val lanjut = findViewById<ImageButton>(R.id.lanjut_putih)
        lanjut.setOnClickListener {
            var intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }
    }
}