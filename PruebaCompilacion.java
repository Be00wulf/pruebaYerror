import java.util.Scanner;
public class PruebaCompilacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("¿Numero positivo o negativo? Introduzca un numero: ");
        numero = entrada.nextInt();
        
        while (numero != 0) {            

            if (numero > 0) {
                System.out.println("El numero es positivo");   
            }   else if(numero < 0){  
                
                System.out.println("El numero es negativo");
            } 
            
            System.out.println("Introduzca otro numero o presione 0 para salir ");
            numero = entrada.nextInt();
        
        }
          
    }
}
