public class Dispositivo {

    int almacenamiento, ram;
    String modelo;

    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public void getAlmacenamiento(){
        System.out.println("El almacenamiento es de: " + almacenamiento);
    }

    public void getRam(){
        System.out.println("La RAM es de: " + ram);
    }

    public void getDescripcion(){
        System.out.println("El modelo del *** es: " + modelo + "\nEl almacenamiento es de: " + almacenamiento + "\nLa RAM es de: " + ram);
    }


}
