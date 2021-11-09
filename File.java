package com.onpy;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class File {
    int inCountTriangle = 1;
    public void saveBinary(ArrayList<triangle> examResults, String fileName) throws IOException {

        long timeStart = System.currentTimeMillis();
        String fileName4 = "D:\\file4laba.txt";
        FileWriter fw;
        BufferedWriter bw;
        FileReader fr;
        BufferedReader br;
        // Строка, которая будет записана в файл
        triangle[] triangles = new triangle[0];
        for (int i = 0; i < inCountTriangle; i++) {
            String size1 = "Сторонa Х1 треугольника №" + (i+1) + ": " + triangles[i].x1 + "\n";
            String size2 = "Сторонa Х2 треугольника №" + (i+1) + ": " + triangles[i].x2 + "\n";
            String size3 = "Сторонa Х3 треугольника №" + (i+1) + ": " + triangles[i].x3 + "\n";
            String size4 = "Периметр треугольника №" + (i+1) + ": " + triangles[i].perimeter + "\n";
            String size5 = "Косинус угла Alpha треугольника №" + (i+1) + " = " + triangles[i].alpha + "\n";
            String size6 = "Косинус угла Betta треугольника №" + (i+1) + " = " + triangles[i].betta + "\n";
            String size7 = "Косинус угла Gamma треугольника №" + (i+1) + " = " + triangles[i].gamma + "\n";
            String size8 = "Площадь треугольника №" + (i+1) + " = " + triangles[i].square + "\n";
            try {
                fw = new FileWriter(fileName4);
                bw = new BufferedWriter(fw);
                System.out.println("Write some data to file: " + fileName4);
                // Несколько раз записать строку
                for (int j = 1; --j >= 0; ) {
                    bw.write(size1);
                    bw.write(size2);
                    bw.write(size3);
                    bw.write(size4);
                    bw.write(size5);
                    bw.write(size6);
                    bw.write(size7);
                    bw.write(size8);
                }
                bw.close();

                fr = new FileReader(fileName4);
                br = new BufferedReader(fr);
                String s;
                int count = 0;
                System.out.println("Read  data from file: " + fileName4);
                // Считывать данные, отображая на экран
                while ((s = br.readLine()) != null) ;
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(System.currentTimeMillis() - timeStart);
            }
        }
    }
    
    public void loadBinary(ArrayList<triangle> examResults, String fileName) {
    }
}
