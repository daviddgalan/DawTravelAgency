import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        System.out.println("Introduce el numero  de viajeros(máximo 5)");
        int viajeros= Integer.parseInt(s.nextLine());

        if (viajeros<0 || viajeros>5){
            System.out.println("El numero de viajeros debe de estar comprendido entre 0 y 5 ");
            do{
                System.out.println("Introduce el numero maximo de viajeros(máximo 5)");
                 viajeros= Integer.parseInt(s.nextLine());
            }while(viajeros<0 || viajeros>5);
        }while(viajeros>=0&& viajeros<=5) {
            if(viajeros==1){
                System.out.println("Cuanto a pagado el viajero 1");
                int viajero1= Integer.parseInt(s.nextLine());
            }else {
                if(viajeros==2){
                    System.out.println("Cuanto a pagado el viajero 1");
                    int viajero1= Integer.parseInt(s.nextLine());
                    System.out.println("Cuanto a pagado el viajero 2");
                    int viajero2= Integer.parseInt(s.nextLine());
                }else {
                    if(viajeros==3){
                        System.out.println("Cuanto a pagado el viajero 1");
                        int viajero1= Integer.parseInt(s.nextLine());
                        System.out.println("Cuanto a pagado el viajero 2");
                        int viajero2= Integer.parseInt(s.nextLine());
                        System.out.println("Cuanto a pagado el viajero 3");
                        int viajero3= Integer.parseInt(s.nextLine());
                    }
                }
            }
        }
    }
}