package ReservadeCine;

public class ReservadeCine {
    public static void main(String[] args) {
        int[][] sala = new int[8][10];

        for (int i = 0; i < sala.length; i++){

        
        for(int j = 0; j<sala.length; j++ ){

        }
    }
            System.out.println("SALA");
            for(int i=0; i<sala.length;i++){

            
            for(int j=0; j < sala[i].length; j++){
                System.out.print(sala[i][j]);
            }
            System.out.println();
        }
    }

        public static void reservarAsiento(int[][] sala, int fila, int col){
            if(fila>=0 && fila<8 && col>=0 && col<10){
                if (sala[fila][col]==0) {
                    sala[fila][col]=1;
                    
                }

            }
        }

        public static void busqueda(int[][] sala, int fila, int col){
            for(int j=0; j<sala[fila].length; j++){
                if (sala[fila][j]==0 && sala[fila][j+1]==0) {
                    System.out.println("tenemos asientos continuos en:"+j+ "y"+ (j+1));
                    return;
                }

            }
            System.out.println("no tenemos asientos continuos");

        }

        public static void mostrarSala (int [][] sala){
            System.out.println("SALA");
            for(int i=0; i<sala.length;i++){

            
            for(int j=0; j < sala.length; j++){
                System.out.println(sala[i][j]);
            }
            System.out.println();

        }


        }

    }

