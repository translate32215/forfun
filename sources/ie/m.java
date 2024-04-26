package ie;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

public final /* synthetic */ class m {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new l[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
