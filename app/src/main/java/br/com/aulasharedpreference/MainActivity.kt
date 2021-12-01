package br.com.aulasharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference  = SharedPreference(this)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val btnRemover = findViewById<Button>(R.id.btnRemover)

        btnSalvar.setOnClickListener{
            var nome = findViewById<EditText>(R.id.edit_nome)
            sharedPreference.save("nome", nome.text.toString())
        }

        btnBuscar.setOnClickListener{
            var text_view = findViewById<TextView>(R.id.text_view_nome)
            text_view.text = sharedPreference.getValue("nome")
        }

        btnRemover.setOnClickListener{
            sharedPreference.removeValue("nome")
        }
    }
}