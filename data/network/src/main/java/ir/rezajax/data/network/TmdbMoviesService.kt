package ir.rezajax.data.network

import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.http.GET

interface TmdbMoviesService {

  @GET("movie/{movie_id}")
  suspend fun getMovieDetails(movieId: Int): TmdbMovieDetailsResponse
}


/*
val client = OkHttpClient()

val request = Request.Builder()
  .url("https://api.themoviedb.org/3/movie/changes?page=1")
  .get()
  .addHeader("accept", "application/json")
  .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJiOTU1YjEwNTNkOGMwZDdkY2EwMTkxODFmYTIxYzI4ZSIsIm5iZiI6MTczNjY4MjU3Ny43NzIsInN1YiI6IjY3ODNhYzUxOTBmNDJjMzI4MzdiMzU0YiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.SL64qJOyiDt2zX45iFrYHCxP_AmfJNgf6bszZhk3Sno")
  .build()

val response = client.newCall(request).execute()

*/
