package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class AktivitasPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_page)
        val bottomNavigationView =
            findViewById<View>(R.id.palingBawah) as BottomNavigationView
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(1)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent1 = Intent(this, HomePage::class.java)
                    startActivity(intent1)
                }
                R.id.komunitas -> {
                    val intent2 = Intent(this, KomunitasPage::class.java)
                    startActivity(intent2)
                }
                R.id.profile -> {
                    val intent3 = Intent(this, ProfilePage::class.java)
                    startActivity(intent3)
                }
            }
            false
        }


    }
}