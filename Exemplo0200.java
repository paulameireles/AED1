/*
Exemplo0200
@Paula Meireles da Costa 
*/
import IO.*;
class Arranjo{
   public Object[] tabela;
   public Arranjo(){
      tabela = null;
   }//End arranjo
   public Arranjo(int tamanho){
      if(tamanho <= 0){
         IO.println("ERRO: quantidade invalida");
      }else{
         tabela = new Object[tamanho];
      }//End else
   }//End arranjo
   public int length(){
      int tamanho = 0;
   
      if(tabela != null){
         tamanho = tabela.length;
      }//End if
      return(tamanho);
   }//End length
   public void printArray(){
      int tamanho, posicao;
      IO.println("");
      if(tabela == null){
         IO.println("ERRO: Tabela Vazia");
      }else{
         tamanho = length();
         IO.println("Tabela com " + tamanho + " posicoes");
         IO.println();
         for(posicao = 0; posicao<tamanho; ++posicao){
            IO.println("Posicao " + posicao + " tem valor " + tabela[posicao]);
         }//End for
      }//End else
   }//End printArray
   public void printPositionArray(int p, int q){
      int posicao;
      int tamanho = length();
      int ultimo = p+q;
   
      for(posicao=0; posicao<ultimo; ++posicao){
         IO.println("Posicao " + posicao + " tem valor " + tabela[posicao]);
      }//End for
   }//End printPositionArray
   public void readArray(String message){
      int posicao, tamanho = length();
      String linha;
   
      if(tamanho <= 0){
         IO.println("ERRO: Tamanho Invalido");
      }else{
         IO.println(message);
         tamanho = this.length();
      
         for(posicao=0; posicao<tamanho; ++posicao){
            linha = IO.readln();
            tabela[posicao] = linha;
         }//End for
      }//End else
   }//End readArray
   public void readIntArray(String message, int n){
      int posicao, tamanho = length();
      String linha;
      if(tamanho <= 0 || n <= 0 || n > tamanho){
         IO.println("ERRO: Quantidade invalida");
      }else{
         IO.println(message);
         for(posicao=0; posicao<n; ++posicao){
            linha = IO.readln();
            tabela[posicao] = IO.getint(linha);
         }//End for
      }//End else
   }//End readIntArray
   public void printIntArray(int n){
      int posicao, tamanho = length();
      IO.println("");
      if(tabela == null || n <= 0 || n>tamanho){
         IO.println("ERRO: Tabela vazia ou quantidade invalida");
      }else{
         IO.println("Tabela com " + tamanho + " posicoes");
         for(posicao=0; posicao<n; ++posicao){
            IO.println("posicao = " + posicao + " tem valor = " + (int) tabela[posicao]);
         }//End for 
      }//End else 
   }//End printIntArray
   public Arranjo clone(){
      int tamanho, posicao;
      Arranjo nova = null;
      if(tabela == null){
         IO.println("ERRO: Tabela vazia");
      }else{
         tamanho = length();
         nova = new Arranjo(tamanho);
         if(nova == null){
            IO.println("ERRO: Nao ha espaco");
         }else{
            for(posicao=0; posicao<nova.length(); ++posicao){
               nova.tabela[posicao] = tabela[posicao];
            }//End for 
         }//End else
      }//End else
      return(nova);
   }//End aranjo clone
   public Arranjo copyArray(int n){
      int posicao, tamanho = length();
      Arranjo nova = null;
      if(tabela==null || n<=0 || n>tamanho){
         IO.println("ERRO: Tabela Vazia");
      }else{
         nova = new Arranjo(n);
         if(nova==null){
            IO.println("ERRO: Nao ha espaco");
         }else{
            for(posicao=0; posicao<nova.length(); ++posicao){
               nova.tabela[posicao] = tabela[posicao];
            }//End for  
         }//End else
      }//End else
      return(nova);
   }//End copyArray
   public String toString(){
      String msg = null;
      int posicao, tamanho;
      if(tabela != null){
         tamanho = length();
         msg = "";
         for(posicao=0; posicao<tamanho; ++ posicao){
            msg = msg + " " + tabela[posicao];
         }//End for
      }//End if
      return(msg);
   }//End toString
   public void readPositionArray(String message, int p, int q){
      int tamanho = length();
      int posicao;
      String linha;
      int ultimo = p+q;
      IO.println(message);
      for(posicao=p; posicao<ultimo; ++posicao){
         linha = IO.readln();
         tabela[posicao] = linha;
      }//End for 
   }//End readPositionArray
   public void LerDoFile(String file){
      int tamanhoFile, i;
      FILE arquivo = new FILE(FILE.INPUT, file);
      tamanhoFile = length();
      String linha;
      for(i=0; i<tamanhoFile; ++i){
         linha = arquivo.readln();
         tabela[i] = linha;
      }//End for
   }///End LerDoFile
   public void printInFile(String file){//Put an array inside a file
      FILE arquivo = new FILE(FILE.OUTPUT, file);
      int tamanho = length();
      int posicao;
      arquivo.println(""+tamanho);
      for(posicao=0; posicao<tamanho; ++posicao){
         arquivo.println("" + tabela[posicao]);
      }//End for
   }//End printInFile
   public void lerQuantidadeFile(String file, int q){
      int posicao;
      String linha;
      FILE arquivo = new FILE(FILE.INPUT, file);
      linha = arquivo.readln();
      for(posicao=0; posicao<q; ++posicao){
         tabela[posicao] = linha;
         linha = arquivo.readln();
      }//End for
   }//End lerQuantidadeFile
   public void printQuantidadeFile(String file, int q){
      FILE arquivo = new FILE(FILE.OUTPUT, file);
      int posicao;
      for(posicao=0; posicao<q; ++posicao){
         arquivo.println(""+tabela[posicao]);
      }//End for
   }//End printQuantidadeFile
   public void readPositionFile(String file, int p, int q){
      FILE arquivo = new FILE(FILE.INPUT, file);
      String linha;
      int posicao;
      linha = arquivo.readln();
      for(posicao=p; posicao<(p+q); ++posicao){
         tabela[posicao] = linha;
         linha = arquivo.readln();
      }//End for
   }//End readPositionFile
   public void printPositionFile(String file, int p, int q){
      FILE arquivo = new FILE(FILE.OUTPUT, file);
      int posicao;
      for(posicao=p; posicao<(q+p); ++posicao){
         arquivo.println(""+tabela[posicao]);
      }//End for
   }//End printPositionFile
   public Arranjo invertArray(){
      int tamanho = length();
      Arranjo inverted = new Arranjo(tamanho);
      int posicao;
      int posicao2 = 0;
      for(posicao = tamanho-1; posicao>-1; --posicao){
         inverted.tabela[posicao2] = tabela[posicao];
         ++posicao2;
      }//End for
      return(inverted);
   }//End invertArray
  public Arranjo copiarPosicaoArray(int p, int q){
    int tamanho = length();
    Arranjo copied = new Arranjo(q);
    int posicao;
    int posicao2 = 0;
    for(posicao=p; posicao<(p+q); ++posicao){
      copied.tabela[posicao2] = tabela[posicao];
      ++posicao2;
    }//End for
    return(copied);
  }//End copiarPosicaoArray
}//End class 
public class Exemplo0200{
   public static int countLnFile(String file){
      FILE arquivo = new FILE(FILE.INPUT, file);
      int i = 0;
      String linha;
      linha = arquivo.readln();
      while(! arquivo.eof()){
         ++i;
         linha = arquivo.readln();
      }//End while
      IO.println("O arquivo tem " + i + " posicoes");
      return(i);
   }//End countInFile
   public static void metodo01(){
      Arranjo a1 = null;
      Arranjo a2 = new Arranjo();
      IO.println("Definicoes do arranjo");
      if(a1 == null){
         IO.println("Arranjo a1 nulo");
      }else{
         IO.println("Arranjo a1 nao nulo");
      }//End else
      if(a2 == null){
         IO.println("Arranjo a2 nulo");
      }else{
         IO.println("Arranjo a2 nao nulo");
      }//End else
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metoro01
   public static void metodo02(){
      Arranjo a1 = null;
      Arranjo a2 = new Arranjo();
      Arranjo a3 = new Arranjo(3);
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com "+ a3.length() + " posicoes");
      }//End else
   }//End metodo02
   public static void metodo03(){
      Arranjo a3 = new Arranjo(3);
      IO.println();
      IO.println("Entrada e saida em arranjo");
      IO.println();
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         IO.println();
         IO.println("Mostrar dados lidos e armazenados");
         IO.println();
         a3.printArray();
      }//End else
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metodo03
   public static void metodo04(){
      Arranjo a3 = new Arranjo(3);
      IO.println();
      IO.println("Entrada e saida em arranjo");
      IO.println();
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readArray("Entrar com dados no arranjo: ");
         IO.println("Mostrar dados lidos e armazenados");
         a3.printArray();
      }//End else
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metodo04
   public static void metodo05(){
      Arranjo a3 = new Arranjo(3);
      IO.println();
      IO.println("Entrada e saida em arranjo");
      IO.println();
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readIntArray("Entrar com dados no arranjo: ", 2);
         IO.println("Mostrar dados lidos e armazenados");
         a3.printArray();
      }//End else
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metodo05
   public static void metodo06(){
      Arranjo a3 = new Arranjo(3);
   
      IO.println(" Entrada e saida em arranjo ");
   
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readIntArray("Entrar com dados no arranjo", 2);
         IO.println("Mostrar dados lidos e armazenados:");
         IO.println();
         a3.printIntArray(2);
      }//End else
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metodo06
   public static void metodo07(){
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo(3);
      IO.println();
      IO.println("Entrada e saida em arranjo");
      IO.println();
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readIntArray("Entrar com dados no arranjo", 2);
         IO.println();
         a2 = a3;
         IO.println("Mostrar dados lidos e armazenados");
         a2.printIntArray(2);
         a2.readIntArray("Entrar com dados no arranjo", 3);
         IO.println();
         IO.println("Mostrar dados lidos e armazenados");
         a3.printIntArray(3);
         IO.println("Mostrar dados lidos e armazenados");
         a2.printIntArray(3);
      }//End else 
      IO.println();
      IO.pause("Apertar ENTER para continuar");
   }//End metodo07
   public static void metodo08(){
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo(3);
   
      IO.println("Entrada e saida em arranjo");
   
      if(a3 == null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readIntArray("Entrar com dados no arranjo", 3);
         a2 = a3.clone();
         IO.println("Mostrar dados lidos e armazenados");
         a2.printIntArray(3);
         a2.readIntArray("Entrar com dados no arranjo", 3);
         IO.println("Mostrar dados lidos e armazenados");
         a2.printIntArray(3);
      }//End else
      IO.pause(" Apertar ENTER para continuar");
   }//End metodo08
   public static void metodo09(){
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo(3);
      IO.println(" Entrada e saida em arranjo ");
   
      if(a3==null){
         IO.println("Arranjo a3 nulo");
      }else{
         IO.println("Arranjo a3 nao nulo com " + a3.length() + " posicoes");
         a3.readIntArray("Entrar com dados no arranjo", 3);
         a2 = a3.copyArray(3);
         IO.println("Mostrar dados lidos e armazenados");
         a2.printIntArray(3);
      }//End else
      IO.pause("Apertar ENTER para continuar");
   }//End metodo09
   public static void metodo10(){
      Arranjo a2 = null;
      Arranjo a3 = new Arranjo(3);
      IO.println();
      IO.println(" Entrada e saida em arranjo ");
      IO.println();
      a3.readArray("Entrar com dados no arranjo");
      a2 = a3.copyArray(2);
      IO.println("Mostrar dados lidos e armazenados");
      IO.println(""+a2);
      IO.println("Mostrar dados lidos e armazenados");
      IO.println(""+a3);
      IO.pause(" Aperte ENTER para continuar");
   }//End metodo10
   public static void metodo11(){
      Arranjo a3 = new Arranjo(5);
      a3.readPositionArray("Arranjo 1", 2, 2);
      a3.printArray();
   }//End metodo11
   public static void metodo12(){
      Arranjo a3 = new Arranjo(5);
      a3.readArray("Arranjo 1");
      a3.printPositionArray(1, 2);
   }//End metodo12
   public static void metodo13(){
      Arranjo a3 = new Arranjo(countLnFile("DADOS1.txt"));
      a3.LerDoFile("DADOS1.txt");
      a3.printArray();
   }//End metodo13
   public static void metodo14(){
      Arranjo a3 = new Arranjo(7);
      a3.readArray("Arranjo 1");
      a3.printArray();
      a3.printInFile("DADOS2.txt");
   }//End metodo14
   public static void metodo15(){
      Arranjo a3 = new Arranjo(8);
      a3.lerQuantidadeFile("DADOS3.txt", 3);
      a3.printArray();
   }//End metodo15
   public static void metodo16(){
      Arranjo a3 = new Arranjo(5);
      a3.readArray("Arranjo 1: ");
      a3.printQuantidadeFile("DADOS4.txt", 2);
   }//End metodo16
   public static void metodo17(){
      Arranjo a3 = new Arranjo(countLnFile("DADOS5.txt"));
      a3.lerQuantidadeFile("DADOS5.txt", 2);
      a3.printArray();
   }//End metodo17
   public static void metodo18(){
      Arranjo a3 = new Arranjo(5);
      a3.readArray("Arranjo 1:");
      a3.printPositionFile("DADOS6.txt", 0, 2);
   }//End metodo18
     public static void metodo19(){
    Arranjo a3 = new Arranjo(5);
    Arranjo a2 = null;
    a3.readArray("Arranjo 1: ");
    a2 = a3.invertArray();
    a2.printArray();
  }//End metodo19
    public static void metodo20(){
    Arranjo a3 = new Arranjo(5);
    Arranjo a2 = null;
    a3.readArray("Arranjo 1: ");
    a2 = a3.copiarPosicaoArray(0, 4);
    a2.printArray();
  }//End metodo20
   public static void main(String [] main){
      IO.println("Exemplo0200 ");
      IO.println("Autor: Paula Meireles");
      metodo20();
      IO.pause(" Apertar ENTER para terminar");
   }//End main
}//End class Exemplo0200
