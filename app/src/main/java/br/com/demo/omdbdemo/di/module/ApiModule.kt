package br.com.demo.omdbdemo.di.module

import br.com.demo.omdbdemo.data.api.OmdbAPI
import dagger.Provides
import retrofit2.Retrofit

class ApiModule {

    @Provides
    fun provideOmdbAPI(retrofit: Retrofit): OmdbAPI {
        return retrofit.create(OmdbAPI::class.java)
    }
}