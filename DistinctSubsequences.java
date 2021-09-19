class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] data = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(data[i],-1);
        }
        for(int i = 0;i<=n;i++)
            data[i][0] = 1;
        for(int i = 1;i<= m;i++)
            data[0][i] = 0;
        return getans(s,t,s.length(),t.length(),data);
        
    }
    
    public int getans(String str1,String str2,int i,int j,int[][] data){
        if(data[i][j] != -1)
            return data[i][j];
        if(str1.charAt(i-1) == str2.charAt(j-1)){
              data[i][j] = getans(str1,str2,i-1,j-1,data) + getans(str1,str2,i-1,j,data);
        }else{
            data[i][j] = getans(str1,str2,i-1,j,data);
        }
        
        return data[i][j];
    }
}
