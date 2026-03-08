import java.util.ArrayList;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int left = 0, ptr = 1, skips = 0;
        while (ptr < asteroids.length) {
            // left is -
            if (asteroids[left] < 0) {
                left++;
                ptr = Math.max(ptr, left + 1);
            }
            // left is + / i is - / i > left / no skips
            else if (asteroids[ptr] < 0 && skips == 0 && Math.abs(asteroids[ptr]) > asteroids[left]) {
                asteroids[left] = 0;
                left = ptr + 1;
                ptr = left + 1;
            }
            // left is + / i is - / i > left / with skips
            else if (asteroids[ptr] < 0 && skips > 0 && Math.abs(asteroids[ptr]) > asteroids[left + skips]) {
                asteroids[left + skips] = 0;
                skips--;
            }
            // left is + / i is - / left > i / no skips
            else if (asteroids[ptr] < 0 && skips == 0 && asteroids[left] > Math.abs(asteroids[ptr])) {
                asteroids[ptr] = 0;
                ptr++;
            }
            // left is + / i is - / left > i / with skips
            else if (asteroids[ptr] < 0 && skips > 0 && asteroids[left + skips] > Math.abs(asteroids[ptr])) {
                asteroids[ptr] = 0;
                ptr++;
            }
            // left is + / i is - / left = i / no skips
            else if (asteroids[ptr] < 0 && skips == 0 && Math.abs(asteroids[ptr]) == asteroids[left]) {
                asteroids[left] = 0;
                asteroids[ptr] = 0;
                left = ptr + 1;
                ptr = left + 1;
            }
            // left is + / i is - / left = i / with skips
            else if (asteroids[ptr] < 0 && skips > 0 && asteroids[left + skips] == Math.abs(asteroids[ptr])) {
                asteroids[left + skips] = 0;
                asteroids[ptr] = 0;
                skips--;
                ptr++;
            }
            // left is + / i is +
            else if (asteroids[ptr] > 0) {
                skips++;
                ptr++;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < asteroids.length; i++)
            if (asteroids[i] != 0)
                list.add(asteroids[i]);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[3];
        System.out.println(s.asteroidCollision(arr));
    }    
}