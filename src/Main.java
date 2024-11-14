import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu = 0;
        float reparto = 0;
        int viajeros = 0;
        float viajero1= 0;
        float viajero2= 0;
        float viajero3= 0;
        float viajero4= 0;
        float viajero5= 0;
        float vuelta1 = 0;
        float vuelta2 = 0;
        float vuelta3 = 0;
        float vuelta4 = 0;
        float vuelta5 = 0;
        String viajero1Debes = "";
        String viajero2Debes = "";
        String viajero3Debes = "";
        String viajero4Debes = "";
        String viajero5Debes = "";
        do {
            System.out.println("1.  Introducir gastos de envio.");
            System.out.println("2.  Calcular reparto de gastos.");
            System.out.println("3.  Mostrar el reparto entre los viajeros.");
            System.out.println("4.  Salir.");
            menu = Integer.parseInt(s.nextLine());
            switch (menu){
                case 1:
                    do {
                        System.out.println("Introduce el numero  de viajeros(máximo 5)");
                         viajeros= Integer.parseInt(s.nextLine());

                        if (viajeros<0 || viajeros>5){
                            System.out.println("El numero de viajeros debe de estar comprendido entre 0 y 5 ");
                            do{
                                System.out.println("Introduce el numero maximo de viajeros(máximo 5)");
                                viajeros= Integer.parseInt(s.nextLine());
                            }while(viajeros<0 || viajeros>5);
                        }if (viajeros>=0 && viajeros<=5) {
                          do{


                             switch (viajeros){

                                    case 1:
                                        System.out.println("Cuanto paga el viajero numero 1");
                                         viajero1 =Integer.parseInt(s.nextLine());
                                        break;
                                    case 2 :
                                        System.out.println("Cuanto paga el viajero numero 1");
                                        viajero1= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 2");
                                         viajero2= Integer.parseInt(s.nextLine());
                                        break;
                                    case 3 :
                                        System.out.println("Cuanto paga el viajero numero 1");
                                        viajero1= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 2");
                                        viajero2= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 1");
                                         viajero3= Integer.parseInt(s.nextLine());
                                        break;
                                    case 4 :
                                        System.out.println("Cuanto paga el viajero numero 1");
                                        viajero1= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 2");
                                        viajero2= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 3");
                                        viajero3= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 4");
                                         viajero4= Integer.parseInt(s.nextLine());
                                        break;
                                    case 5 :
                                        System.out.println("Cuanto paga el viajero numero 1");
                                        viajero1= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 2");
                                        viajero2= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 3");
                                        viajero3= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 4");
                                        viajero4= Integer.parseInt(s.nextLine());
                                        System.out.println("Cuanto paga el viajero numero 5");
                                         viajero5= Integer.parseInt(s.nextLine());
                                        break;
                             }
                             if(viajero1<0||viajero2<0||viajero3<0||viajero4<0||viajero5<0){
                                 System.out.println("-------------------------------------------------------");
                                 System.out.println("El pago de todos los viajeros debe de ser mayor que 0");
                                 System.out.println("-------------------------------------------------------");
                             }
                            }while(viajero1<0||viajero2<0||viajero3<0||viajero4<0||viajero5<0);

                        }
                    menu=menu+1;
                    }while (menu < 2&&menu>0);
                    break;
                case 2:
                    if (viajeros <= 0){
                        System.out.println("Tienes que hacer 1. Introducir gastos de envio. ");
                        break;
                    }else{
                        reparto = (viajero1 + viajero2 + viajero3 + viajero4 + viajero5)/viajeros;

                        if (viajero1 < reparto){
                            vuelta1 = reparto - viajero1;
                            viajero1Debes = "Debes: " + vuelta1 + " €";
                        }else if (viajero1 > reparto){
                            vuelta1 = viajero1 - reparto;
                            viajero1Debes = "Te deben " + vuelta1 + " €";
                        }

                        if (viajero2 < reparto){
                            vuelta2 = reparto - viajero2;
                            viajero2Debes = "Debes: " + vuelta2 + " €";
                        }else if (viajero2 > reparto){
                            vuelta2 = viajero2 - reparto;
                            viajero2Debes = "Te deben: " + vuelta2 + " €";
                        }

                        if (viajero3 < reparto){
                            vuelta3 = reparto - viajero3;
                            viajero3Debes = "Debes: " + vuelta3 + " €";
                        }else if (viajero3 > reparto){
                            vuelta3 = viajero3 - reparto;
                            viajero3Debes = "Te deben: " + vuelta3 + " €";
                        }

                        if (viajero4 < reparto){
                            vuelta4 = reparto - viajero4;
                            viajero4Debes = "Debes: " + vuelta4 + " €";
                        }else if (viajero4 > reparto){
                            vuelta4 = viajero4 - reparto;
                            viajero4Debes = "Te deben: " + vuelta4 + " €";
                        }

                        if (viajero5 < reparto){
                            vuelta5 = reparto - viajero5;
                            viajero5Debes = "Debes: " + vuelta5 + " €";
                        }else if (viajero5 > reparto){
                            viajero5Debes = "Te deben: " + vuelta5 + " €";
                        }

                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println("El reparto se ha calculado exitosamente.");
                    System.out.println("-------------------------------------------------------");
                    break;
                case 3:
                    if (vuelta1!= 0){
                        System.out.println("viajero1"+viajero1Debes);
                    }else{
                        System.out.println("No debes nada");
                    }
                    if (vuelta2 != 0){
                        System.out.println("viajero2"+viajero2Debes);
                    }else{
                        System.out.println("No debes nada");
                    }
                    if (vuelta3 != 0){
                        System.out.println("viajero3"+viajero3Debes);
                    }else{
                        System.out.println("No debes nada");
                    }
                    if (vuelta4 != 0){
                        System.out.println("viajero4"+viajero4Debes);
                    }else{
                        System.out.println("No debes nada");
                    }
                    if (vuelta5 != 0){
                        System.out.println("viajero5"+viajero5Debes);
                    }else{
                        System.out.println("No debes nada");
                    }


            }
        }while(menu < 4);
        System.out.println("-------------------------------------------------------");
        System.out.println("Te has salido de EladiVentura.");
        System.out.println("-------------------------------------------------------");

    }
}