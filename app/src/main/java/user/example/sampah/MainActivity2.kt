package user.example.sampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



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
        viewpager.adapter=adapters



    }
}