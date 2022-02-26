package function.assistant.a003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.second_layout.*
import kotlinx.android.synthetic.main.third_layout.*
import kotlin.math.sqrt

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        buttonwork2.setOnClickListener {if((! TextUtils.isEmpty(input_message_a.getText()) ) && (! TextUtils.isEmpty(input_message_c.getText()) ) ){
            val puta = input_message_a.text.toString().toDouble()
            val putb = input_message_b.text.toString().toDouble()
            val putc = input_message_c.text.toString().toDouble()
            var xone = 0.0
            var xtwo = xone
            val state: Int
            val delta = putb * putb - 4 * puta * putc
            if (delta > 0.0) {
                xone = (-putb + sqrt(delta)) / 2 * puta
                xtwo = (-putb - sqrt(delta)) / 2 * puta
                state = 3
            } else {
                if (delta == 0.0) {
                    xone = (-putb / 2 * puta)
                    xtwo = xone
                    state = 2
                } else state = 1
            }
            if (state == 3) View2.text = "x1=$xone ,x2=$xtwo"
            else if (state == 2) View2.text = "x1=x2=$xone"
            else View2.text = "此方程无实根"}else View2.text="请输入全部参数！"
        }
    }
}