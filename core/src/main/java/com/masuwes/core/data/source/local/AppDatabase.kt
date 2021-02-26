package com.masuwes.core.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.masuwes.core.data.source.local.MoviesDao
import com.masuwes.core.data.source.local.TvShowsDao
import com.masuwes.core.domain.model.DetailMovie
import com.masuwes.core.domain.model.DetailTvShow

@Database(
    entities = [
        DetailMovie::class,
        DetailTvShow::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun moviesDao() : MoviesDao
    abstract fun tvShowsDao() : TvShowsDao
}