/*Exemplo: Criação de Diretórios e de um Arquivo Vazio – File*/
import java.io.*;

public class CriaArquivos{
  public static void main (String args[]){
   File diretorio = new File("c:\\novo"); 
   diretorio.mkdir(); 
   File subdir1 = new File( diretorio, "subdir1");	
   subdir1. mkdir();					                           
   File subdir2 = new File( diretorio, "subdir2");	 
   subdir2. mkdir();					                                              
   // Cria objeto com referência ao arquivo “arquivoVazio.txt”
   File arquivo = new File( diretorio, "arquivoVazio.txt");
   // Abre o arquivo para gravação
   FileWriter f = new FileWriter(arquivo);
   // Poderia escrever no arquivo aqui …………
   f.close(); // fecha o arquivo
   // Recupera a lista de arquivos do diretório
   String[] arquivos = diretorio.list();
   // mostra o caminho absoluto de cada arquivo da lista
   for (int i =0; i<arquivos.length; i++) {
           File filho = new File( diretorio, arquivos[ i]);
           System.out.println(filho.getAbsolutePath());
   }
}
