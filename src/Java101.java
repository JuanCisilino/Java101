import java.util.ArrayList;

public class Java101 {

    /*
     * Arreglar la siguiente función, la cual recibe un array de números enteros,
     * para que retorne el promedio de los valores impares dentro del array recibido.
     */

    Double promedioSoloImpares(ArrayList<Integer> listaDeEnteros){
        
        return 0.0;
    }



    //--------------------------------------------NO CAMBIAR NADA DE ACÁ PARA ABAJO--------------------------------------------



    public static void main(String[] args){

        Java101 ejercicio2 = new Java101();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);
        array1.add(7);

        System.out.println(ejercicio2.promedioSoloImpares(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(0);
        array2.add(103);

        System.out.println(ejercicio2.promedioSoloImpares(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(14);
        array3.add(0);

        System.out.println(ejercicio2.promedioSoloImpares(array3));

    }
}
