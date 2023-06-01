package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String input = scanner.nextLine();
        Boolean result = input.matches("(\\d\\.|\\d\\d\\.|(1)\\d\\d\\.|2[0-4]\\d\\.|25[0-5]\\.){3}(\\d|\\d\\d|(1)\\d\\d|2[0-4]\\d|25[0-5])");
        if (result) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("ip_addresses.txt", true))) {
                writer.println(input);
                System.out.println("IP-адрес записан в файл.");
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл.");
            }

        }
        else{
            System.out.println("Неправильный IP адресс");
        }
    }
}
