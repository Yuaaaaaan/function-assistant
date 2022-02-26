package function.assistant.a003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            val intent1 = Intent(this, FirstActivity::class.java)
            startActivity(intent1) }
        button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            startActivity(intent2) }
        button3.setOnClickListener {
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3) }
    }
}
