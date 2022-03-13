package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class RegistrationPage : AppCompatActivity(), View.OnClickListener {
    private lateinit var MasukButtonpage4 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        MasukButtonpage4 = findViewById(R.id.MasukButtonpage4)

        MasukButtonpage4.setOnClickListener(this)

        //page register button daftar ke daftar page
        var buttonDaftar = findViewById<TextView>(R.id.buttonDaftarRegister)
        buttonDaftar.setOnClickListener {
            var inten = Intent(this, LoginPage::class.java)
            startActivity(inten)
        }


    }

    override fun onClick(p0: View) {
        when(p0.id) {
            R.id.MasukButtonpage4 -> {
                val intenBiasa = Intent(this@RegistrationPage, WelcomingPage::class.java)
                startActivity(intenBiasa)
            }

        }
    }
}