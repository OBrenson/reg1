/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.io.*;
import java.nio.*;
/**
 *
 * @author User
 */
public class JavaApplication6 {
    public static void main(String[] args)  {

    }
    public static void function(int arg1) throws IOException
    {
        File f = new File("C://privet.txt");
        if(arg1<10)
            for(int i=0;i<1*arg1;i++)
                System.out.println("Привет");
        else
        {
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream("C:\\privet.txt");
            byte[] bytes = ByteBuffer.allocate(4).putInt(arg1).array();
            fos.write(bytes, 0, bytes.length);
        }
    }
}
