/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_17112025;

/*
Nancy Beatriz Flores Rivera - FR100524
*/

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {          
         ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13);
             arbol.insertar('a');//raiz
             arbol.insertar('b');//1
             arbol.insertar('c');//2
             arbol.insertar('d');//3
             arbol.asignarHijos(0, 1, 2, 3);
             arbol.insertar('e');//4
             arbol.insertar('f');//5
             arbol.insertar('g');//6
             arbol.asignarHijos(1, 4, 5, 6);
             arbol.insertar('h');//7
             arbol.insertar('i');//8
             arbol.insertar('j');//9
             arbol.asignarHijos(2, 7, 8, 9);        
             arbol.insertar('k');//10
             arbol.insertar('l');//11
             arbol.insertar('m');//12
             arbol.asignarHijos(3, 10, 11, 12);
        
         System.out.println("RECORRIENDO PRE-ORDEN");
         System.out.println("---------------------");
         arbol.recorrerPreOrden(arbol.raiz);
         System.out.println();
        
         System.out.println("RECORRIENDO IN-ORDEN");
         System.out.println("--------------------");
         arbol.recorrerInOrden(arbol.raiz);
         System.out.println();
        
         System.out.println("RECORRIDO POST-ORDEN");
         System.out.println("--------------------");
         arbol.recorrerPostOrden(arbol.raiz);                
     }
 }