package gonzalez.luis.peliculaslistview.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import gonzalez.luis.peliculaslistview.AdaptadorPeliculas
import gonzalez.luis.peliculaslistview.Pelicula
import gonzalez.luis.peliculaslistview.R
import gonzalez.luis.peliculaslistview.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textHome
        //homeViewModel.text.observe(viewLifecycleOwner) {
        //    textView.text = it
        //}
        llenarPeliculas()

        var adaptador = AdaptadorPeliculas(root.context, peliculas)

        var listView: ListView = binding.listViewPeliculas
        listView.adapter = adaptador
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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