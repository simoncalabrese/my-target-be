package service;

import converter.SuperConverter;
import dao.BaseDao;

import javax.interceptor.ExcludeDefaultInterceptors;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * Created by simon on 18/12/16.
 */
@ExcludeDefaultInterceptors
public abstract class BaseService<T extends BaseDao> {

    protected abstract T getDao();

    public <I, O> O converter(final I input, final Function<I, O> converter) {
        return converter.apply(input);
    }

    public <I, O> List<O> collectionConverter(List<I> input, SuperConverter<I, O> converter) {
        return converter.applyToList(input);
    }
}
