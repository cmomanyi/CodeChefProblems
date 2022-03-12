package com.problems.codechef;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Service
public class CodeChefProblemsToSolve implements ApplicationRunner {

    public static final Logger logger = LoggerFactory.getLogger(CodeChefProblemsToSolve.class);

    public void run(ApplicationArguments arguments) {
        logger.info("Starting the Application");

        this.problemATMMachine();
    }

    /**
     * There is an ATM machine. Initially, it contains a total of K units of money. N people (numbered 1 through N) want
     * to withdraw money; for each valid i, the i-th person wants to withdraw Ai units of money.
     * <p>
     * The people come in and try to withdraw money one by one, in the increasing order of their indices.
     * Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it
     * will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case,
     * this person will return home directly without trying to do anything else.
     * <p>
     * For each person, determine whether they will get the required amount of money or not.
     */
    private void problemATMMachine() {

        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("Please enter the total of K units of money\n");
        int K = myScannerObj.nextInt();
        System.out.println(" In Dollars " + K + "\n");
        System.out.println("Enter number of people in the line  \n");
        int n = myScannerObj.nextInt();
        int[] noOfPeople = new int[n];

       while (K > 0) {
            for (int i = 0; i < noOfPeople.length; i++) {
                System.out.println("please enter amount \n");
                i = myScannerObj.nextInt();
                if (i <= K) {
                    K = K - i;
                    System.out.println("The balance is " + K + "\n");
                } else {
                    System.out.println("Insufficient Balance \n");
                }

            }
        }
    }


}

