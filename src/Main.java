import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner e = new Scanner(System.in);
    boolean final1= false;
    boolean final2= false;
    int Posicion;

    ArrayList<Vehiculo> Array_Vehicle = new ArrayList<Vehiculo>();


    public static void main(String[] args){
        // TODO Auto-generated method stub

        Main p = new Main();
        p.Main();
    }

    private void Main() {

        String opcio = " ";


        Menu1();
        opcio = e.next().toUpperCase();

        do {

            switch (opcio) {

                case "ENTRAR":
                    String opcio2 = " ";
                    Menu2();
                    opcio2 =e.next().toUpperCase();
                    do {

                        switch(opcio2) {

                            case "AÑADIR":
                                    String Opcion_Vehiculo = "";
                                    System.out.println("Quin Vehicle vols afegi????");
                                    System.out.println("Els vehicles que pots afegir son els seguents:");
                                    Triarcoche();
                                    Opcion_Vehiculo = e.next().toUpperCase();
                                    switch(Opcion_Vehiculo){
                                        case "COCHE":
                                            Añadir_Coche();
                                            break;
                                        case "MICRO":
                                            Añadir_Micro();
                                            break;
                                        case "FURGO":
                                            Añadir_Furgo();
                                            break;
                                        case "CAMION":
                                            Añadir_Camion();
                                            break;
                                    }
                                break;
                            case "OBTENER":
                                    Buscar_Vehiculo();
                                    System.out.println("\n ----Vehicle Trobat----\n");
                                    Enseñar_Vehiculo(Posicion);

                                break;
                            case "FINALITZAR":
                                final2 = true;
                                break;
                        }
                        Menu2();
                        opcio2 =e.next().toUpperCase();

                    }while(final2 != true);
                    break;

                case "INFO":
                    //InfoPrograma();
                    break;
                case "SORTIR":
                    final1 = true;
                    //Sortir();
                    break;
            }

            Menu1();
            opcio = e.next().toUpperCase();
        }while (final1 != true);
    }

    private void Enseñar_Vehiculo(int Posicion) {

        for(int i = 0; i < Array_Vehicle.size(); i++) {
            Vehiculo vehicle = Array_Vehicle.get(Posicion);
            System.out.println("------------------------");
            System.out.println("Vehcile : ");
            System.out.println("Matricula: " + vehicle.matricula);
            System.out.println("Plazas: " + vehicle.plazas);
            System.out.println("Dias: " + vehicle.dia);
            System.out.println("Tipo Vehiculo: " + vehicle.Tipo_Vehiculo);


            switch(vehicle.Tipo_Vehiculo) {
                case 'C':
                    Coches coche = (Coches) Array_Vehicle.get(i);

                    System.out.println("Calcul alquiler: " + coche.Calcular_Alquiler());

                    break;

                case 'M':
                    Microbuses micro = (Microbuses) Array_Vehicle.get(i);

                    System.out.println("Calcul alquiler: " + micro.Calcular_Alquiler());
                    break;
                case 'F':
                    Furgo furgo = (Furgo) Array_Vehicle.get(i);

                    System.out.println("Calcul alquiler: " + furgo.Calcular_Alquiler());
                    break;

                case 'K':
                    Kamiones kami = (Kamiones) Array_Vehicle.get(i);

                    System.out.println("Calcul alquiler: " + kami.Calcular_Alquiler());
                    break;


            }

            System.out.println("------------------------");


        }
    }

    private void Buscar_Vehiculo() {
        System.out.println("quin vehicle vols agafar??");
        System.out.println("Introdueix la matricula del vehicle que vols utilitzar:");
        int Buscar_Vehiculo;
        Buscar_Vehiculo = Integer.parseInt(e.next().toUpperCase());

        System.out.println("Quants dies vols el vehicle:");
        int Dia;
        Dia = Integer.parseInt(e.next().toUpperCase());


        boolean Trobat = false;

        for (int i = 0; i < Array_Vehicle.size() && Trobat != true; i++){
            if(Buscar_Vehiculo == Array_Vehicle.get(i).getMatricula()){
                Trobat = true;
                Posicion = i;
                Array_Vehicle.get(i).setDia(Dia);
            }
        }

        Enseñar_Vehiculo(Posicion);




    }

    private void Añadir_Camion() {
        int Matricula ;
        System.out.println("Introdueix la matricula:");
        Matricula = Integer.parseInt(e.next());

        char Tipo_Vehiculo = 'M';
/*
        int  Plazas ;
        System.out.println("Introdueix el numero de plazas:");
        Plazas = Integer.parseInt(e.next());

 */
        double PMA;
        System.out.println("Introdueix el pes maxim autoritzat:");
        PMA = Double.parseDouble(e.next());

        Kamiones K = new Kamiones(Matricula, 0, 0, 50, Tipo_Vehiculo, 20, PMA, 40, 0 );
        Array_Vehicle.add(K);

        System.out.println("---Camion añadido---");
    }

    //Metodeo para añadir el vehiculo tipo Furgo
    private void Añadir_Furgo() {

        int Matricula ;
        System.out.println("Introdueix la matricula:");
        Matricula = Integer.parseInt(e.next());

        char Tipo_Vehiculo = 'F';

/*
        int  Plazas ;
        System.out.println("Introdueix el numero de plazas:");
        Plazas = Integer.parseInt(e.next());

 */
        double PMA;
        System.out.println("Introdueix el pes maxim autoritzat:");
        PMA = Double.parseDouble(e.next());

        Furgo F = new Furgo(Matricula, 0, 0, 50, Tipo_Vehiculo, 20, PMA, 0);
        Array_Vehicle.add(F);

        System.out.println("---Furgo añadido---");

    }


    //Metodeo para añadir el vehiculo tipo Microbus
    private void Añadir_Micro() {

        int Matricula ;
        System.out.println("Introdueix la matricula:");
        Matricula = Integer.parseInt(e.next());

        char Tipo_Vehiculo = 'M';

        int  Plazas ;
        System.out.println("Introdueix el numero de plazas:");
        Plazas = Integer.parseInt(e.next());

        Microbuses M = new Microbuses(Matricula, Plazas, 0, 50, Tipo_Vehiculo, 0, 2);
        Array_Vehicle.add(M);

        System.out.println("---Microbus añadido---");

    }


    //Metodeo para añadir el vehiculo tipo coche
    private void Añadir_Coche() {

        int Matricula ;
        System.out.println("Introdueix la matricula:");
        Matricula = Integer.parseInt(e.next());

        char Tipo_Vehiculo = 'C';

        int  Plazas ;
        System.out.println("Introdueix el numero de plazas:");
        Plazas = Integer.parseInt(e.next());

        Coches C = new Coches(Matricula, Plazas, 0, 50, Tipo_Vehiculo, 0, 1.5);
        Array_Vehicle.add(C);

        System.out.println("---Coche añadido---");

    }


    private void Triarcoche() {
        System.out.println("Vehicles:");
        System.out.println("1.-Coche (COCHE)");
        System.out.println("2.-Microbus (MICRO)");
        System.out.println("3.-Furgo (FURGO)");
        System.out.println("4.-Camion (CAMION)");

    }

    private void Menu2() {
        System.out.println("Menu Principal Per afegir ");
        System.out.println("1.-Añadir (AÑADIR)");
        System.out.println("2.-Obtener precio de alquier de un vehiculo (OBTENER)");
        System.out.println("3.-Sortir (FINALIZAR)");
    }

    private void Menu1() {

        System.out.println("Menu Principal ");
        System.out.println("1.-Entrar (ENTRAR)");
        System.out.println("2.-Info del programa (INFO)");
        System.out.println("3.-Sortir (SALIR)");
    }
}
