package lab3p2_haroldcamas;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_HaroldCamas {
    
    static Scanner sc = new Scanner(System.in);
    static Scanner cadena = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList();
    
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
    public static boolean validarPlaca(String placa){
        char ch = 0;
        boolean valido = true;
        
        for (int i = 0; i < placa.length(); i++) {
            ch = placa.charAt(i);
            if(placa.length() != 7){
                valido = false;
                break;
            }
            if((i == 0 || i == 1 || i == 2 ) && (ch < 65 || ch > 90)){
                valido = false;
                break;
            }
            else if((i == 3 || i == 4 || i == 5 || i == 7 ) && (ch < 48 || ch > 57)){
                valido = false;
                break;
            }
        }
        return valido;
    }
    
    public static void agregarAutomovil() throws ParseException{
        System.out.println("Ingrese la placa del vehiculo: \nFormato(AAA0000)");
        String placa = cadena.nextLine().toUpperCase();
        boolean valido = validarPlaca(placa);
        if(valido == false || placa.charAt(0) != 'H'){
            System.out.println("Placa invalida");
        }
        else{
            System.out.println("Ingrese la marca del vehiculo");
            String marca = cadena.nextLine();
            System.out.println("Ingrese el modelo del vehiculo");
            String modelo = cadena.nextLine();
            System.out.println("Ingrese el tipo de vehiculo");
            String tipo = cadena.nextLine();
            Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
            DateFormat df = new SimpleDateFormat("YYYY");
            System.out.println("Ingrese el año del vehiculo:");
            String años = cadena.nextLine();
            Date año = df.parse(años);
            
            System.out.println("Ingrese el tipo de combustible del vehiculo:");
            String combustible = cadena.nextLine();
            System.out.println("Ingrese la cantidad de puertas del vehiculo:");
            int puertas = sc.nextInt();
            System.out.println("Ingrese la transmision del vehiculo: ");
            String transmision = cadena.nextLine();
            System.out.println("Ingrese la cantidad de asientos del vehiculo:");
            int asientos = sc.nextInt();
            
            Vehiculo carro = new Automovil(combustible, puertas, transmision, asientos, placa, marca, modelo, tipo, color, año);
            vehiculos.add(carro);
        }
    }
    
    public static void agregarMotocicleta() throws ParseException{
        
    }
}
