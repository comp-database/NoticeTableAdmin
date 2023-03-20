package technetics.main.noticetableadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NoticeTwo : AppCompatActivity() {
    private val noticeRef = Firebase.firestore.collection("NOTICES").document("NOTICE2")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_two)
        val head : EditText? = findViewById(R.id.HEAD2)
        val body : EditText? = findViewById(R.id.BODY2)
        val send = findViewById<Button>(R.id.SEND2)
        send.setOnClickListener {
            val NoticeMap = hashMapOf(
                "HEAD" to head?.text.toString().trim(),
                "BODY" to body?.text.toString().trim()
            )
            noticeRef.set(NoticeMap).addOnSuccessListener {
                Toast.makeText(this, "Your response Stored Succesfully", Toast.LENGTH_SHORT).show()
                head?.text?.clear()
                body?.text?.clear()
            }
        }
    }
}