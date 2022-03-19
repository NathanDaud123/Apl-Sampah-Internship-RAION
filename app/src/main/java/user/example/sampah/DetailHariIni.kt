package user.example.sampah

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailHariIni : AppCompatActivity() {
    var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hari_ini)

        imageView = findViewById(R.id.rectangle_foto)
        val button = findViewById<ImageButton>(R.id.rectangle_foto)
        button.setOnClickListener {
            val intentCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intentCamera, CAMERA_REQUEST)
        }

        val back = findViewById<ImageButton>(R.id.back)
        back.setOnClickListener{
            var intent = Intent(this,PickUp::class.java)
            startActivity(intent)
        }

        val jadwal = findViewById<ImageButton>(R.id.but_atur_jadwal)
        jadwal.setOnClickListener {
            var intent = Intent(this,DetailAturJadwal::class.java)
            startActivity(intent)
        }

        val lanjut = findViewById<ImageButton>(R.id.rec_lanjut)
        lanjut.setOnClickListener {
            var intent = Intent(this,DetailAturJadwal::class.java)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            val photoCamera = data!!.extras!!["data"] as Bitmap?
            imageView!!.setImageBitmap(photoCamera)
        }
    }
    companion object {
        const val CAMERA_REQUEST = 1888
    }
}