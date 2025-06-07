import java.io.*;
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            File inputFile = new File("tst-input.doc");
            File outputFile = new File("tst-output.doc");
            in = new FileInputStream(inputFile);
            out = new FileOutputStream(outputFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if(in!=null){
                in.close();
            }
            if(out !=null){
                out.close();
            }
        }
    }
}
