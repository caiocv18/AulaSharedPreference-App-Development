package br.com.aulasharedpreference

import android.content.Context
import android.content.SharedPreferences

//Passamos o contexto para ela saber onde irá atuar, no caso será a própria activity que será o contexto
class SharedPreference(context: Context) {

    //Nome para o "Conteiner"
    private val PREFERENCE_NAME = "AULAANDROID"
    //MODE_PRIVATE é a forma de acesso ao SharedPreference
    val sharedPreference: SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun save(key_name: String, valor: String){
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(key_name, valor)
        //Envia o dado para o "Conteinei"
        editor.commit()
    }

    fun getValue(key_name: String) : String? {
        return sharedPreference.getString(key_name, null)
    }

    fun removeValue(key_name: String) {
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.remove(key_name)
        editor.commit()
    }

}