/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201314658;
import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class Menu {
    Scanner leer;
    int opcion;
    static String[] usuario;
    
    public Menu(){
        leer = new Scanner(System.in);
        usuario= new String[5];
}
    public void menu1(){
        
        do{
            System.out.println("Tarea 3");
            System.out.println("201314658");
            System.out.println(" ");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. Salir");
            opcion = leer.nextInt();    
            
            switch(opcion){
                case 1:
                    menuUsuarios();
                    break;
                case 2: 
                    palabras();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    menu1();
                    break;
            }
        }while (opcion != 3);
    
    }
    
    public void menuUsuarios(){
        
        int o;
        
        do{
            System.out.println("Menur de Usuarios");
            System.out.println("");
            System.out.println("1. ingresar suarios");
            System.out.println("2. Mostrar todos los usuarios");
            System.out.println("3. Mostrar un usuario personalizado");
            System.out.println("4. Menu Principal");
            System.out.println("5. Salir");
            o = leer.nextInt();    
            
            switch(o){
                case 1:
                    ingresar();
                    break;
                case 2: 
                    mostrar();
                    break;
                case 3: 
                    mostrarPersonalizado();
                    break;
                case 4: 
                    menu1();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    menuUsuarios();
                    break;
            }
        }while (o!= 5);
    
    }

    private void palabras() {
        
        String palabra, palabraInvertida;
        int x;
        palabra = leer.next();
        palabraInvertida = "";
        
        for(x=0; x < palabra.length(); x++){
            palabraInvertida = palabraInvertida + palabra.charAt(x);
        }
        
        if (palabra.equals(palabraInvertida)){
            System.out.println("La palabra es palindroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
    }

    private void ingresar() {
         
        int posicion;
        
        for(posicion=0; posicion < usuario.length; posicion++){
            System.out.println("Ingresar usuario " + (posicion +1) + ":");
            usuario[posicion]= leer.next();
        }
        
    }

    private void mostrar() {
        
        System.out.println("Mostrar todos los usuarios");
        int posicion;
        
        for(posicion=0; posicion < usuario.length; posicion++){
            System.out.println(usuario[posicion]);   
        }
    }

    private void mostrarPersonalizado() {
        
        String usuarioP;
        int posicion;
        int aux=0;
        
        System.out.println("Mostrar ususario personalizado");
        System.out.println("Ingresar Usuario");
        usuarioP=leer.next();
        
        
            for(posicion=0; posicion<usuario.length; posicion++){
                if (usuario[posicion].equals(usuarioP)){
                    aux=1;
                    System.out.println("Usuario");
                    System.out.println(usuario[posicion]);
                }
            }
            if (aux==0){
                System.out.println("Usuario");
                System.out.println("El usuario no existe");
            }
    }
}
