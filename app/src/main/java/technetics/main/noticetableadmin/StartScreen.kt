package technetics.main.noticetableadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        findViewById<CardView>(R.id.NoticeOne).setOnClickListener {
            val intentOne = Intent(this,NoticeOne::class.java)
            startActivity(intentOne)
        }
        findViewById<CardView>(R.id.NoticeTwo).setOnClickListener {
            val intentTwo = Intent(this,NoticeTwo::class.java)
            startActivity(intentTwo)
        }
    }
}