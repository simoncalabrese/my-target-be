package service;

import converter.SuperConverter;
import dao.BaseDao;

import java.util.Collection;
import java.util.function.Function;
import javax.interceptor.ExcludeDefaultInterceptors;

/**
 * Created by simon on 18/12/16.
 */
@ExcludeDefaultInterceptors
public class BaseService<T extends BaseDao> {

    public <I, O> O converter(final I input, final Function<I, O> converter) {
        return converter.apply(input);
    }

    public <I, O> Collection<O> collectionConverter(Collection<I> input, SuperConverter<I, O> converter) {
        return converter.applyToList(input);
    }
}
