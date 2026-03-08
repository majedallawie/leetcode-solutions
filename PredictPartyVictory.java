public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        int r, d;
        r = d = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') r++;
            else d++;
        }
        StringBuilder s = new StringBuilder(senate);
        //     01234
        // s = DDDRR
        // r = 2
        // d = 3
        // i = 3
        for (int i = 0; d > 0 && r > 0; i++) {
            if (i >= s.length())
                i = 0;
            if (s.charAt(i) == 'R' && s.substring(i).contains("D")) {
                s.deleteCharAt(i + s.substring(i).indexOf("D"));
                d--;
            }
            else if (s.charAt(i) == 'R') {
                s.deleteCharAt(s.indexOf("D"));
                d--;
                i--;
            }
            else if (s.charAt(i) == 'D' && s.substring(i).contains("R")) {
                s.deleteCharAt(i + s.substring(i).indexOf("R"));
                r--;
            }
            else {
                s.deleteCharAt(s.indexOf("R"));
                r--;
                i--;
            }
        }
        if (r > 0)
            return "Radiant";
        else
            return "Dire";
    }
}
