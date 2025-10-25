package split;

import org.domain.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EqualSplitStrategy implements SplitStrategy{
    @Override
    public List<Split> calculateSplits(double amount, List<User> users, Map<String, Double> metadata) {
        double share = amount / users.size();
        return users.stream().map(
                u -> new EqualSplit(u, share))
                .collect(Collectors.toList());
    }
}
