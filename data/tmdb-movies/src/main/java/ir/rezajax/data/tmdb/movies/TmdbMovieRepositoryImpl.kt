package ir.rezajax.data.tmdb.movies

import ir.rezajax.data.api.tmdb.TmdbMoviesRemoteSource
import ir.rezajax.data.model.VideoThumbnail

class TmdbMovieRepositoryImpl (
  private val tmdbMoviesRemoteSource: TmdbMoviesRemoteSource
) : TmdbMovieRepository {
  override suspend fun getMovieDetails(MovieId: Int): VideoThumbnail =
    tmdbMoviesRemoteSource.getMovieDetails(MovieId)

}
