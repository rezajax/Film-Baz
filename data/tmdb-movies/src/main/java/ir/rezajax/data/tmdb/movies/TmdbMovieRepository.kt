package ir.rezajax.data.tmdb.movies

import ir.rezajax.data.model.VideoThumbnail

interface TmdbMovieRepository {
  suspend fun getMovieDetails(MovieId: Int): VideoThumbnail
  
}
