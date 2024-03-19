package resevation.application;

public class Program {
    public static void main(String[] args) {
        // Data e hora de início (10 horas)
        int startHourInt = 10000; // Usando int
        long startHourLong = 10000L; // Usando long

        // Data e hora de fim (15 horas)
        int endHourInt = 15000; // Usando int
        long endHourLong = 15000L; // Usando long

        // Calculando a diferença em horas usando int
        int differenceInt = endHourInt - startHourInt;

        // Calculando a diferença em horas usando long
        long differenceLong = endHourLong - startHourLong;

        // Imprimindo as diferenças
        System.out.println("Diferença em horas (int): " + differenceInt);
        System.out.println("Diferença em horas (long): " + differenceLong);
    }
}
