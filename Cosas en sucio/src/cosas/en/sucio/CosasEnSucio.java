package cosas.en.sucio;

import java.util.Arrays;

public class CosasEnSucio {
    
    //public static void mueveFicha(String tablero[][], int filaInicial, int columnaInicial)
    
    public static void mostrarTablero(String tablero[][]){
        piezasTablero(tablero);
        for (String[] elemento : tablero){
            System.out.println(Arrays.toString(elemento));
        }
    }

    public static void piezasTablero(String tablero[][]){
       for (int i = 0; i < 8; i++) {
            for (int j = 0; j<8; j++){
                tablero[i][j] = "  ";
            }   
        }
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "PN";
            tablero[6][i] = "PB";
        }
        tablero[0][0] = tablero[0][7] = "TN";
        tablero[7][0] = tablero[7][7] = "TB";
      
  }

    public static void main(String[] args) {
     
    
        String tablero[][] = new String [8][8];
        int filaFinal, columnaFinal, filaInicial, columnaInicial;
        filaFinal = 2;
        columnaFinal = 2;
        filaInicial = 1;
        columnaInicial = 2;
        piezasTablero(tablero);
        
        mostrarTablero(tablero);
        System.out.println("Movimiento de jugador");
        
       // mueveFicha (tablero,1,2,2,2);
        
        tablero[filaInicial][columnaInicial] = tablero[filaFinal][columnaFinal] ;
        tablero[filaFinal][columnaFinal] = "  "; 
           
    }
}

