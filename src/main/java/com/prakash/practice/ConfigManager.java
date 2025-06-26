package com.prakash.practice;

/**
 * @author prakashkaruppusamy
 */
public class ConfigManager {


    private static final ConfigManager INSTANCE = new ConfigManager();
    private ConfigManager(){}
    public static ConfigManager getInstance(){
        return INSTANCE;
    }
}
