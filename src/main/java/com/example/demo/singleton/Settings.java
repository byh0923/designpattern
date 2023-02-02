package com.example.demo.singleton;

import java.io.Serializable;

public class Settings {
	
	private Settings() {}

	private static class SettingsHolder implements Serializable {
		private static final Settings INSTANCE = new Settings();
	}
	
	public static Settings getInstance() {
		return SettingsHolder.INSTANCE;
	}
}
