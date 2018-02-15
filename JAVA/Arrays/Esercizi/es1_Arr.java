// quanti numeri pari in un'array casuale

public class es1_Arr extends external.functions{
   public static void main(String[] args){

      int[] arr = fillArray(10);

      int pari = check();

      System.out.println("le occorrenze pari sono: " + pari);
   }

   static int check(int[] arr){
      int pari = 0;

      for(int i = 0; i < arr.length; i++)
         if(arr[i] %2 == 0)
            pari++;

      return pari;
   }
}
