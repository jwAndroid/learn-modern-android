package com.jw_android.learn_modern_android.firebase

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.firestoreSettings
import com.google.firebase.ktx.Firebase
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

/*
* gradle start command line
* $ gradlew signingReport
*
* */

class FirebaseActivity : AppCompatActivity() {

    private val db = Firebase.firestore

    private val city = hashMapOf(
        "name" to "Los Angeles",
        "state" to "CA",
        "country" to "USA"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firebase)

        val textView = findViewById<TextView>(R.id.addItem)
        val tvData = findViewById<TextView>(R.id.tvData)
        val textView3 = findViewById<TextView>(R.id.textView3)

        textView.setOnClickListener {
            db.collection("cities").document("LA")
                .set(city)
                .addOnSuccessListener {
                    Log.d(TAG, "DocumentSnapshot successfully written!")
                }.addOnFailureListener { e ->
                    Log.w(TAG, "Error writing document", e)
                }
        }

        val listener =  db
            .collection("cities")
            .document("LA")
            .addSnapshotListener { snapshot, _ ->
                snapshot?.data.apply {
                    tvData.text = this?.get("name").toString()
                }
        }

        textView3.setOnClickListener {
            listener.remove()
        }


    }

}