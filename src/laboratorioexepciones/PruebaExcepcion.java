/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioexepciones;

/**
 *
 * @author Walls
 */
public class PruebaExcepcion {

    public static void main(String args[]) {
        formatoNumero();
        desborde();
        aritmetico();
    }

//excepción sin tratar 
    //excepción tratada
    public static void formatoNumero() {

        int numero;
        String cadena = "  1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());

        }
    }

    public static void desborde() {
        try {
             int v[] = new int[3];  
               for (int i = 0; i < 5; i++) {
            v[i] = i;
        }
                   System.out.println(v);
        } catch (Exception e) {
             System.out.println("El numero de recorrido no concuerda con el tamaño del vector "+e);
        }
       
      
       
    }

    public static void aritmetico() {
        try {
            int numero = 5, resultado;

            resultado = numero / 0; 
        } catch (Exception e) {
            System.out.println("Dividir por cero genera una paradoja matematica xd, por ende no se puede ("+ e + ")y genera esta excepcion");
        }
        

    }

}
