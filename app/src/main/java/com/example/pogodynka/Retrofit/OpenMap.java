package com.example.pogodynka.Retrofit;



import com.example.pogodynka.Model.WeatherResult;

//import java.util.Observable;
import io.reactivex.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenMap {
    @GET("weather")
        Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                     @Query("lon") String lon,
                                                     @Query("appid") String appid,
                                                     @Query("units") String unit);
}
