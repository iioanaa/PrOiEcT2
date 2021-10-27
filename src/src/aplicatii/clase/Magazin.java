package aplicatii.clase;

public class Magazin {

    private InventarfRUCTE _fructe;
    private InventarLEGUME _legume;
    private double _sold;

    public Magazin(InventarLEGUME _legume, InventarfRUCTE _fructe, double _sold) {
        this._legume = _legume;
        this._fructe = _fructe;
        this._sold = _sold;
    }

    public void modificareInventarLegume(InventarLEGUME _legume) {
        this._legume = _legume;
    }

    public void modificareInventarFructe(InventarfRUCTE _fructe) {
        this._fructe = _fructe;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "_fructe=" + _fructe +
                ", _legume=" + _legume +
                ", _sold=" + _sold +
                '}';
    }

    public void setSold(double _sold){
        this._sold = _sold;
    }


}
