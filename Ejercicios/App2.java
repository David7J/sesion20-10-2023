import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos elementos enteros va a ingresar?");
        int cantidadElementos = lector.nextInt();
        //int A[] = {84, 21, 47,96,15};
        int A[] = new int[cantidadElementos];
        System.out.println("Ingrese los " + cantidadElementos + " elementos: ");

        for (int i = 0; i < A.length; i++) {
            A[i] = lector.nextInt();
        }

        System.out.println("Ingreso de datos finalizado.");
        System.out.println("Que elemento desea buscar? ");
        int buscado = lector.nextInt();
        int hallado = busquedaLineal(A, A.length, buscado);

        if(hallado != -1){
            System.out.println("El valor " + buscado + " fue encontrado en la posicion " + hallado);
        }else{
            System.out.println("El valor " + buscado + " no fue encontrado");
        }
    }

    public static int busquedaLineal(int A[], int n, int buscado){
        int indice = 0;
        while(indice < n){
            if(A[indice] == buscado){
                return indice;
            }
            indice++;
        }
        return -1;
    }
}