package com.example.raymand_interview_task.data.di

import com.example.raymand_interview_task.data.repositories.MovieRepository
import com.example.raymand_interview_task.domain.repositoryImpl.MovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository
}