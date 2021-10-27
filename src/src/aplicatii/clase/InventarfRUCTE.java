package aplicatii.clase;

import aplicatii.interfata.Fructe;

public class InventarfRUCTE implements Fructe {

       private double _mere = 0;
       private double _banane = 0;
       private double _struguri = 0;
       private double _capsuni = 0;

       private double _pretMere;
       private double _pretBanane;
       private double _pretStruguri;
       private double _pretCapsuni;

    public InventarfRUCTE(double _mere, double _banane, double _struguri, double _capsuni, double _pretMere,
                          double _pretBanane, double _pretStruguri, double _pretCapsuni){
        this._mere=_mere;
        this._banane=_banane;
        this._struguri = _struguri;
        this._capsuni = _capsuni;

        this._pretMere = _pretMere;
        this._pretBanane = _pretBanane;
        this._pretStruguri = _pretStruguri;
        this._pretCapsuni = _pretCapsuni;
    }

    public double getMere() {
        return _mere;
    }

    public double getPretMere(){
        return _pretMere;
    }

    @Override
    public void setMere(double _mere, double _pretMere) {
        this._mere = _mere;
        this._pretMere = _pretMere;
    }

    public void sePrettMere( double _pretMere) {
        this._pretMere = _pretMere;
    }

    public double getBanane() {
        return _banane;
    }

    public double getPretBanane(){
        return _pretBanane;
    }

    @Override
    public void setBanane(double _banane, double _pretBanane) {
        this._banane = _banane;
        this._pretBanane = _pretBanane;
    }

    public double getStruguri() {
        return _struguri;
    }

    public double getPretStruguri(){
        return _pretStruguri;
    }

    @Override
    public void setStruguri(double _struguri, double _pretStruguri) {
        this._struguri = _struguri;
        this._pretStruguri = _pretStruguri;
    }

    public double getCapsuni() {
        return _capsuni;
    }

    public double getPretCapsuni(){
        return _pretCapsuni;
    }

    @Override
    public void setCapsuni(double _capsuni, double _pretCapsuni) {
        this._capsuni = _capsuni;
        this._pretCapsuni = _pretCapsuni;
    }

    @Override
    public String toString() {
        return "InventarfRUCTE{" +
                "_mere=" + _mere +
                ", _banane=" + _banane +
                ", _struguri=" + _struguri +
                ", _capsuni=" + _capsuni +
                ", _pretMere=" + _pretMere +
                ", _pretBanane=" + _pretBanane +
                ", _pretStruguri=" + _pretStruguri +
                ", _pretCapsuni=" + _pretCapsuni +
                '}';
    }

    public void sePrettBanane( double _pretBanane) {
        this._pretBanane = _pretBanane ;
    }

    public void sePrettCapsuni( double _pretCapsuni) {
        this._pretCapsuni = _pretCapsuni ;
    }

    public void sePrettStruguri( double _pretStruguri) {
        this._pretStruguri = _pretStruguri ;
    }
}
