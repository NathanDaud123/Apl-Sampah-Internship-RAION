package user.example.sampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class AktivitasPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_page)

        var pickUpButton = findViewById<ImageButton>(R.id.PickUpButton)
        var dropOffButton = findViewById<ImageButton>(R.id.DropOffButton)
        var pickUpText = findViewById<TextView>(R.id.PickUpText)
        var DropOffText = findViewById<TextView>(R.id.DropOffText)
        var TextRiwayat = findViewById<TextView>(R.id.TextRiwayat)
        var alamatRiwayat = findViewById<TextView>(R.id.AlamatRiwayat)
        var harga = findViewById<TextView>(R.id.HargaAktivitas)

        pickUpButton.setOnClickListener {
            pickUpText.setTextColor(0xFAFAFC) //putih
            DropOffText.setTextColor(0x77B1A3) //hijau
            pickUpButton.setImageResource(R.drawable.rectangle_3599) //hijau
            dropOffButton.setImageResource(R.drawable.rectangle_3600) //putih
            TextRiwayat.text = "Pick Up"
            alamatRiwayat.text = "Jl Banyuwangi - Hewan"
            harga.text = "Rp 6.650"
        }

        dropOffButton.setOnClickListener {
            pickUpText.setTextColor(0x77B1A3) //hijau
            DropOffText.setTextColor(0xFAFAFC) //putih
            pickUpButton.setImageResource(R.drawable.rectangle_3600) //putih
            dropOffButton.setImageResource(R.drawable.rectangle_3599) //hijau
            TextRiwayat.text = "Drop Off - TrashShelter"
            alamatRiwayat.text = "Jl Banyuwangi - Singa"
            harga.text = "Rp 12.825"
        }



    }
}