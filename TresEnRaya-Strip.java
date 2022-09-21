import java.util.Scanner;

class TresEnRaya {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 

    // TODO Definir el tablero/piezas, el turno y la condicion de victoria

    iniciarPiezas(/* TODO ARGUMENTOS */);

    // Game loop
    while(/* TODO CONDICION LOOP */) {

      dibujarTablero(/* TODO ARGUMENTOS */);
      turno(input, /* TODO ARGUMENTOS */);

      // TODO Comprobar si hay algun ganador, dibujar el tablero, anunciarlo,
      // y terminar el juego, o pasar el turno al otro jugador
      // (intenta hacerlo con un switch)

    }
  }


  /*
   * Lectura de las coordenadas de la nueva pieza y aplicación del movimiento
   * 
   * @param input Scanner for user input
   * @param ???
   */
  private static void turno(Scanner input, /* TODO ARGUMENTOS */) {

    // TODO Anunciar el turno del jugador
    
    // Pedir coordenadas hasta que se den unas validas
    while(true) {

      // Lectura de coordenadas (stdin)
      int coord_x = input.nextInt();
      int coord_y = input.nextInt();

      // TODO Comprobar que las coordenadas valen

      // TODO Poner la pieza si la casilla no esta ocupada, 
      //      si lo esta, comunicarselo al usuario

    }
  }


  /*
   * Comprobacion de si algun jugador ha ganado
   * 
   * @param ???
   * @return char Pieza ganadora, o '-' si no hay ganador
   */
  private static char checkGanador(/* TODO ARGUMENTOS */) {

    // TODO Comprobar que no se ha producido una condicion de victoria
    //      (comprobar filas, columnas y diagonales)

  }


  /*
   * Iniciación de las piezas a un valor inicial
   *
   * @param ???
   */
  private static void iniciarPiezas(/* TODO ARGUMENTOS */) {

    // TODO Darle un valor inicial a cada pieza en el tablero

  }


  /*
   * Dibujo del tablero en la terminal
   *
   * @param ???
   */
  private static void dibujarTablero(/* TODO ARGUMENTOS */) {
    System.out.println("-----");

    // TODO Dibujar cada fila, incluyendo el borde del tablero con el caracter "|"

    System.out.println("-----");
  } 

}