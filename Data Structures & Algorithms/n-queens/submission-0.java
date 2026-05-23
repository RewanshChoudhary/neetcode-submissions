

class Solution {
    List<List<String>> lst =new ArrayList<>();
    char [] [] board;

    public List<List<String>> solveNQueens(int n) {
        lst=new ArrayList<>();
        board=new char[n][n];

        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';

            }
        }    
        backtrack(0,n);
        return lst;


    }
    public void backtrack(int r , int n){
        if (r == n) {
            List<String> curr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                curr.add(new String(board[i]));
            }

            lst.add(curr);
            return;
        }
        for (int i =0;i<n;i++){
            if (isOkay(r,i,n)){
                board[r][i]='Q';
                backtrack(r+1,n);
                board[r][i]='.';

            }
        }}
        public boolean isOkay(int r ,int c,int n){
          for (int i=0;i<r;i++){
            if (board[i][c]=='Q') return false ;

          }
          int i=r-1;
          int j=c-1;
          while (i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
           
           i--;
           j--;


        }
        i=r-1;
        j=c+1;
        while (i>=0  && j<n){
            if (board[i][j]=='Q') return false;
            i--;
            j++;
            
        

        }
        return true;


        }

    
}