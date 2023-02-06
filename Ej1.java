package tarea1_recursividad;

import javax.swing.JOptionPane;

public class Ej1 {

    /*a. Elimine las vocales de una oración e imprima la oración resultante.
b. Crear un método que obtenga la suma de los números naturales desde 1 hasta N.
c. Crea un método que compruebe si un número es binario. Un número binario está
formado únicamente por ceros y unos.
d. Convierta el siguiente código en funciones recursivas, debe de mostrar el resultado final,
comparelo con el resultado final del código realizado con ciclos for.*/
    public void eliminarVocales() {

        String oracion = JOptionPane.showInputDialog("");
        String eliminar = oracion.replaceAll("[aeiouAEIOU]", "");
        System.out.println(eliminar);
    }
//


    public int sumaNaturalesR(int n) {
int res;
        if (n == 1) {
            return 1;
        } else {
            res = n + sumaNaturalesR(n - 1);
        }
        return res;
    }
/*Ingresa el numero n, si n es 1, retornamos 1, pero sino, 
Definimos que el resultado va a ser igual a n + el metodo, donde cada vez que 
se corre el metodo, n disminuye en 1
Si ingresamos un 2, funciona asi: res = 2 + (2-1)
Y como el numero se disminuye, vuelve a entrar como un 1, y el if se acaba, 
retornando el variable resultado*/

    public boolean binarioR(int num) {
        if (num < 0 || num > 1) {
            return false;  // 0 significa falso
        }
        while (num != 0) {
            if (num % 10 > 1) {
                return false ;
            }
            num = num / 10;
        }
        return true;
    }
}
