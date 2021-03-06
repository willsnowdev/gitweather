package com.will.gitweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 和风接口返回的 JSON数据类型
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

}
