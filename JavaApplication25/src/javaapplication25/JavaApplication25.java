package javaapplication25;

import java.io.*;

public class JavaApplication25 {

    public static void main(String[] args) throws IOException {

        int Matriz[][] = new int[3][3];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = (int) (Math.random() * 3);
            }

            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("[" + Matriz[i][j] + "]");

            }
            System.out.println("");
        }

        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter("C:\\Users\\joberson\\Desktop\\qwertyu\\archivo.txt");
            escritor = new PrintWriter(archivo);

            int MatrizDos[][] = new int[3][3];

            for (int i = 0; i < MatrizDos.length; i++) {
                for (int j = 0; j < MatrizDos.length; j++) {
                    MatrizDos = Matriz;
                    escritor.print(MatrizDos[i][j]);
                }
            }
        } catch (IOException e) {
            System.err.println("No se creo el archivo");
        } finally {
            archivo.close();
        }

        Archivo arch = new Archivo();
        String a;
        a = arch.leer("C:\\Users\\joberson\\Desktop\\qwertyu\\archivo.txt");

    }
}
