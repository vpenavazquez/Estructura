public class InformeSistema {

    public static void main (String[] args ){
        int procesadores = Runtime.getRuntime().availableProcessors();
        System.out.println("Numero de procesadores:" + procesadores);
    }

}
