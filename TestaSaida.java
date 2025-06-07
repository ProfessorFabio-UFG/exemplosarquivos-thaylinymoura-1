import java.io.*;

public class TestaSaida {
    public static  void main (String[] args) throws IOException {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("saida.txt");
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Teste");
        } finally {
            if(bw != null){
                bw.close();
            }
        }
    }

}
