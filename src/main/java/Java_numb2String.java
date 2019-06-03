import java.util.Scanner;

public class Java_numb2String {
    public static void main(String[] args) {
        System.out.println("Please step on!");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        if (weight >=0 && weight < 10) {
            switch (weight) {
                case 0 :
                    System.out.println("zero");
                    break;
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
            }
        }
        else if (weight >= 10 && weight < 20) {
            int ones = weight % 10;
            String Sones = "teen";

            switch (weight) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12 :
                    System.out.println("twelve");
                    break;
                case 13 :
                    System.out.println("thirteen");
                    break;
                case 14 :
                    System.out.println("forteen");
                    break;
                case 15 :
                    System.out.println("fifteen");
                    break;
            }
            switch (ones) {
                case 6 :
                    System.out.println("six"+Sones);
                    break;
                case 7 :
                    System.out.println("seven"+Sones);
                    break;
                case 8 :
                    System.out.println("eight"+Sones);
                    break;
                case 9 :
                    System.out.println("nine"+Sones);
                    break;
            }
        }
        else if (weight >=20 && weight < 100) {
            int tens = weight / 10;
            int ones = weight % 10;
            String sTens = "";
            String sOnes = "";
            switch (tens) {
                case 2 :
                    sTens = "Twenty";
                    break;
                case 3 :
                    sTens = "Thirty";
                    break;
                case 4 :
                    sTens = "Forty";
                    break;
                case 5 :
                    sTens = "Fifty";
                    break;
                case 6 :
                    sTens = "Sixty";
                    break;
                case 7 :
                    sTens = "Seventy";
                    break;
                case 8 :
                    sTens = "Eighty";
                    break;
                case 9 :
                    sTens = "Ninety";
                    break;
            }
            switch (ones) {
                case 0 :
                    sOnes = "";
                    break;
                case 1 :
                    sOnes = " One";
                    break;
                case 2 :
                    sOnes = " Two";
                    break;
                case 3 :
                    sOnes = " Three";
                    break;
                case 4 :
                    sOnes = " Four";
                    break;
                case 5 :
                    sOnes = " Five";
                    break;
                case 6 :
                    sOnes = " Six";
                    break;
                case 7 :
                    sOnes = " Seven";
                    break;
                case 8 :
                    sOnes = " Eight";
                    break;
                case 9 :
                    sOnes = " Nine";
                    break;
            }
            String result = sTens + sOnes;
            System.out.println(result);
        }
        else if (weight >= 100 && weight < 999) {
            int hundrs = weight / 100;
            int tens = (weight % 100) / 10;
            int ones = (weight % 100) % 10;
            String SHundrs = "";
            String STens = "";
            String SOnes = "";
            switch (hundrs) {
                case 1:
                    SHundrs = "One hundred and ";
                    break;
                case 2:
                    SHundrs = "Two hundreds and ";
                    break;
                case 3:
                    SHundrs = "Three hundreds and ";
                    break;
                case 4:
                    SHundrs = "Four hundreds and ";
                    break;
                case 5:
                    SHundrs = "Five hundreds and ";
                    break;
                case 6:
                    SHundrs = "Six hundreds and ";
                    break;
                case 7:
                    SHundrs = "Seven hundreds and ";
                    break;
                case 8:
                    SHundrs = "Eight hundreds and ";
                    break;
                case 9:
                    SHundrs = "Nine hundreds and ";
                    break;
            }
            switch (tens) {
                case 0:
                    STens = "";
                    break;
                case 1:
                    switch (ones) {
                        case 0:
                            STens = "Ten ";
                            break;
                        case 1:
                            STens = "Eleven";
                            break;
                        case 2:
                            STens = "Twelve";
                            break;
                        case 3:
                            STens = "Thirteen";
                            break;
                        case 4:
                            STens = "Forteen";
                            break;
                        case 5:
                            STens = "Fifteen";
                            break;
                        case 6:
                            STens = "Sixteen";
                            break;
                        case 7:
                            STens = "Seventeen";
                            break;
                        case 8:
                            STens = "Eighteen";
                            break;
                        case 9:
                            STens = "Nineteen";
                            break;
                    }
                    break;
                case 2:
                    STens = "Twenty ";
                    break;
                case 3:
                    STens = "Thirty ";
                    break;
                case 4:
                    STens = "Forty ";
                    break;
                case 5:
                    STens = "Fifty ";
                    break;
                case 6:
                    STens = "Sixty ";
                    break;
                case 7:
                    STens = "Seventy ";
                    break;
                case 8:
                    STens = "Eighty ";
                    break;
                case 9:
                    STens = "Ninety ";
                    break;
            }
            switch (ones) {
                case 0:
                    SOnes = "";
                    break;
                case 1:
                    SOnes = "One";
                    break;
                case 2:
                    SOnes = "Two";
                    break;
                case 3:
                    SOnes = "Three";
                    break;
                case 4:
                    SOnes = "Four";
                    break;
                case 5:
                    SOnes = "Five";
                    break;
                case 6:
                    SOnes = "Six";
                    break;
                case 7:
                    SOnes = "Seven";
                    break;
                case 8:
                    SOnes = "Eight";
                    break;
                case 9:
                    SOnes = "Nine";
                    break;
            }
            if (tens == 1) {
                String result1 = SHundrs + STens;
                System.out.println(result1);
            } else {
                String result = SHundrs + STens + SOnes;
                System.out.println(result);
            }
        }
        else {
            System.out.println("out of ability!");
        }
    }
}
