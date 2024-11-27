import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Integer[] edades = new Integer[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, ingresa 20 edades secuencialmente para calcular quienes tienen alto riesgo de hipertension: ");
        for (int i = 0; i < edades.length; i++){
            System.out.println("Edad de la persona "+ (i + 1) +": ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Calculando...");
        for (int i = 0; i < edades.length; i++){
            if (edades[i] >= 60){
                System.out.println("Persona "+ (i + 1)+ " con edad: "+ edades[i]+ " tiene riesgo de hipertension.");
            }
        }
    }
}