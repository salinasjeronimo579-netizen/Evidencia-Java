public class Computador extends Dispositivo implements Propiedades{

    @Override
    public void getDescripcion(){
        System.out.println("El modelo del computador es: " + modelo + "\nEl almacenamiento es de: " + almacenamiento + "\nLa RAM es de: " + ram);
    }
    public void getDescripcion(String overload){
        System.out.println(overload);
    }

    public void encender(){
        System.out.println("EL computador esta encendiendo...");
    };
    public void reiniciar(){
        System.out.println("El computador se va a reiniciar...");
    };
    public void apagar(){
        System.out.println("El computador se apagara...");
    };
    public void hardware(){
        System.out.println("=== Hardware === \nModelo:\n" + modelo + "\nRAM:\n" + ram + "\nAlmacenamiento:\n" + almacenamiento);
    }
}
