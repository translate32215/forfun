package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.un;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vi {

    /* renamed from: a  reason: collision with root package name */
    public final rn f8366a;

    public vi(rn rnVar) {
        this.f8366a = rnVar;
    }

    public final String toString() {
        rn rnVar = this.f8366a;
        int i10 = hj.f6885a;
        un.b A = un.A();
        int y10 = rnVar.y();
        if (A.f5971c) {
            A.n();
            A.f5971c = false;
        }
        un.y((un) A.f5970b, y10);
        for (rn.b next : rnVar.z()) {
            un.a.C0086a C = un.a.C();
            String B = next.B().B();
            if (C.f5971c) {
                C.n();
                C.f5971c = false;
            }
            un.a.B((un.a) C.f5970b, B);
            ln y11 = next.y();
            if (C.f5971c) {
                C.n();
                C.f5971c = false;
            }
            un.a.z((un.a) C.f5970b, y11);
            Cdo z10 = next.z();
            if (C.f5971c) {
                C.n();
                C.f5971c = false;
            }
            un.a.A((un.a) C.f5970b, z10);
            int C2 = next.C();
            if (C.f5971c) {
                C.n();
                C.f5971c = false;
            }
            un.a.y((un.a) C.f5970b, C2);
            un.a aVar = (un.a) ((aq) C.j());
            if (A.f5971c) {
                A.n();
                A.f5971c = false;
            }
            un.z((un) A.f5970b, aVar);
        }
        return ((un) ((aq) A.j())).toString();
    }
}
