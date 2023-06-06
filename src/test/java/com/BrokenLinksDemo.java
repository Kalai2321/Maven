package com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.Base;

public class BrokenLinksDemo extends Base {
	public static void main(String[] args) throws IOException {
		browserLaunch("http://www.deadlinkcity.com/");
		max();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int siz = links.size();
		System.out.println(siz);

		for (WebElement l : links) {
			// to get the links from Web page, we use getAttribute method
			String linksName = l.getAttribute("href");
			//System.out.println(linksName);

			// create object to URL class
			URL url = new URL(linksName);

			// open connection to server
			URLConnection urlconnection = url.openConnection();

			// send request to server - use only downcasting
			HttpURLConnection httpurlconnection = (HttpURLConnection) urlconnection;

			// connect to server
			httpurlconnection.connect();

			// to get the error code and error message from webpage into console
			if (httpurlconnection.getResponseCode() == 200) {
				System.out.println(linksName + '-' + httpurlconnection.getResponseMessage());
			}

			else {
				System.err.println(linksName + '-' + httpurlconnection.getResponseCode() + '-'
						+ httpurlconnection.getResponseMessage());
			}
		}
	}
}
