package com.masuwes.favorite.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.masuwes.core.domain.model.DetailTvShow
import com.masuwes.core.domain.usecase.tvshow.TvShowUseCase
import com.masuwes.core.utils.Resource

class FavTvShowViewModel(tvShowUseCase: TvShowUseCase) : ViewModel() {

    val getTvShowPage: LiveData<Resource<PagedList<DetailTvShow>>> =
            tvShowUseCase.getTvShowPage()
}