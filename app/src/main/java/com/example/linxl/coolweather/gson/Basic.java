package com.example.linxl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Linxl on 2018/5/23.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
