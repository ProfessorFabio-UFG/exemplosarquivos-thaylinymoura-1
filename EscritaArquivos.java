/*Exemplo: Escrita sequencial de Arquivo – FileOutputStream*/

import java.io.*;

public class EscritaArquivos{
  public static void main (String args[]){

    File diretorio = new File("c:\\tmp");
    diretorio.mkdir();
    // Cria um objeto com referência para o arquivo “lixo.txt”  
    File arquivo = new File( diretorio, "lixo.txt");
    //  Cria um objeto out associando ao arquivo um fluxo de saída
    FileOutputStream out = new FileOutputStream(arquivo);
    // grava “lixo” no arquivo
    out.write( new byte[]{ 'l', 'i', 'x', 'o'} );  
    File subdir = new File( diretorio, "subdir");        
    subdir.mkdir();				 // cria o diretório c:\tmp\subdir   
    String[] arquivos = diretorio.list();
    for (int i =0;i<arquivos.length; i++) {		// lista o diretório
       File filho = new File( diretorio, arquivos[ i]);
       System. out. println(filho.getAbsolutePath());
    }
    if (arquivo.exists()) {		// verifica se o arquivo existe
       arquivo.delete();     // e o deleta
    }
    out.close();
  }
}
