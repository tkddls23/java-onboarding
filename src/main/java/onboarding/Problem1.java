package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!checkPageRange(pobi, crong) || !checkPageSequence(pobi, crong)) {
            return -1;
        }
        int pobiMaxNumber = getMaxNumber(pobi);
        int crongMaxNumber = getMaxNumber(crong);

        return getWinner(pobiMaxNumber, crongMaxNumber);
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

    private static int getMaxNumber(List<Integer> page) {
        int pageMaxSumNumber = Math.max(addPageNumber(page.get(0)), addPageNumber(page.get(1)));
        int pageMaxProductNumber = Math.max(multiplyPageNumber(page.get(0)), multiplyPageNumber(page.get(1)));

        return Math.max(pageMaxSumNumber, pageMaxProductNumber);
    }

    private static int addPageNumber(int pageNumber) {
        int sum = 0;
        while (pageNumber != 0){
            sum += (pageNumber % 10);
            pageNumber /= 10;
        }
        return sum;
    }

    private static int multiplyPageNumber(int pageNumber) {
        int product = 1;
        while (pageNumber != 0){
            product *= (pageNumber % 10);
            pageNumber /= 10;
        }
        return product;
    }

    private static int getWinner(int pobiMaxNumber, int crongMaxNumber) {
        if (pobiMaxNumber == crongMaxNumber) {
            return 0;
        }
        if (Math.max(pobiMaxNumber, crongMaxNumber) == pobiMaxNumber) {
            return 1;
        }
        return 2;
    }
}