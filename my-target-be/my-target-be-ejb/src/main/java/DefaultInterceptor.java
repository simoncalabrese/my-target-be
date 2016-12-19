
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Created by simon on 19/12/16.
 */
@Interceptor
@annotation.DefaultInterceptor
public class DefaultInterceptor {
    /**
     * Message Prefix.
     */
    private static final String MESSAGE_PREFIX = "babel-it-be-ejb";

    /**
     * Timer log for all Bean methods.
     *
     * @param ctx Invocation context.
     * @return Invocation method result.
     * @throws Exception An error occurred.
     * @since 2015-09-24
     */
    @AroundInvoke
    public Object methodLogger(final InvocationContext ctx) throws Exception {
        try {
            return ctx.proceed();
        } catch (Exception e) {
            throw e;
        }
    }
}
