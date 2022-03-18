package user.example.sampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.navigation.NavigationBarMenuView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
//        var paling_bawah = findViewById<NavigationBarMenuView>(R.id.palingBawah);
//        paling_bawah.setOnNavigationItemSelectedListener(this);
    }
}

//private fun NavigationBarMenuView.setOnNavigationItemSelectedListener(homePage: HomePage) {
//    if
//}
