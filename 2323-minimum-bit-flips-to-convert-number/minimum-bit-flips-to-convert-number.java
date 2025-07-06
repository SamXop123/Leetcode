class Solution {
    public int minBitFlips(int start, int goal) {
        
        if (start == goal) {return 0;}
        
        int xor = start ^ goal;
        int steps = 0;
        
        while (xor != 0) {
            int lastBit = xor & 1;
            if (lastBit == 1) {
                steps++;
            }
            xor = xor >> 1;
        }    
        return steps;
    }
}    


/*
!! EARLIER APPROACH

public String addZeros(String binaryStr, int targetLength) {
    while (binaryStr.length() < targetLength) {
        binaryStr = "0" + binaryStr;
    }
    return binaryStr;
}

public int minBitFlips(int start, int goal) {
   
    if(start==goal) {return 0;}
    
    int step = 0;

    String binaryStart = Integer.toBinaryString(start);
    String binaryGoal = Integer.toBinaryString(goal);

    if (binaryStart.length() > binaryGoal.length()) {
        binaryGoal = addZeros(binaryGoal, binaryStart.length());
    } else if (binaryGoal.length() > binaryStart.length()) {
        binaryStart = addZeros(binaryStart, binaryGoal.length());
    }  

    int num = start&goal;
    String binary = Integer.toBinaryString(num);
    binary = addZeros(binary, binaryStart.length());

    for(int i = 0; i < binary.length(); i++) {
        int bitMask = 1<<i;
        if((bitMask & num) == 0) {
            step++;
        }
    }
    return step;
}
    return step;
}

LMFAO
*/
