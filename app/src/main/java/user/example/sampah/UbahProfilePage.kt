package user.example.sampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class UbahProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubah_profile_page)

        var checked = findViewById<ImageView>(R.id.Checked1)
        var editteks = findViewById<EditText>(R.id.edit5)

        editteks.setOnClickListener{

        }


    }
}