public class Main {

    public static void main(String[] args) {

        Krabice<Boty> prvniKrabice = new Krabice<Boty>(new Boty("tenisky", 39));
        Krabice<Kniha> druhaKrabice = new Krabice<Kniha>(new Kniha("Proměna"));
        Krabice<Lahev> tretiKrabice = new Krabice<Lahev>(new Lahev("termoska", 1.5));
        Krabice<Boty> ctvrtaKrabice = new Krabice<Boty>(new Boty("zimní boty", 42));

        System.out.println("V první krabici jsou " + prvniKrabice.Polozka.ziskejNazev() + " velikosti " + prvniKrabice.Polozka.ziskejVelikost());
        System.out.println("Ve druhé krabici je kniha s názvem " +  druhaKrabice.Polozka.ziskejNazev());
        System.out.println("Ve třetí krabici je " + tretiKrabice.Polozka.ziskejNazev() + " o objemu " + tretiKrabice.Polozka.ziskejObjem() + " l");
        System.out.println("Ve čtvrté krabici jsou " + ctvrtaKrabice.Polozka.ziskejNazev() + " velikosti " + ctvrtaKrabice.Polozka.ziskejVelikost());

    }
}