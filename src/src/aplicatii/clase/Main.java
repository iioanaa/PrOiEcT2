package aplicatii.clase;

public class Main {

    public static InventarLEGUME legume = new InventarLEGUME(120,5,130,6,150,7,126,8);
    public static InventarfRUCTE fructe = new InventarfRUCTE(120,5,130,6,150,7,126,8);
    public static Magazin magazin = new Magazin(legume, fructe,1200);
}
