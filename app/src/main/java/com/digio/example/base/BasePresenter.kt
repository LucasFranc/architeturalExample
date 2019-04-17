package com.digio.example.base


open class BasePresenter {

    fun createAPI(domain: String, apiClass: Class<*>) {
//        val gson = GsonBuilder().registerTypeAdapter(Deserializer::class.java, Deserializer()).create()
//
//        val httpLoggingInterceptor = HttpLoggingInterceptor()
//        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
//        val okHttpClient = OkHttpClient.Builder().readTimeout(15, TimeUnit.SECONDS)
//        okHttpClient.addInterceptor(httpLoggingInterceptor)
//
//        retrofit = Retrofit.Builder().baseUrl(domain).client(okHttpClient.build())
//            .addConverterFactory(GsonConverterFactory.create(gson)).build()
//
//        return retrofit!!.create(apiClass)

    }

    fun getAPI() {
        //return createAPI(Constants.DOMAIN_URL, API::class.java) as API
    }
}