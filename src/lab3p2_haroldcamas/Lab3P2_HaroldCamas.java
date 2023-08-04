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
    
    public static void main(String[] args) throws ParseException {
        boolean seguir = true;
        int opcion = 0;
        
        while(seguir){
            System.out.println("""
                               1.)Agregar Automovil
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
                    agregarAutomovil();
                    break;
                    
                case 2:
                    agregarMotocicleta();
                    break;
                    
                case 3:
                    agregarAutobus();
                    break;
                    
                case 4:
                    int indice = Listar();
                    
                    if(vehiculos.get(indice) instanceof Automovil){
                        System.out.println("""
                                           1.)Placa
                                           2.)Marca
                                           3.)Modelo
                                           4.)Tipo
                                           5.)Color
                                           6.)Año
                                           7.)Combustible
                                           8.)Puertas
                                           9.)Transmision
                                           10.)Asientos
                                           """);
                        int option = sc.nextInt();
                        modificarAutos(opcion);
                    }
                    
                    else if(vehiculos.get(indice) instanceof Motocicleta){}
                    
                    else if(vehiculos.get(indice) instanceof Autobus){}
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
            System.out.println("Automovil añadido con exito.");
        }
    }
    
    public static void agregarMotocicleta() throws ParseException{
        System.out.println("Ingrese la placa del vehiculo: \nFormato(AAA0000)");
        String placa = cadena.nextLine().toUpperCase();
        boolean valido = validarPlaca(placa);
        if(valido == false || placa.charAt(0) != 'B'){
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
            
            System.out.println("Ingrese la velocidad maxima del vehiculo:");
            int v_maxima = sc.nextInt();
            System.out.println("Ingrese el peso del vehiculo:");
            int peso = sc.nextInt();
            System.out.println("Ingrese el consumo L/km del vehiculo:");
            double consumo = sc.nextInt();
            
            Vehiculo moto = new Motocicleta(v_maxima, peso, consumo, placa, marca, modelo, tipo, color, año);
            vehiculos.add(moto);
            System.out.println("Motocicleta añadido con exito.");
        }
    }
    
    public static void agregarAutobus() throws ParseException{
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
            
            System.out.println("Ingrese la capacidad de pasajeros del vehiculo:");
            int capacidad = sc.nextInt();
            System.out.println("Ingrese el numero de ejes del vehiculo");
            int ejes = sc.nextInt();
            System.out.println("Ingrese la longitud del autobus");
            int longitud = sc.nextInt();
            
            Vehiculo rapidito = new Autobus(capacidad, ejes, longitud, placa, marca, modelo, tipo, color, año);
            vehiculos.add(rapidito);
            System.out.println("Autobus añadido con exito.");
        }
    }
    
    public static int Listar(){
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ".) " + vehiculos.get(i));
        }
        System.out.println("");
        System.out.println("Elija un elemento del lista:");
        int opcion = sc.nextInt() - 1;
        while(opcion < 0 || opcion >= vehiculos.size()){
            System.out.println("Elija un indice valido!");
            opcion = sc.nextInt() - 1;
        }
        return opcion;
    }
    
    public static void modificarAutos(int opcion){
        switch(opcion){
            case 1:
                System.out.println("Ingrese la placa del vehiculo: \nFormato(AAA0000)");
                String placa = cadena.nextLine().toUpperCase();
                boolean valido = validarPlaca(placa);
                while(valido == false || placa.charAt(0) != 'H'){
                    System.out.println("Ingrese una placa valida del vehiculo: \nFormato(AAA0000)");
                    placa = cadena.nextLine().toUpperCase();
                    valido = validarPlaca(placa);
                }
                vehiculos.get(opcion).setPlaca(placa);
                break;
                
            case 2:
                System.out.println("Ingrese la nueva marca del vehiculo");
                String marca = cadena.nextLine();
                vehiculos.get(opcion).setMarca(marca);
                break;
                
            case 3:
                System.out.println("Ingrese el modelo del vehiculo");
                String modelo = cadena.nextLine();
                vehiculos.get(opcion).setModelo(modelo);
                break;
                
            case 4:
                System.out.println("Ingrese el tipo de vehiculo");
                String tipo = cadena.nextLine();
                vehiculos.get(opcion).setTipo(tipo);
                break;
                
            case 5:
                Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                vehiculos.get(opcion).setColor(color);
                break;
                
            case 6:
                DateFormat df = new SimpleDateFormat("YYYY");
                System.out.println("Ingrese el año del vehiculo:");
                String años = cadena.nextLine();
                Date año = df.parse(años);
                vehiculos.get(opcion).setAño(año);
                break;
                
            case 7:
                System.out.println("Ingrese el tipo de combustible del vehiculo:");
                String combustible = cadena.nextLine();
                ((Automovil) vehiculos.get(opcion)).setCombustible(combustible);
                break;
                
            case 8:
                System.out.println("Ingrese la cantidad de puertas del vehiculo:");
                int puertas = sc.nextInt();
                ((Automovil) vehiculos.get(opcion)).setPuertas(puertas);
                break;
                
            case 9:
                System.out.println("Ingrese la transmision del vehiculo: ");
                String transmision = cadena.nextLine();
                ((Automovil) vehiculos.get(opcion)).setTransmision(transmision);
                break;
                
            case 10:
                System.out.println("Ingrese la cantidad de asientos del vehiculo:");
                int asientos = sc.nextInt();
                ((Automovil) vehiculos.get(opcion)).setAsientos(asientos);
                break; 
        }
    }
    
    public static void modificarMotos(int opcion){
        switch(opcion){
            case 1:
                System.out.println("Ingrese la placa del vehiculo: \nFormato(AAA0000)");
                String placa = cadena.nextLine().toUpperCase();
                boolean valido = validarPlaca(placa);
                while(valido == false || placa.charAt(0) != 'H'){
                    System.out.println("Ingrese una placa valida del vehiculo: \nFormato(AAA0000)");
                    placa = cadena.nextLine().toUpperCase();
                    valido = validarPlaca(placa);
                }
                vehiculos.get(opcion).setPlaca(placa);
                break;
                
            case 2:
                System.out.println("Ingrese la nueva marca del vehiculo");
                String marca = cadena.nextLine();
                vehiculos.get(opcion).setMarca(marca);
                break;
                
            case 3:
                System.out.println("Ingrese el modelo del vehiculo");
                String modelo = cadena.nextLine();
                vehiculos.get(opcion).setModelo(modelo);
                break;
                
            case 4:
                System.out.println("Ingrese el tipo de vehiculo");
                String tipo = cadena.nextLine();
                vehiculos.get(opcion).setTipo(tipo);
                break;
                
            case 5:
                Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                vehiculos.get(opcion).setColor(color);
                break;
                
            case 6:
                DateFormat df = new SimpleDateFormat("YYYY");
                System.out.println("Ingrese el año del vehiculo:");
                String años = cadena.nextLine();
                Date año = df.parse(años);
                vehiculos.get(opcion).setAño(año);
                break;
                
            case 7:
                break;
                
            case 8:
                break;
                
            case 9:
                break;
                
            case 10:
                break;
                
        }
    }
    
    public static void modificarBuses(int opcion){
        switch(opcion){
            case 1:
                System.out.println("Ingrese la placa del vehiculo: \nFormato(AAA0000)");
                String placa = cadena.nextLine().toUpperCase();
                boolean valido = validarPlaca(placa);
                while(valido == false || placa.charAt(0) != 'H'){
                    System.out.println("Ingrese una placa valida del vehiculo: \nFormato(AAA0000)");
                    placa = cadena.nextLine().toUpperCase();
                    valido = validarPlaca(placa);
                }
                vehiculos.get(opcion).setPlaca(placa);
                break;
                
            case 2:
                System.out.println("Ingrese la nueva marca del vehiculo");
                String marca = cadena.nextLine();
                vehiculos.get(opcion).setMarca(marca);
                break;
                
            case 3:
                System.out.println("Ingrese el modelo del vehiculo");
                String modelo = cadena.nextLine();
                vehiculos.get(opcion).setModelo(modelo);
                break;
                
            case 4:
                System.out.println("Ingrese el tipo de vehiculo");
                String tipo = cadena.nextLine();
                vehiculos.get(opcion).setTipo(tipo);
                break;
                
            case 5:
                Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                vehiculos.get(opcion).setColor(color);
                break;
                
            case 6:
                DateFormat df = new SimpleDateFormat("YYYY");
                System.out.println("Ingrese el año del vehiculo:");
                String años = cadena.nextLine();
                Date año = df.parse(años);
                vehiculos.get(opcion).setAño(año);
                break;
                
            case 7:
                break;
                
            case 8:
                break;
                
            case 9:
                break;
                
            case 10:
                break;
                
        }
    }
    
}
