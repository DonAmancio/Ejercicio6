import java.util.Date;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

//Inge, para que el codigo genere el Hash primero debe crear una carpeta en el disco C:
// que se llame Docs, ahi se guardaran los archivos .txt donde se escribe el hash
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la palabra clave para el hash: ");
        String dato = sc.nextLine();
        new Documento();
        try {
            PrintWriter writer = new PrintWriter("/C:/docs/datos.txt", "UTF-8");
            System.out.println("El hash ha sido generado en el archivo 'hash.txt'");

            writer.println(dato);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //////
        try {
            PrintWriter writer = new PrintWriter("/C:/docs/hash.txt", "UTF-8");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String ruta = "/C:/Docs/hash.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists())
        {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("hash --->\n");
        }
        else
        {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("checksum\n");
        }
        byte[] b = Files.readAllBytes(Paths.get("C:\\Docs\\datos.txt"));
        byte[] digest = MessageDigest.getInstance("MD5").digest(b);
        String s = toHexString(digest);
        bw.write(s);
        bw.close();
    }

    public static String toHexString(byte[] bytes)
    {
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < bytes.length; i++)
        {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

}

