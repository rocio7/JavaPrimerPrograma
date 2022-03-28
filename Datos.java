import java.util.ArrayList;

public class Datos {
    

    public static void main(String[] args) {

        System.out.println("Mi nombre es Rocio");
        System.out.println("Quiero ser un desarrollador");
        System.out.println("Soy de Chimbote, Peru");



        //Practicando con una lista pero en una sola línea sería así: ...

        ArrayList<String> misDatos = new ArrayList<String>();
        misDatos.add("Mi nombre es Rocio");
        misDatos.add("Quiero ser un desarrollador");
        misDatos.add("Soy de Chimbote, Peru");
        System.out.println (misDatos);
    }

}