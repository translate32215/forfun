package o8;

import com.google.android.gms.common.internal.i;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class t5 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23449a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23450b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f23451c;

    public /* synthetic */ t5(q3 q3Var, String str) {
        this.f23450b = q3Var;
        this.f23451c = str;
    }

    public final Object call() {
        switch (this.f23449a) {
            case 0:
                String str = ((b6) this.f23450b).f23131a;
                i.h(str);
                if (((u5) this.f23451c).L(str).g() && g.b(((b6) this.f23450b).D).g()) {
                    return ((u5) this.f23451c).J((b6) this.f23450b).N();
                }
                ((u5) this.f23451c).d().f8805n.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                q3 q3Var = (q3) this.f23450b;
                String str2 = (String) this.f23451c;
                j jVar = q3Var.f23413b.f23472c;
                u5.I(jVar);
                x3 E = jVar.E(str2);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str2);
                q3Var.f8864a.f8843g.q();
                hashMap.put("gmp_version", 43042L);
                if (E != null) {
                    String P = E.P();
                    if (P != null) {
                        hashMap.put("app_version", P);
                    }
                    hashMap.put("app_version_int", Long.valueOf(E.B()));
                    hashMap.put("dynamite_version", Long.valueOf(E.E()));
                }
                return hashMap;
        }
    }

    public t5(u5 u5Var, b6 b6Var) {
        this.f23451c = u5Var;
        this.f23450b = b6Var;
    }
}
