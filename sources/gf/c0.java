package gf;

import android.support.v4.media.a;
import ud.k;

/* compiled from: typeDisp.kt */
public final class c0 extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f18656a = new c0();

    public String a(Class<?> cls, boolean z10) {
        if (cls.isArray()) {
            StringBuilder a10 = a.a("Array<");
            Class<?> componentType = cls.getComponentType();
            k.b(componentType, "cls.componentType");
            a10.append(f0.c(this, componentType, false, 2, (Object) null));
            a10.append(">");
            return a10.toString();
        }
        String a11 = b8.a.a(cls);
        if (a11 != null) {
            return a11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b8.a.i(cls));
        sb2.append(!z10 ? b8.a.b(cls) : "");
        return sb2.toString();
    }
}
