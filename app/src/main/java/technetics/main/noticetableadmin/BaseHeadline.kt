package technetics.main.noticetableadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class BaseHeadline : AppCompatActivity() {
    private val noticeRef = Firebase.firestore.collection("NOTICES").document("BASE_HEADLINE")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_headline)
        val head : EditText? = findViewById(R.id.HEADLINE)
        val send = findViewById<Button>(R.id.SEND)
        send.setOnClickListener {
            val NoticeMap = hashMapOf(
                "HEAD" to head?.text.toString().trim(),
            )
            noticeRef.set(NoticeMap).addOnSuccessListener {
                Toast.makeText(this, "Your response Stored Succesfully", Toast.LENGTH_SHORT).show()
                head?.text?.clear()
            }
        }
    }
}