package e8;

import a7.b;
import a7.k;
import android.content.Context;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.dd;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.ux;
import com.google.android.gms.internal.ads.y0;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.ads.zx;
import java.util.ArrayList;
import s4.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mv extends zx {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15552a;

    /* renamed from: b  reason: collision with root package name */
    public final b8 f15553b;

    /* renamed from: c  reason: collision with root package name */
    public final y00 f15554c;

    /* renamed from: d  reason: collision with root package name */
    public final i f15555d = new i();

    /* renamed from: e  reason: collision with root package name */
    public rx f15556e;

    public mv(b8 b8Var, Context context, String str) {
        y00 y00 = new y00();
        this.f15554c = y00;
        this.f15553b = b8Var;
        y00.f17548d = str;
        this.f15552a = context;
    }

    public final void B2(b bVar) {
        y00 y00 = this.f15554c;
        y00.f17555k = bVar;
        if (bVar != null) {
            y00.f17550f = bVar.f126a;
        }
    }

    public final void D5(z1 z1Var) {
        y00 y00 = this.f15554c;
        y00.f17559o = z1Var;
        y00.f17549e = new h(false, true, false);
    }

    public final ux K5() {
        i iVar = this.f15555d;
        iVar.getClass();
        qn qnVar = new qn(iVar, (g) null);
        y00 y00 = this.f15554c;
        ArrayList<String> arrayList = new ArrayList<>();
        if (qnVar.f16185c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (qnVar.f16183a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (qnVar.f16184b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (qnVar.f16188f.f24851c > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (qnVar.f16187e != null) {
            arrayList.add(Integer.toString(7));
        }
        y00.f17551g = arrayList;
        y00 y002 = this.f15554c;
        ArrayList<String> arrayList2 = new ArrayList<>(qnVar.f16188f.f24851c);
        int i10 = 0;
        while (true) {
            s.i<String, y0> iVar2 = qnVar.f16188f;
            if (i10 >= iVar2.f24851c) {
                break;
            }
            arrayList2.add(iVar2.h(i10));
            i10++;
        }
        y002.f17552h = arrayList2;
        y00 y003 = this.f15554c;
        if (y003.f17546b == null) {
            y003.f17546b = li0.j();
        }
        return new dd(this.f15552a, this.f15553b, this.f15554c, qnVar, this.f15556e);
    }

    public final void N2(n1 n1Var) {
        this.f15554c.f17553i = n1Var;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jd.a<p4.d>, com.google.android.gms.internal.ads.o0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P4(com.google.android.gms.internal.ads.o0 r2) {
        /*
            r1 = this;
            s4.i r0 = r1.f15555d
            r0.f24945b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mv.P4(com.google.android.gms.internal.ads.o0):void");
    }

    public final void R3(String str, y0 y0Var, t0 t0Var) {
        i iVar = this.f15555d;
        ((s.i) iVar.f24949f).put(str, y0Var);
        ((s.i) iVar.f24950g).put(str, t0Var);
    }

    public final void R4(rx rxVar) {
        this.f15556e = rxVar;
    }

    public final void S4(ui0 ui0) {
        this.f15554c.f17547c = ui0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.c2, jd.a<java.util.concurrent.Executor>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U1(com.google.android.gms.internal.ads.c2 r2) {
        /*
            r1 = this;
            s4.i r0 = r1.f15555d
            r0.f24948e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mv.U1(com.google.android.gms.internal.ads.c2):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jd.a<android.content.Context>, com.google.android.gms.internal.ads.s0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c3(com.google.android.gms.internal.ads.s0 r2) {
        /*
            r1 = this;
            s4.i r0 = r1.f15555d
            r0.f24944a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mv.c3(com.google.android.gms.internal.ads.s0):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.b1, jd.a<s4.k>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h2(com.google.android.gms.internal.ads.b1 r2, e8.li0 r3) {
        /*
            r1 = this;
            s4.i r0 = r1.f15555d
            r0.f24947d = r2
            e8.y00 r2 = r1.f15554c
            r2.f17546b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mv.h2(com.google.android.gms.internal.ads.b1, e8.li0):void");
    }

    public final void w3(k kVar) {
        y00 y00 = this.f15554c;
        y00.f17556l = kVar;
        if (kVar != null) {
            y00.f17550f = kVar.f145a;
            y00.f17557m = kVar.f146b;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jd.a<t4.c>, com.google.android.gms.internal.ads.f1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w5(com.google.android.gms.internal.ads.f1 r2) {
        /*
            r1 = this;
            s4.i r0 = r1.f15555d
            r0.f24946c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mv.w5(com.google.android.gms.internal.ads.f1):void");
    }
}
