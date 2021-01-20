package ipca.medusa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class SplashScreen : AppCompatActivity() {

    //private lateinit var database: FirebaseDatabase
    //private lateinit var reference: DatabaseReference
    lateinit var textViewTitle :TextView
    lateinit var buttonBegin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        textViewTitle = findViewById(R.id.textViewTitle)
        buttonBegin = findViewById(R.id.buttonBegin)

        val database = Firebase.database
        val reference = database.getReference("title")

        reference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val name = snapshot.getValue<String>()
                textViewTitle.text = name
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w( "Failed to read value.", error.toException())
            }
        })

        // Butao de inicio
        buttonBegin.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}