package com.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class destructCode {


    static Thread thread = new Thread();
    public static void main(String[] args) {

        // variables for first officer
        String officerName1; //James Kirk
        String officerRank1; // Captain
        String code1;       //11A
        Boolean jamesKirk = false;
        Boolean jamesRank = false;
        Boolean firstCode = false;


        //Variables for second officer
        String officerName2; // Montgomery Scott
        String officerRank2; // Chief Engineering Officer
        String code2;        // 11A2B
        Boolean montScott = false;
        Boolean scottRank = false;
        Boolean secondCode = false;


        //variables for third officer
        String officerName3; // Pavel Chekov
        String officerRank3; // Chief Science Officer
        String code3;       // 31B2B3
        Boolean pCheckov = false;
        Boolean chekovRank = false;
        Boolean thirdCode = false;

        //Final code for 1 minute count down.
        String code4;       //000DESTRUCT0
        Boolean finalCode = false;

        int countDownTimer = 60;
        Boolean timer = false;
        int menuChoice;
        Boolean menuReturn = false;
        int pressOne;

        Scanner inputDevice = new Scanner(System.in);

        // this do while loop runs a menu with the switch
        // until you select initiate self destruct it will keep looping

        do {
            System.out.println("Please Choose One of the Following: ");
            System.out.println();
            System.out.println("1: Review Officer List.");
            System.out.println("2: Initiate Self-Destruct Sequence.");
            System.out.println("3: !Top Secret Destruct Codes!");
            System.out.println();
            System.out.print("Your Choice (1-3): ");

            menuChoice = inputDevice.nextInt();

            //spacing
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            switch (menuChoice) {
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("James Kirk        Rank: Captain");
                    System.out.println("Montgomery Scott  Rank: Officer");
                    System.out.println("Pavel Chekov      Rank: Officer");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;

                case 2:
                    menuReturn = true;
                    break;

                case 3:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("HAHAHA Nice Try!...");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;


            }
        } while (menuReturn == false);

        // spacing
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        // ask for first officer input***********************************************
        System.out.println("To initiate Self-Destruct sequence please code in.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("1: What is your Name: ");

        officerName1 = inputDevice.next();

        // this switch if maching makes boolean jamesKirk true
        // this triggers the following if statement
        switch (officerName1) {

            case "Kirk,James":
                System.out.println();
                System.out.println();
                System.out.println("Entry Accepted");
                System.out.println();
                System.out.println();
                jamesKirk = true;
                break;

            default:
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Invalid Entry!");
        }

        // this if statement contains the switch for rank
        // if rank matches then jamesRank is true which triggers following if statement
        if (jamesKirk == true) {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("1: What is your Rank: ");
            officerRank1 = inputDevice.next();

            switch (officerRank1) {
                case "Captain":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println();
                    System.out.println();
                    jamesRank = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }
        }

// finally this if statement contains the actual code
        // if this code matches the first sequence is complete
        // and it moves on to the next sequence for Montgomery Scott
        if (jamesRank == true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("1: Code In: ");
            code1 = inputDevice.next();

            switch (code1) {

                case "11A":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println("!SEQUENCE 1 COMPLETE!");
                    System.out.println();
                    System.out.println();
                    firstCode = true;
                    break;
                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");

            }
        }


// Second officer entry********************************************
// these if statements follow the same rules as the first sequence for Kirk
        if(firstCode == true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("2: What is your Name: ");

            officerName2 = inputDevice.next();

            switch (officerName2) {

                case "Scott,Montgomery":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println();
                    System.out.println();
                    montScott = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }
        }

        if(montScott == true) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("2: What is your Rank: ");
            officerRank2 = inputDevice.next();

            switch (officerRank2) {
                case "Officer":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println();
                    System.out.println();
                    scottRank = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }
        }

        if(scottRank == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("2: Code In: ");
            code2 = inputDevice.next();


            switch(code2){

                case "11A2B":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println("!SEQUENCE 2 COMPLETE!");
                    System.out.println();
                    System.out.println();
                    secondCode = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }
        }

        // Third Officer Entry ***************************************
        // these if statements follow the same sequence for the first 2

        if(secondCode == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("3: What is your Name: ");
            officerName3 = inputDevice.next();

            switch (officerName3){

                case "Chekov,Pavel":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println();
                    System.out.println();
                    pCheckov = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }
        }


        if(pCheckov == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("3: What is your Rank: ");
            officerRank3 = inputDevice.next();

            switch(officerRank3){

                case "Officer":
                    System.out.println();
                    System.out.println();
                    System.out.println("Entry Accepted");
                    System.out.println();
                    System.out.println();
                    chekovRank = true;
                    break;

                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry");
            }
        }


        if(chekovRank == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("3: Code in: ");
            code3 = inputDevice.next();

            switch(code3){

                case "31B2B3":
                    System.out.println();
                    System.out.println();
                    System.out.println("Correct Entry");
                    System.out.println("!SEQUENCE 3 COMPLETE!");
                    System.out.println();
                    System.out.println();
                    thirdCode = true;
                    break;
                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Incorrect Entry");
            }

        }
// final sequence and DESTRUCTION!*********************************

        // after moving through all of the other if statements
        // this final destruct sequence is initiated
        if(thirdCode == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Please Enter the Final Initiation code: ");
            code4 = inputDevice.next();

            //if there is a match then
            // finalCode is true activating the final if statement
            switch (code4){

                case "000DESTRUCT0":
                    System.out.println();
                    System.out.println();
                    System.out.println("CODE ACCEPTED");
                    System.out.println();
                    System.out.println();
                    finalCode = true;
                    break;
                default:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Invalid Entry!");
            }

        }

// this if statement triggers if finalCode is true
        // I wanted to have an actual countdown timer however it was triggering immediately
        // I added "press 1 to continue" so I could trigger the timer
        // this gave users the ability to see the final message
        if(finalCode == true){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("!ENTERPRISE SELF-DESTRUCT SEQUENCE INITIATED!");
            System.out.println("        !BEGIN 60 SECOND COUNT DOWN!         ");
            System.out.println();
            System.out.println();
            System.out.println("Press 1 to continue..");

            pressOne = inputDevice.nextInt();

            // this loops to make sure the correct key is pressed
            while(pressOne != 1){

                System.out.println();
                System.out.println();
                System.out.println("Press 1 to continue..");
                pressOne = inputDevice.nextInt();
            }
        }


        //Timer trigger********************************************

        // I looked up how to time a countdown to 60 seconds
        // I had to use the thread.sleep(); method
        // this was causing an error so I found that if I use try/catch
        // it makes sure that it doesnt crash if it finds the intteruped exception error
        for(int i = 60; i >= 0; i--) {

            try {
                thread.sleep(1000);
            }catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
// print countdown each second
            System.out.println(i);

            if(i == 0){

                timer = true;
            }
        }

        // finally this creates pop up window with the dialog for the explosion.
        if(timer == true){

            JOptionPane.showMessageDialog(null,"!!!KABOOM!!!");
        }








    }


}
