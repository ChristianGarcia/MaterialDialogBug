package uk.co.origamibits.materialdialogbug

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            MaterialAlertDialogBuilder(this, R.style.Theme_ThemeOverlay_MaterialAlertDialog)
                .setTitle("This text's size has a magical upper limit!")
                .setMessage("This text's size works just fine")
                .setPositiveButton("Ok", null)
                .show()
        }

        findViewById<Button>(R.id.buttonMaterial3).setOnClickListener {
            MaterialAlertDialogBuilder(this, R.style.Theme_ThemeOverlay_Material3AlertDialog)
                .setTitle("This text's size has a magical upper limit!")
                .setMessage("This text's size works just fine")
                .setPositiveButton("Ok", null)
                .show()
        }
    }
}