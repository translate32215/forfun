package la;

import java.util.Set;

/* compiled from: AbstractComponentContainer */
public abstract class a implements d {
    public <T> T a(Class<T> cls) {
        ua.a<T> c10 = c(cls);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
