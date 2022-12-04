package javaapplication25;
import java.io.*;

public class Archivo {

    public String leer(String direccion) {

        String txt = "";
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String end = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                end = end + bfRead;
            }
            
            txt = end;
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
    return txt;
    }
}
