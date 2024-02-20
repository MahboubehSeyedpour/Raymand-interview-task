package com.example.raymand_interview_task.data.di

import com.example.raymand_interview_task.data.repositories.SearchRepository
import com.example.raymand_interview_task.domain.repositoryImpl.SearchRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindSearchRepository(searchRepositoryImpl: SearchRepositoryImpl): SearchRepository
}