import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu = 0;
        int viajero1= 0;
        int viajero2= 0;
        int viajero3= 0;
        int viajero4= 0;
        int viajero5= 0;
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
                        int viajeros= Integer.parseInt(s.nextLine());

                        if (viajeros<0 || viajeros>5){
                            System.out.println("El numero de viajeros debe de estar comprendido entre 0 y 5 ");
                            do{
                                System.out.println("Introduce el numero maximo de viajeros(máximo 5)");
                                viajeros= Integer.parseInt(s.nextLine());
                            }while(viajeros<0 || viajeros>5);
                        }while(viajeros>=0 && viajeros<=5) {
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
                            if(viajero1==-1){
                                System.out.println("El viajero 1 no existe");
                            }
                            if(viajero2==-1){
                                System.out.println("El viajero 2 no existe");

                            }
                            if(viajero3==-1){
                                System.out.println("El viajero 3 no existe");

                            }
                            if(viajero4==-1){
                                System.out.println("El viajero 4 no existe");

                            }
                            if(viajero5==-1){
                                System.out.println("El viajero no existe");
                            }
                        }
                    }while (menu < 2);
                    break;
                case 2:
                    break;
                case 3:
            }
        }while(menu < 4);
    }
}