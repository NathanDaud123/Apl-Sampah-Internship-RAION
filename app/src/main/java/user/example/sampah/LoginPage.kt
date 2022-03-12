package user.example.sampah

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

class LoginPage : AppCompatActivity() {

    private lateinit var mataBuka: ImageButton
    private lateinit var password: EditText
    private var showPassword = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var backButton = findViewById<ImageButton>(R.id.back_button)
        backButton.setOnClickListener {
            var pindah = Intent(this@LoginPage, WelcomingPage::class.java)
            startActivity(pindah)
        }
        password = findViewById(R.id.password)
        mataBuka = findViewById(R.id.mataBuka)
        mataBuka.setOnClickListener {
            if (showPassword) {
                mataBuka.setImageResource(R.drawable.tutup)
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                showPassword = false
            } else {
                mataBuka.setImageResource(R.drawable.buka)
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                showPassword = true
            }
        }

        var daftar = findViewById<TextView>(R.id.daftar)
        daftar.setOnClickListener {
            var pindah = Intent(this@LoginPage, RegistrationPage::class.java)

            startActivity(pindah)
        }
    }
}