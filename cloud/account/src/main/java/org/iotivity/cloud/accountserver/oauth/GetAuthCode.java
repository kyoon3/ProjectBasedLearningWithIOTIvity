package org.iotivity.cloud.accountserver.oauth;

import java.awt.Desktop;
import java.io.BufferedReader;

/**
 * Get OAuth2 from github.com
 * @author kyoon3
 *
 */

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.sun.xml.internal.messaging.saaj.util.Base64;

public class GetAuthCode {
	public static void main(String[] args) {
		String url = "https://github.com/login?return_to=%2Flogin%2Foauth%2Fauthorize%"
				+ "3Fclient_id%3Dea9c18f540323b0213d0%26redirect_uri%"
				+ "3Dhttp%253A%252F%252Fwww.example.com%252Foauth_callback%252F";


	        if(Desktop.isDesktopSupported()){
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(url));
	            } catch (IOException | URISyntaxException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	         
	        }else{
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("xdg-open " + url);
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	    }
	}
}
