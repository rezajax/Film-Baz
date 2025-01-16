package ir.rezajax.data.api.tmdb

import ir.rezajax.data.model.VideoThumbnail

interface TmdbMoviesRemoteSource {
  suspend fun getMovieDetails(MovieId: Int): VideoThumbnail
}
