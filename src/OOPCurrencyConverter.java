import java.util.Scanner;


public class OOPCurrencyConverter {

    static String rate;
    public static void main(String[] args) {
        double[] i = new double[1];
        double k;
        CurrencyConverterCLO[] h1 = new CurrencyConverterCLO[5];

        h1[0] = new CurrencyConverterCLO("Приветствуем в CurrencyConverter");
        do {

            h1[1] = new CurrencyConverterCLO("1.EURO");
            h1[2] = new CurrencyConverterCLO("2.USD");
            h1[3] = new CurrencyConverterCLO("3.TL");
            h1[4] = new CurrencyConverterCLO("4.exit");

            valutArrayTest(h1);
            System.out.print("Введите исходную валюту: ");
            CLI h3 = new CLI();
            if ( h3.currency.equals("exit"))
            {
                break;
            }
            System.out.print("Введите конечную валюту: ");
            CLI h4 = new CLI();
            System.out.println(h3.currency + "-" + h4.currency);
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите сумму : ");
            CLAM amn = new CLAM();

            rate = (h3.currency + "-" + h4.currency);
            switch (h3.currency + "-" + h4.currency) {
                case "EURO-EURO":

                    k = amn.amount;
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "EURO-USD":
                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "EURO-TL":

                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "USD-EURO":
                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "USD-USD":
                    k = amn.amount;
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "USD-TL":
                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "TL-EURO":
                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "TL-USD":
                    k = amn.amount * getRateValue(i);
                    System.out.println(" Ваш результат : " + k);
                    break;
                case "TL-TL":
                    k = amn.amount;
                    System.out.println(" Ваш результат : " + k);
                    break;
                default:
                    System.out.println("unknown currency, bye!");
                    break;
            }
        } while(true);


    }
    public static double getRateValue( double[] rates )
    {
        Scanner getRateVal = new Scanner ( System.in);

        double result = 0 ;
        System.out.print("Введите курс валют для " + rate + " (Введите 0 , если хотите использовать стандартный курс валют) :");
        double kursValut = getRateVal.nextDouble();
        for (int i=0;i<rates.length;i++)
        {
            if (kursValut == 0 && rate.equals("EURO-USD")){
                rates[i] = 1.09;
            }
            else if (kursValut == 0 && rate.equals("EURO-TL")){
                rates[i] = 32.91;
            }
            else if (kursValut == 0 && rate.equals("USD-EURO")){
                rates[i] = 0.92;
            }
            else if (kursValut == 0 && rate.equals("USD-TL")){
                rates[i] = 30.22;
            }
            else if (kursValut == 0 && rate.equals("TL-USD")){
                rates[i] = 0.033;
            }
            else if (kursValut == 0 && rate.equals("TL-EURO")){
                rates[i] = 0.030;
            }
            else {
                rates[i] = kursValut;
            }

            result = rates[i];

        }


        return result;

    }

    public static void valutArrayTest(CurrencyConverterCLO[] arraysDlaValut)
    {
        for ( int i = 0;i<arraysDlaValut.length;i++)
        {
            System.out.println(arraysDlaValut[i].predValut);
        }
    }
}
class CurrencyConverterCLO {

    String predValut;

    CurrencyConverterCLO(String predValut)
    {
        this.predValut = predValut;

    }

}
 class CLI{
    String currency;

     Scanner curr = new Scanner(System.in);

    CLI(){
        this.currency = curr.nextLine();;

        if (currency == "exit")
        {
            System.exit(0);
        }

    }
 }
 class CLAM {
    double amount;
    Scanner am = new Scanner (System.in);

    CLAM(){
        this.amount = am.nextDouble();
    }

 }


