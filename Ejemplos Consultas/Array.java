import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];
        System.out.println("Escriba el nombre del estudiante: ");
        for (int i = 1; i <= 4; i++){
            System.out.print("Estudiante: " + i + ".");
            nombres[i] = entrada.nextLine(); 
        }
        System.out.println("Escriba la edad del estudiante: ");
        for (int i = 1; i <= 4; i++){
            System.out.print("Estudiante " + i + ": ");
            edades[i] = entrada.nextInt();
        }

        System.out.println("----------ESTUDIANTES Y SUS EDADES----------");
        for (int i = 1; i <= 4; i++){
            System.out.print(nombres[i] + " tiene ");
            System.out.println(edades[i] + " años.");
        }
        entrada.close();
    }
    
}
