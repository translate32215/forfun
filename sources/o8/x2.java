package o8;

import android.os.Bundle;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import q.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class x2 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference<String[]> f23571b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<String[]> f23572c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<String[]> f23573d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public final v3 f23574a;

    public x2(v3 v3Var) {
        this.f23574a = v3Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        if (atomicReference != null) {
            i.a(strArr.length == strArr2.length);
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (r.Y(str, strArr[i10])) {
                    synchronized (atomicReference) {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    }
                    return str2;
                }
            }
            return str;
        }
        throw new NullPointerException("null reference");
    }

    public final String a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder a10 = a.a("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (a10.length() != 1) {
                    a10.append(", ");
                }
                a10.append(str);
            }
        }
        a10.append("]");
        return a10.toString();
    }

    public final String b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f23574a.a()) {
            return bundle.toString();
        }
        StringBuilder a10 = a.a("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (a10.length() != 8) {
                a10.append(", ");
            }
            a10.append(e(str2));
            a10.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            a10.append(str);
        }
        a10.append("}]");
        return a10.toString();
    }

    public final String c(r rVar) {
        String str;
        if (!this.f23574a.a()) {
            return rVar.toString();
        }
        StringBuilder a10 = a.a("origin=");
        a10.append(rVar.f23416c);
        a10.append(",name=");
        a10.append(d(rVar.f23414a));
        a10.append(",params=");
        p pVar = rVar.f23415b;
        if (pVar == null) {
            str = null;
        } else if (!this.f23574a.a()) {
            str = pVar.toString();
        } else {
            str = b(pVar.i());
        }
        a10.append(str);
        return a10.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f23574a.a()) {
            return str;
        }
        return g(str, e4.f23178c, e4.f23176a, f23571b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f23574a.a()) {
            return str;
        }
        return g(str, f4.f23202b, f4.f23201a, f23572c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f23574a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return b.a("experiment_id(", str, ")");
        }
        return g(str, g4.f23220b, g4.f23219a, f23573d);
    }
}
