package ir.rezajax.data.api.tmdb

import ir.rezajax.data.model.VideoThumbnail

interface TmdbRemoteSource {
  suspend fun getMovieDetails(MovieId: Int): VideoThumbnail
}
