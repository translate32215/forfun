package com.google.android.gms.internal.ads;

import e8.gc0;
import e8.hc0;
import e8.se0;
import e8.vb0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import k3.b;
import u6.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class eu implements du {

    /* renamed from: a  reason: collision with root package name */
    public final du[] f6328a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<du> f6329b;

    /* renamed from: c  reason: collision with root package name */
    public final hc0 f6330c = new hc0();

    /* renamed from: d  reason: collision with root package name */
    public se0 f6331d;

    /* renamed from: e  reason: collision with root package name */
    public gc0 f6332e;

    /* renamed from: f  reason: collision with root package name */
    public Object f6333f;

    /* renamed from: g  reason: collision with root package name */
    public int f6334g = -1;

    /* renamed from: h  reason: collision with root package name */
    public b f6335h;

    public eu(du... duVarArr) {
        this.f6328a = duVarArr;
        this.f6329b = new ArrayList<>(Arrays.asList(duVarArr));
    }

    public final cu a(int i10, f fVar) {
        int length = this.f6328a.length;
        cu[] cuVarArr = new cu[length];
        for (int i11 = 0; i11 < length; i11++) {
            cuVarArr[i11] = this.f6328a[i11].a(i10, fVar);
        }
        return new fu(cuVarArr);
    }

    public final void b() throws IOException {
        b bVar = this.f6335h;
        if (bVar == null) {
            for (du b10 : this.f6328a) {
                b10.b();
            }
            return;
        }
        throw bVar;
    }

    public final void c(cu cuVar) {
        fu fuVar = (fu) cuVar;
        int i10 = 0;
        while (true) {
            du[] duVarArr = this.f6328a;
            if (i10 < duVarArr.length) {
                duVarArr[i10].c(fuVar.f6497a[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        for (du e10 : this.f6328a) {
            e10.e();
        }
    }

    public final void f(vb0 vb0, boolean z10, se0 se0) {
        this.f6331d = se0;
        int i10 = 0;
        while (true) {
            du[] duVarArr = this.f6328a;
            if (i10 < duVarArr.length) {
                duVarArr[i10].f(vb0, false, new se(this, i10));
                i10++;
            } else {
                return;
            }
        }
    }
}
