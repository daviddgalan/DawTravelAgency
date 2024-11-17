import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;
        float reparto=0;
        int viajeros = 0;
        float viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        float vuelta1 = 0, vuelta2 = 0, vuelta3 = 0, vuelta4 = 0, vuelta5 = 0;
        String viajero1Debes = "", viajero2Debes = "", viajero3Debes = "", viajero4Debes = "", viajero5Debes = "";
        boolean viajero1Participa = false, viajero2Participa = false, viajero3Participa = false, viajero4Participa = false, viajero5Participa = false;
        do {
            System.out.println("1.  Introducir gastos de envio.");
            System.out.println("2.  Calcular reparto de gastos.");
            System.out.println("3.  Mostrar el reparto entre los viajeros.");
            System.out.println("4.  Salir.");
            menu = Integer.parseInt(s.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Introduce el número  de viajeros(mínimo 2 y máximo 5)");
                    viajeros= Integer.parseInt(s.nextLine());

                    if (viajeros<2 || viajeros>5){

                        do{
                            System.out.println("El número de viajeros debe de estar comprendido entre 2 y 5 ");
                            System.out.println("Introduce el número máximo de viajeros(mínimo 2 y máximo 5)");
                            viajeros= Integer.parseInt(s.nextLine());
                        }while(viajeros<2 || viajeros>5);
                    }
                    // Evitar errores de ejecuciones anteriores.
                    viajero1 = viajero2 = viajero3 = viajero4 = viajero5 = 0;
                    viajero1Participa = viajero2Participa = viajero3Participa = viajero4Participa = viajero5Participa = false;
                    do {
                        System.out.println("¿Cuánto paga el viajero 1?");
                        viajero1 = Float.parseFloat(s.nextLine());
                        viajero1Participa = true;

                        System.out.println("¿Cuánto paga el viajero 2?");
                        viajero2 = Float.parseFloat(s.nextLine());
                        viajero2Participa = true;

                        if (viajeros >= 3) {
                            System.out.println("¿Cuánto paga el viajero 3?");
                            viajero3 = Float.parseFloat(s.nextLine());
                            viajero3Participa = true;
                        }
                        if (viajeros >= 4) {
                            System.out.println("¿Cuánto paga el viajero 4?");
                            viajero4 = Float.parseFloat(s.nextLine());
                            viajero4Participa = true;
                        }
                        if (viajeros == 5) {
                            System.out.println("¿Cuánto paga el viajero 5?");
                            viajero5 = Float.parseFloat(s.nextLine());
                            viajero5Participa = true;
                        }
                        if (viajero1 < 0 || viajero2 < 0 || viajero3 < 0 || viajero4 < 0 || viajero5 < 0) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("El pago de todos los viajeros debe de ser mayor que 0");
                            System.out.println("-------------------------------------------------------");
                        }
                    } while (viajero1 < 0 || viajero2 < 0 || viajero3 < 0 || viajero4 < 0 || viajero5 < 0);
                    break;
                case 2:
                    if (viajeros == 0) {
                        System.out.println("Tienes que hacer 1. Introducir gastos de envio. ");
                        break;
                    } else {
                        reparto = (viajero1 + viajero2 + viajero3 + viajero4 + viajero5) / viajeros;

                        if (viajero1 < reparto) {
                            vuelta1 = reparto - viajero1;
                            viajero1Debes = "Debes: " + vuelta1 + " €";
                        } else if (viajero1 > reparto) {
                            vuelta1 = viajero1 - reparto;
                            viajero1Debes = "Te deben: " + vuelta1 + " €";
                        }
                        if (viajero2 < reparto) {
                            vuelta2 = reparto - viajero2;
                            viajero2Debes = "Debes: " + vuelta2 + " €";
                        } else if (viajero2 > reparto) {
                            vuelta2 = viajero2 - reparto;
                            viajero2Debes = "Te deben: " + vuelta2 + " €";
                        }
                        if (viajero3 < reparto){
                            vuelta3 = reparto - viajero3;
                            viajero3Debes = "Debes: " + vuelta3 + " €";
                        } else if (viajero3 > reparto) {
                            vuelta3 = viajero3 - reparto;
                            viajero3Debes = "Te deben: " + vuelta3 + " €";
                        }
                        if (viajero4 < reparto) {
                            vuelta4 = reparto - viajero4;
                            viajero4Debes = "Debes: " + vuelta4 + " €";
                        } else if (viajero4 > reparto) {
                            vuelta4 = viajero4 - reparto;
                            viajero4Debes = "Te deben: " + vuelta4 + " €";
                        }
                        if (viajero5 < reparto) {
                            vuelta5 = reparto - viajero5;
                            viajero5Debes = "Debes: " + vuelta5 + " €";
                        } else if (viajero5 > reparto) {
                            viajero5Debes = "Te deben: " + vuelta5 + " €";
                        }
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println("El reparto se ha calculado exitosamente.");
                    System.out.println("-------------------------------------------------------");
                    break;
                case 3:
                    if (viajeros == 0 || reparto <= 0) {
                        System.out.println("Tienes que hacer 1. Introducir gastos de envio y tienes que hacer 2. Calcular reparto de gastos. ");
                        break;
                    } else {
                        if (viajero1Participa) {
                            if (vuelta1 != 0) {
                                System.out.println("Viajero 1 " + viajero1Debes);
                            } else {
                                System.out.println("Viajero 1 no debes nada");
                            }
                        }
                        if (viajero2Participa) {
                            if (vuelta2 != 0) {
                                System.out.println("Viajero 2 " + viajero2Debes);
                            } else {
                                System.out.println("Viajero 2 no debes nada");
                            }
                        }
                        if (viajero3Participa) {
                            if (vuelta3 != 0) {
                                System.out.println("Viajero 3 " + viajero3Debes);
                            } else {
                                System.out.println("Viajero 3 no debes nada");
                            }
                        }
                        if (viajero4Participa) {
                            if (vuelta4 != 0) {
                                System.out.println("Viajero 4 " + viajero4Debes);
                            } else {
                                System.out.println("Viajero 4 no debes nada");
                            }
                        }
                        if (viajero5Participa) {
                            if (vuelta5 != 0) {
                                System.out.println("Viajero 5 " + viajero5Debes);
                            } else {
                                System.out.println("Viajero 5 no debes nada");
                            }
                        }
                    }
            }
        }while (menu < 4) ;
        System.out.println("-------------------------------------------------------");
        System.out.println("Te has salido de EladiVentura.");
        System.out.println("-------------------------------------------------------");
    }
}