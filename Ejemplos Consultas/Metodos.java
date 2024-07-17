import java.util.Scanner;

public class Metodos{
    public void Login(String nombre, int contraseña){
        if (nombre.equalsIgnoreCase("Cristian") && contraseña == 2005){
            System.out.println("----------¡Login Exitoso!----------");
            System.out.println("Hola " + nombre);
        } else {
            System.out.println("¡Error en el usuario o la contraseña!");
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------------Login---------------");
        System.out.println("Escriba su usuario: ");
        String nombre = entrada.nextLine();
        System.out.println("Escriba su contraseña: ");
        int contraseña = entrada.nextInt();

        Metodos login = new Metodos();
        login.Login(nombre, contraseña);

        entrada.close();
    }
}