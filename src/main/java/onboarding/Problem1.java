package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        if (!checkPageRange(pobi, crong) || !checkPageSequence(pobi, crong)) {
            return -1;
        }
        return answer;
    }

    private static Boolean checkPageRange(List<Integer> pobi, List<Integer> crong) {
        if (pobi.get(0) > 1 && pobi.get(1) < 400 && crong.get(0) > 1 && crong.get(1) < 400) {
            return true;
        }
        return false;
    }

    private static Boolean checkPageSequence(List<Integer> pobi, List<Integer> crong) {
        if ((pobi.get(1) - pobi.get(0)) == 1 && (crong.get(1) - crong.get(0)) == 1) {
            return true;
        }
        return false;
    }
}