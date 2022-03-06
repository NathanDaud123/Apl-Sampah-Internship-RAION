package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity2 : AppCompatActivity() {

    lateinit var adapters: Adapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var list = mutableListOf<Int>()

        list.add(R.drawable.rectangle_1)
        list.add(R.drawable.facebook)
        list.add(R.drawable.rectangle_1)
        list.add(R.drawable.gog)
        list.add(R.drawable.rectangle_1)
        list.add(R.drawable.pemuda_panjasila)


        adapters=Adapters(this)
        adapters.setContentList(list)
        val viewpager = findViewById<ViewPager2>(R.id.viewpager)
        viewpager.adapter=adapters



        var lewati = findViewById<Button>(R.id.lewati)
        lewati.setOnClickListener{
            var lanjut3 = Intent(this,MainActivity3::class.java)
            startActivity(lanjut3)







        }
    }
}