package cl.jpinodev.favsmoviesrecyclerview.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.jpinodev.favsmoviesrecyclerview.databinding.ItemMovieBinding
import cl.jpinodev.favsmoviesrecyclerview.entities.Movie


class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    lateinit var onItemClickListener: (Movie) -> Unit

    var movies = mutableListOf<Movie>()
        @SuppressLint("NotifyDataSetChanged")
        set(value){
            field = value
            this.notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {

        val bindingItem = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MovieViewHolder(bindingItem)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
            val movie: Movie = movies[position]
            holder.bind(movie)
    }

    override fun getItemCount(): Int {
            return movies.size
    }

    inner class MovieViewHolder(private var bindingItem: ItemMovieBinding)
        : RecyclerView.ViewHolder(bindingItem.root) {
             fun bind(movie: Movie){
                 with(movie){
                     bindingItem.movieTitle.text = title
                     bindingItem.movieYear.text = year.toString()
                     bindingItem.movieRating.rating = rating.toFloat()
                 }

                 bindingItem.root.setOnClickListener {
                     if(::onItemClickListener.isInitialized)
                         onItemClickListener(movie)
                 }
             }
        }

}