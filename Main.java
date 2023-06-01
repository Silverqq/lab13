package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\d\\.|\\d\\d\\.|(1)\\d\\d\\.|2[0-4]\\d\\.|25[0-5]\\.){3}(\\d|\\d\\d|(1)\\d\\d|2[0-4]\\d|25[0-5])");

        try (PrintWriter writer = new PrintWriter(new FileWriter("ip_addresses.txt", true))) {
            writer.println(input);
            System.out.println("IP-адрес записан в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл.");
        }

    }
}