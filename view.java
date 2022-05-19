package com.elias.view;

import com.elias.beans.Board;

public class view {
    public static void main(String[] args) {
    while(true){
        int i = 0;
        Board b = new Board();
//        b.player.chooseChess();
        b.printBoard();
        while(b.isFinish()!=1||b.isFinish()!=2||b.isFinish()!=-1){
            if(b.isFinish()==1){
                System.out.println("Player one wins");
                break;
            }
            if(b.isFinish()==2){
                System.out.println("Player two wins");
                break;
            }
            if(b.isFinish()==-1){
                System.out.println("No one wins the game");
                break;
            }

            if(b.getChessnum()%2==0) {
                boolean judge = b.putChess(-1);
                if(!judge) continue;
            }
            else{
                boolean judge = b.putChess(1);
                if(!judge) continue;
            }
            i++;
            b.setChessnum(i);
            b.printBoard();

        }
        if(!b.player.reStart()){
            System.out.println("Game over!");
            break;
        }
    }
}
}
