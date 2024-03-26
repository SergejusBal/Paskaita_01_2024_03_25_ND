import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //////////////////////////////////
        //// Pirmas Uždavinys

        System.out.println();
        System.out.println("Pirmas Uždavinys");
        System.out.println();

        Sou mikis = new Sou();
        mikis.amzius = 5;
        mikis.Vardas = "Mikis";
        mikis.ArDresuotas = true;
        mikis.veisle = "Bulldogas";
        char antrameIndekse =  mikis.Vardas.charAt(2);

        System.out.println("Suns vardas: " + mikis.Vardas );
        System.out.println("Suns amzius: " + mikis.amzius);
        System.out.println("Ar Dresuotas? "+ mikis.ArDresuotas);
        System.out.println("Veislė: " + mikis.veisle);
        System.out.println("Vertė antrame indekse yra:"+antrameIndekse);
        System.out.println();


        Sou abis = new Sou();
        abis.amzius = 8;
        abis.Vardas = "Abis";
        abis.ArDresuotas = false;
        abis.veisle = "Retriveris";
        antrameIndekse =  abis.Vardas.charAt(2);

        System.out.println("Suns vardas: " + abis.Vardas );
        System.out.println("Suns amzius: " + abis.amzius);
        System.out.println("Ar Dresuotas? "+ abis.ArDresuotas);
        System.out.println("Veislė: " + abis.veisle);
        System.out.println("Vertė antrame indekse yra:"+antrameIndekse);

        //////////////////////////////////
        //// Antras Uždavinys

        System.out.println();
        System.out.println("Antras Uždavinys");
        System.out.println();

        String duSunis = mikis.Vardas + abis.Vardas;
        System.out.println("Jungtinis vardas: "+duSunis);
        int simbSkaicius = duSunis.length();
        System.out.println("Simboliu skaicius: "+ simbSkaicius);
        String pozicijos = duSunis.substring(2,7);
        System.out.println("Verte 2-6 pozicijos: "+pozicijos);
        boolean ArVienodi = mikis.Vardas.equals(abis.Vardas);
        System.out.println("Ar vienodi vardai?: "+ArVienodi);
        char raide = duSunis.charAt(5);
        System.out.println("Raides verte 5 pozicijosje: " + raide);

        //////////////////////////////////
        //// Trecias Uždavinys

        System.out.println();
        System.out.println("Trecias Uždavinys");
        System.out.println();

        Darbuotojas jonas = new Darbuotojas();
        jonas.Vardas = "Jonas";
        jonas.Pavarde = "Beržas";
        jonas.Pareigos = "pardavijas";
        jonas.AsmensKodas = 3588457441454L;
        jonas.Lytis = "vyras";
        jonas.ArVairuoja = true;


        System.out.println("Vardas pavarde: " + jonas.Vardas + " " + jonas.Pavarde);
        System.out.println("Pareigos: " + jonas.Pareigos);
        System.out.println("Asmens kodas? "+ jonas.AsmensKodas);
        System.out.println("Lytis: " + jonas.Lytis);
        System.out.println("Ar Vairuoja?: "+jonas.ArVairuoja);
        System.out.println();

        Darbuotojas tomas = new Darbuotojas();
        tomas.Vardas = "Tomas";
        tomas.Pavarde = "Miskinis";
        tomas.Pareigos = "Vairuotojas";
        tomas.AsmensKodas = 54564545645L;
        tomas.Lytis = "vyras";
        tomas.ArVairuoja = true;


        System.out.println("Vardas pavarde: " + tomas.Vardas + " " + tomas.Pavarde);
        System.out.println("Pareigos: " + tomas.Pareigos);
        System.out.println("Asmens kodas? "+ tomas.AsmensKodas);
        System.out.println("Lytis: " + tomas.Lytis);
        System.out.println("Ar Vairuoja?: "+tomas.ArVairuoja);
        System.out.println();


        //////////////////////////////////
        //// Ketvirtas Uždavinys

        System.out.println();
        System.out.println("Ketvirtas Uždavinys");
        System.out.println();

        String duDarbuotojai = tomas.Pareigos + jonas.Pareigos;
        System.out.println("Jungtines pareigos: "+duDarbuotojai);
        int kitasSimbSkaicius = duDarbuotojai.length();
        System.out.println("Simboliu skaicius: "+ kitasSimbSkaicius);
        String kitosPozicijos = duDarbuotojai.substring(3,10);
        System.out.println("Verte 3-9 pozicijos: "+kitosPozicijos);
        boolean kitasArVienodi = jonas.Pareigos.equals(tomas.Pareigos);
        System.out.println("Ar vienodos pareigos?: "+kitasArVienodi);
        char kitaRaide = duDarbuotojai.charAt(3);
        System.out.println("Raides verte 3 pozicijosje: " + kitaRaide);

        //////////////////////////////////
        //// Penktas Uždavinys

        System.out.println();
        System.out.println("Penktas Uždavinys");
        System.out.println();

        int pirmasSkInt = 5;
        int antrasSkInt = 89;

        int sumInt = pirmasSkInt + antrasSkInt;
        System.out.println("Suma: " + sumInt);
        int skirtInt = pirmasSkInt - antrasSkInt;
        System.out.println("Skirtumas: " + skirtInt);
        int multInt = pirmasSkInt*antrasSkInt;
        System.out.println("Daugyba: " + multInt);
        int divdInt = pirmasSkInt/antrasSkInt;
        System.out.println("Dalyba: " + divdInt);
        System.out.println();

        float pirmasSkFloat  = 88.46F;
        float antrasSkFloat  = -456.12F;

        float sumFloat = pirmasSkFloat + antrasSkFloat;
        System.out.println("Suma: " + sumFloat);
        float skirtFloat = pirmasSkFloat - antrasSkFloat;
        System.out.println("Skirtumas: " + skirtFloat);
        float multFloat = pirmasSkFloat*antrasSkFloat;
        System.out.println("Daugyba: " + multFloat);
        float divdFloat = pirmasSkFloat/antrasSkFloat;
        System.out.println("Dalyba: " + divdFloat);
        System.out.println();

        BigDecimal pirmasSkBgDc = new BigDecimal(12.456);
        BigDecimal antrasskBgDc = new BigDecimal(2.89);

        BigDecimal sumBgDc =pirmasSkBgDc.add(antrasskBgDc);
        System.out.println("Suma: " + sumBgDc);
        BigDecimal skirtBgDc = pirmasSkBgDc.subtract(antrasskBgDc);
        System.out.println("Skirtumas: " + skirtBgDc);
        BigDecimal multBgDc = pirmasSkBgDc.multiply(antrasskBgDc);
        System.out.println("Daugyba: " + multBgDc);
        BigDecimal divdBgDc = pirmasSkBgDc.divide(antrasskBgDc, 4,RoundingMode.HALF_UP);
        System.out.println("Dalyba: " + divdBgDc);
        System.out.println();


        sumBgDc = sumBgDc.round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Suma: " + sumBgDc);
        skirtBgDc = skirtBgDc.round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Skirtumas: " + skirtBgDc);
        multBgDc = multBgDc.round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Daugyba: " + multBgDc);
        divdBgDc = divdBgDc.round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Dalyba: " + divdBgDc);
        System.out.println();

        //////////////////////////////////
        //// Sestas Uždavinys

        System.out.println();
        System.out.println("Sestas Uždavinys");
        System.out.println();

        Random random = new Random();

        BigDecimal pirmasSkBgDcR = new BigDecimal(random.nextDouble(0,10000));
        BigDecimal antrasSkBgDcR = new BigDecimal(random.nextDouble(0,10000));

        boolean palyginti = 0 != pirmasSkBgDcR.compareTo(antrasSkBgDcR);
        System.out.println("Ar lygus: " + palyginti);

        BigDecimal sumBgDcR =pirmasSkBgDcR.add(antrasSkBgDcR).round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Suma: " + sumBgDcR);
        BigDecimal skirtBgDcR = pirmasSkBgDcR.subtract(antrasSkBgDcR).round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Skirtumas: " + skirtBgDcR);
        BigDecimal multBgDcR = pirmasSkBgDcR.multiply(antrasSkBgDcR).round(new MathContext(2,RoundingMode.HALF_UP));
        System.out.println("Daugyba: " + multBgDcR);
        BigDecimal divdBgDcR = pirmasSkBgDcR.divide(antrasSkBgDcR, 2,RoundingMode.HALF_UP);
        System.out.println("Dalyba: " + divdBgDcR);
        System.out.println();


    }
    static class Sou{
        String Vardas;
        int amzius;
        boolean ArDresuotas;
        String veisle;

    }

    static class Darbuotojas{
        String Vardas;
        String Pavarde;
        String Pareigos;
        long AsmensKodas;
        String Lytis;
        boolean ArVairuoja;

    }

}