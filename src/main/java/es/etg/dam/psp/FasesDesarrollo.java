package es.etg.dam.psp;

public class FasesDesarrollo {

    private static final String TEXT_INICIANDO = "Inciando desarrollo de software";
    private static final String TEXT_EJECUTANDO = "Ejecutando ";
    private static final String TEXT_FINALIZADO = " finalizado";
    private static final String TEXT_TODAS_FASES_FINALIZADAS = "Todas las fases del desarrollo han finalizado";

    private static final String NOM_ANALISIS = "Análisis";
    private static final String NOM_DISENO = "Diseño";
    private static final String NOM_CODIFICACION = "Codificación";
    private static final String NOM_PRUEBAS = "Pruebas";

    private static final int TIEMPO_ESPERA_ANALISIS = 3000;
    private static final int TIEMPO_ESPERA_DISENO = 2000;
    private static final int TIEMPO_ESPERA_CODIFICACION = 1000;
    private static final int TIEMPO_ESPERA_PRUEBAS = 2000;
    public static void main(String[] args) throws InterruptedException{

        Tarea t1 = new Tarea(NOM_ANALISIS, TIEMPO_ESPERA_ANALISIS);
        Tarea t2 = new Tarea(NOM_DISENO, TIEMPO_ESPERA_DISENO);
        Tarea t3 = new Tarea(NOM_CODIFICACION, TIEMPO_ESPERA_CODIFICACION);
        Tarea t4 = new Tarea(NOM_PRUEBAS, TIEMPO_ESPERA_PRUEBAS);
        
        System.out.println(TEXT_INICIANDO);
        
        System.out.println(TEXT_EJECUTANDO + NOM_ANALISIS);
        t1.start();

        t1.join();
        System.out.println(NOM_ANALISIS + TEXT_FINALIZADO);

        System.out.println(TEXT_EJECUTANDO + NOM_DISENO);
        t2.start();

        t2.join();
        System.out.println(NOM_DISENO + TEXT_FINALIZADO);

        System.out.println(TEXT_EJECUTANDO + NOM_CODIFICACION);
        t3.start();

        t3.join();
        System.out.println(NOM_CODIFICACION + TEXT_FINALIZADO);
        
        System.out.println(TEXT_EJECUTANDO + NOM_PRUEBAS);
        t4.start();

        System.out.println(NOM_PRUEBAS + TEXT_FINALIZADO);

        System.out.println(TEXT_TODAS_FASES_FINALIZADAS);
    }
}