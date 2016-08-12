import java.util.Map;
import java.util.TreeMap;

public class RandomSelector {

    public int selectNumber(double[] probability, double random) throws Exception {
        Map<Double, Integer> map = new TreeMap<Double, Integer>();

        for (int index = 0; index < probability.length; index++) {
            map.put(probability[index], index);
        }

        double cumulativeProbability = 0.0;

        for (Map.Entry entry : map.entrySet()) {
            cumulativeProbability += (Double)entry.getKey();
            if (random <= cumulativeProbability)
                return (Integer) entry.getValue();
        }

        throw new Exception("Unable to find the array index for that number");
    }

}
