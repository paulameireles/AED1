public class IMyString {
  
  
   /**
   Funcao para converter conteudo para valor inteiro, se possivel.
   */
   public int getInt ( ){
      String msg;
      int x;
      x = msg.getInt ();
      return x ;
   }
   /**
   Funcao para converter conteudo para valor real, se possivel.
   */
   public double getDouble ( ){
      String msg;
      double z;
      z = msg.getDouble();
      return z;
   }
   /**
   Funcao para converter conteudo para valor lógico, se possivel.
   Nota: Considerar válidos: { true, false, T, F, 0, 1 }
   */
   public boolean getBoolean( ){
      String msg;
      boolean z;
      z = getBoolean(msg);
      return z;
   }
   /**
   Funcao para verificar se o parametro esta’ contido no conteudo.
   */
   public boolean contains ( String texto ){
      String msg; 
      boolean x;
      if (msg.contains(texto)){
         x = true;
      }
   }
   /**
   Funcao para converter letras para maiusculas.
   */
   public String toUpperCase( ){
      String msg;
      return (msg.toUppercase ());
   }
   /**
   Funcao para converter letras para minusculas.
   */
   public String toLowerCase( ){
      String msg;
      String x;
      x = msg.toLowerCase();
      return x;
   }
   /**
   Funcao para trocar todas as ocorrencias de certo caractere por outro novo.
   */
   public String replace ( char original, char novo ){
      String msg;
      int x;
      for (x = 0; x < msg.length(); x++){
         String [x]== novo;
         return x;
      }
   }
   /**
   Funcao para isolar todas as sequencias separadas por espaços em branco.
   */
   public String [ ] split ( ){
      String msg;
      int x;
      char c;
      
      for (x = 0; x < msg.length(); x++){
         c = msg[x];
         c = c + " ";
         return c;
      }
   }
   /**
   Funcao para codificar o conteudo segundo a cifra de César (pesquisar).
   */
   public String encrypt ( ){
      
   }
}