package dev.example.androidtexteditor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var text: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.editText)
    }

    fun onNavigationButtonClick(view: View) {
        val intent = Intent(this, DisplayTextActivity::class.java)

        val text = text!!.text.toString()
        intent.putExtra(Constants.text(), text)

        startActivity(intent)
    }

}
