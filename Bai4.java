package Chuong3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Bai4 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.w3schools.com");
        try {
            URLConnection urlConnection = url.openConnection();
            long date = urlConnection.getDate();
            long lastModifield = urlConnection.getLastModified();
            long exp = urlConnection.getExpiration();
            System.out.println("Ngay tao: " + new Date(date));
            System.out.println("Ngay chinh sua cuoi cung: " + new Date(lastModifield));
            System.out.println("Ngay het han: " + new Date(exp));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}