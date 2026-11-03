
void main() {

    Celular celular = new Celular();
    Computador computador = new Computador();

    try{
        Inventario inventario = new Inventario();

        inventario.registrarDispositivo("honor x8b", 16, 256);

        inventario.listarDispositivos();


    } catch (Exception e) {
        System.out.println("Algo salio mal...");
    }


}