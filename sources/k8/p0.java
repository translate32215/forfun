package k8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.t;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final k2 f20399a;

    /* renamed from: b  reason: collision with root package name */
    public g f20400b;

    /* renamed from: c  reason: collision with root package name */
    public final c f20401c = new c();

    /* renamed from: d  reason: collision with root package name */
    public final t f20402d = new t(6);

    public p0() {
        k2 k2Var = new k2();
        this.f20399a = k2Var;
        this.f20400b = k2Var.f20288b.w();
        ((Map) k2Var.f20290d.f3445b).put("internal.registerCallback", new a(this, 0));
        ((Map) k2Var.f20290d.f3445b).put("internal.eventLogger", new a(this, 1));
    }

    public final void a(x3 x3Var) throws h1 {
        i iVar;
        String str;
        String str2;
        try {
            this.f20400b = this.f20399a.f20288b.w();
            if (!(this.f20399a.a(this.f20400b, (b4[]) x3Var.u().toArray(new b4[0])) instanceof g)) {
                for (v3 next : x3Var.s().v()) {
                    List<b4> u10 = next.u();
                    String t10 = next.t();
                    Iterator<b4> it = u10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o a10 = this.f20399a.a(this.f20400b, it.next());
                            if (a10 instanceof l) {
                                g gVar = this.f20400b;
                                if (!gVar.D(t10)) {
                                    iVar = null;
                                } else {
                                    o A = gVar.A(t10);
                                    if (!(A instanceof i)) {
                                        String valueOf = String.valueOf(t10);
                                        if (valueOf.length() != 0) {
                                            str2 = "Invalid function name: ".concat(valueOf);
                                        } else {
                                            str2 = new String("Invalid function name: ");
                                        }
                                        throw new IllegalStateException(str2);
                                    }
                                    iVar = (i) A;
                                }
                                if (iVar == null) {
                                    String valueOf2 = String.valueOf(t10);
                                    if (valueOf2.length() != 0) {
                                        str = "Rule function is undefined: ".concat(valueOf2);
                                    } else {
                                        str = new String("Rule function is undefined: ");
                                    }
                                    throw new IllegalStateException(str);
                                }
                                iVar.b(this.f20400b, Collections.singletonList(a10));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new h1(th);
        }
    }

    public final boolean b(b bVar) throws h1 {
        try {
            c cVar = this.f20401c;
            cVar.f20085a = bVar;
            cVar.f20086b = bVar.clone();
            cVar.f20087c.clear();
            this.f20399a.f20289c.C("runtime.counter", new h(Double.valueOf(0.0d)));
            this.f20402d.f(this.f20400b.w(), this.f20401c);
            c cVar2 = this.f20401c;
            if ((!cVar2.f20086b.equals(cVar2.f20085a)) || (!this.f20401c.f20087c.isEmpty())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new h1(th);
        }
    }
}
