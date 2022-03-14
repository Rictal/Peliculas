package gonzalez.luis.peliculaslistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PeliculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula)

        val tv_nombre : TextView= findViewById(R.id.tv_nombre_pelicula)
        val tv_desc : TextView = findViewById(R.id.tv_desc_pelicula)
        val img_view : ImageView = findViewById(R.id.img_pelicula)

        val bundle = intent.extras

        if (bundle!= null){
            var nombre : String = bundle.getString("nombre","")
            var desc : String = bundle.getString("sinopsis", "")
            var img: Int = bundle.getInt("img")

            tv_nombre.setText(nombre)
            tv_desc.setText(desc)
            img_view.setImageResource(img)
        }
    }
}