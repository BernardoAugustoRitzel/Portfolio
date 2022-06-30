import java.util.Scanner;
public class Primos{
    public static void main(String[]args){
    try (Scanner Primos = new Scanner(System.in)) {
        System.out.println("Digite o valor para achar os números primos até ele: ");
        int n = Primos.nextInt();
        System.out.println("----------------------------------------------------");
        int i = 0;

            while(i <= n){
            int contador = 0;
            int j = i;
            
            while(j >= 1){
                if(i % j == 0){
            
                contador++;}
                j--;}
        
                if(contador == 2){
                System.out.println(i);
            }
                i++;
            }
    }
    }
}