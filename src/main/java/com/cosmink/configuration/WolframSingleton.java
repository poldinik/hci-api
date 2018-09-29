package com.cosmink.configuration;

public class WolframSingleton {
    private static WolframSingleton ourInstance = new WolframSingleton();

    public static WolframSingleton getInstance() {
        return ourInstance;
    }

    private WolframSingleton() {
    }

    private static String appid = "G57UP5-8XXHXK7TLW";

    public static String getAppid() {
        return appid;
    }

    public static void setAppid(String appid) {
        WolframSingleton.appid = appid;
    }
}
