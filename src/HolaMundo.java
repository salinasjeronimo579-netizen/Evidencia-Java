public class HolaMundo {
    public static void main(String[] args) {

        //solución actividad.

        int[] fichas = new int[5];

        fichas[0] = 3412760;
        fichas[1] = 3001278;
        fichas[2] = 3172673;
        fichas[3] = 1233821;
        fichas[4] = 2122233;

        String[] ciudades = new String[5];

        ciudades[0] = "Medellín";
        ciudades[1] = "Bogotá";
        ciudades[2] = "Cali";
        ciudades[3] = "Barranquilla";
        ciudades[4] = "Cartagena";

        String[] frutas = new String[5];

        frutas[0] = "mango";
        frutas[1] = "lulo";
        frutas[2] = "maracuyá";
        frutas[3] = "guanábana";
        frutas[4] = "papaya";

        int[] precios = new int[5];

        precios[0] = 4500;
        precios[1] = 3800;
        precios[2] = 5200;
        precios[3] = 7000;
        precios[4] = 3000;

        double[] pesos = new double[5];

        pesos[0] = 1.5;
        pesos[1] = 0.8;
        pesos[2] = 2.25;
        pesos[3] = 3.0;
        pesos[4] = 1.2;

        // 2 dimensiones

        String[][] competencias = new String[5][5];

        competencias[0][0] = "bases de datos";
        competencias[1][0] = "fundamentos";
        competencias[2][0] = "emprendimiento";
        competencias[0][1] = "inglés";
        competencias[0][2] = "c#";
        competencias[0][3] = "javascript";
        competencias[0][4] = "herramientas TIC";
        competencias[1][1] = "arquitectura";
        competencias[1][2] = "requerimientos";

        String[][] tablero = new String[3][3];

        tablero[0][0] = "X";  tablero[0][1] = "O";  tablero[0][2] = "X";
        tablero[1][0] = "O";  tablero[1][1] = "X";  tablero[1][2] = "O";
        tablero[2][0] = "";   tablero[2][1] = "";   tablero[2][2] = "X";

        boolean[][] asistencia = new boolean[4][5];

        asistencia[0][0] = true;   asistencia[0][1] = true;   asistencia[0][2] = false;  asistencia[0][3] = true;   asistencia[0][4] = true;
        asistencia[1][0] = true;   asistencia[1][1] = false;  asistencia[1][2] = false;  asistencia[1][3] = true;   asistencia[1][4] = true;
        asistencia[2][0] = true;   asistencia[2][1] = true;   asistencia[2][2] = true;   asistencia[2][3] = true;   asistencia[2][4] = true;
        asistencia[3][0] = false;  asistencia[3][1] = true;   asistencia[3][2] = true;   asistencia[3][3] = false;  asistencia[3][4] = true;

        // 3 dimensiones

        String[][][] datos = new String[5][5][3];

        datos[0][0][0] = "jeronimo";
        datos[0][0][1] = "salinas";
        datos[0][0][2] = "18";
        datos[0][1][1] = "Fressi";
        datos[0][1][2] = "Penaldo";
        datos[0][1][3] = "30";


    }
}