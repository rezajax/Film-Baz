package ir.rezajax.domain.tmdb.movies

import ir.rezajax.data.model.VideoThumbnail

interface GetMovieDetailsUseCase {
  suspend operator fun invoke(MovieId: Int): VideoThumbnail
}
