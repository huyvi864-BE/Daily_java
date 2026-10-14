import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max_candy = 0;
        for (int candy : candies){
            max_candy = Math.max(max_candy, candy);
        }
        for (int candy : candies){
            if(candy + extraCandies >= max_candy){
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}