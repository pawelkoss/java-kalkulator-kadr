public class Uod {

    double brutto;
    double kosztyUp = 0.2;           //koszty uzyskania dochodu np 20%
    double podatek18;
    double netto;

    public Uod() {
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    public void setKosztyUp(double kosztyUp) {
        this.kosztyUp = kosztyUp;
    }

    public double getPodatek18() {
        podatek18 = (brutto - (brutto*kosztyUp)) * 18/100;
        return podatek18;
    }

    public double getNetto() {
        netto = brutto - getPodatek18();
        return netto;
    }
}
