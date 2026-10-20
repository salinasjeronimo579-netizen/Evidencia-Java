import java.util.Scanner;

public class arcade {
    public static void main(String[] args) {

        // ==========================================================
        // RETO 1: Registrar los jugadores (arreglos de 1 dimensión)
        // ==========================================================
        String[] nombres = {"Laura", "Andrés", "Camila"};
        int[] edades = {19, 22, 20};
        int[] puntajes = {1500, 2200, 2200};
        boolean[] esVip = {true, false, true};

        System.out.println("===== ARCADE CHALLENGE =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("Jugador: " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Puntaje acumulado: " + puntajes[i]);

            if (esVip[i]) {
                System.out.println("VIP: Sí");
            } else {
                System.out.println("VIP: No");
            }
            System.out.println();
        }

        // ==========================================================
        // RETO 2: Puntuaciones por juego (matriz de 3 filas x 3 columnas)
        // Filas = jugadores | Columnas = videojuegos
        // ==========================================================
        int[][] puntuaciones = {
                {500, 800, 200},   // Laura
                {900, 700, 600},   // Andrés
                {400, 950, 850}    // Camila
        };

        System.out.println("===== TABLA DE PUNTUACIONES =====");
        System.out.println("Jugador\tCarrera\tInvasores\tRobots");
        for (int fila = 0; fila < 3; fila++) {
            System.out.print(nombres[fila] + "\t");
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(puntuaciones[fila][columna] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Camila es la fila 2, Invasores es la columna 1
        System.out.println("Puntuación de Camila en Invasores: " + puntuaciones[2][1]);
        System.out.println();

        // ==========================================================
        // RETO 3: Campeonato de dos días (arreglo de 3 dimensiones)
        // [día][ronda][jugador]
        // ==========================================================
        int[][][] campeonato = new int[2][2][3];

        // Día 1 (índice 0)
        campeonato[0][0][0] = 100;
        campeonato[0][0][1] = 200;
        campeonato[0][0][2] = 150;
        campeonato[0][1][0] = 300;
        campeonato[0][1][1] = 250;
        campeonato[0][1][2] = 100;

        // Día 2 (índice 1)
        campeonato[1][0][0] = 200;
        campeonato[1][0][1] = 150;
        campeonato[1][0][2] = 300;
        campeonato[1][1][0] = 250;
        campeonato[1][1][1] = 100;
        campeonato[1][1][2] = 200;

        // Mostrar el primer día
        System.out.println("===== CAMPEONATO: DÍA 1 =====");
        for (int ronda = 0; ronda < 2; ronda++) {
            System.out.println("Ronda " + (ronda + 1) + ":");
            for (int jugador = 0; jugador < 3; jugador++) {
                System.out.println("  " + nombres[jugador] + ": " + campeonato[0][ronda][jugador]);
            }
        }
        System.out.println();

        // Tercer jugador, segunda ronda, primer día -> [0][1][2]
        System.out.println("Puntaje del jugador 3 en la ronda 2 del día 1: " + campeonato[0][1][2]);
        System.out.println();

        // Sumar todas las rondas de un jugador (Laura = índice 0)
        int jugadorElegido = 0;
        int sumaCampeonato = 0;
        for (int dia = 0; dia < 2; dia++) {
            for (int ronda = 0; ronda < 2; ronda++) {
                sumaCampeonato = sumaCampeonato + campeonato[dia][ronda][jugadorElegido];
            }
        }
        System.out.println("Total de " + nombres[jugadorElegido] + " en el campeonato: " + sumaCampeonato);
        System.out.println();

        // ==========================================================
        // RETO 4: ¿Quién es el campeón? (usa la matriz del Reto 2)
        // ==========================================================
        int[] totales = new int[3];

        System.out.println("===== RESULTADOS FINALES =====");
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + puntuaciones[i][j];
            }
            totales[i] = suma;
            System.out.println(nombres[i] + ": " + totales[i] + " puntos");
        }

        // Buscar el puntaje más alto
        int maximo = totales[0];
        for (int i = 1; i < 3; i++) {
            if (totales[i] > maximo) {
                maximo = totales[i];
            }
        }

        // Contar cuántos jugadores tienen ese puntaje máximo
        int cantidadGanadores = 0;
        for (int i = 0; i < 3; i++) {
            if (totales[i] == maximo) {
                cantidadGanadores++;
            }
        }

        // Anunciar al ganador o a los empatados
        if (cantidadGanadores == 1) {
            for (int i = 0; i < 3; i++) {
                if (totales[i] == maximo) {
                    System.out.println(">>> ¡El ganador es " + nombres[i] + " con " + maximo + " puntos!");
                }
            }
        } else {
            System.out.print(">>> ¡Tenemos un empate entre ");
            int mostrados = 0;
            for (int i = 0; i < 3; i++) {
                if (totales[i] == maximo) {
                    System.out.print(nombres[i]);
                    mostrados++;
                    if (mostrados < cantidadGanadores - 1) {
                        System.out.print(", ");
                    } else if (mostrados == cantidadGanadores - 1) {
                        System.out.print(" y ");
                    }
                }
            }
            System.out.println("!");
        }
        System.out.println();

        // ==========================================================
        // RETO ADICIONAL: Consultar un puntaje con validación
        // ==========================================================
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== CONSULTAR PUNTAJE =====");
        System.out.print("Número de jugador (1 a 3): ");
        int numJugador = teclado.nextInt();
        System.out.print("Número de videojuego (1 = Carrera, 2 = Invasores, 3 = Robots): ");
        int numJuego = teclado.nextInt();

        // Validar antes de acceder al arreglo
        if (numJugador >= 1 && numJugador <= 3 && numJuego >= 1 && numJuego <= 3) {
            int puntaje = puntuaciones[numJugador - 1][numJuego - 1];
            System.out.println(nombres[numJugador - 1] + " obtuvo " + puntaje + " puntos en ese juego.");
        } else {
            System.out.println("Error: posición inválida. Usa valores entre 1 y 3.");
        }

        teclado.close();

    }

}
