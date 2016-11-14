/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergefile;

import java.io.*;
import java.util.*;

/**
 *
 * @author jihua5758
 */
public class MergeFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file1=new File("file1.txt");
        File file2=new File("file2.txt");
        File file=new File("file.txt");
        FileReader in;
        FileWriter out;
        String s;
        BufferedReader read;
        BufferedWriter write;
        ArrayList<Integer> a=new ArrayList<Integer>();
        int num;
        try{
            in=new FileReader(file1);
            read=new BufferedReader(in);
            while((s=read.readLine())!=null){
                num=Integer.parseInt(s);
                a.add(num);
            }
            read.close();
            in.close();
            in=new FileReader(file2);
            read=new BufferedReader(in);
            while((s=read.readLine())!=null){
                num=Integer.parseInt(s);
                a.add(num);
            }
            read.close();
            in.close();
            Collections.sort(a);
            file.createNewFile();
            out=new FileWriter(file);
            write=new BufferedWriter(out);
            for(int i=0;i<a.size();i++){
                write.write(String.valueOf(a.get(i)));
                write.newLine();
            }
            write.close();
            out.close();
        }catch(IOException e){
            System.out.println("error "+e.getMessage());
        }
    }
    
}
