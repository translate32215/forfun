package e8;

import a7.j;
import com.google.android.gms.internal.ads.l0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    public final j.b f14355a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a f14356b;

    /* renamed from: c  reason: collision with root package name */
    public j f14357c;

    public e2(j.b bVar, j.a aVar) {
        this.f14355a = bVar;
        this.f14356b = aVar;
    }

    public static j a(e2 e2Var, l0 l0Var) {
        j jVar;
        synchronized (e2Var) {
            jVar = e2Var.f14357c;
            if (jVar == null) {
                jVar = new z1(l0Var);
                e2Var.f14357c = jVar;
            }
        }
        return jVar;
    }
}
