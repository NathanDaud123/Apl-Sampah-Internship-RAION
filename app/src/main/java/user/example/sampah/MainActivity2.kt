package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity2 : AppCompatActivity() {

//    lateinit var adapters: Adapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //KODE TEKS CHANGE DISPLAY VIA BUTTON
        var lanjut = findViewById<TextView>(R.id.ButtonLanjut)
        var teksganti = findViewById<TextView>(R.id.TeksGantiganti)
        var judulganti = findViewById<TextView>(R.id.mainJudulgantiganti)
        var gambar1 = findViewById<ImageView>(R.id.page2gambar1)
        var itung: Int = 0

        lanjut.setOnClickListener {
            if (itung == 0) {
                teksganti.text = "Sampah akan diambil oleh kolektor kami sesuai alamat anda."
                judulganti.text = "Tunggu Kolektor"
                gambar1.setImageResource(R.drawable.page2gambar2)
                itung++
            } else if (itung == 1){
                teksganti.text = "Tukarkan sampah yang sudah anda kumpulkan menjadi uang yang dapat diperbelanjakan."
                judulganti.text = "Dapatkan Uang"
                lanjut.text = "Selesai"
                gambar1.setImageResource(R.drawable.page2gambar3)
                itung++
            } else if (itung == 2) {
                var nextPage = Intent(this,LoginPage::class.java)
                startActivity(nextPage)
            }
        }

//        var lewati = findViewById<Button>(R.id.lewati)
//        lewati.setOnClickListener{
//            var lanjut3 = Intent(this,MainActivity3::class.java)
//            startActivity(lanjut3)
//        }
    }
}