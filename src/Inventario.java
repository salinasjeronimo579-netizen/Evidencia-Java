import java.util.ArrayList;

public class Inventario {

    ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

    public void registrarDispositivo(String modelo, Integer ram, Integer almacenamiento){
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setModelo(modelo);
        dispositivo.setRam(ram);
        dispositivo.setAlmacenamiento(almacenamiento);

        listaDispositivos.add(dispositivo);
    }

    public void listarDispositivos(){
        for(Dispositivo dispositivo: listaDispositivos){
            System.out.println(dispositivo.modelo + "\n" + dispositivo.almacenamiento + "\n" + dispositivo.ram);
        }
    }
}
