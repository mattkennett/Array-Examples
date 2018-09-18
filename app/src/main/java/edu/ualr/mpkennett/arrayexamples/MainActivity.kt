package edu.ualr.mpkennett.arrayexamples

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    val myContacts: Array<Contact> = arrayOf(
            Contact("John", "Doe", arrayOf("555-1111", "555-2222"), 0),
            Contact("Jane", "Doe", arrayOf("555-3333", "555-4444"), 1),
            Contact("John", "Smith", arrayOf("555-5555", "555-6666"), 0),
            Contact("Jane", "Smith", arrayOf("555-7777", "555-8888"), 1)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewOne: TextView = findViewById(R.id.textViewOne)
        val textViewTwo: TextView = findViewById(R.id.textViewTwo)
        val textViewThree: TextView = findViewById(R.id.textViewThree)
        val textViewFour: TextView = findViewById(R.id.textViewFour)

        val myTextViews: Array<TextView> = arrayOf(textViewOne, textViewTwo, textViewThree, textViewFour)



        for(i in 0..3) {
            myTextViews[i].text = myContacts[i].printMe()
        }
    }
}
