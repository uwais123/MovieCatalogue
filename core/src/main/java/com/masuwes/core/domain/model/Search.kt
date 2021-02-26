package com.masuwes.core.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "search_history")
data class Search(
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "media_type") val media_type: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "poster_path") val poster_path: String,
    @ColumnInfo(name = "title") val title: String,
    val original_language: String,
    val first_air_date: String,
    val release_date: String,
    val vote_average: Double
)