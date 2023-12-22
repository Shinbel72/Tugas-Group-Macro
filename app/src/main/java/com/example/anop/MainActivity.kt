package com.example.anop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    // on below line we are creating variable for all
    // floating action buttons and a boolean variable.
    lateinit var addFAB: FloatingActionButton
    lateinit var homeFAB: FloatingActionButton
    lateinit var settingsFAB: FloatingActionButton
    var fabVisible = false

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing variables of floating
        // action button on below line.
        addFAB = findViewById(R.id.idFABAdd)
        homeFAB = findViewById(R.id.idFABHome)
        settingsFAB = findViewById(R.id.idFABSettings)

        // on below line we are initializing our
        // fab visibility boolean variable
        fabVisible = false

        // on below line we are adding on click listener
        // for our add floating action button
        addFAB.setOnClickListener {
            // on below line we are checking
            // fab visible variable.
            if (!fabVisible) {

                // if its false we are displaying home fab
                // and settings fab by changing their
                // visibility to visible.
                homeFAB.show()
                settingsFAB.show()

                // on below line we are setting
                // their visibility to visible.
                homeFAB.visibility = View.VISIBLE
                settingsFAB.visibility = View.VISIBLE

                // on below line we are checking image icon of add fab
                addFAB.setImageDrawable(resources.getDrawable(R.drawable.silang))

                // on below line we are changing
                // fab visible to true
                fabVisible = true
            } else {

                // if the condition is true then we
                // are hiding home and settings fab
                homeFAB.hide()
                settingsFAB.hide()

                // on below line we are changing the
                // visibility of home and settings fab
                homeFAB.visibility = View.GONE
                settingsFAB.visibility = View.GONE

                // on below line we are changing image source for add fab
                addFAB.setImageDrawable(resources.getDrawable(R.drawable.add))

                // on below line we are changing
                // fab visible to false.
                fabVisible = false
            }
        }

        // on below line we are adding
        // click listener for our home fab
        homeFAB.setOnClickListener {
            // on below line we are displaying a toast message.
            val intent: Intent
        }

        // on below line we are adding on
        // click listener for settings fab
        settingsFAB.setOnClickListener {
            // on below line we are displaying a toast message
            Toast.makeText(this@MainActivity, "Settings clicked..", Toast.LENGTH_LONG).show()
        }
    }
}