public class nineTimes {
    
    public int getAnswer(int x){
        int answer = 0;
        int constVarInc = -1;
        int constVarDec = 10;
        int counter = 0;

        for(int i =1; i<=x; i++){
            constVarDec = constVarDec -1;
            constVarInc = constVarInc +1;
            if(constVarDec == -1){
                constVarDec = 9;
            } // This will handle the reset of Dec
            if(i%10 == 1){
                constVarInc = 9 * counter;
                counter ++;
            } // handles the remainder of i if %10
            String stringValOne = Integer.toString(constVarInc);
            String stringValTwo = Integer.toString(constVarDec);
            answer = Integer.parseInt(stringValOne + stringValTwo);
            
        }

        return answer;

    }
}


/*
09
18
27
36
45
54
63
72
81
90
99 - 21 --31 -- 41 <This happens only when i%10 == 1 > 
108
117
*/
