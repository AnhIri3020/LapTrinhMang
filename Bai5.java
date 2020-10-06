package Chuong3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Bai5 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.java2s.com");
        URLConnection urlConnection = url.openConnection();

        urlConnection.setAllowUserInteraction(true);
        if (urlConnection.getAllowUserInteraction() == false) {
            System.out.println("Ban dang truy cap den trang web bi cam !!!");
        }
        else {
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        }
    }
}