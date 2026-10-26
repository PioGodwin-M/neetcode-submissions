class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] arr;
        
        for(int i=0;i<9;i++){
            arr=new int[10];
            for(int j=0;j<9;j++){
                char v=board[i][j];
                if(v=='.') continue;
               
                if(arr[v-'0']!=0) return false;
                arr[v-'0']=1;
            }
        }
       int n=9;
        for(int i=0;i<9;i++){
            arr=new int[10];
            for(int j=0;j<9;j++){
                   char v=board[j][i];
                if(v=='.') continue;
                if(arr[v-'0']!=0) return false;
                arr[v-'0']=1;
            }
        }
        for(int a=0;a<n;a=a+3){
            for(int b=0;b<n;b+=3){

        arr=new int[10];

                     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                   char v=board[a+i][b+j];
                if(v=='.') continue;
                if(arr[v-'0']!=0) return false;
                arr[v-'0']=1;
            }
            
        }
            }
        }
        return true;
    }
}
