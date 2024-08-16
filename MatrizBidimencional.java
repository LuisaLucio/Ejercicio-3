package matrizbidimencional;
        
/**
 *
 * @author Valentina Rubio
 */

public class MatrizBidimencional {

    public static void main(String[] args) {
        
        int[][] matrix = new int [3][3];
        
        int valor = 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = valor++;
            }                       
        }
        
        for ( int i = 0; i < matrix.length; i++){
            int suma = 0;
            int producto = 1;
            int diferencia = matrix[1][0];
            double cociente = matrix [i][0];
            
            for (int j = 0; j < matrix[i].length; j++){
                suma += matrix[i][j];
                producto *= matrix[i][j];
                if (j > 0){
                    diferencia -= matrix[i][j];
                    cociente /=  matrix[i][j];
                }
            }
            System.out.println("Fila " + (i+1) + "- Suma: " + suma + ", Multiplacion: " + producto + ",  Resta: " + diferencia + ", Division: " + cociente);
        }
        
        for ( int j = 0; j < matrix[0].length; j++){
            int suma = 0;
            int producto = 1;
            int diferencia = matrix[0][j];
            double cociente = matrix [0][j];
            
            for (int i = 0; i < matrix.length; i++){
                suma += matrix[i][j];
                producto *= matrix[i][j];
                if (i > 0){
                    diferencia -= matrix[i][j];
                    cociente /=  matrix[i][j];
                }
            }
            
            System.out.println("Columna " + (j+1) + "- Suma: " + suma + ", Multiplacion: " + producto + ",  Resta: " + diferencia + ", Division: " + cociente);
        }
    }
}