package user.example.sampah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class SubPickUpPlastik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_pick_up_plastik)

        val estimasi_plastik = findViewById<TextView>(R.id.angka_estimasi)

        val plus1 = findViewById<ImageButton>(R.id.plus1)
        val plus2 = findViewById<ImageButton>(R.id.plus2)
        val plus3 = findViewById<ImageButton>(R.id.plus3)
        val plus4 = findViewById<ImageButton>(R.id.plus4)
        val plus5 = findViewById<ImageButton>(R.id.plus5)
        val plus6 = findViewById<ImageButton>(R.id.plus6)

        val minus1 = findViewById<ImageButton>(R.id.minus1)
        val minus2 = findViewById<ImageButton>(R.id.minus2)
        val minus3 = findViewById<ImageButton>(R.id.minus3)
        val minus4 = findViewById<ImageButton>(R.id.minus4)
        val minus5 = findViewById<ImageButton>(R.id.minus5)
        val minus6 = findViewById<ImageButton>(R.id.minus6)

        val num1 = findViewById<TextView>(R.id.num1)
        val num2 = findViewById<TextView>(R.id.num2)
        val num3 = findViewById<TextView>(R.id.num3)
        val num4 = findViewById<TextView>(R.id.num4)
        val num5 = findViewById<TextView>(R.id.num5)
        val num6 = findViewById<TextView>(R.id.num6)

        var counter1:Int = 0
        num1.setText(counter1)

        plus1.setOnClickListener{
            counter1++
            num1.setText(counter1)
        }
        minus1.setOnClickListener{
            if(counter1 > 0){
                counter1--
                num1.setText(counter1)
            } else {
                counter1 = 0
                num1.setText(counter1)
            }
        }

        var counter2:Int = 0
        num1.setText(counter2)

        plus1.setOnClickListener{
            counter2++
            num1.setText(counter2)
        }
        minus1.setOnClickListener{
            if(counter2 > 0){
                counter2--
                num1.setText(counter2)
            } else {
                counter2 = 0
                num1.setText(counter2)
            }
        }

        var counter3:Int = 0
        num1.setText(counter3)

        plus1.setOnClickListener{
            counter3++
            num1.setText(counter3)
        }
        minus1.setOnClickListener{
            if(counter3 > 0){
                counter3--
                num1.setText(counter3)
            } else {
                counter3 = 0
                num1.setText(counter3)
            }
        }

        var counter4:Int = 0
        num1.setText(counter4)

        plus1.setOnClickListener{
            counter4++
            num1.setText(counter4)
        }
        minus1.setOnClickListener{
            if(counter4 > 0){
                counter4--
                num1.setText(counter4)
            } else {
                counter4 = 0
                num1.setText(counter4)
            }
        }

        var counter5:Int = 0
        num1.setText(counter5)

        plus1.setOnClickListener{
            counter5++
            num1.setText(counter5)
        }
        minus1.setOnClickListener{
            if(counter5 > 0){
                counter5--
                num1.setText(counter5)
            } else {
                counter5 = 0
                num1.setText(counter5)
            }
        }

        var counter6:Int = 0
        num1.setText(counter6)

        plus1.setOnClickListener{
            counter6++
            num1.setText(counter6)
        }
        minus1.setOnClickListener{
            if(counter6 > 0){
                counter6--
                num1.setText(counter6)
            } else {
                counter6 = 0
                num1.setText(counter6)
            }
        }

        val total_plastik:Int = counter1+counter2+counter3+counter4+counter5+counter6
        estimasi_plastik.setText(total_plastik)
    }
}