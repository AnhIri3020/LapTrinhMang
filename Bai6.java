package Chuong3;

import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws MalformedURLException {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap URL name: ");
        String name = s.nextLine();
        InetAddress ip;
        try {
            ip = InetAddress.getByName(name);
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\Note\\URL info.txt");
            fw.write(ip.getHostName() + " ");
            fw.write(ip.getHostAddress() + "\n");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Luu thanh cong !!!");

    }
}