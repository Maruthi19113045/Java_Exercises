package demo;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;


    public class BufferOutputStream {
        public static void main(String[] args) {

            String data = "This is a line of text to write inside the file";

            try {
                // Creates a FileOutputStream
                FileOutputStream file = new FileOutputStream("C:/Users/marut/Desktop/Filereader.txt");


                // Creates a BufferedOutputStream
                BufferedOutputStream output = new BufferedOutputStream(file);

                byte[] array = data.getBytes();

                // Writes data to the output stream
                output.write(array);
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

