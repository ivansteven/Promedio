/**
 * prom
 */
public class prom {

    public static void main(String[] args) {
        double arreglo[] = {3.5,4,4.5,5};
        double sum =0;
        double promedio = 0;
        
        System.out.println("");

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("[");
            System.out.print(arreglo[i]);
            System.out.print("]");
            sum +=arreglo[i];
        }

        System.out.println("");

        System.out.println("La suma es: " + sum);
        promedio = sum / arreglo.length;
        System.out.println("El promedio es de: " +promedio);



    }
}