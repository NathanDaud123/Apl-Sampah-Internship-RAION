package user.example.sampah

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val bottomNavigationView =
            findViewById<View>(R.id.palingBawah) as BottomNavigationView
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(0)
        menuItem.isChecked = true
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.aktivitas -> {
                    val intent2 = Intent(this, AktivitasPage::class.java)
                    startActivity(intent2)
                }
                R.id.komunitas -> {
                    val intent3 = Intent(this, KomunitasPage::class.java)
                    startActivity(intent3)
                }
                R.id.profile -> {
                    val intent4 = Intent(this, ProfilePage::class.java)
                    startActivity(intent4)
                }
            }
            false
        }

        var pick_up = findViewById<ImageButton>(R.id.imageView30)
        var drop_off = findViewById<ImageButton>(R.id.imageView35)
        var info_manfaat_sampah = findViewById<ImageButton>(R.id.imageView27)
        var move_gerakan = findViewById<ImageButton>(R.id.grid1)

        pick_up.setOnClickListener{
            var intent = Intent(this, PickUp::class.java)
            startActivity(intent)
        }

//        drop_off.setOnClickListener{
//            var intent = Intent(this, DropOff::class.java)
//            startActivity(intent)
//        }

        info_manfaat_sampah.setOnClickListener{
            var intent = Intent(this, InformasiDetail::class.java)
            startActivity(intent)
        }

        move_gerakan.setOnClickListener{
            var intent = Intent(this, MovementDetail::class.java)
            startActivity(intent)
        }
    }
}