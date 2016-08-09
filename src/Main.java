/**
 * Created by andrewdmo on 8/7/16.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---CodingBat Katas, Part 1---\n");
        System.out.println("-...brought to you by: Adderall and coffee!-");
        //sleepIn
        Kata answer0 = new Kata();
        System.out.println("\n-- sleepIn() --\n");
        System.out.println(answer0.sleepIn(true, true));
        System.out.println(answer0.sleepIn(true, false));
        System.out.println(answer0.sleepIn(false, true));

        //monkeyTrouble
        Kata answer1 = new Kata();
        System.out.println("\n-- monkeyTrouble() --\n");
        System.out.println(answer1.monkeyTrouble(true, true));
        System.out.println(answer1.monkeyTrouble(false, false));
        System.out.println(answer1.monkeyTrouble(true, false));

        //sumDouble
        Kata answer2 = new Kata();
        System.out.println("\n-- sumDouble --\n");
        System.out.println(answer2.sumDouble(1, 2));
        System.out.println(answer2.sumDouble(3, 2));
        System.out.println(answer2.sumDouble(2, 2));

        //diff21
        Kata answer3 = new Kata();
        System.out.println("\n-- diff21 --\n");
        System.out.println(answer3.diff21(19));
        System.out.println(answer3.diff21(11));
        System.out.println(answer3.diff21(21));

        //parrotTrouble
        Kata answer4 = new Kata();
        System.out.println("\n-- parrotTrouble --\n");
        System.out.println(answer4.parrotTrouble(true, 6));
        System.out.println(answer4.parrotTrouble(true, 7));
        System.out.println(answer4.parrotTrouble(false, 6));

        ///makes10
        Kata answer5 = new Kata();
        System.out.println("\n-- makes10 --\n");
        System.out.println(answer5.makes10(9, 10));
        System.out.println(answer5.makes10(9, 9));
        System.out.println(answer5.makes10(1, 9));

        //nearHundred
        Kata answer6 = new Kata();
        System.out.println("\n-- nearHundred --\n");
        System.out.println(answer6.nearHundred(93));
        System.out.println(answer6.nearHundred(90));
        System.out.println(answer6.nearHundred(89));

        //posNeg
        Kata answer7 = new Kata();
        System.out.println("\n-- posNeg --\n");
        System.out.println(answer7.posNeg(1, -1, false));
        System.out.println(answer7.posNeg(-1, 1, false));
        System.out.println(answer7.posNeg(-4, -4, true));

        //notString
        Kata answer8 = new Kata();
        System.out.println("\n-- notString --\n");
        System.out.println(answer8.notString("candy"));
        System.out.println(answer8.notString("x"));
        System.out.println(answer8.notString("not bad"));

        //missingChar
        Kata answer9 = new Kata();
        System.out.println("\n-- missingChar --\n");
        System.out.println(answer9.missingChar("kitten", 1));
        System.out.println(answer9.missingChar("kitten", 0));
        System.out.println(answer9.missingChar("kitten", 4));

        //frontBack
        Kata answer10 = new Kata();
        System.out.println("\n-- frontBack --\n");
        System.out.println(answer10.frontBack("code"));
        System.out.println(answer10.frontBack("a"));
        System.out.println(answer10.frontBack("ab"));

        //front3
        Kata answer11 = new Kata();
        System.out.println("\n-- front3 --\n");
        System.out.println(answer11.front3("Java"));
        System.out.println(answer11.front3("chocolate"));
        System.out.println(answer11.front3("abc"));

        //backAround
        Kata answer12 = new Kata();
        System.out.println("\n-- backAround --\n");
        System.out.println(answer12.backAround("cat"));
        System.out.println(answer12.backAround("Hello"));
        System.out.println(answer12.backAround("a"));

        //or35
        Kata answer13 = new Kata();
        System.out.println("\n-- or35 --\n");
        System.out.println(answer13.or35(3));
        System.out.println(answer13.or35(10));
        System.out.println(answer13.or35(8));

        //front22
        Kata answer14 = new Kata();
        System.out.println("\n-- front22 --\n");
        System.out.println(answer14.front22("kitten"));
        System.out.println(answer14.front22("Ha"));
        System.out.println(answer14.front22("abc"));

        //startHi
        Kata answer15 = new Kata();
        System.out.println("\n-- startHi --\n");
        System.out.println(answer15.startHi("hi there"));
        System.out.println(answer15.startHi("hi"));
        System.out.println(answer15.startHi("hello hi"));

        //icyHot
        Kata answer16 = new Kata();
        System.out.println("\n-- icyHot --\n");
        System.out.println(answer16.icyHot(120, -1));
        System.out.println(answer16.icyHot(-1, 120));
        System.out.println(answer16.icyHot(2, 120));

        //in1020
        Kata answer17 = new Kata();
        System.out.println("\n-- in1020 --\n");
        System.out.println(answer17.in1020(12, 99));
        System.out.println(answer17.in1020(21, 12));
        System.out.println(answer17.in1020(8, 99));

        //hasTeen
        Kata answer18 = new Kata();
        System.out.println("\n-- hasTeen --\n");
        System.out.println(answer18.hasTeen(13, 20, 10));
        System.out.println(answer18.hasTeen(20, 19, 10));
        System.out.println(answer18.hasTeen(20, 10, 13));

        //loneTeen
        Kata answer19 = new Kata();
        System.out.println("\n-- loneTeen --\n");
        System.out.println(answer19.loneTeen(13, 99));
        System.out.println(answer19.loneTeen(21, 19));
        System.out.println(answer19.loneTeen(13, 13));

        //delDel
        Kata answer20 = new Kata();
        System.out.println("\n-- delDel --\n");
        System.out.println(answer20.delDel("adelbc"));
        System.out.println(answer20.delDel("adelHello"));
        System.out.println(answer20.delDel("adedbc"));

        //mixStart
        Kata answer21 = new Kata();
        System.out.println("\n-- mixStart --\n");
        System.out.println(answer21.mixStart("mix snacks"));
        System.out.println(answer21.mixStart("pix snacks"));
        System.out.println(answer21.mixStart("piz snacks"));

        //startOz
        Kata answer22 = new Kata();
        System.out.println("\n-- startOz --\n");
        System.out.println(answer22.startOz("ozymandias"));
        System.out.println(answer22.startOz("bzoo"));
        System.out.println(answer22.startOz("oxx"));

        //intMax
        Kata answer23 = new Kata();
        System.out.println("\n-- intMax --\n");
        System.out.println(answer23.intMax(1, 2, 3));
        System.out.println(answer23.intMax(1, 3, 2));
        System.out.println(answer23.intMax(3, 2, 1));

        //close10
        Kata answer24 = new Kata();
        System.out.println("\n-- close10 --\n");
        System.out.println(answer24.close10(8, 13));
        System.out.println(answer24.close10(13, 8));
        System.out.println(answer24.close10(13, 7));

        //in3050
        Kata answer25 = new Kata();
        System.out.println("\n-- in3050 --\n");
        System.out.println(answer25.in3050(30, 31));
        System.out.println(answer25.in3050(30, 41));
        System.out.println(answer25.in3050(40, 50));

        //max1020
        Kata answer26 = new Kata();
        System.out.println("\n-- max1020 --\n");
        System.out.println(answer26.max1020(11, 19));
        System.out.println(answer26.max1020(19, 11));
        System.out.println(answer26.max1020(11, 9));

        //stringE
        Kata answer27 = new Kata();
        System.out.println("\n-- stringE --\n");
        System.out.println(answer27.stringE("Hello"));
        System.out.println(answer27.stringE("Heelle"));
        System.out.println(answer27.stringE("Heelele"));

        //lastDigit
        Kata answer28 = new Kata();
        System.out.println("\n-- lastDigit --\n");
        System.out.println(answer28.lastDigit(7, 17));
        System.out.println(answer28.lastDigit(6, 17));
        System.out.println(answer28.lastDigit(3, 113));

        //endUp
        Kata answer29 = new Kata();
        System.out.println("\n-- endUp --\n");
        System.out.println(answer29.endUp("Hello"));
        System.out.println(answer29.endUp("hi there"));
        System.out.println(answer29.endUp("hi"));

        //every9th
        Kata answer30 = new Kata();
        System.out.println("\n-- every9th --\n");
        System.out.println(answer30.every9th("Miracle", 2));
        System.out.println(answer30.every9th("abcdefg", 2));
        System.out.println(answer30.every9th("abcdefg", 3));

        System.out.println("\n--End of the show!--");

//        //model
//        Kata answer31 = new Kata();
//        System.out.println("\n-- model --\n");
//        System.out.println( answer31.model(argh));
//        System.out.println( answer31.model(argh));
//        System.out.println( answer31.model(argh));
//
//        //model
//        Kata answer32 = new Kata();
//        System.out.println("\n-- model --\n");
//        System.out.println( answer32.model(argh));
//        System.out.println( answer32.model(argh));
//        System.out.println( answer32.model(argh));
//
//
//
//
//        //intMax
////        Kata 213 = new Kata();
////        System.out.println("\n-- intMax --\n");
////        System.out.println( 213.intMax(argh));
////        System.out.println( 213.intMax(argh));
////        System.out.println( 213.intMax(argh));
//
//
//    }
    }
}