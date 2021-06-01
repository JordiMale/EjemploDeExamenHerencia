public class Coches  extends Vehiculo{



    protected double Precio_Total_Coche;
    protected double Suma = 1.5;
    //En el public van tots si hi han atributs en la classe coches es posarien en el public, per exemple si
    //HI ha un atribut hola es posa en el public, pero en el super no es posa a sota aixi this.Hola = Hola;
    public Coches(int matricula, int plazas, int dias, double precio_base, char Tipo_Vehiculo, double Precio_Total_Coche, double Suma /*i aqui int Hola*/) {
        super(matricula, plazas, dias, precio_base, Tipo_Vehiculo);
        //Aqui this.Hola = Hola;
        this.Precio_Total_Coche = Precio_Total_Coche;
        this.Suma = Suma;
    }

    public double getPrecio_Total_Coche() {
        return Precio_Total_Coche;
    }

    public void setPrecio_Total_Coche(double precio_Total_Coche) {
        Precio_Total_Coche = precio_Total_Coche;
    }

    @Override
    protected double Calcular_Alquiler() {

        Precio_Total_Coche = (precio_base + (Suma * plazas + dia));

        return Precio_Total_Coche;
    }


}
