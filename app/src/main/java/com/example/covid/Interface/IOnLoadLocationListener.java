package com.example.covid.Interface;

import com.example.covid.MyLatLng;

import java.util.List;

public interface IOnLoadLocationListener {
    void sendNotification(String title, String content);

    void onLoadLocationSuccess(List<MyLatLng> latLngs);
    void onLoadLocationFailed(String message);
}
