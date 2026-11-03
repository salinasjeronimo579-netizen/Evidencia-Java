public class Celular extends Dispositivo implements Propiedades{

    @Override
    public void getDescripcion(){
        System.out.println("El modelo del celular es: " + modelo + "\nEl almacenamiento es de: " + almacenamiento + "\nLa RAM es de: " + ram);
    }

    public void encender(){
        System.out.println("EL celular esta encendiendo...");
    };
    public void reiniciar(){
        System.out.println("El celular se va a reiniciar...");
    };
    public void apagar(){
        System.out.println("El celular se apagara...");
    };
    public void hardware(){
        System.out.println("=== Hardware === \nModelo:\n" + modelo + "\nRAM:\n" + ram + "\nAlmacenamiento:\n" + almacenamiento);
    }
}
