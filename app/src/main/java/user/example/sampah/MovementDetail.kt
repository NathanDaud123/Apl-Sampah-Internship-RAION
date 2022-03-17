package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MovementDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movement_detail)




        var backHomeButton = findViewById<ImageButton>(R.id.BackHomeButton)

        backHomeButton.setOnClickListener {
            var inten = Intent(this, HomePage::class.java)
            startActivity(inten)
        }
    }
}