

import javax.swing.*;
import java.io.*;

public class EscritaArquivos{
  public static void main (String args[]) throws IOException {


    File diretorio = new File("/home/thayliny/Disciplinas - Engenharia de Software 2025-1 /Programação Orientado a Objeto/exception-negative-number-thaylinymoura/arquivos");
    if (!diretorio.exists()) {
      diretorio.mkdir();
    }

    File arquivoLixo = new File(diretorio, "lixo.txt");
    FileOutputStream out = null;
    try {
      out = new FileOutputStream(arquivoLixo);
      out.write(new byte[]{'l', 'i', 'x', 'o'});
    } finally {
      if (out != null) {
        out.close();
      }
    }

    File subdir = new File(diretorio, "subdir");
    if (!subdir.exists()) {
      subdir.mkdir();
    }

    String[] arquivos = diretorio.list();
    if (arquivos != null) {
      for (int i = 0; i < arquivos.length; i++) {
        File filho = new File(diretorio, arquivos[i]);
        System.out.println(filho.getAbsolutePath());
      }
    }

    if (arquivoLixo.exists()) {
      arquivoLixo.delete();
    }

    System.out.println("\nDigite o texto (para parar, pressione Enter after writing a line)");

    FileOutputStream f0 = null;
    try {
      f0 = new FileOutputStream("/home/thayliny/Disciplinas - Engenharia de Software 2025-1 /Programação Orientado a Objeto/exception-negative-number-thaylinymoura/arquivos"); // Consider cross-platform paths
      int a;
      while ((a = System.in.read()) != -1 && a != '\n' && a != '\r') {
        f0.write(a);
      }
    } finally {
      if (f0 != null) {
        f0.close();
      }
    }

    System.out.println("\nConteúdo de /listaAlunos.txt:");

    File arquivoListaAlunos = new File("/listaAlunos.txt");
    FileInputStream in = null;
    InputStreamReader conversor = null;
    BufferedReader bf = null;

    try {
      if (arquivoListaAlunos.exists()) {
        in = new FileInputStream(arquivoListaAlunos);
        conversor = new InputStreamReader(in);
        bf = new BufferedReader(conversor);

        String linha;
        while ((linha = bf.readLine()) != null) {
          System.out.println(linha);
        }
      } else {
        System.out.println("Arquivo /listaAlunos.txt não encontrado.");
      }
    } finally {
      if (bf != null) {
        bf.close();
      }

    }


    JFileChooser fc = new JFileChooser();
    int result = fc.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
      File farqEnt = fc.getSelectedFile();
      FileReader f = null;
      BufferedReader inReader = null;

      try {
        f = new FileReader(farqEnt);
        inReader = new BufferedReader(f);
        String linha;
        while ((linha = inReader.readLine()) != null) {
          System.out.println(linha);
        }
      } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo selecionado: " + e.getMessage());
      } finally {
        if (inReader != null) {
          inReader.close();
        }
      }
    } else if (result == JFileChooser.CANCEL_OPTION) {
      System.out.println("Seleção de arquivo cancelada.");

    }


    FileWriter fw = null;
    PrintWriter pw = null;

    try {
      fw = new FileWriter("arquivo.txt");

      String linha = JOptionPane.showInputDialog("Digite uma linha (digite 'fim' para terminar):");
      while (linha != null && !linha.equalsIgnoreCase("fim")) { // Handle null if dialog is cancelled
        pw.println(linha);
        pw.flush(); // Confirm the recording
        linha = JOptionPane.showInputDialog("Digite uma linha (digite 'fim' para terminar):");
      }
    } finally {
      if (pw != null) {
        pw.close();
      }
    }
  }
}