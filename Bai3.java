package Chuong3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Bai3 {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            System.out.println("The localhost is: " + ip);
            ip = InetAddress.getByName("www.youtube.com");
            System.out.println(ip);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}