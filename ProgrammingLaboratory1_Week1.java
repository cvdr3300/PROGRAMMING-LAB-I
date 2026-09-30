
package programminglaboratory.pkg1_week.pkg1;

import java.util.Scanner;

public class ProgrammingLaboratory1_Week1 {

    public static void main(String[] args) {
        
        System.out.println("Matches1 -> Team A and Team B");
        System.out.println("Matches1 -> Team A and Team C");
        System.out.println("Matches1 -> Team A and Team D");
        System.out.println("Matches1 -> Team B and Team C");
        System.out.println("Matches1 -> Team B and Team D");
        System.out.println("Matches1 -> Team C and Team D");
        
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Please enter the Matches1 score.");
        System.out.print("A:");
        int a = scan.nextInt();
        System.out.print("B:");
        int b = scan.nextInt();
        
        System.out.println("Please enter the Matches2 score.");
        System.out.print("A:");
        int c = scan.nextInt();
        System.out.print("C:");
        int d = scan.nextInt();
        
        System.out.println("Please enter the Matches3 score.");
        System.out.print("A:");
        int e = scan.nextInt();
        System.out.print("D:");
        int f = scan.nextInt();
        
        System.out.println("Please enter the Matches4 score.");
        System.out.print("B:");
        int g = scan.nextInt();
        System.out.print("C:");
        int h = scan.nextInt();
        
        System.out.println("Please enter the Matches5 score.");
        System.out.print("B:");
        int k = scan.nextInt();
        System.out.print("D:");
        int l = scan.nextInt();
        
        System.out.println("Please enter the Matches6 score.");
        System.out.print("C:");
        int m = scan.nextInt();
        System.out.print("D:");
        int n = scan.nextInt();
        
        
        
        System.out.println("\n--- MATCH SCORES ---");
        System.out.println("Match 1: Team A vs Team B -> Team A: " + a + " | Team B: " + b);
        System.out.println("Match 2: Team A vs Team C -> Team A: " + c + " | Team C: " + d);
        System.out.println("Match 3: Team A vs Team D -> Team A: " + e + " | Team D: " + f);
        System.out.println("Match 4: Team B vs Team C -> Team B: " + g + " | Team C: " + h);
        System.out.println("Match 5: Team B vs Team D -> Team B: " + k + " | Team D: " + l);
        System.out.println("Match 6: Team C vs Team D -> Team C: " + m + " | Team D: " + n);
        
        
        
        int scoreA=0;
        int scoreB=0;
        int scoreC=0;
        int scoreD=0;
        
        int winCountA=0;
        int winCountB=0;
        int winCountC=0;
        int winCountD=0;
        
        int drawCountA=0;
        int drawCountB=0;
        int drawCountC=0;
        int drawCountD=0;
        
        int loseCountA=0;
        int loseCountB=0;
        int loseCountC=0;
        int loseCountD=0;
        
        int goalsForA=0;
        int goalsForB=0;
        int goalsForC=0;
        int goalsForD=0;
        
        int goalAgainstA=0;
        int goalAgainstB=0;
        int goalAgainstC=0;
        int goalAgainstD=0;
        
        
        if (a > b) {
            scoreA = scoreA + 3;
            winCountA++;
            loseCountB++;
        } else if (a == b) {
            scoreA++;
            scoreB++;
            drawCountA++;
            drawCountB++;
        } else {
            scoreB = scoreB + 3;
            winCountB++;
            loseCountA++;
        }
        
        
        
        
        
        if (c > d) {
            scoreA = scoreA + 3;
            winCountA++;
            loseCountC++;
        } else if (c == d) {
            scoreA++;
            scoreC++;
            drawCountA++;
            drawCountC++;
        } else {
            scoreC = scoreC + 3;
            winCountC++;
            loseCountA++;
        }
        
        
        
        
        
        if (e > f) {
            scoreA = scoreA + 3;
            winCountA++;
            loseCountD++;
        } else if (e == f) {
            scoreA++;
            scoreD++;
            drawCountA++;
            drawCountD++;
        } else {
            scoreD = scoreD + 3;
            winCountD++;
            loseCountA++;
        }
        
        
        
        
        
        
        if (g > h) {
            scoreB = scoreB + 3;
            winCountB++;
            loseCountC++;
        } else if (g == h) {
            scoreB++;
            scoreC++;
            drawCountB++;
            drawCountC++;
        } else {
            scoreC = scoreC + 3;
            winCountC++;
            loseCountB++;
        }
        
        
        
        
        
        if (k > l) {
            scoreB = scoreB + 3;
            winCountB++;
            loseCountD++;
        } else if (k == l) {
            scoreB++;
            scoreD++;
            drawCountB++;
            drawCountD++;
        } else {
            scoreD = scoreD + 3;
            winCountD++;
            loseCountB++;
        }
       
        
        
        
        
        if (m > n) {
            scoreC = scoreC + 3;
            winCountC++;
            loseCountD++;
        } else if (m == n) {
            scoreC++;
            scoreD++;
            drawCountC++;
            drawCountD++;
        } else {
            scoreD = scoreD + 3;
            winCountD++;
            loseCountC++;
        }
        
        
        goalsForA = a+c+e;
        goalAgainstA=b+d+f;
        int goalDifferenceA=0;
        goalDifferenceA = goalsForA - goalAgainstA;
        
        goalsForB = b+g+k;
        goalAgainstB= a+h+l;
        int goalDifferenceB=0;
        goalDifferenceB = goalsForB - goalAgainstB;
        
        goalsForC = d+h+m;
        goalAgainstC= c+g+n;
        int goalDifferenceC=0;
        goalDifferenceC = goalsForC - goalAgainstC;
        
        goalsForD = f+l+n;
        goalAgainstD= e+k+m;
        int goalDifferenceD=0;
        goalDifferenceD = goalsForD - goalAgainstD;
        
        
        
        System.out.println("TEAM | PLAYED | WIN COUNT | DRAW COUNT | LOSE COUNT | TOTAL SCORE | GOAL DIFFERENCE" );
        System.out.println("A" + "    |    3   |     " + winCountA + "     |     " + drawCountA + "      |     " + loseCountA + "      |      " + scoreA + "      |      " + goalDifferenceA);
        System.out.println("B" + "    |    3   |     " + winCountB + "     |     " + drawCountB + "      |     " + loseCountB + "      |      " + scoreB + "      |      " + goalDifferenceB);
        System.out.println("C" + "    |    3   |     " + winCountC + "     |     " + drawCountC + "      |     " + loseCountC + "      |      " + scoreC + "      |      " + goalDifferenceC);
        System.out.println("D" + "    |    3   |     " + winCountD + "     |     " + drawCountD + "      |     " + loseCountD + "      |      " + scoreD + "      |      " + goalDifferenceD);
        
        
        
        String[] teams = {"Team A", "Team B", "Team C", "Team D"};
        int[] totalPoints = {scoreA, scoreB, scoreC, scoreD};
        int[] goalDifferences = {goalDifferenceA, goalDifferenceB, goalDifferenceC, goalDifferenceD};

        int bestIndex = 0;
        
        for (int i = 1; i < 4; i++) {
            if (totalPoints[i] > totalPoints[bestIndex]) {
                bestIndex = i;
            } 
            else if (totalPoints[i] == totalPoints[bestIndex] && goalDifferences[i] > goalDifferences[bestIndex]) {
                bestIndex = i;
            }
        }

        System.out.println("\nTournament Champion: " + teams[bestIndex]);
    

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
