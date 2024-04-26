package b2;

import a7.m;
import ab.d0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import c6.b;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.internal.ads.d7;
import e8.j3;
import e8.p1;
import e8.r5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ScheduledFuture;
import k3.a;
import k8.k1;
import k8.s1;
import ke.f0;
import m3.w;
import mb.h;
import o8.c3;
import o8.u5;
import ob.e;
import ob.f;
import org.json.JSONObject;
import s8.d;
import s8.i;
import y3.c;
import z5.c0;

/* compiled from: ViewGroupOverlayApi18 */
public class t implements u, a, c, k7.c, c0, b, p1, j3, c3, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3444a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3445b;

    public t(m mVar) {
        this.f3444a = 9;
        this.f3445b = mVar;
    }

    public int B(long j10) {
        return 1;
    }

    public int C(long j10, long j11) {
        return 1;
    }

    public void F(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    public void G(nb.a aVar) {
        e.d.d((h) this.f3445b);
        JSONObject jSONObject = new JSONObject();
        qb.a.d(jSONObject, "interactionType", aVar);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "adUserInteraction", jSONObject);
    }

    public void H(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public void I() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "bufferFinish", (JSONObject) null);
    }

    public void J() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "bufferStart", (JSONObject) null);
    }

    public void K() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "complete", (JSONObject) null);
    }

    public synchronized void L(f0 f0Var) {
        ((Set) this.f3445b).remove(f0Var);
    }

    public void M() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "firstQuartile", (JSONObject) null);
    }

    public void N() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "midpoint", (JSONObject) null);
    }

    public Message O(int i10) {
        return ((Handler) this.f3445b).obtainMessage(i10);
    }

    public Message P(int i10, int i11, int i12) {
        return ((Handler) this.f3445b).obtainMessage(i10, i11, i12);
    }

    public Message Q(int i10, Object obj) {
        return ((Handler) this.f3445b).obtainMessage(i10, obj);
    }

    public void R() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "pause", (JSONObject) null);
    }

    public void S(int i10) {
        ((Handler) this.f3445b).removeMessages(i10);
    }

    public void T() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "resume", (JSONObject) null);
    }

    public boolean U(int i10) {
        return ((Handler) this.f3445b).sendEmptyMessage(i10);
    }

    public void V(ImageView.ScaleType scaleType) {
        ((m) this.f3445b).getClass();
        if (scaleType != null) {
            try {
                new c8.b(scaleType);
                throw null;
            } catch (RemoteException e10) {
                l0.e.C("Unable to call setMediaViewImageScaleType on delegate", e10);
            }
        }
    }

    public void W(String str, String str2, Object obj) {
        s1 s1Var = (s1) this.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new k1(s1Var, str, str2, obj, true));
    }

    public void X() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "skipped", (JSONObject) null);
    }

    public void Y(float f10, float f11) {
        F(f10);
        H(f11);
        e.d.d((h) this.f3445b);
        JSONObject jSONObject = new JSONObject();
        qb.a.d(jSONObject, "duration", Float.valueOf(f10));
        qb.a.d(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        qb.a.d(jSONObject, "deviceVolume", Float.valueOf(f.a().f23669a));
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "start", jSONObject);
    }

    public void Z() {
        e.d.d((h) this.f3445b);
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "thirdQuartile", (JSONObject) null);
    }

    public long a() {
        long j10 = Long.MAX_VALUE;
        for (c0 a10 : (c0[]) this.f3445b) {
            long a11 = a10.a();
            if (a11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, a11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public void a0(float f10) {
        H(f10);
        e.d.d((h) this.f3445b);
        JSONObject jSONObject = new JSONObject();
        qb.a.d(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        qb.a.d(jSONObject, "deviceVolume", Float.valueOf(f.a().f23669a));
        e.f23667a.a(((h) this.f3445b).f21783e.f(), "volumeChange", jSONObject);
    }

    public void b(View view) {
        ((ViewGroupOverlay) this.f3445b).add(view);
    }

    public long d(long j10) {
        return 0;
    }

    public long e() {
        long j10 = Long.MAX_VALUE;
        for (c0 e10 : (c0[]) this.f3445b) {
            long e11 = e10.e();
            if (e11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean f(long j10) {
        long j11 = j10;
        boolean z10 = false;
        while (true) {
            long a10 = a();
            if (a10 != Long.MIN_VALUE) {
                boolean z11 = false;
                for (c0 c0Var : (c0[]) this.f3445b) {
                    long a11 = c0Var.a();
                    boolean z12 = a11 != Long.MIN_VALUE && a11 <= j11;
                    if (a11 == a10 || z12) {
                        z11 |= c0Var.f(j11);
                    }
                }
                z10 |= z11;
                if (!z11) {
                    break;
                }
            } else {
                break;
            }
        }
        return z10;
    }

    public void g(long j10) {
        for (c0 g10 : (c0[]) this.f3445b) {
            g10.g(j10);
        }
    }

    public long h(long j10, long j11) {
        return 0;
    }

    public boolean j() {
        for (c0 j10 : (c0[]) this.f3445b) {
            if (j10.j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(java.lang.Object r5, java.io.File r6, k3.e r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f3445b
            n3.b r0 = (n3.b) r0
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.f(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0033 }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0045
        L_0x002c:
            r5 = move-exception
            goto L_0x004e
        L_0x002e:
            r5 = move-exception
            r2 = r3
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0040
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0031 }
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.Object r5 = r4.f3445b
            n3.b r5 = (n3.b) r5
            r5.put(r0)
            return r1
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            java.lang.Object r6 = r4.f3445b
            n3.b r6 = (n3.b) r6
            r6.put(r0)
            goto L_0x005c
        L_0x005b:
            throw r5
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.t.k(java.lang.Object, java.io.File, k3.e):boolean");
    }

    public long l(long j10, long j11) {
        return j11;
    }

    public w<BitmapDrawable> m(w<Bitmap> wVar, k3.e eVar) {
        return t3.t.d((Resources) this.f3445b, wVar);
    }

    public long n(long j10, long j11) {
        return 0;
    }

    public void o(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        ((u5) this.f3445b).l(str, i10, th, bArr, map);
    }

    public void p(r5 r5Var) {
        ((d7) this.f3445b).c(r5Var);
    }

    public void s(i iVar) {
        switch (this.f3444a) {
            case 16:
                int i10 = ab.c0.f204b;
                ((d0.a) this.f3445b).a();
                return;
            default:
                ((ScheduledFuture) this.f3445b).cancel(false);
                return;
        }
    }

    public long t(long j10, long j11) {
        return -9223372036854775807L;
    }

    public String toString() {
        switch (this.f3444a) {
            case 19:
                StringBuilder a10 = q.c.a('<');
                a10.append((String) this.f3445b);
                a10.append('>');
                return a10.toString();
            default:
                return super.toString();
        }
    }

    public d6.h u(long j10) {
        return (d6.h) this.f3445b;
    }

    public boolean w() {
        return true;
    }

    public long x() {
        return 0;
    }

    public void z(View view) {
        ((ViewGroupOverlay) this.f3445b).remove(view);
    }

    public t(d0.a aVar) {
        this.f3444a = 16;
        this.f3445b = aVar;
    }

    public /* synthetic */ t(j jVar) {
        this.f3444a = 12;
        this.f3445b = jVar;
    }

    public t(ScheduledFuture scheduledFuture) {
        this.f3444a = 17;
        this.f3445b = scheduledFuture;
    }

    public t(s1 s1Var) {
        this.f3444a = 14;
        this.f3445b = s1Var;
    }

    public t(h hVar) {
        this.f3444a = 18;
        this.f3445b = hVar;
    }

    public t(u5 u5Var) {
        this.f3444a = 15;
        this.f3445b = u5Var;
    }

    public t(Context context, Collection collection) {
        this.f3444a = 11;
        TreeSet treeSet = new TreeSet();
        this.f3445b = treeSet;
        treeSet.clear();
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.add(context.getApplicationContext().getPackageName());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((TreeSet) this.f3445b).iterator();
            boolean z10 = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (str.startsWith(str2)) {
                    z10 = false;
                } else if (str2.startsWith(str)) {
                    ((TreeSet) this.f3445b).remove(str2);
                }
            }
            if (z10) {
                ((TreeSet) this.f3445b).add(str);
            }
        }
    }

    public t(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f3444a = 4;
        this.f3445b = abstractAdViewAdapter;
    }

    public t(d7 d7Var) {
        this.f3444a = 10;
        this.f3445b = d7Var;
    }

    public t(int i10) {
        this.f3444a = i10;
        if (i10 == 7) {
            this.f3445b = new SparseArray();
        } else if (i10 == 13) {
            this.f3445b = new HashMap();
        } else if (i10 != 20) {
            this.f3445b = new ArrayList();
        } else {
            this.f3445b = new LinkedHashSet();
        }
    }

    public t(String str) {
        this.f3444a = 19;
        this.f3445b = str;
    }

    public t(n3.b bVar) {
        this.f3444a = 1;
        this.f3445b = bVar;
    }

    public t(Handler handler) {
        this.f3444a = 8;
        this.f3445b = handler;
    }

    public t(c0[] c0VarArr) {
        this.f3444a = 5;
        this.f3445b = c0VarArr;
    }

    public t(d6.h hVar) {
        this.f3444a = 6;
        this.f3445b = hVar;
    }

    public t(ViewGroup viewGroup) {
        this.f3444a = 0;
        this.f3445b = viewGroup.getOverlay();
    }

    public t(Resources resources) {
        this.f3444a = 2;
        this.f3445b = resources;
    }
}
