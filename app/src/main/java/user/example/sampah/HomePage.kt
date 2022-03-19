package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.navigation.NavigationBarMenuView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

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