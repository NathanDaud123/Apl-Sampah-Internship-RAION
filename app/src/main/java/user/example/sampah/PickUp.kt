package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class PickUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up)

        val back = findViewById<ImageButton>(R.id.back)
        val kertas = findViewById<ImageButton>(R.id.kertas)
        val plastik = findViewById<ImageButton>(R.id.plastik)
        var aluminium = findViewById<ImageButton>(R.id.aluminium)
        val besi = findViewById<ImageButton>(R.id.besi)
        val elekronik = findViewById<ImageButton>(R.id.elektronik)
        val botol = findViewById<ImageButton>(R.id.botol)
        val lanjut = findViewById<ImageButton>(R.id.rectangle_bawah)

        val kg = findViewById<TextView>(R.id.kg)
        val item = findViewById<TextView>(R.id.item)

        var tempTotal:Int
        var itemPlastik:String
        var tempJenis:String

        var kgPlastik = intent.getStringExtra("estimasiPlastik")
        if(intent.getStringExtra("estimasiPlastik").equals("0")){
            itemPlastik = ""
        } else {
            itemPlastik = "Plastik"
        }

        tempTotal = 0

        if (kgPlastik != null) {
            tempTotal = kgPlastik.toInt()
        }

        tempJenis = itemPlastik

        kg.setText(Integer.toString(tempTotal))
        item.setText(tempJenis)

        back.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        kertas.setOnClickListener{
            var intent = Intent(this, SubPickUpKertas::class.java)
            startActivity(intent)
        }

        plastik.setOnClickListener{
            val intent = Intent(this, SubPickUpPlastik::class.java)
            startActivity(intent)
        }

        aluminium.setOnClickListener{
            var intent = Intent(this, SubPickUpAlumunium::class.java)
            startActivity(intent)
        }

        besi.setOnClickListener{
            val intent = Intent(this, SubPickUpBesi::class.java)
            startActivity(intent)
        }

        elekronik.setOnClickListener{
            val intent = Intent(this, SubPickUpElektronik::class.java)
            startActivity(intent)
        }

        botol.setOnClickListener{
            var intent = Intent(this, SubPickUpKaca::class.java)
            startActivity(intent)
        }

        lanjut.setOnClickListener{
            val intent = Intent(this, DetailHariIni::class.java)
            startActivity(intent)

        }
    }
}