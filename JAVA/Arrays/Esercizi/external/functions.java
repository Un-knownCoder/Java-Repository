public class functions{

// riempie un'array di interi
   public static int[] fillArray(int length){
      int[] out = new int[length];

      for(int i = 0; i < out.length; i++){
         out[i] = Math.ceil(Math.random() * 99);
      }

      return out;

   }
}
