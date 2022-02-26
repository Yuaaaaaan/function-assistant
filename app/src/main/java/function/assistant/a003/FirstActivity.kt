package function.assistant.a003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.first_layout.*
import kotlinx.android.synthetic.main.second_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        buttonwork1.setOnClickListener {
            if ((! TextUtils.isEmpty(input1_message_a.getText()) ) && (! TextUtils.isEmpty(input1_message_b.getText()) ) )
            { val puta = input1_message_a.text.toString().toDouble()
            val putb = input1_message_b.text.toString().toDouble()
            val xone = -putb/puta
            View.text="此方程的解为x = $xone"}else View.text="请输入全部参数！"
        }
    }
}