class TicTacToe{
    char [][] board;
    public TicTacToe(){
        board=new char [3][3];
        space();
    }
    void space(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';

            }

        }
    }
    void display(){
        System.out.println(" -------------");
        for(int i=0;i<board.length;i++){
            System.out.print(" | ");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println(" -------------");

        }

    }
    void placeMark(int row,int col,char mark){
        if (row>=0 && row<=2 && col>=0 && col<=2){
        board[row][col]=mark;
        }
        else{
            System.out.println("invalid brother");
        }

    }
    boolean colwin(){
        for(int j=0;j<=2;j++){
            if(board[0][j] != ' ' &&board[0][j] == board[1][j] && board[1][j] == board[2][j]){
                return true;

            }

        }
        return false;
    }
    boolean rowWin(){
        for(int i=0;i<=2;i++){
            if(board[i][0]!=' ' &&board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;

            }

        }
        return false;
    }
    void  daiWin(){
        if(board[0][0]!=' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]||
        board[0][2]!= ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            System.out.println("won daigonally");
        }
        else{
        System.out.println("llol");
    }
}
    

}

class Simple{  
    public static void main(String args[]){  
        TicTacToe t=new TicTacToe();
       
        t.display();
        t.placeMark(0, 0,'X');
        t.placeMark(0, 1,'O');
        t.placeMark(1, 1,'X');
        t.placeMark(1, 2,'O');
        t.placeMark(2, 2,'X');

       t.display();
       t.daiWin();
    
    }  
}  