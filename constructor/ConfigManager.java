package com.constructor;

public class ConfigManager {

    private String appName;
    private String version;
    private String environment;
    private static ConfigManager instance;

    private ConfigManager() {
        this.appName = "MyJavaApp";
        this.version = "1.0.0";
        this.environment = "production";
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    void loadConfig() {
        System.out.println("App Name   : " + appName);
        System.out.println("Version    : " + version);
        System.out.println("Environment: " + environment);
    }

    public static void main(String[] args) {
        System.out.println("Loading configuration...");

        ConfigManager c1 = ConfigManager.getInstance();
        c1.loadConfig();

        ConfigManager c2 = ConfigManager.getInstance();

        System.out.println("Are both config instances same? " + (c1 == c2));
    }
}
