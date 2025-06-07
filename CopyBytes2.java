import java.io.*;
public class CopyBytes2 {
    public static void main(String[] args) throws IOException {
        FileReader inputFile = null;
        FileWriter outputFile = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
             inputFile = new FileReader("oi.txt");
             outputFile = new FileWriter("ola.txt");
             in = new BufferedReader(inputFile);
             out = new PrintWriter(outputFile);

            String s;
            while ((s = in.readLine()) != null) {
                out.println(s);
            }
            out.flush();
            }
            finally{
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        }
    }
