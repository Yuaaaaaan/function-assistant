package function.assistant.a003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.first_layout.*
import kotlinx.android.synthetic.main.second_layout.*
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        buttonwork3.setOnClickListener{
            if ((! TextUtils.isEmpty(input3_message_a.getText()) ) && (! TextUtils.isEmpty(input3_message_c.getText()) ) )
            {
                val a = input3_message_a.text.toString().toDouble()
                val b = input3_message_b.text.toString().toDouble()
                val c = input3_message_c.text.toString().toDouble()
                val d = input3_message_d.text.toString().toDouble()
                val e = input3_message_e.text.toString().toDouble()
                val f = input3_message_f.text.toString().toDouble()
                var xone = 0.0
                var xtwo = xone
                xtwo = (c*d-a*f)/(b*d-a*e)
                xone = (c-b*xtwo)/a
                View3.text="此方程组的解为/nx =$xone , y =$xtwo"
            }else View3.text="请输入全部参数！"
        }
    }
}