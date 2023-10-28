package com.tutorials.mvvm_architecture.data.data_sources.constant

import com.tutorials.mvvm_architecture.data.data_sources.helper.ApiHelper
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


private  const val BASE_URL ="https://jsonplaceholder.typicode.com/"
class Constant {


    private  val retrofit by  lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create()).build()
    }

    val  api: ApiHelper by  lazy {
        retrofit.create(ApiHelper::class.java)
    }


}
