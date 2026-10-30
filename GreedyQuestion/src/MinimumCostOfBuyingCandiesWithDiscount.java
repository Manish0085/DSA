import java.util.Arrays;
import java.util.Map;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        if (cost.length == 1)
            return cost[0];
        if (cost.length == 2)
            return cost[0] + cost[1];
        Arrays.sort(cost);
        int minCost = 0;
        int idx = cost.length-1;
        while (idx >= 0) {
            int c1 = idx >= 0? cost[idx--]: 0;
            int c2 = idx >= 0? cost[idx--]: 0;
            if (idx >= 0 && cost[idx] <= Math.max(c1, c2))
                idx--;
            minCost += (c1 + c2);
        }

        return minCost;
    }
}
