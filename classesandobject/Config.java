package com.classesandobject;

public class Config {
	
	static String configName = "System Config";
	String settingValue;

	public static void main(String[] args) {
		
		Config config1 = new Config();
		Config config2 = new Config();
		
		config1.settingValue = "Dark Mode";
		config2.settingValue = "Light Mode";
		
		System.out.println("Config Name: "+Config.configName);
		System.out.println("Setting 1: "+config1.settingValue);
		System.out.println("Setting 2: "+config2.settingValue);

	}

}
