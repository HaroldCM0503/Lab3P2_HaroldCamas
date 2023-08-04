package lab3p2_haroldcamas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_HaroldCamas {
    
    static Scanner sc = new Scanner(System.in);
    static Scanner cadena = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean seguir = true;
        int opcion = 0;
        
        while(seguir){
            System.out.println("""
                               1.)Agregar Autobus
                               2.)Agregar Motocicleta
                               3.)Agregar Autobus
                               4.)Modificar Vehiculo
                               5.)Eliminar Vehiculo
                               6.)Mostrar Vehiculos
                               7.)Generar Boletas
                               8.)Salir
                               """);
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    seguir = false;
                    break;
                    
                default:
                    break;
                    
            }
        }
    }
    
}
