/**
* Guia00014 
*
* Paula Meireles, 628072
* @version 14
*/
//
// Lista de dependencias
//
import jkarel.World;
import jkarel.Robot;
/**
* Exemplo de programa para uso com a classe JKarel.
*/
public class Guia00014 extends Robot
{
/**
* construtor padrao da classe Guia00.
* @param avenue - uma das coordenadas da posicao inicial
* @param street - outra das coordenadas da posicao inicial
* @param direction - direcao inicial
* @param beepers - quantidade inicial de marcadores
*/
public Guia00014( int avenue, int street, int direction, int beepers )
{
// metodo para repassar dados
// ao construtor padrao da classe original (Robot)
super( avenue, street, direction, beepers );
} // end Guia0001( )
/**
* metodo para criar configuracoes do ambiente.
* @param nome do arquivo onde guardar a configuracao
*/
public static void createWorld( String nome )
{
// o executor deste metodo (World - agente)
// ja' foi definido na classe original (Robot)
World.reset( ); // limpar configuracoes
World.placeNSWall(5,2,1);
World.placeEWWall(3,1,1);
// para nao exibir os passos de criacao do ambiente
World.setTrace( false ); // (opcional)
// para colocar marcador(es)
World.placeBeepers( 4, 4, 0 ); // marcador no topo da escada
// para guardar em arquivo
World.saveWorld( nome ); // gravar configuracao
} // end createWorld( )
/**
* metodo para virar 'a direita.
*/
public void turnRight( )
{
// o executor deste metodo
// deve virar tres vezes 'a esquerda
turnLeft( );
turnLeft( );
turnLeft( );
} // end turnRight( )
/**
* metodo para mover varios passos.
* @param steps - passos a serem dados.
*/
public void moveN( int steps )
{
// definir dado local
int step; // contador de passos
// repetir para contador
// comecando em 1,
// enquanto menor ou igual 'a quantidade,
// variando de 1 em 1
for ( step = 1; step <= steps; step = step + 1 )
{
// dar um passo
move( );
} // end for
} // end moveN( )
/**
* metodo para especificar parte de uma tarefa.
*/
public void doPartialTask( )
{
moveN( 2 );
turnLeft( );
} // end doPartialTask( )
/**
* metodo para especificar parte de uma tarefa.
*/
public void doTask( )
{
//doPartialTask( );
//doPartialTask( );
// ( nextToABeeper( ) )
//{
//( );
//( );
//}
//else
//{
//doPartialTask( );
//} // end if
//doPartialTask( );
turnLeft( );
moveN( 2 );
turnRight( );
moveN( 2 );
putBeeper ( );
moveN( 2 );
putBeeper ( );
moveN( 2 );
putBeeper ( );
turnLeft ( );
turnLeft ( );
moveN( 2 );
moveN( 2 );
moveN( 2 );
turnLeft ( );
moveN( 2 );
moveN( 2 );
} // end doTask( )
/**
* metodo para especificar parte de uma tarefa.
*/
/**
* Acao principal: executar a tarefa descrita acima.
*/
public static void main( String [ ] args )
{
// criar o ambiente com escada
// OBS.: executar pelo menos uma vez,
// antes de qualquer outra coisa
// (depois de criado, podera' ser comentado)
createWorld( "Guia0001.txt" );
// comandos para tornar o mundo visivel
World.reset( ); // limpar configuracoes
World.setSpeed ( 7 ); // escolher velocidade
World.readWorld( "Guia0001.txt" ); // ler configuracao do ambiente
// definir o objeto particular para executar as acoes (agente)
Guia00014 JK = new Guia00014( 1, 1, World.EAST, 3 );
// executar acoes
JK.doTask( );
} // end main( )
} // end class
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. ( OK )
// 0.2 01. ( OK ) teste da tarefa
// 0.3 01. ( OK ) teste da tarefa parcial
// 0.4 01. ( OK ) teste do apanhar marcador
// 0.5 01. ( OK ) teste do colocar marcador
// 0.6 01. ( OK ) teste da repeticao do movimento
// 0.7 01. ( OK ) teste com marcador na posicao (4,4)
//     02. ( OK ) teste sem marcador na posicao (4,4)
// 0.8 01. ( OK ) teste com a quantidade de marcadores
// 0.9 01. ( OK ) teste com outra forma de repeticao
// 1.0 01. ( OK ) teste com outra forma de alternativa
// nao sei fazer as paredes de modo certo