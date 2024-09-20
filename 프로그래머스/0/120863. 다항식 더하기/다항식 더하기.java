class Solution {
    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");

        int xNum = 0;
        int normalNumber = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("x")) {
                if (strArr[i].length() == 1) {
                    xNum++;
                    continue;
                }
                xNum += Integer.parseInt(strArr[i].substring(0, strArr[i].length() - 1));
            }
            else if (!strArr[i].equals("+")) {
                normalNumber += Integer.parseInt(strArr[i]);
            }
        }

        if (xNum == 0) {
            return normalNumber + "";
        }
        else if (normalNumber == 0) {
            String strXNum = xNum + "";
            return strXNum.equals("1") ? "x" : strXNum + "x";
        }
        else {
            String strXNum = xNum + "";
            String strNormalNumber = normalNumber + "";
            return strXNum.equals("1") ? "x" + " " + "+" + " " + strNormalNumber : strXNum + "x" + " " + "+" + " " + strNormalNumber;
        }
    }
}