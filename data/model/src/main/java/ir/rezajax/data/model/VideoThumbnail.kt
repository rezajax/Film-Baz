package ir.rezajax.data.model

data class VideoThumbnail (
  val ids: VideoId,
  val title: String,
  val posterUrl: String,
  val year: Int,
)


data class VideoId (
  val tracktId: Int?,
  val tmdbId: Int?,
)
