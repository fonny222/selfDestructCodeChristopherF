package com.example;


import javax.swing.JOptionPane;
public class clockTest {

static Thread thread = new Thread();

    public static void main(String[] args){

        int counter1 = 60;
        int counter2 = 60;
        int seconds = 60;

        Boolean count0 = false;


        for(int i = 60; i >= 0; i--) {

            try {
                thread.sleep(1000);
            }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }

            System.out.println(i);

            if(i == 0) {


                count0 = true;
            }
        }

        if(count0 == true){

            JOptionPane.showMessageDialog(null,"!!KABOOM!!");
        }


     /*for(int s1 = 60; s1 >= 0; s1--){

         System.out.println(seconds);

         for(int s2 = 60; s2 >= 0; s2--){

             counter1 -= 1;

             for(int s3 = 60; s3 >= 0; s3 --){

                counter2 -= 1;
             }
         }
     */
     }


    }


