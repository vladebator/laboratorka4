package com.onpy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Binary {

    public static void main(String[] args) throws IOException {

        int inCountTriangle = 1;//scan.nextInt();
        triangle[] triangles = new triangle[inCountTriangle];

        LineNumberReader reader = new LineNumberReader(new FileReader(args[0]));
        DataOutputStream out = new DataOutputStream(new FileOutputStream(args[1]));
        String line;
        for (int i = 0; i < inCountTriangle; i++) {
            out.writeUTF(String.valueOf(triangles[i].x1));
            out.writeUTF(String.valueOf(triangles[i].x2));
            out.writeUTF(String.valueOf(triangles[i].x3));
            out.writeUTF(String.valueOf(triangles[i].perimeter));
            out.writeUTF(String.valueOf(triangles[i].alpha));
            out.writeUTF(String.valueOf(triangles[i].betta));
            out.writeUTF(String.valueOf(triangles[i].gamma));
            out.writeUTF(String.valueOf(triangles[i].square));
            reader.close();
            out.close();
        }
    }
}
