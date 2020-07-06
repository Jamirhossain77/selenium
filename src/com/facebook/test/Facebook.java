package com.facebook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamir\\Desktop\\OSA1221201905A\\chromedriver.exe");
    ChromeDriver dr =new ChromeDriver();	
	dr.get("https://www.facebook.com/login/");
	
}
	
	
	
	
	
}
