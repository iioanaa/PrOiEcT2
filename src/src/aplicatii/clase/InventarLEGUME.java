package aplicatii.clase;

import aplicatii.interfata.Legume;

public class InventarLEGUME implements Legume {
        private double _rosii = 0;
        private double _castraveti = 0;
        private double _ceapa = 0;
        private double _ardei = 0;

        private double _pretRosii = 6;
        private double _pretCastraveti = 8;
        private double _pretCeapa = 9;
        private double _pretArdei= 2;

        public InventarLEGUME(double _rosii,double _castraveti, double _ceapa,double _ardei, double _pretRosii, double _pretCastraveti,double _pretCeapa, double _pretArdei){
            this._rosii = _rosii;
            this._castraveti = _castraveti;
            this._ceapa = _ceapa;
            this._ardei = _ardei;

            this._pretRosii = _pretRosii;
            this._pretCastraveti = _pretCastraveti;
            this._pretCeapa = _pretCeapa;
            this._pretArdei = _pretArdei;
        }

    public double getRosii() {
        return _rosii;
    }

    public double getPretRosii() {
        return _pretRosii;
    }

    @Override
    public void setRosii(double _rosii, double _pretRosii) {
        this._rosii = _rosii;
        this._pretRosii = _pretRosii;
    }

    public double getCastraveti() {
        return _castraveti;
    }

    public double getPretCastraveti(){
            return _pretCastraveti;
    }

    @Override
    public void setCastraveti(double _castraveti, double _pretCastraveti) {
        this._castraveti = _castraveti;
        this._pretCastraveti = _pretCastraveti;
    }


    public double getCeapa() {
        return _ceapa;
    }

    public double getPretCeapa(){
            return _pretCeapa;
    }

    @Override
    public void setCeapa(double _ceapa, double _pretCeapa) {

        this._ceapa = _ceapa;
    }

    public double getArdei() {
        return _ardei;
    }

    public double getPretArdei(){
            return _pretArdei;
    }

    @Override
    public void setArdei(double _ardei, double _pretArdei) {
        this._ardei = _ardei;
        this._pretArdei = _pretArdei;
    }

    @Override
    public String toString() {
        return "InventarLEGUME{" +
                "_rosii=" + _rosii +
                ", _castraveti=" + _castraveti +
                ", _ceapa=" + _ceapa +
                ", _ardei=" + _ardei +
                ", _pretRosii=" + _pretRosii +
                ", _pretCastraveti=" + _pretCastraveti +
                ", _pretCeapa=" + _pretCeapa +
                ", _pretArdei=" + _pretArdei +
                '}';
    }

    public void setPretRosii( double _pretRosii) {
        this._pretRosii = _pretRosii ;
    }

    public void setPretCastraveti( double _pretCastraveti) {
        this._pretCastraveti = _pretCastraveti ;
    }

    public void setPrettCeapa( double _pretCeapa) {
        this._pretCeapa = _pretCeapa ;
    }

    public void setPrettArdei( double _pretArdei) {
        this._pretArdei = _pretArdei ;
    }
}
