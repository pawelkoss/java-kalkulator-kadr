public class Uop {

    //skłądki po stronie pracodawcy
    double brutto;
    double sEmPr;
    double sRePr;
    double sWyPr;
    double sFpPr;
    double kosztyPracodawcy;

    //składki po stronie pracownika liczone od brutto
    double sEmZa;
    double sReZa;
    double sChZa;
    double sZdZa;
    double kosztyZatrudnionego;     // suma kosztów po stronie pracownika
    double netto;
    double podatek18;               // zaliczka na podatek (18%)
    double kosztyUp;                // koszty uzyskania przychodu
    double ulga;                    // miesięczna ulga

    public Uop(){
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    public void setKosztyUp(double kosztyUp) { this.kosztyUp = kosztyUp; }

    public void setUlga(double ulga) { this.ulga = ulga; }

    public double getBrutto() {
        return brutto;
    }

    public double getSEmPr() {
        sEmPr = brutto * 0.0976;
        return sEmPr;
    }

    public double getSRePr() {
        sRePr = brutto * 0.065;
        return sRePr;
    }

    public double getSWyPr() {
        sWyPr = brutto * 0.018;
        return sWyPr;
    }

    public double getSFpPr() {
        sFpPr = brutto * 0.0245;
        return sFpPr;
    }

    public double getSEmZa() {
        sEmZa = brutto * 0.0976;
        return sEmZa;
    }

    public double getSReZa() {
    sReZa = brutto * 0.015;
        return sReZa;
    }

    public double getSChZa() {
        sChZa = brutto * 0.0245;
        return sChZa;
    }

    public double getSZdZa() {

    sZdZa =  (brutto - (getSEmZa()+getSReZa()+getSChZa()) ) * 0.09;
    return sZdZa;
    }

    double getKosztyPracodawcy(){
        kosztyPracodawcy = Math.round( ( getSEmPr()+getSRePr()+getSWyPr()+getSFpPr() )*100);
        kosztyPracodawcy /= 100;
        return kosztyPracodawcy;
    }

    double getKosztyZatrudnionego(){
        kosztyZatrudnionego = Math.round( ( getSEmZa()+getSReZa()+getSChZa()+getSZdZa() )*100);
        kosztyZatrudnionego /=100;
        return kosztyZatrudnionego;
    }

    public double getPodatek18() {
        podatek18 = Math.round(((Math.round(brutto - getSEmZa()-getSReZa()-getSChZa()-kosztyUp))*0.18) - ulga - ((brutto - (getSEmZa()+getSReZa()+getSChZa()) ) * 0.0775));

        return podatek18;
    }

    double getNetto(){
        netto = brutto - kosztyZatrudnionego - getPodatek18();
        return netto;
    }




}
