package user.example.sampah

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class RegistrationPage : AppCompatActivity(), View.OnClickListener {
    private lateinit var MasukButtonpage4 : TextView

    //buat hide password Kata Sandi
    private lateinit var  kataSandi : EditText
    private lateinit var hideKataSandi : ImageButton
    private var showPasswordd = false

    //buat hide password Ulangi Kata Sandi :
    private lateinit var  ulangiKataSandi : EditText
    private lateinit var hideUlangiKataSandi : ImageButton
    private var showPassworddd = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //intent ke welcoming page
        MasukButtonpage4 = findViewById(R.id.MasukButtonpage4)
        MasukButtonpage4.setOnClickListener(this)

        //page register button daftar ke daftar page
        var buttonDaftar = findViewById<TextView>(R.id.buttonDaftarRegister)
        buttonDaftar.setOnClickListener {
            var inten = Intent(this, LoginPage::class.java)
            startActivity(inten)
        }

        //button hide password Kata Sandi
        hideKataSandi = findViewById(R.id.showPasswordButton)
        kataSandi = findViewById(R.id.kataSandi)

        hideKataSandi.setOnClickListener {
            if (showPasswordd == true) {
                showPasswordd = false
                hideKataSandi.setImageResource(R.drawable.eye)
                kataSandi.setTransformationMethod(PasswordTransformationMethod.getInstance())
            } else {
                showPasswordd = true
                hideKataSandi.setImageResource(R.drawable.show_password)
                kataSandi.setTransformationMethod(HideReturnsTransformationMethod.getInstance())
            }
        }

        //button hide password ulangi Kata Sandi
        hideUlangiKataSandi = findViewById(R.id.showPasswordButton2)
        ulangiKataSandi = findViewById(R.id.kataSandi2)

        hideUlangiKataSandi.setOnClickListener {
            if (showPassworddd == true) {
                showPassworddd = false
                hideUlangiKataSandi.setImageResource(R.drawable.eye)
                ulangiKataSandi.setTransformationMethod(PasswordTransformationMethod.getInstance())
            } else {
                showPassworddd = true
                hideUlangiKataSandi.setImageResource(R.drawable.show_password)
                ulangiKataSandi.setTransformationMethod(HideReturnsTransformationMethod.getInstance())
            }
        }

        //setuju syarat dan ketentuan
        var setujuSyaratKetentuan = findViewById<ImageView>(R.id.checkboxSyarat)
        var setuju = false

        setujuSyaratKetentuan.setOnClickListener {
            if (setuju == true) {
                setujuSyaratKetentuan.setImageResource(R.drawable.check_box)
                setuju = false
            } else {
                setujuSyaratKetentuan.setImageResource(R.drawable.check_box_selected)
                setuju = true
            }
        }





    }
    //intent ke welcoming page
    override fun onClick(p0: View) {
        when(p0.id) {
            R.id.MasukButtonpage4 -> {
                val intenBiasa = Intent(this@RegistrationPage, LoginPage::class.java)
                startActivity(intenBiasa)
            }

        }
    }
}