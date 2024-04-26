package r7;

import android.os.Bundle;
import s8.h;
import s8.i;
import s8.l;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class t implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f24732a = new t();

    public final i f(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = d.f24687h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return l.e(null);
        }
        return l.e(bundle);
    }
}
