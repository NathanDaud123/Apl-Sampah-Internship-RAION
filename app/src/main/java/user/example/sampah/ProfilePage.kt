package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)
        val bottomNavigationView =
            findViewById<View>(R.id.palingBawah) as BottomNavigationView
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(3)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent1 = Intent(this, HomePage::class.java)
                    startActivity(intent1)
                }
                R.id.aktivitas -> {
                    val intent2 = Intent(this, AktivitasPage::class.java)
                    startActivity(intent2)
                }
                R.id.komunitas -> {
                    val intent3 = Intent(this, KomunitasPage::class.java)
                    startActivity(intent3)
                }
            }
            false
        }

        //intent ke ubah profile
        var gambarUbah = findViewById<ImageView>(R.id.gambarUbahProfil)
        var teksUbah = findViewById<TextView>(R.id.TulisanUbahProfil)
        var buttonUbah = findViewById<ImageView>(R.id.buttonUbahProfil)

        gambarUbah.setOnClickListener {
            var intent = Intent(this, UbahProfilePage::class.java)
            startActivity(intent)
        }

        teksUbah.setOnClickListener {
            var intent = Intent(this, UbahProfilePage::class.java)
            startActivity(intent)
        }

        buttonUbah.setOnClickListener {
            var intent = Intent(this, UbahProfilePage::class.java)
            startActivity(intent)
        }

        //intent ke login page
        var keluar = findViewById<TextView>(R.id.TulisanKeluar)

        keluar.setOnClickListener {
            var intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }


    }
}