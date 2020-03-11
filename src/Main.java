public class Main {
    public static void main(String[] args) {

        Uop kosztyUop = new Uop();
        CalcUop calc = new CalcUop();
        Uod kosztyUod = new Uod();
        B2b kosztyB2b = new B2b();

        kosztyUop.setBrutto(10000);      //Umowa o pracę kwota brutto
        kosztyUop.setKosztyUp(111.25);
        kosztyUop.setUlga(46.33);

        kosztyUod.setBrutto(10000);      //Umowa o dzieło kwota netto

        kosztyB2b.setBrutto(10000);      //Umowa B2B


        System.out.println("Kwota brutto: " + kosztyUop.getBrutto());

        System.out.println("Koszty pracodawcy: " + kosztyUop.getKosztyPracodawcy());

        System.out.println("Koszty zatrudnionego: " + kosztyUop.getKosztyZatrudnionego());

        System.out.println("Kwota netto: " + kosztyUop.getNetto());

        System.out.println("Umowa o dzieło, brutto: " + kosztyUod.brutto + ", netto: " + kosztyUod.getNetto());

        System.out.println("Umowa B2B, brutto: " + kosztyB2b.getBrutto() + ", netto: " + kosztyB2b.getNetto() + " w tym podatek 18% " + kosztyB2b.getPodatek18());




    }
}
