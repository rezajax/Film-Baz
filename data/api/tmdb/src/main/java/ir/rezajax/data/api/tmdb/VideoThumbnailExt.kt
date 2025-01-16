package ir.rezajax.data.api.tmdb

import ir.rezajax.data.model.VideoId
import ir.rezajax.data.model.VideoThumbnail
import ir.rezajax.data.network.TmdbMovieDetailsResponse

fun TmdbMovieDetailsResponse.toVideoThumbnail () =
  VideoThumbnail (
    ids = VideoId (
      tracktId = null,
      tmdbId = id,
    ),
    title = title,
    posterUrl = posterPath,
    year = releaseDate.take(4).toInt()
  )
