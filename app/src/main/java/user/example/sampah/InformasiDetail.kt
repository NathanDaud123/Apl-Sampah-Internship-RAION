package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class InformasiDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_detail)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}