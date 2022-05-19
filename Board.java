package com.elias.beans;

public class Board {
    int[][] mtr = new int[3][3] ;
    private int chessnum = 0;
    public User player = new User();

    //初始化
    public Board(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mtr[i][j] = 0;
            }
        }
    }

    //打印棋盘
    public void printBoard(){
        for (int i=0;i<3;i++){
            System.out.println("---------------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.printf("|  %d  ",mtr[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------------------------------");
    }
    //判断棋局是否结束，若结束且User1赢，返回1，User2赢返回2，平局返回-1，未结束返,0
    public int isFinish(){
        for (int i = 0; i < 3; i++) {
            if(mtr[i][0]+mtr[i][1]+mtr[i][2]==3) {

                return 1;
            }
            if(mtr[i][0]+mtr[i][1]+mtr[i][2]==-3){

                return 2;
            }
        }
        for(int j=0;j<3;j++){
            if(mtr[0][j]+mtr[1][j]+mtr[2][j]==3){

                return 1;
            }
            if(mtr[0][j]+mtr[1][j]+mtr[2][j]==-3){

                return 2;
            }
        }
        if(mtr[0][0]+mtr[1][1]+mtr[2][2]==3||mtr[0][2]+mtr[1][1]+mtr[2][0]==3){

            return 1;
        }
        if(mtr[0][0]+mtr[1][1]+mtr[2][2]==-3||mtr[0][2]+mtr[1][1]+mtr[2][0]==-3){

            return 2;
        }

        if(chessnum==9) return -1;

        return 0;



    }

    //判断棋子位置是否合法
    public boolean judgement(int row,int col){
        if(mtr[row][col]!=0) return false;
        else if(row>2||col>2||row<0||col<0) return  false;
        else return true;
    }

    //放置棋子
    public boolean putChess(int chess){
        player.chessPlace(chess);
        if (judgement(player.row,player.col)){
            mtr[player.row][player.col] = player.chesspiece;
            return true;
        }
        else {
            System.out.println("This position has been taken up,please choose another!");
            return false;
        }
    }
    public int getChessnum() {
        return chessnum;
    }

    public void setChessnum(int number) {
                this.chessnum = number;
            }
}
