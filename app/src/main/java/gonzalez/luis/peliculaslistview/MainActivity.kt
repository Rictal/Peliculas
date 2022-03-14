package gonzalez.luis.peliculaslistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenarPeliculas()

        var adaptador = AdaptadorPeliculas(this, peliculas)

        var listView:ListView = findViewById(R.id.listView)
        listView.adapter = adaptador
    }

    fun llenarPeliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.peli1), getString(R.string.peli1_sinopsis), 180, R.drawable.unforgiven)
        peliculas.add(pelicula1)
        val pelicula2 = Pelicula(2, getString(R.string.peli2), getString(R.string.peli2_sinopsis), 180, R.drawable.for_a_few_dollars_more)
        peliculas.add(pelicula2)
        val pelicula3 = Pelicula(3, getString(R.string.peli3), getString(R.string.peli3_sinopsis), 180, R.drawable.django)
        peliculas.add(pelicula3)
        val pelicula4 = Pelicula(4, getString(R.string.peli4), getString(R.string.peli4_sinopsis), 180, R.drawable.the_good_the_bad_and_the_ugly)
        peliculas.add(pelicula4)
        val pelicula5 = Pelicula(5, getString(R.string.peli5), getString(R.string.peli5_sinopsis), 180, R.drawable.yuma)
        peliculas.add(pelicula5)
    }
}