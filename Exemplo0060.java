/**
* Exemplo0060
*
* Paula Meireles, 628072   
* @version 05
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0060
{
// ---------------------------------------------- definicao de metodo auxiliar
// ---------------------------------------------- definicao de metodo auxiliar
   public static void metodo01 ( )
   {
   // definir dados
      int x;
      double y;
      char z;
   // identificar o metodo
      IO.println ( "Metodo 01" );
   // ler valor inteiro do teclado
      x = IO.readint ( "Entrar com um valor inteiro: " );
      IO.println ( "Valor lido = " + x );
   } // fim metodo01( )
   public static void metodo02 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 02" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
      while ( quantidade > 0 )
      {
      // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
      // diminuir a quantidade
         quantidade = quantidade - 1;
      } // fim repetir
   } // fim metodo02( )
   public static void metodo03 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
      // definir contador
      int contador;
   // identificar o metodo
      IO.println ( "Metodo 03" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
      contador = quantidade;
      while ( contador > 0 )
      {
      // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
      // diminuir a quantidade
         contador = contador - 1;
      } // fim repetir
   } // fim metodo03( )
   public static void metodo04 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
      // definir contador
      int contador;
   // identificar o metodo
      IO.println ( "Metodo 04" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
      contador = 1;
      while ( contador <= quantidade )
      {
      // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
      // diminuir a quantidade
         contador = contador + 1;
      } // fim repetir
   } // fim metodo04( )
   public static void metodo05 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
      // definir contador
      int contador;
   // identificar o metodo
      IO.println ( "Metodo 05" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
      contador = 0;
      while ( contador < quantidade )
      {
      // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
      // diminuir a quantidade
         contador = contador + 1;
      } // fim repetir
   } // fim metodo05( )

   public static void metodo06 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 06" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readint ( "Entrar com um valor inteiro: " );
         if ( x < 100 )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo06( )
   public static void metodo07 ( )
   {
   // definir dados
      int x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 07" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readint ( "Entrar com um valor inteiro: " );
         if ( x < 100 && x % 2 == 0 )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo07( )
   public static void metodo08 ( )
   {
   // definir dados
      double y;
   // definir dado para guardar o resultado
      double quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 08" );
      quantidade = IO.readdouble ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         y = IO.readdouble ( "Entrar com um valor inteiro: " );
         if ( y < 225 && y > 15 && y % 2 != 0 )
         {
            IO.println ( "Valor lido = " + y );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo08( )
   public static void metodo09 ( )
   {
   // definir dados
      double y;
   // definir dado para guardar o resultado
      double quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 09" );
      quantidade = IO.readdouble ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         y = IO.readdouble ( "Entrar com um valor inteiro: " );
         if ( y < 100 && y > 0  )
         {
            IO.println ( "Valor lido = " + (int) y );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo09( )
   public static void metodo10 ( )
   {
   // definir dados
      double y;
   // definir dado para guardar o resultado
      double quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 10" );
      quantidade = IO.readdouble ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         y = IO.readdouble ( "Entrar com um valor inteiro: " );
         if ( y < 100 && y > 0  )
         {
            IO.println ( "Valor lido = " + ( y - (int) y ));
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo10( )
   public static void metodo11 ( )
   {
   // definir dados
      char x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 11" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readchar ( "Entrar com um valor inteiro: " );
         if ( 'a' <= x && x <= 'z'  )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo11( )
   public static void metodo12 ( )
   {
   // definir dados
      char x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 12" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readchar ( "Entrar com um valor inteiro: " );
         if ( 'a' <= x && x <= 'z'  )
         {
            IO.println ( "" );
         }
         else 
         { 
            IO.println ( "Valor lido = " + x );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo12( )
   public static void metodo13 ( )
   {
   // definir dados
      char x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 13" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readchar ( "Entrar com um valor inteiro: " );
         if ( '0' <= x && x <= '9' )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo13( )
   public static void metodo14 ( )
   {
   // definir dados
      char x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 14" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readchar ( "Entrar com um valor inteiro: " );
         if ( ('A' <= x && x <= 'Z') || ('a' <= x && x <= 'z') )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo14( )
   public static void metodo15 ( )
   {
   // definir dados
      char x;
   // definir dado para guardar o resultado
      int quantidade = 0;
   // identificar o metodo
      IO.println ( "Metodo 15" );
      quantidade = IO.readint ( "Entrar com a quantidade: " );
            // ler valor inteiro do teclado
      while ( quantidade > 0 ) 
      {
         x = IO.readchar ( "Entrar com um valor inteiro: " );
         if ( '0' <= x && x <= '9' )
         {
            IO.println ( "Valor lido = " + x );
         }
         else 
         { 
            IO.println ( "" );
         }
      // diminuir a quantidade
         quantidade = quantidade - 1;
      }
   } // fim metodo15( )


// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // definir dado
      int opcao;
      do
      {
      // identificar
         IO.println ( "Exemplo0060 - Programa em Java" );
         IO.println ( "Autor: Paula Meireles" );
      // mostrar opcoes
         IO.println ( "Opcoes:" );
         IO.println ( "0 – Parar" );
         IO.println ( "1 – Metodo 01" );
         IO.println ( "2 – Metodo 02" );
         IO.println ( "3 – Metodo 03" );
         IO.println ( "4 – Metodo 04" );
         IO.println ( "5 – Metodo 05" );
         IO.println ( "6 – Metodo 06" );
         IO.println ( "7 – Metodo 07" );
         IO.println ( "8 – Metodo 08" );
         IO.println ( "9 – Metodo 09" );
         IO.println ( "10 – Metodo 10" );
         IO.println ( "11 – Metodo 11" );
         IO.println ( "12 – Metodo 12" );
         IO.println ( "13 – Metodo 13" );
         IO.println ( "14 – Metodo 14" );
         IO.println ( "15 – Metodo 15" );
      // ler a opcao do teclado
         opcao = IO.readint ( "Qual a sua opcao? " );
      // escolher qual metodo executar
         switch ( opcao )
         {
            case 0: // nao faz nada
               break;
            case 1: metodo01 ( );
               break;
            case 2: metodo02 ( );
               break;
            case 3: metodo03 ( );
               break;
            case 4: metodo04 ( );
               break;
            case 5: metodo05 ( );
               break;
            case 6: metodo06 ( );
               break;
            case 7: metodo07 ( );
               break;
            case 8: metodo08 ( );
               break;
            case 9: metodo09 ( );
               break;
            case 10: metodo10 ( );
               break;
            case 11: metodo11 ( );
               break;
            case 12: metodo12 ( );
               break;
            case 13: metodo13 ( );
               break;
            case 14: metodo14 ( );
               break;
            case 15: metodo15 ( );
               break;
            default:
               IO.println ( "ERRO: Opcao invalida." );
         } // fim escolher
      }
      while ( opcao != 0 );
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0060   // ---------------------------------------------- documentacao complementar
//
// ---------------------------------------------- historico
//
// Versao   Data   Modificacao
// 0.1     __ / __    esboco
//
// ---------------------------------------------- testes
//
// Versao      Teste
// 0.1     01. ( OK ) identificacao de programa e leitura
// 0.2     01. ( OK )
// 0.3     01. ( OK )
