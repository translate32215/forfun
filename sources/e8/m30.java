package e8;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.a;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.j4;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.sf;
import java.util.concurrent.Executor;
import s8.i;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class m30 {

    /* renamed from: a  reason: collision with root package name */
    public Object f15451a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15452b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15453c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15454d;

    /* renamed from: e  reason: collision with root package name */
    public Object f15455e;

    /* renamed from: f  reason: collision with root package name */
    public Object f15456f;

    /* renamed from: g  reason: collision with root package name */
    public i<ma> f15457g;

    /* renamed from: h  reason: collision with root package name */
    public i<ma> f15458h;

    public m30(Context context, Executor executor, mf mfVar, h30 h30, sf sfVar, rf rfVar) {
        this.f15451a = context;
        this.f15452b = executor;
        this.f15453c = mfVar;
        this.f15454d = h30;
        this.f15455e = sfVar;
        this.f15456f = rfVar;
    }

    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        ti0 ti0 = ti0.f16763j;
        y8 y8Var = ti0.f16764a;
        String str2 = ti0.f16770g.f14544a;
        y8Var.getClass();
        y8.b(context, str2, "gmob-apps", bundle, new a(3));
    }

    public j4 a(Context context, s2 s2Var) {
        return (j4) new ix(context, s2Var).b(context, false);
    }

    /* JADX WARNING: type inference failed for: r9v24, types: [s8.i<com.google.android.gms.internal.ads.ma>] */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r0v2, types: [e8.kq] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m30(e8.nd r9, android.content.Context r10, java.lang.String r11, e8.li0 r12) {
        /*
            r8 = this;
            r8.f15458h = r9
            r8.<init>()
            e8.ta0 r9 = e8.wa0.a(r10)
            r8.f15451a = r9
            e8.ta0 r9 = e8.wa0.a(r12)
            r8.f15452b = r9
            e8.ta0 r9 = e8.wa0.a(r11)
            r8.f15453c = r9
            s8.i<com.google.android.gms.internal.ads.ma> r9 = r8.f15458h
            e8.nd r9 = (e8.nd) r9
            e8.ab0<e8.t20> r9 = r9.f15634n
            e8.je r10 = new e8.je
            r11 = 20
            r10.<init>(r9, r11)
            java.lang.Object r9 = e8.ua0.f16865c
            boolean r9 = r10 instanceof e8.ua0
            if (r9 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            e8.ua0 r9 = new e8.ua0
            r9.<init>(r10)
            r10 = r9
        L_0x0031:
            r8.f15454d = r10
            s8.i<com.google.android.gms.internal.ads.ma> r9 = r8.f15458h
            e8.nd r9 = (e8.nd) r9
            e8.ab0<e8.i10> r9 = r9.f15631l0
            e8.rr r10 = new e8.rr
            r11 = 7
            r10.<init>(r9, r11)
            boolean r9 = r10 instanceof e8.ua0
            if (r9 == 0) goto L_0x0045
            r5 = r10
            goto L_0x004b
        L_0x0045:
            e8.ua0 r9 = new e8.ua0
            r9.<init>(r10)
            r5 = r9
        L_0x004b:
            r8.f15455e = r5
            java.lang.Object r9 = r8.f15451a
            r1 = r9
            e8.ab0 r1 = (e8.ab0) r1
            s8.i<com.google.android.gms.internal.ads.ma> r9 = r8.f15458h
            e8.nd r9 = (e8.nd) r9
            e8.ab0<java.util.concurrent.Executor> r2 = r9.f15636o
            e8.ab0<com.google.android.gms.internal.ads.b8> r3 = r9.H
            java.lang.Object r9 = r8.f15454d
            r4 = r9
            e8.ab0 r4 = (e8.ab0) r4
            e8.a10 r6 = e8.z00.f17679a
            e8.kq r9 = new e8.kq
            r7 = 11
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r9 instanceof e8.ua0
            if (r10 == 0) goto L_0x006f
            r4 = r9
            goto L_0x0075
        L_0x006f:
            e8.ua0 r10 = new e8.ua0
            r10.<init>(r9)
            r4 = r10
        L_0x0075:
            r8.f15456f = r4
            java.lang.Object r9 = r8.f15451a
            r1 = r9
            e8.ab0 r1 = (e8.ab0) r1
            java.lang.Object r9 = r8.f15452b
            r2 = r9
            e8.ab0 r2 = (e8.ab0) r2
            java.lang.Object r9 = r8.f15453c
            r3 = r9
            e8.ab0 r3 = (e8.ab0) r3
            java.lang.Object r9 = r8.f15454d
            r5 = r9
            e8.ab0 r5 = (e8.ab0) r5
            java.lang.Object r9 = r8.f15455e
            r6 = r9
            e8.ab0 r6 = (e8.ab0) r6
            e8.kq r9 = new e8.kq
            r7 = 6
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r9 instanceof e8.ua0
            if (r10 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            e8.ua0 r10 = new e8.ua0
            r10.<init>(r9)
            r9 = r10
        L_0x00a2:
            r8.f15457g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.m30.<init>(e8.nd, android.content.Context, java.lang.String, e8.li0):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [s8.i<com.google.android.gms.internal.ads.ma>, e8.j6] */
    /* JADX WARNING: type inference failed for: r8v0, types: [s8.i<com.google.android.gms.internal.ads.ma>, e8.f2] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m30(e8.di0 r1, e8.ei0 r2, e8.gj0 r3, e8.c2 r4, e8.s7 r5, z3.g r6, e8.j6 r7, e8.f2 r8) {
        /*
            r0 = this;
            r0.<init>()
            r0.f15451a = r1
            r0.f15452b = r2
            r0.f15453c = r3
            r0.f15454d = r4
            r0.f15455e = r5
            r0.f15456f = r6
            r0.f15457g = r7
            r0.f15458h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.m30.<init>(e8.di0, e8.ei0, e8.gj0, e8.c2, e8.s7, z3.g, e8.j6, e8.f2):void");
    }
}
