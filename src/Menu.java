// Clase molde (abstracta) Menu
public abstract class Menu {
    // Creacion de atributos de la clase Menu
    public double Hamburg;
    public double Papa;
    public double Refresc;
    public double Pizzas;
    public double Nughuets;
    public double Enesalada;
    public double Yogurth;
    public double Agua;
   
    // Constructor para la clase abstracta Menu
    public Menu(double H, double P, double R, double PZ, double N, double ES, double YG, double A){
        this.Hamburg = H;
        this.Papa = P;;
        this.Refresc = R;
        this.Pizzas = PZ;
        this.Nughuets = N;
        this.Enesalada = ES;
        this.Yogurth = YG;
        this.Agua = A;
    }
    // Metodo abstracto para mostrar los productos recien vendidos
    public abstract void mostrarDetalles();
    //Metodo abstracto para calcular las ganancia totales
    public abstract void ganancia();
    // Metodo abstracto para calcular la factura de todo
    public abstract void factura();
    // Metodos abstractos para mostrar el monto total de cada producto registrado a facturar
    public abstract void facturacionHamburguesa(double IVA);
    public abstract void facturacionPapas(double IVA);
    public abstract void facturacionRefrescos(double IVA);
    public abstract void facturacionPizzas(double IVA);
    public abstract void facturacionNughuets(double IVA);
    public abstract void facturacionEnsaladas(double IVA);
    public abstract void facturacionYoghurt(double IVA);
    public abstract void facturacionAgua(double IVA);
   }