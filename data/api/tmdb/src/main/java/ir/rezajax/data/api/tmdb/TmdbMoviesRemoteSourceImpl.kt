package ir.rezajax.data.api.tmdb

import ir.rezajax.data.model.VideoThumbnail
import ir.rezajax.data.network.TmdbMoviesService

class TmdbMoviesRemoteSourceImpl (
  private val tmdbMoviesService: TmdbMoviesService,
) : TmdbMoviesRemoteSource {
  override suspend fun getMovieDetails(movieId: Int): VideoThumbnail =
    tmdbMoviesService.getMovieDetails(movieId).toVideoThumbnail()
}
