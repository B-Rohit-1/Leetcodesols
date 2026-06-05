class Solution {
    int num = 0;
    public int romanToInt(String s) {
        int num = 0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='I'){
                num+=1;
            }
            else if(s.charAt(i)== 'V' && i == 0 ){
                num+=5;
            }
            else if(s.charAt(i)== 'V' && s.charAt(i-1)!='I'){
                num+=5;
            }
            else if(s.charAt(i)== 'V' && s.charAt(i-1)=='I'){
                num = num + 3;
            }
            else if(s.charAt(i)== 'X' && i == 0 ){
                num+=10;
            }
            else if(s.charAt(i)== 'X' && (s.charAt(i-1)=='I')){
                num +=8 ;
            }
            else if(s.charAt(i)== 'X' && (s.charAt(i-1)!='I' )){
                num+=10;
            }
            else if(s.charAt(i)== 'L' && i == 0 ){
                num+=50;
            }
            else if(s.charAt(i)== 'L' && (s.charAt(i-1)=='X')){
                num +=30 ;
            }
            else if(s.charAt(i)== 'L' && (s.charAt(i-1)!='X')){
                num+=50;
            }
            else if(s.charAt(i)== 'C' && i == 0 ){
                num+=100;
            }
            else if(s.charAt(i)== 'C' && (s.charAt(i-1)=='X')){
                num +=80;
            }
            else if(s.charAt(i)== 'C' && (s.charAt(i-1)!='X')){
                num+=100;
            }
            else if(s.charAt(i)== 'D' && i == 0 ){
                num+=500;
            }
            else if(s.charAt(i)== 'D' && (s.charAt(i-1)=='C')){
                num +=300 ;
            }
            else if(s.charAt(i)== 'D' && (s.charAt(i-1)!='C')){
                num+=500;
            }
            else if(s.charAt(i)== 'M' && i == 0 ){
                num+=1000;
            }
            else if(s.charAt(i)== 'M' && s.charAt(i-1)=='C'){
                num +=800 ;
            }
            else if(s.charAt(i)== 'M' && (s.charAt(i-1)!='C')){
                num+=1000;
            }
        }
        return num;
    }
}