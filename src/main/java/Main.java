import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    for (int i=0;i<5;i++){
    System.out.println("Podaj liczby"+(i+1)+":");
    int number=scanner.nextInt();
     if(number<min){
       min=number;
     }
   }
    System.out.println("Najmniejsza liczba to: "+min);
    }
}