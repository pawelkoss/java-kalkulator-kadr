public class B2b {

    double brutto;
    double zusMin = 1316.97;
    double sklZdr;
    double podatek18;
    double netto;


    public B2b() {
    }

    public double getBrutto() {
        return brutto;
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    public double getSklZdr() {

        sklZdr =  brutto * 0.09;
        return sklZdr;
    }

    public double getPodatek18() {
        podatek18 = Math.round(((brutto - zusMin)* 0.18) - (brutto * 0.0775));
        return podatek18;
    }

    public double getNetto() {
        netto = Math.round((brutto - zusMin - getSklZdr() - getPodatek18())*100)/100;
        return netto;
    }
}


