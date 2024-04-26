package o1;

import android.annotation.SuppressLint;
import android.support.v4.media.a;
import java.util.LinkedHashMap;
import java.util.Map;
import o1.d0;
import q.b;
import ud.k;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* compiled from: NavigatorProvider.kt */
public class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f22676b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<?>, String> f22677c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d0<? extends r>> f22678a = new LinkedHashMap();

    public static final String b(Class<? extends d0<?>> cls) {
        Map<Class<?>, String> map = f22677c;
        String str = (String) ((LinkedHashMap) map).get(cls);
        if (str == null) {
            d0.b bVar = (d0.b) cls.getAnnotation(d0.b.class);
            str = bVar != null ? bVar.value() : null;
            if (d(str)) {
                map.put(cls, str);
            } else {
                StringBuilder a10 = a.a("No @Navigator.Name annotation found for ");
                a10.append(cls.getSimpleName());
                throw new IllegalArgumentException(a10.toString().toString());
            }
        }
        k.c(str);
        return str;
    }

    public static final boolean d(String str) {
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final d0<? extends r> a(d0<? extends r> d0Var) {
        String b10 = b(d0Var.getClass());
        if (d(b10)) {
            d0 d0Var2 = this.f22678a.get(b10);
            if (k.a(d0Var2, d0Var)) {
                return d0Var;
            }
            boolean z10 = false;
            if (d0Var2 != null && d0Var2.f22668b) {
                z10 = true;
            }
            if (!(!z10)) {
                throw new IllegalStateException(("Navigator " + d0Var + " is replacing an already attached " + d0Var2).toString());
            } else if (!d0Var.f22668b) {
                return this.f22678a.put(b10, d0Var);
            } else {
                throw new IllegalStateException(("Navigator " + d0Var + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    public <T extends d0<?>> T c(String str) {
        k.f(str, "name");
        if (d(str)) {
            T t10 = (d0) this.f22678a.get(str);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException(b.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
