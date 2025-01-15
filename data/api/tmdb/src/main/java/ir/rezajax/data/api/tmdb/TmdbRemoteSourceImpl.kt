package ir.rezajax.data.api.tmdb

import ir.rezajax.data.model.VideoThumbnail

class TmdbRemoteSourceImpl : TmdbRemoteSource {
  override suspend fun getMovieDetails(MovieId: Int): VideoThumbnail {
    TODO("Not yet implemented")
  }
}
