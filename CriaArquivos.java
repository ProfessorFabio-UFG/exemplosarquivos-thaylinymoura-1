
import java.io.*;

public class CriaArquivos{
    public static void main (String args[]) throws IOException {
        File diretorio = new File("/home/thayliny/Disciplinas - Engenharia de Software 2025-1 /Programação Orientado a Objeto/exception-negative-number-thaylinymoura/arquivos");
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        File subdir1 = new File(diretorio, "subdir1");
        if (!subdir1.exists()) {
            subdir1.mkdir();
        }

        File subdir2 = new File(diretorio, "subdir2");
        if (!subdir2.exists()) {
            subdir2.mkdir();
        }

        File arquivo = new File(diretorio, "arquivoVazio.txt");
        FileWriter f = null;

        try {
            f = new FileWriter(arquivo);

        } finally {
            if (f != null) {
                f.close();
            }
        }

        String[] arquivos = diretorio.list();
        if (arquivos != null) {
            for (int i = 0; i < arquivos.length; i++) {
                File filho = new File(diretorio, arquivos[i]);
                System.out.println(filho.getAbsolutePath());
            }
        }
    }
}