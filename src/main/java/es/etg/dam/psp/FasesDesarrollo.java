package es.etg.dam.psp;

public class FasesDesarrollo {
    public static void main(String[] args) throws InterruptedException{

        Tarea t1 = new Tarea("Análisis",3000);
        Tarea t2 = new Tarea("Diseño",2000);
        Tarea t3 = new Tarea("Codificación",1000);
        Tarea t4 = new Tarea("Pruebas",2000);
        
        System.out.println("Inciando desarrollo de software");
        
        System.out.println("Ejecutando análisis");
        t1.start();

        t1.join();
        System.out.println("Análisis finalizado");

        System.out.println("Ejecutando diseño");
        t2.start();

        t2.join();
        System.out.println("Diseño finalizado");

        System.out.println("Ejecutando codificación");
        t3.start();

        t3.join();
        System.out.println("Codificación finalizada");
        
        System.out.println("Ejecutando pruebas");
        t4.start();

        System.out.println("Desarrollo finalizado");
    }
}