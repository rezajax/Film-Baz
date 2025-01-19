package ir.rezajax.domain.tmdb.movies

import ir.rezajax.data.model.VideoThumbnail
import ir.rezajax.data.tmdb.movies.TmdbMovieRepository

internal class GetMovieDetailsUseCaseImpl(
  private val tmdbMovieRepository: TmdbMovieRepository,
): GetMovieDetailsUseCase {
  override suspend fun invoke(MovieId: Int): VideoThumbnail =
    tmdbMovieRepository.getMovieDetails(MovieId)
}
