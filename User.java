package com.elias.beans;

import java.util.Scanner;

public class User {
    Scanner s = new Scanner(System.in);
    int row,col;
    int chesspiece;

    //选择棋子种类(弃用）
//    public void chooseChess() {
//        int playerone, playertwo;
//        do {
//            System.out.printf("The first player choose chess(1 or -1):");
//            playerone = s.nextInt();
//        } while (!(playerone == 1) || playerone == -1);
//        if (playerone == 1) {
//            playertwo = -1;
//            System.out.printf("The first player use 1,The second player use -1");
//        } else {
//            playertwo = 1;
//            System.out.println("The first player use -1,The second player use 1");
//        }
//    }

    //选择棋子位置
    public void chessPlace(int chesspiece){
        do {
            System.out.printf("Enter a row (1,2,3) for player %d",chesspiece);
            row = s.nextInt() -1;
            s.nextLine();
        }while(row<0||row>2);
        do{
            System.out.printf("Enter a row (1,2,3) for player %d",chesspiece);
            col = s.nextInt() - 1;
            s.nextLine();
        }while(col<0||col>2);
        this.chesspiece = chesspiece;
    }

    //选择是否开始下一局
    public boolean reStart(){
        Scanner s = new Scanner(System.in);
        String flag;
        System.out.printf("Do you want a new game?(Y or N):");
        flag = s.nextLine();
        s.close();
        if (flag.equals("Y")||flag.equals("y")) return true;
        else return false;
    }
}
