package com.example.linxl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Linxl on 2018/5/23.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
