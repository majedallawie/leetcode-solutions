

public class Segmentation {
    public static void main(String[] args) {
        String epsString = "1018-1020 1024-1025. 1045-1046. 1053-1054: 1059-1060 1071-1072. 1077-1079: 1093-1094 1135-1136.";
        
        String finalResult = "";
        int countOfEps = 0;
        String currStr = "";
        int startNum = -1;
        int endNum = -1;

        for (int i = 0; i < epsString.length(); i++) {
            if (tryParse(epsString.charAt(i) + "") >= 0) {
                currStr += epsString.charAt(i);
            }
            else if (epsString.charAt(i) == '-') {
                startNum = Integer.parseInt(currStr);
                currStr = "";
                endNum = -1;
            }
            else {
                endNum = tryParse(currStr);
                if (endNum >= 0 && startNum >= 0) {
                    countOfEps += (endNum - startNum) + 1;
                    finalResult += startNum + "-" + endNum + "\n";
                }
                else if (endNum >= 0) {
                    countOfEps++;
                    finalResult += endNum + "\n";
                }
                currStr = "";
                startNum = -1;
                endNum = -1;
            }
        }
        System.out.println(finalResult);
        System.out.println("Total eps = " + countOfEps);
    }

    public static int tryParse(String s) {
        try {
            int x = Integer.parseInt(s);
            return x;
        }
        catch(NumberFormatException e) {
            return -1;
        }
    }
}
