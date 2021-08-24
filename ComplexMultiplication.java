class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] n1 = new int[2];
        int[] n2 = new int[2];
        getnum(n1,num1);
        getnum(n2,num2);
        int real = n1[0]*n2[0] - n1[1]*n2[1];
        int img = n1[0]*n2[1] + n1[1]*n2[0];
        return real+"+"+img+"i";
    }
    
    public void getnum(int[] num,String str){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(str.charAt(i) != '+'){
            sb.append(str.charAt(i));
            i++;
        }
            
        num[0] = Integer.parseInt(sb.toString());
        sb.setLength(0);
        i++;
        while(str.charAt(i) != 'i'){
            sb.append(str.charAt(i));
            i++;
        }
            
        num[1] = Integer.parseInt(sb.toString());
        return;
    }
    
    
}
