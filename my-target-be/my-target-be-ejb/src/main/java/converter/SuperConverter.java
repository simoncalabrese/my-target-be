package converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by simon on 18/12/16.
 */
public interface SuperConverter<A,B> extends Function<A,B> {

    default Collection<B> applyToList(Collection<A> input) {
        return input
                .stream()
                .map(this)
                .collect(Collectors.toList());
    }
}
