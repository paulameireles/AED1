/**
* Exemplo0137
*
* Paula Meireles 628072
* @version 01
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0140
{
// ---------------------------------------------- definicao de metodo auxiliar
/**
* guardar dados em arquivo,
* dada a quantidade deles.
*/
   public static void metodo01 ( )
   {
   // 1. definir dados
      int n;
      int k;
      String dado;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Guardar dados em arquivos" );
   // 3. ler dado do teclado
      n = IO.readint ( "Quantos nomes? " );
   // 4. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // criar arquivo para gravar dados
         arquivo = new FILE ( FILE.OUTPUT, "DADOS1.TXT" );
      // guardar a quantidade de dados em arquivo
         arquivo.println ( ""+ n );
      // ler os outros dados do teclado
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler um dado do teclado
            dado = IO.readString ( "Nome = " );
         // guardar dado em arquivo
            arquivo.println ( ""+dado );
         } // fim repetir
      // fechar o arquivo (INDISPENSAVEL para a gravacao)
         arquivo.close ( );
      } // fim se
   // 5. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo01( )
/**
* consultar dados em arquivo.
*/
   public static void metodo02 ( )
   {
   // 1. definir dados
      String linha;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Consultar dados em arquivos" );
   // 3. abrir arquivo para a leitura
      arquivo = new FILE ( FILE.INPUT, "DADOS1.TXT" );
   // 4. ler linhas do arquivo
   // tentar ler uma linha do arquivo
      linha = arquivo.readln ( );
   // repetir enquanto houver dado
      while ( ! arquivo.eof ( ) )
      {
      // mostrar dado na tela
         IO.println ( "" + linha );
      // tentar ler outra linha do arquivo
         linha = arquivo.readln ( );
      } // fim repetir
   // fechar o arquivo (RECOMENDAVEL para a leitura)
      arquivo.close ( );
   // 5. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo02 ( )
/**
* recuperar dados em arquivo,
* dada a quantidade deles na primeira linha.
*/
   public static void metodo03 ( )
   {
   // 1. definir dados
      int n, k;
      String linha;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Consultar dados em arquivos" );
   // 3. abrir arquivo para a leitura
      arquivo = new FILE ( FILE.INPUT, "DADOS1.TXT" );
   // 4. ler quantidade de dados do arquivo
   // 4.1 ler uma linha do arquivo
      linha = arquivo.readln ( );
   // 4.2 converter conteudo para valor inteiro
      n = IO.getint ( linha );
   // 5. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // mostrar a quantidade de dados
         IO.println ( "Quantidade de dados = " + n );
      // ler os outros dados do arquivo
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler uma linha do arquivo
            linha = arquivo.readln ( );
         // mostrar dado na tela
            IO.println ( "" + linha );
         } // fim repetir
      // fechar o arquivo (RECOMENDAVEL para a leitura)
         arquivo.close ( );
      } // fim se
   // 6. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo03 ( )
/**
* guardar dados inteiros em arquivo,
* dada a quantidade deles.
*/
   public static void metodo04 ( )
   {
   // 1. definir dados
      int n, k, dado;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Guardar dados inteiros em arquivos" );
   // 3. ler dado do teclado
      n = IO.readint ( "Fornecer a quantidade de valores: " );
   // 4. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // criar arquivo para gravar dados
         arquivo = new FILE ( FILE.OUTPUT, "DADOS2.TXT" );
      // guardar a quantidade de dados
         arquivo.println ( ""+n );
      // ler os outros dados do teclado
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler um dado do teclado
            dado = IO.readint ( "Dado = " );
         // guardar dado em arquivo
            arquivo.println ( ""+dado );
         } // fim repetir
      // fechar o arquivo (INDISPENSAVEL para a gravacao)
         arquivo.close ( );
      } // fim se
   // 5. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo04 ( )
   public static void metodo05 ( )
   {
   // 1. definir dados
      int n, k, dado;
      String linha;
      FILE arquivo;
   // 2. identificar
      IO.println ( );
      IO.println ( "Consultar dados em arquivos" );
      IO.println ( );
   // 3. abrir arquivo para a leitura
      arquivo = new FILE ( FILE.INPUT, "DADOS2.TXT" );
   // 4. ler quantidade de dados do arquivo
   // 4.1 ler uma linha do arquivo
      linha = arquivo.readln ( );
   // 4.2 converter conteudo para valor inteiro
      n = IO.getint ( linha );
   // 5. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // mostrar a quantidade de dados
         IO.println ( "Quantidade de dados = " + n );
      // ler os outros dados do arquivo
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler uma linha do arquivo
            linha = arquivo.readln ( );
         // converter conteudo para valor inteiro
            dado = IO.getint ( linha );
         // mostrar dado na tela
            IO.println ( "" + dado );
         } // fim repetir
      // fechar o arquivo (RECOMENDAVEL para a leitura)
         arquivo.close ( );
      } // fim se
   // 6. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo05 ( )
   /**
* guardar dados reais em arquivo,
* dada a quantidade deles.
*/
   public static void metodo06 ( )
   {
   // 1. definir dados
      int n, k;
      double dado;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Guardar dados reais em arquivos" );
   // 3. ler dado do teclado
      n = IO.readint ( "Fornecer a quantidade de valores: " );
   // 4. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // criar arquivo para gravar dados
         arquivo = new FILE ( FILE.OUTPUT, "DADOS3.TXT" );
      // guardar a quantidade de dados
         arquivo.println ( ""+n );
      // ler os outros dados do teclado
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler um dado do teclado
            dado = IO.readdouble ( "Dado = " );
         // guardar dado em arquivo
            arquivo.println ( ""+dado );
         } // fim repetir
      // fechar o arquivo (INDISPENSAVEL para a gravacao)
         arquivo.close ( );
      } // fim se
   // 5. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo06 ( )
   /**
* recuperar dados reais em arquivo,
* dada a quantidade deles na primeira linha.
*/
   public static void metodo07 ( )
   {
   // 1. definir dados
      int n, k;
      double dado;
      String linha;
      FILE arquivo;
   // 2. identificar
      IO.println ( "Consultar dados em arquivos" );
   // 3. abrir arquivo para a leitura
      arquivo = new FILE ( FILE.INPUT, "DADOS3.TXT" );
   // 4. ler quantidade de dados do arquivo
   // 4.1 ler uma linha do arquivo
      linha = arquivo.readln ( );
   // 4.2 converter conteudo para valor inteiro
      n = IO.getint ( linha );
   // 5. testar a quantidade
      if ( n <= 0 )
      {
         IO.println ( "ERRO: Quantidade invalida." );
      }
      else
      {
      // mostrar a quantidade de dados
         IO.println ( "Quantidade de dados = " + n );
      // ler os outros dados do arquivo
         for ( k = 1; k <= n; k = k + 1 )
         {
         // ler uma linha do arquivo
            linha = arquivo.readln ( );
         // converter conteudo para valor inteiro
            dado = IO.getdouble ( linha );
         // mostrar dado na tela
            IO.println ( "" + dado );
         } // fim repetir
      // fechar o arquivo (RECOMENDAVEL para a leitura)
         arquivo.close ( );
      } // fim se
   // 6. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo07 ( )
   /**
* guardar dados em arquivo.
*/
   public static void metodo08 ( )
   {
   // 1. definir dados
      String linha;
      FILE arquivo;
   // 2. identificar
      IO.println ( );// nao entendi o porque de não printar nada na linha, seria algum tipo de separação?
      IO.println ( "Guardar dados em arquivos" );
      IO.println ( );
   // 3. criar arquivo para gravar dados
      arquivo = new FILE ( FILE.OUTPUT, "TEXTO.TXT" );
   // 4. ler uma linha do teclado
      linha = IO.readln ( "" );
   // 5. repetir enquanto quiser guardar dados
      while ( ! linha.equals ( "PARAR" ) )
      {
      // guardar linha em arquivo
         arquivo.println ( ""+linha );
      // ler outra linha do teclado
         linha = IO.readln ( "" );
      } // fim repetir
   // 6. fechar o arquivo (INDISPENSAVEL para a gravacao)
      arquivo.close ( );
   // 7. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo08 ( )
   /**
* ler dados de arquivo.
*/
   public static void metodo09 ( )
   {
   // 1. definir dados
      String dado;
      FILE arquivo;
   // 2. identificar
      IO.println ( );
      IO.println ( "Ler dados de arquivos" );
      IO.println ( );
   // 3. abrir arquivo para ler dados
      arquivo = new FILE ( FILE.INPUT, "TEXTO.TXT" );
   // 4. tentar ler um dado do teclado
      dado = arquivo.read ( );
   // 5. repetir enquanto houver dados
      while ( ! arquivo.eof ( ) )
      {
      // mostrar dado lido de arquivo
         IO.println ( ""+dado );
      // ler outro dado do teclado
         dado = arquivo.read ( );
      } // fim repetir
   // 6. fechar o arquivo (RECOMENDAVEL para a leitura)
      arquivo.close ( );
   // 7. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo09 ( )
   /**
* ler dados de arquivo.
*/
   public static void metodo10 ( )
   {
   // 1. definir dados
      String dado;
      int valor;
      FILE arquivo;
   // 2. identificar
      IO.println ( );
      IO.println ( "Ler dados de arquivos" );
      IO.println ( );
   // 3. abrir arquivo para ler dados
      arquivo = new FILE ( FILE.INPUT, "TEXTO.TXT" );
   // 4. tentar ler um dado do teclado
      dado = arquivo.read ( );
   // 5. repetir enquanto houver dados
      while ( ! arquivo.eof ( ) )
      {
      // mostrar dado lido de arquivo
         if ( dado != null &&
         dado.length( ) > 0 )
         {
            IO.println ( ""+IO.getint(dado) );
         } // fim se
      // ler outro dado do teclado
         dado = arquivo.read ( );
      } // fim repetir
   // 6. fechar o arquivo (RECOMENDAVEL para a leitura)
      arquivo.close ( );
   // 7. encerrar
      IO.println ( );
      IO.pause ( "Apertar ENTER para continuar." );
   } // fim metodo10 ( )
   public static void metodo11 ( )
   {
   // definir dados
      int x, y;
      FILE arquivo;
   // identificar 
      IO.println ( );
      IO.println ("Guardar numero de arquivos ");
      IO.println ( );
      //ler dados do teclado
      x = IO.readint ("qual a quantidade de numeros? ");
      x = x * 5;
      //criar novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_01.TXT");
      //definir limitaçoes para os numeros 
      while ( x != 0 )
      {
         arquivo.println ( " " + x);
         IO.println ( x );
         x = x - 5;
      }
      arquivo.close ( );
      IO.println ("Programa finalizado. ");
      IO.pause("Aperte ENTER para fechar o programa.");
   }
   public static void metodo12 ( )
   {
   // definir dados
      FILE arquivo; 
      int x, y;
      IO.println ("Programa para guardar numeros em arquivo. ");
      x = IO.readint ("Quantidade de numeros desejada? ");
      x = x * 5;
   //criar novo arquivo
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_02.TXT");
      for ( y = 5; y <= x; y = y + 5)
      {
         arquivo.println ( " " + y);
         IO.println ( y );
      }
      arquivo.close ( );
      IO.println ("O programma terminou. ");
      IO.pause (" Aperte ENTER para terminar. ");
   }
   public static void metodo13 ( )
   {
   // definir dados 
      FILE arquivo;
      int x, y;
      x = IO.readint ("Quantidade de numeros desejada? ");
      x = (x-1) * 5;
   // criar arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_03.TXT");
      y = 1;
      arquivo.println ( " " + y);
      IO.println ( y );
      for (y = 5; y <= x; y = y + 5)
      {
         arquivo.println ( " " + y);
         IO.println ( y );
      }// fim for 
      arquivo.close ( );
      IO.println ("O programa terminou. ");
      IO.pause ("Aperte ENTER para terminar");
   }// fim 
   public static void metodo14 ( )
   {
   // definir dados 
      FILE arquivo;
      int x;
   //criar novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_04.TXT");
   //ler variavel 
      x = IO.readint ("Quantidade de numeros desejada? ");
      x = x - 1;
      while ( x > - 1)
      {
         if ( x == 0) 
         {
            arquivo.println ("1");
            IO.println ("1");
            x = x - 1;
         }//fim if 
         else 
         {
            IO.println ("1/" + Math.pow(5,x));
            arquivo.println ("1/" + Math.pow(5,x));
            x = x - 1;
         }//fim else
      }//fim while
      IO.println ("O programa terminou. ");
      IO.pause ("Aperte ENTER para finalizar o programa. ");
   }//fim metodo14
   public static void metodo15 ( )
   {
   // definir dados 
      FILE arquivo;
      String dados;
      int x;
      char f;
   // iniciar um novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_05.TXT");
   // ler e passar de cadeia de caracteres para numeros de inteiros 
      dados = IO.readString ("Digite uma cadeia de caracteres. ");
      x = dados.length( ) - 1;
      while ( x > - 1)
      {
         f = dados.charAt ( x );
         IO.println ( x );
         arquivo.println (""+ 1);
         x = x - 1;
      }//fim while 
   }//fim metodo15
   public static void metodo16 ( )
   {
   //definir dados 
      int q, n;
      int soma = 0; 
      FILE arquivo;
   //abrir um novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_06.TXT");
      q = IO.readint ("Entre com a quantidade. ");
      for( n = 3; q > 0; q = q - 1) 
      {
         IO.println ("+" + n);
         soma = soma + n;
         n = n + 2;
      }
      IO.println ("=" + soma);
      arquivo.println ("Soma = " + soma);
      arquivo.close ( );
      IO.println ("O programa foi finalizado. ");
      IO.pause ("Aperte ENTER para terminar. ");
   }
   public static void metodo17 ( )
   {
   //definir dados 
      int x;
      double soma = 0; 
      double y, z;
      FILE arquivo;
   //abrir arquivo
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_07.TXT");
      x = IO.readint ("Entre com um valor. ");
      x = x - 1;
      for ( y = 3; x > 0; x = x - 1)
      {
         z = (1.0/y);
         soma = soma + z;
         IO.println ("+1/" + y);
         y = y + 2;
      }      
      arquivo.println ("" + soma);
      IO.println ("= " + soma);
      arquivo.close ( );
      IO.println ("O programa foi finalizado. ");
      IO.pause ("Aperte ENTER para terminar. ");
   }
   public static int funcao18 ( int x )
   {
   // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( x == 1 || x == 2 )
      {
      // primeiros dois valores iguais a 1
         resposta = 1; // bases
      }
      else
      {
         if ( x > 1 )
         {
         // fazer de novo com valor absoluto
            resposta = funcao18 ( x-1 ) + funcao18 ( x-2 );
         } // fim se
      } // fim se
   // retornar resposta
      return ( resposta );
   } // fim funcao18( )
   public static int metodo18 ( int x ) 
   {
      int soma = 0;
      int fibo;
      int atual = 1;
      FILE arquivo;
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_08.TXT");
      while ( x > 0 ) 
      {
         fibo = funcao18(atual);
         if (fibo%2==0) 
         {
            arquivo.println ("" + fibo);
            soma = soma + fibo;
            x = x - 1;
         }
         atual = atual + 1;
      }
      arquivo. println ( "" + soma);
      arquivo.close ( );
      return soma;
   }
   public static int metodo19 ( String x )
   {
   //definir dados 
      int soma = 0;
      int z, r;
      char g;
      FILE arquivo;
   //abrir novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_09.TXT");
      z = x.length ( );
      for ( r = 0; r < z; r = r + 1)
      {
         g = x.charAt ( r );
         if ( g >= 'A' && g <= 'Z')
         {
            soma = soma + 1;
            arquivo.println ("" + g);
         }// fim se 
      }// fim repeticao
      arquivo.println ("" + soma);
      arquivo.close ( );
      return soma;
   }// fim 
   public static int metodo20 ( String x )
   {
   //definir dados 
      int soma = 0;
      int z, r;
      char g;
      FILE arquivo;
   //abrir novo arquivo 
      arquivo = new FILE (FILE.OUTPUT, "QUESTAO_10.TXT");
      z = x.length ( );
      for ( r = 0; r < z; r = r + 1)
      {
         g = x.charAt ( r );
         if ( g >= '0' && g <= '9')
         {
            soma = soma + 1;
            arquivo.println ("" + g);
         }// fim se 
      }// fim repeticao
      arquivo.println ("" + soma);
      arquivo.close ( );
      return soma;
   }// fim 


   //-------------------------------------------------------- definicao do metodo principal
   /**
   * main() – metodo principal
   */
   public static void main ( String [ ] args )
   {
   // declarar dados 
      int x;
      int a;
      String p;
   // identificar
      IO.println ( "Exemplo0140- Programa em Java" );
      IO.println ( "Autor: Paula Meireles" );
   // executar o metodo auxiliar
   //metodo01 ( );
   //metodo02 ( );
   //metodo03 ( );
   //metodo04 ( );
   //metodo05 ( );
   //metodo06 ( );
   //metodo07 ( );
   //metodo08 ( );
   //metodo09 ( );
   //metodo10 ( )
   //metodo11 ( );
   //metodo12 ( );
   //metodo13 ( );
   //metodo14 ( );
   //metodo15 ( );
   //metodo16 ( );
   //metodo17 ( );
   // a = metodo18 (x = IO.readint ("Digite um valor inteiro. "));
   //IO.println ( a );
   //a = metodo19 (p = IO.readString ("Digite uma palavra. "));
   //IO.println ( a );
      a = metodo20 (p = IO.readString ("Digite uma palavra. "));
      IO.println ( a );
   // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0137
// metodo01 grava dados em TXT
// metodo02 consulta dados do metodo01 e imprime na tela 
// metodo03 mostra a quantidade de dados em inteiro e mostra as linhas do TXT do metodo01
// metodo04 lê quantidade de valores inteiros (int) e grava em um arquivo TXT
// metodo05 consulta dados no aquivo TXT do metodo04 e mostra a quantidade de numeros inteiros e os numeros escolhidos 
// metodo06 recolhe quantidade (int) de valores double e guarda em arquivo TXT
// metodo07 consulta dados em arquivo do metodo06 em TXT e printa na tela 
// comentario com duvida na linha 303
// metodo08 guarda todos os vlores double, int, char e string que tiver e quando digitar PARAR ele para o programa 
// metodo09 lê arquivo TXT do metodo08
// metodo10 não entendi o que se passa e como ele funciona 









