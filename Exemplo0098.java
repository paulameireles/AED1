/**
* Exemplo0098
*
* Paula Meireles, 628072
* @version 01
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0098
{
// ---------------------------------------------- definicao de metodo auxiliar
   public static void metodo01 ( int x )
   {
   // repetir enquanto valor maior que zero
      while ( x > 0 )
      {
      // mostrar valor
         IO.println ( "Valor = " + x );
      // passar ao próximo
         x = x - 1;
      } // fim se
   } // fim metodo01( )
   public static void metodo02 ( int x )
   {
   // definir dado local
      int y = x;
   // repetir enquanto valor maior que zero
      while ( y > 0 )
      {
      // mostrar valor
         IO.println ( "Valor = " + y );
      // passar ao próximo
         y = y - 1;
      } // fim se
   } // fim metodo02( )
   public static void metodo03 ( int x )
   {
   // definir dado local
      int y;
   // repetir enquanto valor maior que zero
      for ( y = x; y > 0; y = y - 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + y );
      } // fim se
   } // fim metodo03( )
   public static void metodo04 ( int x )
   {
   // definir dado local
      int y;
   // repetir enquanto valor maior que zero
      for ( y = 1; y <= x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + y );
      } // fim se
   } // fim metodo04( )
   public static void metodo05 ( int x )
   {
   // definir dado local
      int y;
      int z = 1;
   // repetir enquanto valor maior que zero
      for ( y = 1; y <= x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + z );
      // passar ao proximo
         z = z + 2;
      } // fim se
   } // fim metodo05( )
   public static void metodo06 ( int x )
   {
   // definir dado local
      int y;
      int z = 1;
   // repetir enquanto valor maior que zero
      IO.println ( "Valor = " + z );
      z = 2;
      for ( y = 1; y < x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + z );
      // passar ao proximo
         z = z + 2;
      } // fim se
   } // fim metodo06( )
   public static void metodo07 ( int x )
   {
   // definir dado local
      int y;
      int z;
   // repetir enquanto valor maior que zero
      IO.println ( "Valor = 1/1");
      z = 3;
      for ( y = 2; y <= x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + (z-1) + "/" + z );
      // passar ao proximo
         z = z + 2;
      } // fim se
   } // fim metodo07( )
   public static void metodo08 ( int x )
   {
   // definir dado local
      int y;
      int z;
      double soma = 1.0;
   // repetir enquanto valor maior que zero
      IO.println ( "Valor = 1/1" );
      z = 3;
      for ( y = 2; y <= x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + (z-1) + "/" + z );
      // somar uma parcela
         soma = soma + 1.0 * (z-1) / z;
      // passar ao proximo
         z = z + 2;
      } // fim se
   // mostrar o resultado
      IO.println ( "Soma = " + soma );
   } // fim metodo08( )
   public static double metodo09 ( int x )
   {
   // definir dado local
      int y;
      int z;
      double soma = 1.0;
   // repetir enquanto valor maior que zero
      IO.println ( "Valor = 1/1" );
      z = 3;
      for ( y = 1; y < x; y = y + 1 )
      {
      // mostrar valor
         IO.println ( "Valor = " + (z-1) + "/" + z );
      // somar uma parcela
         soma = soma + 1.0 * (z-1) / z;
      // passar ao proximo
         z = z + 2;
      } // fim se
   // retornar a resposta
      return ( soma );
   } // fim metodo09( )
   public static double metodo10 ( int x )
   {
   // definir dado local
      int y;
      int numerador = 1;
      int denominador = 1;
      double soma = (double) numerador / denominador;
   // repetir enquanto valor maior que zero
      IO.println ( ""+soma );
      for ( y = 1; y < x; y = y + 1 )
      {
      // passar ao proximo numerador
         numerador = y * 2;
      // passar ao proximo denominador
         denominador = denominador + 2;
      // mostrar valor
         IO.println ( "+ " + numerador + "/" + denominador );
      // somar uma parcela
         soma = soma + 1.0 * numerador / denominador;
      } // fim se
   // retornar a resposta
      return ( soma );
   } // fim metodo10( )
   public static void metodo11 (  )
   {
   // definir dado local 
      int y = 3;
      int x = IO.readint ( "Entre com um valor inteiro. ");
      int z;
      for (z = 1; z <= x; z = z + 1)
      {
         IO.println ( "" + y);
         y = y + 3;
      }
   }
   public static void metodo12 ( )
   {
      int x = IO.readint ( "Entre com um valor inteiro. ");
      int y = 3;
      int z;
      for (z = 1; z <= x; z = z + 1)
      {
         if ( y % 2 == 0 )
         {
            IO.println ( "" + y); 
         }
         y = y + 3;
      }
   }
   public static void metodo13 ( )
   {
      int x = IO.readint ( "Entre cou um valor inteiro. ");
      int y = 3;
      int z;
      for (z = 1; z <= x; z = z + 1)
      {
         if ( y % 2 != 0 )
         {
            IO.println ( "" + y );
         }
         y = y + 3;
      }
   }
   public static void metodo14 ( )
   {
      int x = IO.readint ( "Entre com um valor inteiro. ");
      int y = 3;
      int z;
      IO.println ( "1");
      for (z = 1; z <= x; z = z + 1)
      {
         IO.println ("1/" + y );
         y = y + 3;
      }
   }
   public static void metodo15 ( )
   {
      int x = IO.readint ( "Entre com um valor inteiro. ");
      int y = 3;
      int z;
      IO.println ( "1");
      for (z = 1; z <= x; z = z + 1)
      {
         IO.println ("1/" + y );
         y = (int) Math.pow( 3, z);
      }
   }
   public static int metodo16 ( )
   {
      int x = IO.readint ( "Entre com um valor inteiro. ");
      int y = 2;
      int z;
      int w = 0;
      IO.println ("1");
      for (z = 2; z <= x; z = z + 1)
      {
         if ( z % 2 == 0 && z % 3 != 0)
         {
            w = w + z;
         }
         
      }
      return w;
      
   }
   public static int metodo17 ( )
   {
      int x = IO.readint ( "Entre com um valor inteiro. ");
      double y;
      int z;
      IO.println ( "1");
      for (z = 1; z <= x; z = z + 1)
      {
         if ( z % 2 == 0 && z % 3 != 0)
         {
            IO.println ("1/" + z );
         }
      }
      return z;
   }
   public static void metodo18 (  )
   {
   //declarar variavel 
   int x = IO.readint ( "entrar com um valor inteiro. ");
   int quantidade = 0;
   // testar se valor positivo
      if ( x > 0)
      {
      // mostrar valor
         IO.println ( "Valor lido = " + x );
         
         quantidade = quantidade - 1;
      } // fim se
   } // fim metodo18( )

// ---------------------------------------------- definicao do metodo principal
/**
* main()  metodo principal
*/
   public static void main ( String [ ] args )
   {
   // definir dado para receber o resultado
      double resposta;
   // receber o resultado
      resposta = metodo10 ( 16 );
   // mostrar o resultado
      IO.println ( "Soma = " + resposta );
   // definir dados
      int opcao;
   // identificar
      IO.println ( "Exemplo0098 - Programa em Java" );
      IO.println ( "Autor: Paula Meireles" );
      IO.println ( "Opcoes:" );
      IO.println ( "1 - Metodo 01" );
      IO.println ( "2 - Metodo 02" );
      IO.println ( "3 - Metodo 03" );
      IO.println ( "4 - Metodo 04" );
      IO.println ( "5 - Metodo 05" );
      IO.println ( "6 - Metodo 06" );
      IO.println ( "7 - Metodo 07" );
      IO.println ( "8 - Metodo 08" );
      IO.println ( "9 - Metodo 09" );
      IO.println ( "10 - Metodo 10" );
      IO.println ( "11 - Metodo 11" );
      IO.println ( "12 - Metodo 12" );
      IO.println ( "13 - Metodo 13" );
      IO.println ( "14 - Metodo 14" );
      IO.println ( "15 - Metodo 15" );
      IO.println ( "16 - Metodo 16" );
      IO.println ( "17 - Metodo 17" );
      IO.println ( "18 - Metodo 18" );
   //ler a opcao do teclado
      opcao = IO.readint ( "Qual a sua opcao? " );
   //escolher opcao
      switch ( opcao )
      {
         case 1: metodo01 ( 5 );
            break;
         case 2: metodo02 ( 9 );
            break;
         case 3: metodo03 ( 15 );
            break;
         case 4: metodo04 ( 21 );
            break;
         case 5: metodo05 ( 33 );
            break;
         case 6: metodo06 ( 44 );
            break;
         case 7: metodo07 ( 35 );
            break;
         case 8: metodo08 ( 46 );
            break;
         case 9: metodo09 ( 12 );
            break;
         case 10: metodo10 ( 16 );
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
         case 16: metodo16 ( );
            break;
         case 17: metodo17 ( );
            break;
         case 18: metodo18 ( );
            break;
      }//fim escolher 
      IO.println ( metodo16 ( ));
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0098 
// metodo 1 imprime valores decrescenter (de 5 a 1) na tela 
// mudei a seleção de metodos e coloquei o metodo 2 
// metodo 3 conta de 15 ate 1 (decrescente)
// metodo 4 conta de forma crescente ate 21 
// metodo 5 exclui valores pares 
// metodo 6 exclui valores impares
// metodo 7 mostra valores em sequencia 
// metodo 8 tem a mesma funcao do 7 porem possui soma 
// o programa não está aceitando a saida com IO.pause
// metodo 9 possui somas 
// metodo 10 faz somas com os numeros em sequencia
// n�o entendi o enunciado do exemplo0097


 
