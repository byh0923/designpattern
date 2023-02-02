package com.example.demo.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App implements Serializable {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException, ClassNotFoundException {
		
		Settings settings = Settings.getInstance();
		
		Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Settings settings1 = constructor.newInstance();
		
		System.out.println(settings == settings1);
		
		// 직렬화
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			out.writeObject(settings);
		}
		
		// 역직렬화
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settings1 = (Settings) in.readObject();
		}
		System.out.println(settings == settings1);
		
		Runtime runtime = Runtime.getRuntime();
		
	}
}
