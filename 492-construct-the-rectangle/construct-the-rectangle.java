class Solution {
    public int[] constructRectangle(int area) {
          int root = (int) Math.sqrt(area);

        for (int w = root; w >= 1; w--) {

            if (area % w == 0) {
                int l = area / w;

                return new int[]{l, w};
            }
        }

        return new int[]{area, 1};
    }
}