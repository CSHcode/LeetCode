class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int curr = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
         switch (s.charAt(i)) {
             case 'M': curr = 1000; break;
             case 'D': curr = 500; break;
             case 'C': curr = 100; break;
             case 'L': curr = 50; break;
             case 'X': curr = 10; break;
             case 'V': curr = 5; break;
             case 'I': curr = 1; break;
        }
        if (curr < prev) {
            answer -= curr;
        }
        else {
            answer += curr;
        }
        prev = curr;
    }
    return answer;
    }
}
