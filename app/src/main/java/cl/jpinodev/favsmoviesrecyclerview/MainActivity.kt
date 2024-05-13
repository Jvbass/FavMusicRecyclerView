package cl.jpinodev.favsmoviesrecyclerview

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import cl.jpinodev.favsmoviesrecyclerview.adapter.MovieAdapter
import cl.jpinodev.favsmoviesrecyclerview.databinding.ActivityMainBinding
import cl.jpinodev.favsmoviesrecyclerview.entities.Movie

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerMovies.layoutManager = LinearLayoutManager(this)
    initAdapter()
    }

    private fun initAdapter() {
        val movieAdapter = MovieAdapter()
        binding.recyclerMovies.adapter = movieAdapter
        movieAdapter.movies = Movie.dataMovies

         //sismoAdaptador.sismos = Sismo.dataEmpty
        if (movieAdapter.movies.isEmpty())
            binding.empty.visibility = View.VISIBLE
        else
            binding.empty.visibility = View.GONE
    }
}