package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        while (!checkContinuousCryptogram(cryptogram)) {
            cryptogram = decrypt(cryptogram);
        }
        return cryptogram;
    }

    private static boolean checkContinuousCryptogram(String cryptogram) {
        if (cryptogram.length() == 0) {
            return true;
        }
        for(int i=0; i<cryptogram.length()-1; i++) {
            if(cryptogram.charAt(i) == cryptogram.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    private static String decrypt(String cryptogram) {
        int begin =getDuplicateIndexOfBegin(cryptogram);
        int end =getDuplicateIndexOfEnd(cryptogram, begin);
        if (begin != 0) {
            return cryptogram.substring(0, begin) + cryptogram.substring(end);
        }
        return cryptogram.substring(end);
    }

    // 3. 중복일때 첫 인덱스 구하기
    private static int getDuplicateIndexOfBegin(String cryptogram) {

        for(int i = 0; i < cryptogram.length()-1 ; i++){
            if (cryptogram.charAt(i) == cryptogram.charAt(i+1)) {
                return i;
            }
        }
        return -1;
    }

    // 4. 중복일때 끝 인덱스 구하기
    private static int getDuplicateIndexOfEnd(String cryptogram, int begin) {
        int end;
        for ( end = begin + 1 ; end < cryptogram.length(); end ++ ){
            if ((cryptogram.charAt(begin) != cryptogram.charAt(end))) {
                break;
            }
        }
        return end;
    }
}
