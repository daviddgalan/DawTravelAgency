//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("1.  Introducir gastos de envio.");
            System.out.println("2.  Calcular reparto de gastos.");
            System.out.println("3.  Mostrar el reparto entre los viajeros.");
            System.out.println("4.  Salir.");
            menu = Integer.parseInt(s.nextLine());
            switch (menu){
                case 1:
                    do {
                        System.out.print("Hola");
                    }while (menu < 2);
                    break;

                case 2:
                    do {


                    }while ();
                    break;
                case 3:
                    do {

                    }while ();

            }
        }while(menu < 4);

        System.out.println("Introduce el numero  de viajeros(máximo 5)");
        int viajeros= Integer.parseInt(s.nextLine());

        System.out.print("Has salido");
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