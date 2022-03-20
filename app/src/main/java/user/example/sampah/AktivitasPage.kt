package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class AktivitasPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_page)

        var pickUpButton = findViewById<ImageButton>(R.id.PickUpButton)
        var dropOffButton = findViewById<ImageButton>(R.id.DropOffButton)
        var TextRiwayat = findViewById<TextView>(R.id.TextRiwayat)
        var alamatRiwayat = findViewById<TextView>(R.id.AlamatRiwayat)
        var harga = findViewById<TextView>(R.id.HargaAktivitas)

        var pickUptextGreen = findViewById<TextView>(R.id.pickUpTextGreen)
        var pickUpTextwhite = findViewById<TextView>(R.id.PickUpTextWhite)
        var DropOffTextGreen = findViewById<TextView>(R.id.DropOffTextGreen)
        var DropOffTextWhite = findViewById<TextView>(R.id.dropOffTextWhite)



        pickUpButton.setOnClickListener {
            pickUpButton.setImageResource(R.drawable.rectangle_3599) //hijau
            dropOffButton.setImageResource(R.drawable.rectangle_3600) //putih
            pickUpTextwhite.text = "Pick Up"
            pickUptextGreen.text = ""

            DropOffTextGreen.text = "Drop Off"
            DropOffTextWhite.text = ""

            TextRiwayat.text = "Pick Up"
            alamatRiwayat.text = "Jl Banyuwangi - Hewan"
            harga.text = "Rp 6.650"
        }

        dropOffButton.setOnClickListener {
            pickUpButton.setImageResource(R.drawable.rectangle_3600) //putih

            pickUpTextwhite.text = ""
            pickUptextGreen.text = "Pick Up"

            DropOffTextGreen.text = ""
            DropOffTextWhite.text = "Drop Off"
            dropOffButton.setImageResource(R.drawable.rectangle_3599) //hijau
            TextRiwayat.text = "Drop Off - TrashShelter"
            alamatRiwayat.text = "Jl Banyuwangi - Singa"
            harga.text = "Rp 12.825"
        }



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