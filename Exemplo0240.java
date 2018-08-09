/*
Exemplo0240
Paula Meireles 628072
*/
import IO.*;

public class Exemplo0240{
  public static boolean withoutNumbers(String s){
    boolean wn = true;
    int tamanho = s.length(), i;
    for(i=0;i<tamanho;++i){
      if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
        wn = false;
      }
    }
    return(wn);
  }
  public static boolean justNumbers(String s){
    boolean jn = true;
    int tamanho = s.length(), i;
    for(i=0;i<tamanho;++i){
      if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '-')){
        jn = false;
      }
    }
    return(jn);
  }
  public static boolean stringNonEmpty(String s){
    boolean se = true;
    if(s == ""){
      se = false;
    }
    return(se);
  }
  public static boolean stringNonNull(String s){
    boolean snn = true;
    if(s == null){
      snn = false;
    }
    return(snn);
  }


  public static void metodo16(){
    Contato a1 = new Contato("Paula", "88991001", "88990896");
    System.out.println(a1.getNome() + "\t" + a1.getFone() + "\t" + a1.fone2);
  }
  public static void metodo17(){
    Contato a1 = new Contato("paula", "88991001", "88990896");
    System.out.println("Todos cadastros sao obrigados a ter 2 numeros");
    System.out.println(a1.getTelefones());
  }
  public static void metodo18(){
    Contato a1 = new Contato();
    a1.setFone2("3333-3333");
    System.out.println(a1.fone2);
  }
  public static void metodo19(){
    Contato a1 = new Contato();
    a1.setFone2("3333-3333");
    System.out.println(a1.fone2);
  }
  public static void metodo20(){
    Contato a1 = new Contato();
    a1.setFone2("3333-3333");
    System.out.println(a1.fone2);
    a1.rmFone2();
    System.out.println(a1.fone2);
  }
  public static void main(String [] args){
    System.out.println("Exemplo0240 - Programa em Java");
    System.out.println("Autor: Paula Meireles");
    metodo20();
    IO.pause("\nApertar ENTER para terminar");
  }
}
