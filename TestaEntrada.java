import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {
    public static  void main (String[] args) throws IOException{

        InputStream is = null;
        InputStreamReader isr = null;

        try {
             is = new FileInputStream("arquivo.txt");
             isr = new InputStreamReader(is);
             int c =isr.read();
        } finally {
            if(isr != null){
                isr.close();
            }
        }

    }

}
