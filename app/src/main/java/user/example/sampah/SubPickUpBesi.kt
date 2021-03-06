package user.example.sampah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class SubPickUpBesi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_pick_up_besi)
        val estimasi_besi = findViewById<TextView>(R.id.angka_estimasi)

        val lanjut = findViewById<ImageView>(R.id.rec_lanjut)
        val besi = findViewById<TextView>(R.id.text_plastik)

        val plus1 = findViewById<ImageView>(R.id.plus1)
        val plus2 = findViewById<ImageView>(R.id.plus2)
        val plus3 = findViewById<ImageView>(R.id.plus3)
        val plus4 = findViewById<ImageView>(R.id.plus4)
        val plus5 = findViewById<ImageView>(R.id.plus5)
        val plus6 = findViewById<ImageView>(R.id.plus6)
        val plus7 = findViewById<ImageButton>(R.id.plus7)

        val minus1 = findViewById<ImageButton>(R.id.minus1)
        val minus2 = findViewById<ImageButton>(R.id.minus2)
        val minus3 = findViewById<ImageButton>(R.id.minus3)
        val minus4 = findViewById<ImageButton>(R.id.minus4)
        val minus5 = findViewById<ImageButton>(R.id.minus5)
        val minus6 = findViewById<ImageButton>(R.id.minus6)
        val minus7 = findViewById<ImageButton>(R.id.minus7)

        val num1 = findViewById<TextView>(R.id.num1)
        val num2 = findViewById<TextView>(R.id.num2)
        val num3 = findViewById<TextView>(R.id.num3)
        val num4 = findViewById<TextView>(R.id.num4)
        val num5 = findViewById<TextView>(R.id.num5)
        val num6 = findViewById<TextView>(R.id.num6)
        val num7 = findViewById<TextView>(R.id.num7)

        var total_besi:Int = 0

        var counter1:Int = 0
        plus1.setOnClickListener{
            counter1++
            total_besi++
            num1.setText(Integer.toString(counter1))
            estimasi_besi.setText(Integer.toString(total_besi))
        }
        minus1.setOnClickListener{
            if(counter1 > 0){
                counter1--
                total_besi--
                num1.setText(Integer.toString(counter1))
                estimasi_besi.setText(Integer.toString(total_besi))
            } else {
                counter1 = 0
                num1.setText(Integer.toString(counter1))
            }
        }

        var counter2:Int = 0

        plus2.setOnClickListener{
            counter2++
            total_besi++
            num2.setText(Integer.toString(counter2))
            estimasi_besi.setText(Integer.toString(total_besi))
        }
        minus2.setOnClickListener{
            if(counter2 > 0){
                counter2--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num2.setText(Integer.toString(counter2))
            } else {
                counter2 = 0
                num2.setText(Integer.toString(counter2))
            }
        }

        var counter3:Int = 0

        plus3.setOnClickListener{
            counter3++
            total_besi++
            estimasi_besi.setText(Integer.toString(total_besi))
            num3.setText(Integer.toString(counter3))
        }
        minus3.setOnClickListener{
            if(counter3 > 0){
                counter3--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num3.setText(Integer.toString(counter3))
            } else {
                counter3 = 0
                num3.setText(Integer.toString(counter3))
            }
        }

        var counter4:Int = 0

        plus4.setOnClickListener{
            counter4++
            total_besi++
            estimasi_besi.setText(Integer.toString(total_besi))
            num4.setText(Integer.toString(counter4))
        }
        minus4.setOnClickListener{
            if(counter4 > 0){
                counter4--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num4.setText(Integer.toString(counter4))
            } else {
                counter4 = 0
                num4.setText(Integer.toString(counter4))
            }
        }

        var counter5:Int = 0

        plus5.setOnClickListener{
            counter5++
            total_besi++
            estimasi_besi.setText(Integer.toString(total_besi))
            num5.setText(Integer.toString(counter5))
        }
        minus5.setOnClickListener{
            if(counter5 > 0){
                counter5--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num5.setText(Integer.toString(counter5))
            } else {
                counter5 = 0
                num5.setText(Integer.toString(counter5))
            }
        }

        var counter6:Int = 0

        plus6.setOnClickListener{
            counter6++
            total_besi++
            estimasi_besi.setText(Integer.toString(total_besi))
            num6.setText(Integer.toString(counter6))
        }
        minus6.setOnClickListener{
            if(counter6 > 0){
                counter6--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num6.setText(Integer.toString(counter6))
            } else {
                counter6 = 0
                num6.setText(Integer.toString(counter6))
            }

        }

        var counter7:Int = 0

        plus7.setOnClickListener{
            counter7++
            total_besi++
            estimasi_besi.setText(Integer.toString(total_besi))
            num7.setText(Integer.toString(counter7))
        }
        minus7.setOnClickListener{
            if(counter7 > 0){
                counter7--
                total_besi--
                estimasi_besi.setText(Integer.toString(total_besi))
                num6.setText(Integer.toString(counter7))
            } else {
                counter7 = 0
                num6.setText(Integer.toString(counter7))
            }
        }

        lanjut.setOnClickListener{
            val intent = Intent(this, PickUp::class.java)
            intent.putExtra("estimasiBesi", estimasi_besi.text.toString())
//            intent.putExtra("jenisBesi", besi.text.toString())
            startActivity(intent)
        }
    }
}