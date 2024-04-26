package z9;

import android.app.Activity;
import android.content.Context;
import z9.l;
import z9.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28739a;

    static {
        a aVar;
        try {
            aVar = (a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(a.class).newInstance();
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException(e11);
        } catch (ClassNotFoundException unused) {
            aVar = new b();
        }
        f28739a = aVar;
    }

    public abstract c a(Context context, String str, l.a aVar, l.b bVar);

    public abstract e b(Activity activity, c cVar, boolean z10) throws o.a;
}
