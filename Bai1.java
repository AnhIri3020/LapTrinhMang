package Chuong3;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws MalformedURLException {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap URL name: ");
        String name = s.nextLine();
        URL url = new URL(name);
        System.out.println("The URL file is: " + url.getFile());
        System.out.println("The URL's Host's name: "+ url.getHost());
        System.out.println("The URL Port: " + url.getPort());
        System.out.println("The URL Protocol: " + url.getProtocol());
    }

}