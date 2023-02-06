package tarea1_recursividad;

import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args) {
Ej1 e=new Ej1();
//e.eliminarVocales();



//Ejercicio 2: Crear un método que obtenga la suma de los números naturales desde 1 hasta N.
int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero natural"));

int resultado = e.sumaNaturalesR(n);
System.out.printf("El resultado de la suma de los numeros es: %d\n\n", resultado);


e.binarioR(n);
System.out.print("Si el numero no es binario, retorna false, "
 + "y si es binario retorna true.\nEl resultado es: "
+ e.binarioR(n)+"\n");
    }
    
}
