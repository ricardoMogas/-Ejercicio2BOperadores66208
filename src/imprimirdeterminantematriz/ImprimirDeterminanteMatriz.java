package imprimirdeterminantematriz;

import java.util.Scanner;

public class ImprimirDeterminanteMatriz {

    public static void main(String[] args) {
        //Declaro la matriz, importo el Scanne y declaro los contadores
        int matriz[][] = new int[2][2];
        Scanner Mz = new Scanner(System.in);
        // lo siguiente es ingresar datos, me guie por la siguiente pagina =
        //http://puntocomnoesunlenguaje.blogspot.com/2012/12/matriz-en-java.html
       System.out.println("ingrese los datos");
       int i,j;
        for (i = 0;i < 2; i++){
            for(j = 0; j < 2; j++){
                System.out.print("Matriz[" + i + "][" + j + "]= ");
                matriz[i][j] = Mz.nextInt();
            }
        }
        
        int A = (matriz[0][0]*matriz[1][1]);
        int B = (matriz[1][0]*matriz[0][1]);
        int respuesta = A-B;
        System.out.println("la Respuesta es" + respuesta );
    }
    
}
