package demo;
import java.io.FileReader;
    public class inputoutput {
        public static void main(String args[])throws Exception{
            FileReader fr=new FileReader("C:\\New folder\\input\\src\\demo\\java");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
    }

