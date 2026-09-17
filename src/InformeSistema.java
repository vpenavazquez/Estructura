public class InformeSistema {

    public static void main (String[] args ){
       Runtime runtime = Runtime.getRuntime();

        //PROCESADORES
        System.out.println("PROCESADORES");
        System.out.println("==================");
        System.out.println("Disponible en JVM:" + runtime.availableProcessors());
        System.out.println("(son hilos lógicos: con SMT no coinciden con los núcleos físicos)");

        // MEMORIA ANTES
        System.out.println("MEMORIA ANTES");
        System.out.println("==================");
        long totalBytes1 = runtime.totalMemory();
        long freeBytes1 = runtime.freeMemory();
        long inUseBytes1 = totalBytes1 - freeBytes1;
        long maxBytes1 = runtime.maxMemory();

        long totalMiB1 = totalBytes1 / (1024 * 1024);
        long freeMiB1 = freeBytes1 / (1024 * 1024);
        long inUseMiB1 = inUseBytes1 / (1024 * 1024);
        long maxMiB1 = maxBytes1 / (1024 * 1024);
        long pct1;

        if (totalMiB1 > 0) {
            pct1 = inUseMiB1 * 100 / totalMiB1;
        } else {
            pct1 = 0;
        }

        System.out.println("Total reservada: " + totalMiB1 + " MiB");
        System.out.println("Libre: " + freeMiB1 + " MiB");
        System.out.println("En uso: " + inUseMiB1 + " MiB (" + pct1 + "% de la total)");
        System.out.println("Máxima (-Xmx): " + maxMiB1 + " MiB");

        // RESERVA DE MEMORIA (64 MiB)
        long [] reservado = new long [8 * 1024 * 1024];

        //MEMORIA DESPUES

        System.out.println("DESPUÉS DE RESERVAR 64 MIB");
        System.out.println("=====================");
        long totalBytes2 = runtime.totalMemory();
        long freeBytes2 = runtime.freeMemory();
        long inUseBytes2 = totalBytes2 - freeBytes2;
        long maxBytes2 = runtime.maxMemory();

        long totalMiB2 = totalBytes2 / (1024 * 1024);
        long freeMiB2 = freeBytes2 / (1024 * 1024);
        long inUseMiB2 = inUseBytes2 / (1024 * 1024);
        long maxMiB2 = maxBytes2 / (1024 * 1024);
        long pct2;

        if (totalMiB2 > 0) {
            pct2 = inUseMiB2 * 100 / totalMiB2;
        } else {
            pct2 = 0;
        }

        System.out.println("Total reservada: " + totalMiB2 + " MiB");
        System.out.println("Libre: " + freeMiB2 + " MiB");
        System.out.println("En uso: " + inUseMiB2 + " MiB (" + pct2 + "% de la total)");
        System.out.println("Máxima (-Xmx): " + maxMiB2 + " MiB");
        System.out.println("==========================");

        long incInUse = inUseMiB2 - inUseMiB1;
        System.out.println("Incremento en uso: " + incInUse + " MiB");
        System.out.println("(el array sigue en memoria: reservado[0] = " + reservado[0] + ")");

        // MULTIPLATAFORMA

        System.out.println("SISTEMA");
        System.out.println("===========================");
        String osName = System.getProperty("os.name");
        String fileSep = System.getProperty("file.separator");
        String userHome = System.getProperty("user.home");

        System.out.println("os.name: " + osName);
        System.out.println("file.separator: \"" + fileSep + "\"");

        String rutaConstruida = userHome + fileSep + "psp" + fileSep + "informe.txt";
        System.out.println("Ruta construida con las propiedades:" + rutaConstruida + "");

        // PROPIEDADES DEL SISTEMA


    }

}



