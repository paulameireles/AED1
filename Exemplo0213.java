/**
* Exemplo0213
* Paula Meireles da Costa 
*/
import IO.*;
/**
* Classe para tratar matriz de objetos.
*/
class Matriz
{
/**
* armazenador generico dos dados
*/
   public Object [ ][ ] tabela;
/**
* construtor padrao
*/
   public Matriz ( ){
      tabela = null;
   } 
   public Matriz ( int linhas, int colunas ){
      if ( linhas <= 0 || colunas <= 0 ){
         IO.println ( "ERRO: quantidade invalida." );
      }else{
         tabela = new Object [ linhas ][ colunas ];
      }
   }
/**
* informar a quantidade de posicoes reservadas (linhas).
*/
   public int lines ( ){
      int linhas = 0;
      if ( tabela != null ){
         linhas = tabela.length;
      }
      return ( linhas );
   }
/**
* informar a quantidade de posicoes reservadas (colunas).
*/
   public int columns ( ){
      int colunas = 0;
      if ( tabela != null ){
         colunas = tabela[0].length;
      }
      return ( colunas );
   }
   public void printMatrix ( ){
      int x, y,
         linhas, colunas;
      IO.println ( );
      if ( tabela == null ){
         IO.println ( "ERRO: Matriz vazia." );
      }else{
         linhas = lines( );
         colunas = columns( );
         IO.println ( "Matriz com "+linhas+"x"+colunas+" posicoes:" );
         for ( x = 0; x < linhas; x = x + 1 ){
            for ( y = 0; y < colunas; y = y + 1 ){
               IO.print ( "\t"+tabela [ x ][ y ] );
            }
            IO.println ( );
         }
      }
   }
   public void readMatrix ( String message ){
      int x, y,
         linhas = lines( ),
         colunas = columns( );
      String linha;
      if ( linhas <= 0 || colunas <= 0 ){
         IO.println ( "ERRO: Tamanho invalido." );
      }else{
         IO.println ( message );
         linhas = this.lines ( );
         colunas = this.columns ( );
         for ( x = 0; x < linhas; x = x + 1 ){
            for ( y = 0; y < colunas; y = y + 1 ){
               linha = IO.readln ( );
               tabela [ x ][ y ] = linha;
            } 
         }
      } 
   } 
   public void readIntMatrix ( String message, int m, int n )
   {
      int x, y,
         linhas = lines( ),
         colunas = columns( ) ;
      String linha;
      if ( linhas <= 0 || colunas <= 0 ||
      m <= 0 || m > linhas ||
      n <= 0 || n > colunas ){
         IO.println ( "ERRO: Quantidade invalida." );
      }else{
         IO.println ( message );
         for ( x = 0; x < m; x = x + 1 ){
            for ( y = 0; y < n; y = y + 1 ){
               linha = IO.readln ( );
               tabela [ x ][ y ] = IO.getint ( linha );
            } 
         }
      }
   }
   public void printIntMatrix ( int m, int n ){
      int x, y,
         linhas = lines( ),
         colunas = columns( ) ;
      String linha;
      if ( linhas <= 0 || colunas <= 0 ||
      m <= 0 || m > linhas ||
      n <= 0 || n > colunas ){
         IO.println ( "ERRO: Tabela vazia ou quantidade invalida." );
      }else{
         IO.println ( "Tabela com "+linhas+"x"+colunas+" posicoes:" );
         for ( x = 0; x < m; x = x + 1 ){
            for ( y = 0; y < n; y = y + 1 ){
               IO.print ( "\t"+(int) tabela [ x ][ y ] );
            } 
            IO.println ( );
         } 
      }
   }
   public Matriz clone ( ){
      int x,y,
         linhas, colunas;
      Matriz nova = null;
      if ( tabela == null ){
         IO.println ( "ERRO: Tabela vazia." );
      }else{
         linhas = lines( );
         colunas = columns( );
         nova = new Matriz ( linhas, colunas );
         if ( nova == null ){
            IO.println ( "ERRO: Nao ha' espaco." );
         }else{
            for ( x = 0; x < nova.lines( ); x = x + 1 ){
               for ( y = 0; y < nova.columns( ); y = y + 1 ){
                  nova.tabela [ x ][ y ] = tabela [ x ][ y ];
               } 
            } 
         } 
      } 
      return ( nova );
   } 
   public Matriz copyMatrix ( int m, int n ){
      int x, y,
         linhas = lines( ),
         colunas = columns( );
      Matriz nova = null;
      if ( tabela == null ||
      m <= 0 || m > linhas ||
      n <= 0 || n > colunas ){
         IO.println ( "ERRO: Tabela vazia." );
      }else{
         nova = new Matriz ( m, n );
         if ( nova == null ){
            IO.println ( "ERRO: Nao ha' espaco." );
         }else{
            for ( x = 0; x < nova.lines( ); x = x + 1 ){
               for ( y = 0; y < nova.columns( ); y = y + 1 ){
                  nova.tabela [ x ][ y ] = tabela [ x ][ y ];
               }
            }
         }
      }
      return ( nova );
   }
   public String toString ( )
   {
      String msg = null;
      int x, y,
         linhas,
         colunas;
      if ( tabela != null ){
         linhas = lines( );
         colunas = columns( );
         msg = "";
         for ( x = 0; x < linhas; x = x + 1 ){
            for ( y = 0; y < colunas; y = y + 1 ){
               msg = msg + "\t" + tabela [ x ][ y ];
            } 
            msg = msg + "\n";
         }
      }
      return ( msg );
   }
   public int colocarNaMatriz (int m, int n){
      int a;
      int b;
      int linhas = lines();
      int colunas = columns();
      int linha = IO.readint ("Fale uma posicao para a linha começar a preencher a matriz. ");
      int coluna = IO.readint ("Fale uma posicao para a coluna começar a preencher a matriz. ");
      
      for (a=0; a < linhas; a = a + 1){
         for (b=0; b < colunas; b = b + 1){
            if (linha < linhas && coluna < colunas){
               // do nothing 
            
            }
            if (linha<=a && coluna<=b){
               int z = IO.readint ("Armazene um inteiro");  
               // pick the int 
            }
         }
      }
      return 0;
   }
   public int printIntMatriz (int m, int n){
      int a;
      int b;
      int linhas = lines();
      int colunas = columns();
      int linha = IO.readint ("Fale uma posicao para a linha começar a preencher a matriz. ");
      int coluna = IO.readint ("Fale uma posicao para a coluna começar a preencher a matriz. ");
      for (a=0; a < linhas; a = a + 1){
         for (b=0; b < colunas; b = b + 1){
            if (linha < linhas && coluna < colunas){// não necessitou de colocar o a e o b, afinal isso iria ficar como resto 
               IO.println ("Posicao ["+a+"]["+b+"]= null"); 
            }
            if (linha<=a && coluna<=b){
               int z = IO.readint ("Armazene um inteiro"); 
               IO.println ("posicoes ["+a+"]["+b+"]="+z); 
            }
         }
      }
      return 0;
   }
   public static int [ ][ ] lerDoArquivo ( String nome )
   {
      FILE arquivo = new FILE ( FILE.INPUT, nome );
      int linhas, colunas;
      int x, y;
      int [ ][ ] tabela = null;
      String linha;
      IO.println ( "Montar matriz com valores lidos de arquivo" );
      linha = arquivo.readln ( );
      if ( linha == null ){
         IO.println ( "ERRO: Nao ha' dados no arquivo." );
      }else{
         linhas = IO.getint ( linha );
         linha = arquivo.readln ( );
         colunas = IO.getint ( linha );
         if ( linhas <= 0 || colunas <= 0 ){
            IO.println ( "ERRO: Tamanho invalido." );
         }else{
            tabela = new int [ linhas ] [ colunas ];
            for ( x = 0; x < linhas; x = x + 1 ){
               for ( y = 0; y < colunas; y = y + 1 ){
                  linha = arquivo.readln ( );
                  tabela [ x ][ y ] = IO.getint ( linha );
               }
            }
         }
      }
      arquivo.close ( );
      return ( tabela );
   }
}
public class Exemplo0213{
/**
* Testar definições de matriz usando classe.
*/
   public static void metodo01 ( )
   {
      Matriz a1 = null; 
      Matriz a2 = new Matriz ( );
      IO.println ( "Definicoes de matriz" );
      if ( a1 == null ){
         IO.println ( "Matriz a1 nula (inexistente)" );
      }else{
         IO.println ( "Matriz a1 nao nula (existente)" );
      }
      if ( a2 == null ){
         IO.println ("Matriz a2 nula (inexistente)");
      }else{
         IO.println ( "Matriz a2 nao nula (existente)" );
      }
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo02(){
      Matriz a1 = null;
      Matriz a2 = new Matriz ( );
      Matriz a3 = new Matriz ( 3, 3 );
      if ( a3 == null ){
         IO.println ( " Matriz a3 nula" );
      }else{
         IO.println ( " Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
      } 
   }
   public static void metodo03 ( ){
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
      } 
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo04 ( )
   {
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readMatrix ( "Entrar com dados na matriz:" );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
      }
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo05 ( ){
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readIntMatrix ( "Entrar com dados no matriz:", 2, 2 );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
      }
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo06 ( ){
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readIntMatrix ( "Entrar com dados no matriz:", 2, 2 );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printIntMatrix (2, 2);
      } 
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo07 ( ){
      Matriz a2 = null;
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readIntMatrix ( "Entrar com dados na matriz:", 2, 2 );
         a2 = a3;
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printMatrix ();
         a3.readIntMatrix ( "Entrar com dados na matriz:", 3, 3 );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printMatrix ( );
      }
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } 
   public static void metodo08 ( ){
      Matriz a2 = null;
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readIntMatrix ( "Entrar com dados na matriz:", 2, 2 );
         a2 = a3.clone ( );
         IO.println ( "Mostrar dados copiados:" );
         a2.printIntMatrix ( 2, 2 );
         a2.readIntMatrix ( "Entrar com dados na matriz:", 3, 3 );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a2.printMatrix ( );
      }
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo09 ( ){
      Matriz a2 = null;
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      if ( a3 == null ){
         IO.println ( "Matriz a3 nula" );
      }else{
         IO.println ( "Matriz a3 nao nula com "+a3.lines( )+"x"+a3.columns( )+" posicoes." );
         a3.readIntMatrix ( "Entrar com dados na matriz:", 3,3 );
         a2 = a3.copyMatrix ( 2, 2 );
         IO.println ( "Mostrar dados copiados:" );
         a2.printIntMatrix (2, 2 );
         IO.println ( "Mostrar dados lidos e armazenados:" );
         a3.printMatrix ( );
      } 
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo10 ( )
   {
      Matriz a2 = null;
      Matriz a3 = new Matriz ( 3, 3 );
      IO.println ( );
      IO.println ( "Entrada e saida em matriz" );
      IO.println ( );
      a3.readIntMatrix ( "Entrar com dados na matriz:", 2,2 );
      a2 = a3.copyMatrix(2,2 );
      IO.println ( "Mostrar dados copiados:" );
      IO.println ( ""+a2 );
      IO.println ( "Mostrar dados lidos e armazenados:" );
      IO.println ( ""+a3 );
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   }
   public static void metodo11(){
      Matriz a1 = new Matriz (3, 3);
      a1.colocarNaMatriz(2,2);
   }
   public static void metodo12(){
      Matriz a1 = new Matriz (3, 3);
      a1.printIntMatriz(2,2);
   }
   public static void metodo13(){
      int [][] tabela = new int[][];
      IO.println ( "Recuperar dados de arquivo" );
      tabela = lerDoArquivo ( "DADOS.TXT" );
      if ( tabela == null ){
         IO.println ( "ERRO: Matriz vazia." );
      }else{
         if (tabela.length == 0){
            IO.println ( "ERRO: Matriz vazia." );
         }else{
            IO.println ( "Matriz montada com " +
               tabela.length + "x" +
               tabela[0].length + " dados." );
         }
      }
      IO.pause ( "Apertar ENTER para continuar." );
   }
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args ){
      IO.println ( "Exemplo0213 - Programa em Java" );
      IO.println ( "Autor: Paula Meireles da Costa" );
      //metodo01 ( );
      //metodo02();
      //metodo03();
      //metodo04();
      //metodo05();
      //metodo06();
      //metodo07();
      //metodo08();
      //metodo09();
      //metodo10();
      //metodo11();
      //metodo12();
      metodo13();
      IO.pause ( "Apertar ENTER para terminar." );
   }
}