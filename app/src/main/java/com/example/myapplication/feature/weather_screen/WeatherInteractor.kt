package com.example.myapplication.feature.weather_screen

import com.example.myapplication.feature.weather_screen.data.WeatherRepo

class WeatherInteractor(private val weatherRepo: WeatherRepo) {

   suspend fun getWeather(): String{
        return weatherRepo.getTemperature()
    }
}