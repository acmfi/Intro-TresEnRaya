import java.util.Scanner;

class TresEnRaya {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 
    char [][] piezas = new char[3][3];
    boolean loop = true;
    char turnoJugador = 'x';

    iniciarPiezas(piezas);

    // Game loop
    while(loop) {

      dibujarTablero(piezas);
      turno(turnoJugador, piezas, input);

      switch(checkGanador(piezas)) {
        
        case 'x' : 
          // Ganan las piezas x
          dibujarTablero(piezas);
          System.out.println("Ganador: x !!");
          loop = false;
          break;
        
        case 'o' : 
          // Ganan las piezas o
          dibujarTablero(piezas);
          System.out.println("Ganador: o !!");
          loop = false;
          break;
        
        default:
          // Cambio de turno
          turnoJugador = (turnoJugador == 'x') ? 'o' : 'x';
          break;
      }
    }

    suma(1.0, 3);
  }

  int suma(int m1, int m2) {
    return m1 + m2;
  }

  /*
   * Lectura y aplicación del movimiento del jugador
   * 
   * @param turnoJugador char que indica el turno del jugador
   * @param piezas Piezas en el tablero
   * @param input Scanner for user input
   */
  private static void turno(char turnoJugador, char[][] piezas, Scanner input) {
    System.out.println("TURNO DE JUGADOR " + turnoJugador);
    
    // Bucle hasta recibir buenas coordenadas
    while(true) {

      int coord_x = input.nextInt();
      int coord_y = input.nextInt();

      // Comprobar coordenadas validas
      if (coord_x >= 0 && coord_x <= 2 && coord_y >= 0 && coord_y <= 2) {

        // Comprobar casilla libre
        if (piezas[coord_x][coord_y] == ' ') {

          piezas[coord_x][coord_y] = turnoJugador;
          return;

        }else {

          // Comunicar casilla ocupada
          System.out.println("Casilla ocupada! Escoge otra...");

        }

      }else {
        // Comunicar casilla fuera del tablero
        System.out.println("¡¡Casilla fuera del tablero!!");
      }
    }
  }

  /*
   * Comprobacion de si algun jugador ha ganado
   * 
   * @param piezas Piezas en el tablero
   * @return char Pieza ganadora, o '-' si no hay ganador
   */
  private static char checkGanador(char[][] piezas) {
    int numFilas = piezas.length;
    int numColumnas = piezas[0].length;
    boolean ganador = false;

    // Comprobar filas
    for (int i = 0; i < numFilas; i++) {
      if (piezas[i][0] != ' ' && piezas[i][0] == piezas[i][1] && piezas[i][1] == piezas[i][2])
        return piezas[i][0];        
    }
  
    // Comprobar columnas
    for (int i = 0; i < numColumnas; i++) {
      if (piezas[0][i] != ' ' && piezas[0][i] == piezas[1][i] && piezas[1][i] == piezas[2][i])
        return piezas[0][i];
    }

    // Comprobar diagonales
    if (piezas[0][0] != ' ' && piezas[0][0] == piezas[1][1] && piezas[1][1] == piezas[2][2])
      return piezas[0][0];
    if (piezas[0][2] != ' ' && piezas[0][2] == piezas[1][1] && piezas[1][1] == piezas[2][0])
      return piezas[0][2];      

    // Sin ganador
    return '-';
  }

  /*
   * Dibujo del tablero en la terminal
   *
   * @param piezas Piezas en el tablero
   */
  private static void iniciarPiezas(char[][] piezas) {
    for (int i = 0; i < piezas.length; i++)
      for (int j = 0; j < piezas[i].length; j++)
        piezas[i][j] = ' ';
  }

   /*
   * Dibujo del tablero en la terminal
   *
   * @param piezas Piezas en el tablero
   */
  private static void dibujarTablero(char[][] piezas) {
    System.out.println("-----");
    for(int i = 0; i < piezas.length; i++) {
      System.out.println("|" + piezas[i][0] + piezas[i][1] + piezas[i][2] + "|");
    }
    System.out.println("-----");
  } 

}