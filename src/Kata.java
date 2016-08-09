/**
 * Created by andrewdmo on 8/8/16.
 */


public class Kata {

    // sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    //monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ( (aSmile && bSmile) || (!aSmile && !bSmile) ) {
            return true;
        }
        return false;
    }
    //sumDouble
    public int sumDouble(int a, int b) {
        if (a != b) {
            return (a + b);}
        return (2 * (a + b));
    }
    //diff21
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else { return ((n - 21) * 2);
        } }
    //parrotTrouble
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking) && ((hour < 7) || (hour > 20))) {
            return true;
        }
        return false;
    }
    //makes10
    public boolean makes10(int a, int b) {
        if ((a == 10) || (b == 10) || ((a + b) == 10)) {
            return true;
        }{
            return false;
        }
    }
    //nearHundred
    public boolean nearHundred(int n) {
        if (((n >= 90) && (n <= 110)) || ((n >= 190) && (n <= 210))) {
            return true;
        }
        return false;
    }
    //posNeg
    public boolean posNeg(int a, int b, boolean negative) {
        if((a < 0 && b > 0 && !negative) || (a > 0 && b < 0 && !negative) || (a < 0 && b < 0 && negative))
            return true;
        return false;
    }
    //notString
    //a little proud of my solution
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }
    //missingChar
    //couldn't get deleteCharAt(n) to work
    public String missingChar(String str, int n){
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }
    //frontBack
    //couldn't get to work
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    //front3
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }
    //backAround
    public String backAround(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    //or35
    public boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));
    }

    //front22
    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }
    //startHi
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }

    }
    //icyHot
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 >100) || (temp2 < 0 && temp1 > 100)) {
            return true;
        } else {
            return false;
        }
    }
    //in1020
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    //hasTeen
    //though maybe another way to solve, assigning an int with range then evaluating
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    //loneTeen
    //though could solve another way, maybe with if statement
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);}

    //delDel
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    //mixStart
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
    //startOz
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
    //intMax
    //makes sense
    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    //close10
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }
    //in3050
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }
    //max1020
    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    //stringE
    //makes sense, I guess
    public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }
    //lastDigit
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }

    //endUp
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }
    //every9th
    public String every9th(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}