package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var lewati = findViewById<Button>(R.id.lewati)
        lewati.setOnClickListener{
            var lanjut3 = Intent(this,MainActivity3::class.java)
            startActivity(lanjut3)
        }
    }
}