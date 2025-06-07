import java.io.*;

public class TestaEntradaBufferedReader {
    public static  void main (String[] args) throws IOException {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            is = new FileInputStream("arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String s = br.readLine();

            while ( s !=null){
                System.out.println(s);
                s = br.readLine();
            }
        } finally {
            if (br != null) {
                br.close();
            }

        }
    }
}