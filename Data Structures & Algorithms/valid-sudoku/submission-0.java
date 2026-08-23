class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=board.length;
        int col =board[0].length;
    boolean flag = true;
        for(int i=0;i<9;i++){
            //row fixed
            if(!isValid(board,i,i,0,8))  {
                flag=false;
                break;
            };

            //col fixed
            if(!isValid(board,0,8,i,i)){
                flag=false;
                break;
            };
        }
          
         
        return (
         isValid(board,0,2,0,2)&&
         isValid(board,0,2,3,5)&&
         isValid(board,0,2,6,8)&&

         isValid(board,3,5,0,2)&&
         isValid(board,3,5,3,5)&&
         isValid(board,3,5,6,8)&&

         isValid(board,6,8,0,2)&&
         isValid(board,6,8,3,5)&&
         isValid(board,6,8,6,8)&&
         
         flag
        );
    
    }
   
    public boolean isValid(char[][] board,int r1,int r2,int c1,int c2){
        HashSet<Character> set = new HashSet<>();
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){

                if(board[i][j]=='.'){
                    continue;
                }else if('1'<=board[i][j] && board[i][j]<='9'){
                        if(!set.contains(board[i][j])){
                            set.add(board[i][j]);
                        }else{
                            return false;
                        }
                }else{
                    return false;
                }

            }
        }

        return true;
        
    }
}