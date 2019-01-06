
import java.util.Scanner;

//Kunj Patel
//N01225943
//Currency Conversion
//Purpose: To convert currency from one to another
public class CurrencyConversion {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Variable Declarations
        
        String have;
        String want;
        double currencyOnHand;
        double currencyRequired;
        final double euroDollarRate=1.124;
        final double cadDollarRate=0.758;
        final double poundDollarRate=1.296;
        
        System.out.println("\t\t Currency Conversion Program:");
        
        System.out.println("\nPlease enter the currency you have from: USD | CAD | EUROS | GBP");
        have = scan.next();
        System.out.println("Please enter the currency you require from: USD | CAD | EUROS | GBP");
        want = scan.next();
        
        if(have == null ? want == null : have.equals(want)){
            System.out.println("Wrong selection! Same currency's cannot be converted");
            
        }
        else
        System.out.println("Please enter the amount");
        currencyOnHand = scan.nextDouble();
        
        //USD To EUROS CONVERSION
        if("USD".equals(have) && "EUROS".equals(want)) {
            currencyRequired=currencyOnHand/euroDollarRate;
            System.out.println("The Exchange rate is: One USD($) = 0.0896 Euros");
            System.out.printf("The currency in Euros you will get is :" + Math.round(currencyRequired));
        }
        //USD To CAD CONVERSION
        else if("USD".equals(have) && "CAD".equals(want)) {
            currencyRequired=currencyOnHand/cadDollarRate;
            System.out.println("The Exchange rate is: One USD($) = 1.319 Canadian Dollars");
            System.out.println("The currency in Canadian dollars you will get is :" + currencyRequired);
            
        }
        //USD To GBP CONVERSION
        else if("USD".equals(have) && "GBP".equals(want)) {
            currencyRequired=currencyOnHand/poundDollarRate;
            System.out.println("The Exchange rate is: One USD($) = 0.771 Great Britain Pounds");
            System.out.println("The currency in Great Britain Pound(s) you will get is :" + currencyRequired);
            
        }
        //CAD To USD CONVERSION
        else if("CAD".equals(have) && "USD".equals(want)) {
            currencyRequired=currencyOnHand*cadDollarRate;
            System.out.println("The Exchange rate is: One CAD($) = 0.758 US dollars");
            System.out.println("The currency in US dollars you will get is :" + currencyRequired);
            
        }
        //CAD To EUROS CONVERSION
        else if("CAD".equals(have) && "EUROS".equals(want)) {
            currencyRequired=currencyOnHand*cadDollarRate/euroDollarRate;
            System.out.println("The Exchange rate is: One CAD($) = 0.6744 Euros");
            System.out.println("The currency in Euros you will get is :" + currencyRequired);
            
        }
        //CAD To GBP CONVERSION
        else if("CAD".equals(have) && "GBP".equals(want)) {
            currencyRequired=currencyOnHand*cadDollarRate/poundDollarRate;
            System.out.println("The Exchange rate is: One CAD($) = 0.5849 Great Britain pounds");
            System.out.println("The currency in Great Britain Pound(s) you will get is :" + currencyRequired);
            
        }
        //EUROS To USD CONVERSION
        else if("EUROS".equals(have) && "USD".equals(want)) {
            currencyRequired=currencyOnHand*euroDollarRate;
            System.out.println("The Exchange rate is: One Euro($) = 1.124 US dollars");
            System.out.println("The currency in US dollar(s) you will get is :" + currencyRequired);
            
        }
        //EUROS To CAD CONVERSION
        else if("EUROS".equals(have) && "CAD".equals(want)) {
            currencyRequired=currencyOnHand*euroDollarRate/cadDollarRate;
            System.out.println("The Exchange rate is: One Euro($) =  1.4828 Canadian dollars");
            System.out.println("The currency in Canadian dollar(s) you will get is :" + currencyRequired);
            
        }
        //EUROS To GBP CONVERSION
        else if("EUROS".equals(have) && "GBP".equals(want)) {
            currencyRequired=currencyOnHand*euroDollarRate/poundDollarRate;
            System.out.println("The Exchange rate is: One Euro($) =0.995 Great Britain Pounds");
            System.out.println("The currency in Great Britain Pound(s) you will get is :" + currencyRequired);
            
        }
        //GBP To USD CONVERSION
        else if("GBP".equals(have) && "USD".equals(want)) {
            currencyRequired=currencyOnHand*poundDollarRate;
            System.out.println("The Exchange rate is: One Pound($) =1.296 US dollars");
            System.out.println("The currency in US dollar(s) you will get is :" + currencyRequired);
            
        }
        //GBP To CAD CONVERSION
        else if("GBP".equals(have) && "CAD".equals(want)) {
            currencyRequired=currencyOnHand*poundDollarRate/cadDollarRate;
            System.out.println("The Exchange rate is: One Pound($) =1.71 Canadian dollars");
            System.out.println("The currency in Canadian dollar(s) you will get is :" + currencyRequired);
            
        }
        //GBP To EUROS CONVERSION
        else if("GBP".equals(have) && "EUROS".equals(want)) {
            currencyRequired=currencyOnHand*poundDollarRate/euroDollarRate;
            System.out.println("The Exchange rate is: One Pound($) =1.153 Euros");
            System.out.println("The currency in Euros(s) you will get is :" + currencyRequired);
            
        }
      
    
    }
    
}
