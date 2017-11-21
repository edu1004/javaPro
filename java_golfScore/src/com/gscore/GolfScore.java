package com.gscore;

public class GolfScore {

    public static void main(String[] args) {
        int[] par = {5,4,4,4,3,5,3,4,4,5,4,3,4,5,4,4,3,4};
        int pSum = 0;
        for (int x : par) {
            pSum += x;
        }
        System.out.println("pSum:"+pSum);

        int[] score1 = { 1, 1, 0, 3, 2, 1, 3, 1, 1, 0, 4, 1, 2, 1, 1, 4, 0, 1 };
        int[] score2 = { 2, 1, 0, 1, 1, 0, 2, 3, 0, 3, 3, 0, 1, 3, 2, 2, 2, 1 };
        int[] score3 = { 2, 2, 2, 1, 0, 1, 0, 2, 0, 2, 2, 0, 2, 1, -1, 0, 1, 3 };
        int[] score4 = { 3, 2, 0, 2, 0, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 2 };

        int[] players = new int[4];
        
        int holeCount = 18, money = 2000, birdie = 5000;
        ////////////////////////////////////////////////////////////////
        int[][] scores = new int[players.length][holeCount];
        scores[0] = score1;
        scores[1] = score2;
        scores[2] = score3;
        scores[3] = score4;
        
        ////스코어 합계//////
        int[] playerScores = new int[]{72,72,72,72};
        
        for (int x = 0; x < scores.length; x++) {
            for (int i = 0; i < scores[x].length; i++) {
                playerScores[x] += scores[x][i];
            }
        }
        ////스코어 합계//////
        
        System.out.println("======================================");
        for (int x = 0; x < scores.length; x++) {
            for (int i = 0; i < scores[x].length; i++) {
                    System.out.print(scores[x][i] + " ");
            }
            System.out.println();
        }
        System.out.println("======================================");

        // 더블판 체크 저장용 배열생성//////////////////////////////
        System.out.println("====더블판 체크 저장용 배열생성 첫판은 민판============");
        boolean[] tripleNbirdie = new boolean[holeCount];
        boolean[] doublePan = new boolean[holeCount];
        for (int x = 0; x < holeCount; x++) {
            for (int i = 0; i < 4; i++) {
                if (scores[i][x] >= 3) {
                        tripleNbirdie[x] = true;
                        break;
                }
                if (scores[i][x] < 0) {
                        tripleNbirdie[x] = true;
                        break;
                }
            }
        }

        for (int i = 0; i < tripleNbirdie.length; i++) {
            if (i == 0)
                continue;
            if (tripleNbirdie[i - 1] == true)
                doublePan[i] = true;
        }
        for (int i = 0; i < tripleNbirdie.length; i++) {
            System.out.print(tripleNbirdie[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < doublePan.length; i++) {
            System.out.print(doublePan[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");

        ////계산 순서배열/////
        int[][] temps = new int[][] { { 1, 2, 3 }, { 2, 3, 0 }, { 3, 0, 1 }, { 0, 1, 2 } };
        //////////////////////////////////////////
        for (int y = 0; y < players.length; y++) {
            for (int x = 0; x < 18; x++) {
                String message = "[민판]";
                if (doublePan[x]) {
                        message = "[배판]";
                        money = 4000;
                } else {
                        money = 2000;
                }

                for (int i = 0; i < 3; i++) {
                        int minus = scores[y][x] - scores[temps[y][i]][x];
                        if (minus < 0) {
                                System.out.print(minus * -money + "\t");
                                players[y] += minus * -money;
                        }
                        if (minus > 0) {
                                System.out.print(minus * -money + "\t");
                                players[y] -= minus * money;
                        }
                        if (scores[y][x] == -1) {
                                System.out.print(birdie + "\t");
                                players[y] += birdie;
                        }
                        if (scores[temps[y][i]][x] == -1) {
                                System.out.print(-birdie + "\t");
                                players[y] -= birdie;
                        }
                }

                System.out.println();
                System.out.print(message);
                System.out.println(x + 1 + "-hole" + "[players[" + (y+1) + "]:" + players[y] + "]");
                System.out.println("------------------------------------");
            }
        }

        System.out.println("====결과==================================");
        int sum = 0;
        for (int y = 0; y < players.length; y++) {
                System.out.println(playerScores[y]+":players[" + (y+1) + "]:" + players[y]);
                sum += players[y];
        }
        System.out.println("sum:"+sum);

    }

}
