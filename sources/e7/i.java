package e7;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.f2;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.n6;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.w7;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.yt;
import com.google.android.gms.internal.ads.zzapp;
import d7.l;
import e8.bc0;
import e8.co;
import e8.cp;
import e8.fn;
import e8.gf0;
import e8.ia;
import e8.r20;
import e8.t;
import e8.t9;
import e8.ti0;
import e8.tn;
import e8.yc0;
import e8.yq;
import e8.zh0;
import i4.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import l0.e;
import o0.r;
import o8.b4;
import o8.b6;
import o8.d4;
import o8.g5;
import o8.k;
import o8.s4;
import org.json.JSONObject;
import r7.j;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13642a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13643b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13644c;

    public i(f2 f2Var, String str) {
        this.f13643b = f2Var;
        this.f13644c = str;
    }

    private final void a() {
        boolean z10;
        su suVar = (su) this.f13644c;
        View view = (View) this.f13643b;
        suVar.getClass();
        try {
            ou ouVar = new ou(suVar.f8157f, suVar.f8158g, suVar.f8159h, suVar.f8160i, suVar.f8161r, suVar.f8162s, suVar.f8163t, suVar.f8166w);
            Context b10 = l.B.f13189f.b();
            if (b10 != null && !TextUtils.isEmpty(suVar.f8164u)) {
                String str = (String) view.getTag(b10.getResources().getIdentifier((String) ti0.f16763j.f16769f.a(t.M), "id", b10.getPackageName()));
                if (str != null && str.equals(suVar.f8164u)) {
                    return;
                }
            }
            r a10 = suVar.a(view, ouVar);
            ouVar.d();
            if (a10.f22632a != 0 || a10.f22633b != 0) {
                int i10 = a10.f22633b;
                if (i10 != 0 || ouVar.f7746k != 0) {
                    if (i10 == 0) {
                        qu quVar = suVar.f8155d;
                        synchronized (quVar.f7997a) {
                            if (quVar.f7999c.contains(ouVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            return;
                        }
                    }
                    suVar.f8155d.b(ouVar);
                }
            }
        } catch (Exception e10) {
            e.C("Exception in fetchContentOnUIThread", e10);
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "ContentFetchTask.fetchContent");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v16, types: [int] */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0603, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0605, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0606, code lost:
        r4.a(0, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0610, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0297, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        e8.t60.f16708a.b(r2, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:263:0x05e6, B:266:0x05eb] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:80:0x027d, B:94:0x0293] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x058c A[Catch:{ IOException -> 0x058f }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0599 A[Catch:{ IOException -> 0x059c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f13642a
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 23
            switch(r0) {
                case 0: goto L_0x0611;
                case 1: goto L_0x05d8;
                case 2: goto L_0x000c;
                case 3: goto L_0x05ca;
                case 4: goto L_0x05af;
                case 5: goto L_0x059d;
                case 6: goto L_0x054c;
                case 7: goto L_0x04d7;
                case 8: goto L_0x03a7;
                case 9: goto L_0x0399;
                case 10: goto L_0x0389;
                case 11: goto L_0x037b;
                case 12: goto L_0x0360;
                case 13: goto L_0x0354;
                case 14: goto L_0x02fc;
                case 15: goto L_0x02d5;
                case 16: goto L_0x02b2;
                case 17: goto L_0x02a0;
                case 18: goto L_0x0267;
                case 19: goto L_0x0259;
                case 20: goto L_0x0243;
                case 21: goto L_0x022d;
                case 22: goto L_0x0217;
                case 23: goto L_0x0198;
                case 24: goto L_0x0194;
                case 25: goto L_0x0186;
                case 26: goto L_0x0150;
                case 27: goto L_0x0139;
                case 28: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0627
        L_0x000e:
            java.lang.Object r0 = r1.f13643b
            o8.s4 r0 = (o8.s4) r0
            java.lang.Object r4 = r1.f13644c
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 != 0) goto L_0x002a
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.g3 r0 = r0.f8827v
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.b(r2)
            goto L_0x0138
        L_0x002a:
            com.google.android.gms.measurement.internal.l r5 = r0.f8864a
            com.google.android.gms.measurement.internal.j r5 = r5.t()
            o8.g3 r5 = r5.f8827v
            android.os.Bundle r5 = r5.a()
            java.util.Set r6 = r4.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x003e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r4.get(r7)
            if (r8 == 0) goto L_0x0088
            boolean r9 = r8 instanceof java.lang.String
            if (r9 != 0) goto L_0x0088
            boolean r9 = r8 instanceof java.lang.Long
            if (r9 != 0) goto L_0x0088
            boolean r9 = r8 instanceof java.lang.Double
            if (r9 != 0) goto L_0x0088
            com.google.android.gms.measurement.internal.l r9 = r0.f8864a
            com.google.android.gms.measurement.internal.r r9 = r9.A()
            boolean r9 = r9.S(r8)
            if (r9 == 0) goto L_0x007a
            com.google.android.gms.measurement.internal.l r9 = r0.f8864a
            com.google.android.gms.measurement.internal.r r10 = r9.A()
            o8.z5 r11 = r0.f23441p
            r12 = 0
            r13 = 27
            r14 = 0
            r15 = 0
            r16 = 0
            r10.z(r11, r12, r13, r14, r15, r16)
        L_0x007a:
            com.google.android.gms.measurement.internal.l r9 = r0.f8864a
            com.google.android.gms.measurement.internal.h r9 = r9.d()
            o8.a3 r9 = r9.f8802k
            java.lang.String r10 = "Invalid default event parameter type. Name, value"
            r9.c(r10, r7, r8)
            goto L_0x003e
        L_0x0088:
            boolean r9 = com.google.android.gms.measurement.internal.r.U(r7)
            if (r9 == 0) goto L_0x009c
            com.google.android.gms.measurement.internal.l r8 = r0.f8864a
            com.google.android.gms.measurement.internal.h r8 = r8.d()
            o8.a3 r8 = r8.f8802k
            java.lang.String r9 = "Invalid default event parameter name. Name"
            r8.b(r9, r7)
            goto L_0x003e
        L_0x009c:
            if (r8 != 0) goto L_0x00a2
            r5.remove(r7)
            goto L_0x003e
        L_0x00a2:
            com.google.android.gms.measurement.internal.l r9 = r0.f8864a
            com.google.android.gms.measurement.internal.r r9 = r9.A()
            com.google.android.gms.measurement.internal.l r10 = r0.f8864a
            r10.getClass()
            r10 = 100
            java.lang.String r11 = "param"
            boolean r9 = r9.M(r11, r7, r10, r8)
            if (r9 == 0) goto L_0x003e
            com.google.android.gms.measurement.internal.l r9 = r0.f8864a
            com.google.android.gms.measurement.internal.r r9 = r9.A()
            r9.A(r5, r7, r8)
            goto L_0x003e
        L_0x00c2:
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            r4.A()
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            o8.f r4 = r4.f8843g
            int r4 = r4.m()
            int r6 = r5.size()
            if (r6 > r4) goto L_0x00d6
            goto L_0x0115
        L_0x00d6:
            java.util.TreeSet r6 = new java.util.TreeSet
            java.util.Set r7 = r5.keySet()
            r6.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L_0x00e4:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f7
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            int r7 = r7 + r3
            if (r7 <= r4) goto L_0x00e4
            r5.remove(r8)
            goto L_0x00e4
        L_0x00f7:
            com.google.android.gms.measurement.internal.l r3 = r0.f8864a
            com.google.android.gms.measurement.internal.r r6 = r3.A()
            o8.z5 r7 = r0.f23441p
            r8 = 0
            r9 = 26
            r10 = 0
            r11 = 0
            r12 = 0
            r6.z(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.l r3 = r0.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8802k
            java.lang.String r4 = "Too many default event parameters set. Discarding beyond event parameter limit"
            r3.a(r4)
        L_0x0115:
            com.google.android.gms.measurement.internal.l r3 = r0.f8864a
            com.google.android.gms.measurement.internal.j r3 = r3.t()
            o8.g3 r3 = r3.f8827v
            r3.b(r5)
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.p r0 = r0.y()
            r0.h()
            r0.i()
            o8.b6 r2 = r0.q(r2)
            f7.f0 r3 = new f7.f0
            r3.<init>((com.google.android.gms.measurement.internal.p) r0, (o8.b6) r2, (android.os.Bundle) r5)
            r0.t(r3)
        L_0x0138:
            return
        L_0x0139:
            java.lang.Object r0 = r1.f13644c
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            r0.a()
            java.lang.Object r0 = r1.f13644c
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f13643b
            o8.b6 r2 = (o8.b6) r2
            r0.p(r2)
            return
        L_0x0150:
            java.lang.Object r0 = r1.f13643b
            o8.d4 r0 = (o8.d4) r0
            r0.f()
            boolean r0 = f7.v.a()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r1.f13643b
            o8.d4 r0 = (o8.d4) r0
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            r0.r(r1)
            goto L_0x0185
        L_0x0169:
            java.lang.Object r0 = r1.f13644c
            o8.k r0 = (o8.k) r0
            long r4 = r0.f23301c
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0176
            r2 = 1
        L_0x0176:
            java.lang.Object r0 = r1.f13644c
            o8.k r0 = (o8.k) r0
            r0.f23301c = r6
            if (r2 == 0) goto L_0x0185
            java.lang.Object r0 = r1.f13644c
            o8.k r0 = (o8.k) r0
            r0.b()
        L_0x0185:
            return
        L_0x0186:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.oz r0 = (com.google.android.gms.internal.ads.oz) r0
            java.lang.Object r2 = r1.f13644c
            c7.b r2 = (c7.b) r2
            c7.a r0 = r0.f7788h
            r2.a(r0)
            return
        L_0x0194:
            r17.a()
            return
        L_0x0198:
            java.lang.Object r0 = r1.f13644c
            e8.gf0 r0 = (e8.gf0) r0
            java.lang.Object r0 = r0.f14777c
            e8.og0 r0 = (e8.og0) r0
            java.lang.Object r2 = r1.f13643b
            e8.bc0 r2 = (e8.bc0) r2
            com.google.android.gms.internal.ads.n7 r0 = (com.google.android.gms.internal.ads.n7) r0
            java.lang.ref.WeakReference<e8.ia> r0 = r0.f7541r
            java.lang.Object r0 = r0.get()
            e8.ia r0 = (e8.ia) r0
            e8.l<java.lang.Boolean> r3 = e8.t.f16562d1
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0216
            if (r0 == 0) goto L_0x0216
            if (r2 == 0) goto L_0x0216
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            float r4 = r2.f13926t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "frameRate"
            r3.put(r6, r4)
            int r4 = r2.f13916b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "bitRate"
            r3.put(r6, r4)
            int r4 = r2.f13924r
            int r6 = r2.f13925s
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r4)
            java.lang.String r4 = "x"
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r5 = "resolution"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f13919e
            java.lang.String r5 = "videoMime"
            r3.put(r5, r4)
            java.lang.String r4 = r2.f13920f
            java.lang.String r5 = "videoSampleMime"
            r3.put(r5, r4)
            java.lang.String r2 = r2.f13917c
            java.lang.String r4 = "videoCodec"
            r3.put(r4, r2)
            java.lang.String r2 = "onMetadataEvent"
            r0.O(r2, r3)
        L_0x0216:
            return
        L_0x0217:
            java.lang.Object r0 = r1.f13644c     // Catch:{ InterruptedException -> 0x0225 }
            com.google.android.gms.internal.ads.vt r0 = (com.google.android.gms.internal.ads.vt) r0     // Catch:{ InterruptedException -> 0x0225 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a<?>> r0 = r0.f8408b     // Catch:{ InterruptedException -> 0x0225 }
            java.lang.Object r2 = r1.f13643b     // Catch:{ InterruptedException -> 0x0225 }
            com.google.android.gms.internal.ads.a r2 = (com.google.android.gms.internal.ads.a) r2     // Catch:{ InterruptedException -> 0x0225 }
            r0.put(r2)     // Catch:{ InterruptedException -> 0x0225 }
            goto L_0x022c
        L_0x0225:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x022c:
            return
        L_0x022d:
            java.lang.Object r0 = r1.f13644c
            com.google.android.gms.internal.ads.yt r0 = (com.google.android.gms.internal.ads.yt) r0
            e8.pe0 r0 = r0.f8646e
            java.lang.Object r2 = r1.f13643b
            java.io.IOException r2 = (java.io.IOException) r2
            com.google.android.gms.internal.ads.n7 r0 = (com.google.android.gms.internal.ads.n7) r0
            e8.ua r0 = r0.f7542s
            if (r0 == 0) goto L_0x0242
            java.lang.String r3 = "onLoadError"
            r0.f(r3, r2)
        L_0x0242:
            return
        L_0x0243:
            java.lang.Object r0 = r1.f13643b
            e8.yc0 r0 = (e8.yc0) r0
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.Object r0 = r1.f13644c
            t1.c r0 = (t1.c) r0
            java.lang.Object r0 = r0.f25351c
            e8.mc0 r0 = (e8.mc0) r0
            java.lang.Object r2 = r1.f13643b
            e8.yc0 r2 = (e8.yc0) r2
            r0.getClass()
            return
        L_0x0259:
            java.lang.Object r0 = r1.f13643b
            e8.r20 r0 = (e8.r20) r0
            java.lang.Object r2 = r1.f13644c
            java.lang.String r2 = (java.lang.String) r2
            e8.c9 r0 = r0.f16226b
            r0.c(r2)
            return
        L_0x0267:
            java.lang.Object r0 = r1.f13643b
            r3 = r0
            java.io.InputStream r3 = (java.io.InputStream) r3
            java.lang.Object r0 = r1.f13644c
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r4 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x028f }
            r4.<init>(r0)     // Catch:{ all -> 0x028f }
            r0 = 1024(0x400, float:1.435E-42)
            com.google.android.gms.common.util.c.a(r3, r4, r2, r0)     // Catch:{ all -> 0x0281 }
            r4.close()     // Catch:{ all -> 0x028f }
            r3.close()     // Catch:{ IOException -> 0x029f }
            goto L_0x029f
        L_0x0281:
            r0 = move-exception
            r2 = r0
            r4.close()     // Catch:{ all -> 0x0287 }
            goto L_0x028e
        L_0x0287:
            r0 = move-exception
            r4 = r0
            e8.s60 r0 = e8.t60.f16708a     // Catch:{ all -> 0x028f }
            r0.b(r2, r4)     // Catch:{ all -> 0x028f }
        L_0x028e:
            throw r2     // Catch:{ all -> 0x028f }
        L_0x028f:
            r0 = move-exception
            r2 = r0
            if (r3 == 0) goto L_0x029e
            r3.close()     // Catch:{ all -> 0x0297 }
            goto L_0x029e
        L_0x0297:
            r0 = move-exception
            r3 = r0
            e8.s60 r0 = e8.t60.f16708a     // Catch:{ IOException -> 0x029f }
            r0.b(r2, r3)     // Catch:{ IOException -> 0x029f }
        L_0x029e:
            throw r2     // Catch:{ IOException -> 0x029f }
        L_0x029f:
            return
        L_0x02a0:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.j8 r0 = (com.google.android.gms.internal.ads.j8) r0
            java.lang.Object r2 = r1.f13644c
            e8.zh0 r2 = (e8.zh0) r2
            java.lang.Object r0 = r0.f7136d
            com.google.android.gms.internal.ads.ke r0 = (com.google.android.gms.internal.ads.ke) r0
            e8.ov r0 = r0.f7242d
            r0.j0(r2)
            return
        L_0x02b2:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.ld r0 = (com.google.android.gms.internal.ads.ld) r0
            java.lang.Object r3 = r1.f13644c
            e8.cp[] r3 = (e8.cp[]) r3
            r0.getClass()
            r4 = r3[r2]
            if (r4 == 0) goto L_0x02d4
            com.google.android.gms.internal.ads.ve<e8.cp> r4 = r0.f7372e
            r0 = r3[r2]
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.h(r0)
            monitor-enter(r4)
            java.util.Deque<e8.p50<T>> r2 = r4.f8360a     // Catch:{ all -> 0x02d1 }
            r2.addFirst(r0)     // Catch:{ all -> 0x02d1 }
            monitor-exit(r4)
            goto L_0x02d4
        L_0x02d1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x02d4:
            return
        L_0x02d5:
            java.lang.Object r0 = r1.f13644c
            com.google.android.gms.internal.ads.d7 r0 = (com.google.android.gms.internal.ads.d7) r0
            d7.l r2 = d7.l.B
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g
            f7.d0 r2 = r2.f()
            com.google.android.gms.ads.internal.util.o r2 = (com.google.android.gms.ads.internal.util.o) r2
            e8.u8 r2 = r2.j()
            java.lang.String r2 = r2.f16860f
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x02f3
            r0.b(r2)
            goto L_0x02fb
        L_0x02f3:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            r0.c(r2)
        L_0x02fb:
            return
        L_0x02fc:
            java.lang.Object r0 = r1.f13643b
            e8.tn r0 = (e8.tn) r0
            java.lang.Object r5 = r1.f13644c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x0307
            r2 = 1
        L_0x0307:
            e8.jn r5 = r0.f16778d
            android.view.View r5 = r5.n()
            if (r5 == 0) goto L_0x0353
            e8.jn r5 = r0.f16778d
            int r5 = r5.k()
            if (r4 == r5) goto L_0x0340
            e8.jn r4 = r0.f16778d
            int r4 = r4.k()
            if (r3 != r4) goto L_0x0320
            goto L_0x0340
        L_0x0320:
            r3 = 6
            e8.jn r4 = r0.f16778d
            int r4 = r4.k()
            if (r3 != r4) goto L_0x0353
            f7.d0 r3 = r0.f16775a
            e8.w00 r4 = r0.f16776b
            java.lang.String r4 = r4.f17192f
            java.lang.String r5 = "2"
            r3.f(r4, r5, r2)
            f7.d0 r3 = r0.f16775a
            e8.w00 r0 = r0.f16776b
            java.lang.String r0 = r0.f17192f
            java.lang.String r4 = "1"
            r3.f(r0, r4, r2)
            goto L_0x0353
        L_0x0340:
            f7.d0 r3 = r0.f16775a
            e8.w00 r4 = r0.f16776b
            java.lang.String r4 = r4.f17192f
            e8.jn r0 = r0.f16778d
            int r0 = r0.k()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.f(r4, r0, r2)
        L_0x0353:
            return
        L_0x0354:
            java.lang.Object r0 = r1.f13643b
            e8.fn r0 = (e8.fn) r0
            java.lang.Object r2 = r1.f13644c
            e8.co r2 = (e8.co) r2
            r0.h(r2)
            return
        L_0x0360:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.j9 r0 = (com.google.android.gms.internal.ads.j9) r0
            java.lang.Object r2 = r1.f13644c
            r0.F(r2)     // Catch:{ all -> 0x036a }
            goto L_0x037a
        L_0x036a:
            r0 = move-exception
            r2 = r0
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.y6 r0 = r0.f13190g
            java.lang.String r3 = "EventEmitter.notify"
            r0.c(r2, r3)
            java.lang.String r0 = "Event emitter exception."
            l0.e.v(r0, r2)
        L_0x037a:
            return
        L_0x037b:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.t7 r0 = (com.google.android.gms.internal.ads.t7) r0
            java.lang.Object r2 = r1.f13644c
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r3 = "AFMA_updateActiveView"
            r0.m(r3, r2)
            return
        L_0x0389:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.w7 r0 = (com.google.android.gms.internal.ads.w7) r0
            java.lang.Object r2 = r1.f13644c
            java.util.Map r2 = (java.util.Map) r2
            e8.ia r0 = r0.f8418a
            java.lang.String r3 = "pubVideoCmd"
            r0.O(r3, r2)
            return
        L_0x0399:
            java.lang.Object r0 = r1.f13643b
            e8.ia r0 = (e8.ia) r0
            java.lang.Object r2 = r1.f13644c
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "onGcacheInfoEvent"
            r0.O(r3, r2)
            return
        L_0x03a7:
            java.lang.Object r0 = r1.f13644c
            e8.t9 r0 = (e8.t9) r0
            java.lang.Object r6 = r1.f13643b
            android.media.MediaPlayer r6 = (android.media.MediaPlayer) r6
            java.util.Map<java.lang.Integer, java.lang.String> r7 = e8.t9.f16715z
            r0.getClass()
            java.lang.String r7 = "frameRate"
            e8.l<java.lang.Boolean> r8 = e8.t.f16562d1
            e8.ti0 r9 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r9 = r9.f16769f
            java.lang.Object r8 = r9.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x04c9
            e8.ia r8 = r0.f16716c
            if (r8 == 0) goto L_0x04c9
            if (r6 == 0) goto L_0x04c9
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r8 >= r9) goto L_0x03d6
            goto L_0x04c9
        L_0x03d6:
            android.media.MediaPlayer$TrackInfo[] r6 = r6.getTrackInfo()
            if (r6 != 0) goto L_0x03de
            goto L_0x04c9
        L_0x03de:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            int r9 = r6.length
        L_0x03e4:
            if (r2 >= r9) goto L_0x04bc
            r10 = r6[r2]
            if (r10 == 0) goto L_0x04b7
            int r11 = r10.getTrackType()
            r12 = 30
            java.lang.String r13 = "codecs-string"
            java.lang.String r14 = "mime"
            if (r11 == r3) goto L_0x0424
            if (r11 == r4) goto L_0x03fa
            goto L_0x04b7
        L_0x03fa:
            android.media.MediaFormat r10 = r10.getFormat()
            if (r10 == 0) goto L_0x04b7
            boolean r11 = r10.containsKey(r14)
            if (r11 == 0) goto L_0x040f
            java.lang.String r11 = r10.getString(r14)
            java.lang.String r14 = "audioMime"
            r8.put(r14, r11)
        L_0x040f:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r12) goto L_0x04b7
            boolean r11 = r10.containsKey(r13)
            if (r11 == 0) goto L_0x04b7
            java.lang.String r10 = r10.getString(r13)
            java.lang.String r11 = "audioCodec"
            r8.put(r11, r10)
            goto L_0x04b7
        L_0x0424:
            android.media.MediaFormat r10 = r10.getFormat()
            if (r10 == 0) goto L_0x04b7
            java.lang.String r11 = "frame-rate"
            boolean r15 = r10.containsKey(r11)
            if (r15 == 0) goto L_0x0449
            float r15 = r10.getFloat(r11)     // Catch:{ ClassCastException -> 0x043e }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ ClassCastException -> 0x043e }
            r8.put(r7, r15)     // Catch:{ ClassCastException -> 0x043e }
            goto L_0x0449
        L_0x043e:
            int r11 = r10.getInteger(r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r8.put(r7, r11)
        L_0x0449:
            java.lang.String r11 = "bitrate"
            boolean r15 = r10.containsKey(r11)
            if (r15 == 0) goto L_0x0464
            int r11 = r10.getInteger(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.f16730y = r11
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r15 = "bitRate"
            r8.put(r15, r11)
        L_0x0464:
            java.lang.String r11 = "width"
            boolean r15 = r10.containsKey(r11)
            if (r15 == 0) goto L_0x0495
            java.lang.String r15 = "height"
            boolean r16 = r10.containsKey(r15)
            if (r16 == 0) goto L_0x0495
            int r11 = r10.getInteger(r11)
            int r15 = r10.getInteger(r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r11)
            java.lang.String r11 = "x"
            r4.append(r11)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r11 = "resolution"
            r8.put(r11, r4)
        L_0x0495:
            boolean r4 = r10.containsKey(r14)
            if (r4 == 0) goto L_0x04a4
            java.lang.String r4 = r10.getString(r14)
            java.lang.String r11 = "videoMime"
            r8.put(r11, r4)
        L_0x04a4:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r12) goto L_0x04b7
            boolean r4 = r10.containsKey(r13)
            if (r4 == 0) goto L_0x04b7
            java.lang.String r4 = r10.getString(r13)
            java.lang.String r10 = "videoCodec"
            r8.put(r10, r4)
        L_0x04b7:
            int r2 = r2 + 1
            r4 = 2
            goto L_0x03e4
        L_0x04bc:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x04c9
            e8.ia r0 = r0.f16716c
            java.lang.String r2 = "onMetadataEvent"
            r0.O(r2, r8)
        L_0x04c9:
            java.lang.Object r0 = r1.f13644c
            e8.t9 r0 = (e8.t9) r0
            com.google.android.gms.internal.ads.f7 r0 = r0.f16729x
            if (r0 == 0) goto L_0x04d6
            com.google.android.gms.internal.ads.i7 r0 = (com.google.android.gms.internal.ads.i7) r0
            r0.i()
        L_0x04d6:
            return
        L_0x04d7:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.n6 r0 = (com.google.android.gms.internal.ads.n6) r0
            java.lang.Object r3 = r1.f13644c
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.getClass()
            com.google.android.gms.internal.ads.mp r4 = com.google.android.gms.internal.ads.mp.f7494b
            e8.l70 r4 = new e8.l70
            r4.<init>()
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG
            r3.compress(r5, r2, r4)
            java.lang.Object r3 = r0.f7528i
            monitor-enter(r3)
            com.google.android.gms.internal.ads.yq$b r0 = r0.f7520a     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f$b r5 = com.google.android.gms.internal.ads.yq.f.B()     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.mp r4 = r4.a()     // Catch:{ all -> 0x0549 }
            boolean r6 = r5.f5971c     // Catch:{ all -> 0x0549 }
            if (r6 == 0) goto L_0x0504
            r5.n()     // Catch:{ all -> 0x0549 }
            r5.f5971c = r2     // Catch:{ all -> 0x0549 }
        L_0x0504:
            MessageType r6 = r5.f5970b     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f r6 = (com.google.android.gms.internal.ads.yq.f) r6     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq.f.y(r6, r4)     // Catch:{ all -> 0x0549 }
            java.lang.String r4 = "image/png"
            boolean r6 = r5.f5971c     // Catch:{ all -> 0x0549 }
            if (r6 == 0) goto L_0x0516
            r5.n()     // Catch:{ all -> 0x0549 }
            r5.f5971c = r2     // Catch:{ all -> 0x0549 }
        L_0x0516:
            MessageType r6 = r5.f5970b     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f r6 = (com.google.android.gms.internal.ads.yq.f) r6     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq.f.A(r6, r4)     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f$a r4 = com.google.android.gms.internal.ads.yq.f.a.TYPE_CREATIVE     // Catch:{ all -> 0x0549 }
            boolean r6 = r5.f5971c     // Catch:{ all -> 0x0549 }
            if (r6 == 0) goto L_0x0528
            r5.n()     // Catch:{ all -> 0x0549 }
            r5.f5971c = r2     // Catch:{ all -> 0x0549 }
        L_0x0528:
            MessageType r6 = r5.f5970b     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f r6 = (com.google.android.gms.internal.ads.yq.f) r6     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq.f.z(r6, r4)     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.cq r4 = r5.j()     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.aq r4 = (com.google.android.gms.internal.ads.aq) r4     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq$f r4 = (com.google.android.gms.internal.ads.yq.f) r4     // Catch:{ all -> 0x0549 }
            boolean r5 = r0.f5971c     // Catch:{ all -> 0x0549 }
            if (r5 == 0) goto L_0x0540
            r0.n()     // Catch:{ all -> 0x0549 }
            r0.f5971c = r2     // Catch:{ all -> 0x0549 }
        L_0x0540:
            MessageType r0 = r0.f5970b     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq r0 = (com.google.android.gms.internal.ads.yq) r0     // Catch:{ all -> 0x0549 }
            com.google.android.gms.internal.ads.yq.B(r0, r4)     // Catch:{ all -> 0x0549 }
            monitor-exit(r3)     // Catch:{ all -> 0x0549 }
            return
        L_0x0549:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0549 }
            throw r0
        L_0x054c:
            java.lang.Object r0 = r1.f13643b
            r2 = r0
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            java.lang.Object r0 = r1.f13644c
            byte[] r0 = (byte[]) r0
            r3 = 0
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x056d }
            r4.<init>(r2)     // Catch:{ IOException -> 0x056d }
            int r3 = r0.length     // Catch:{ IOException -> 0x0568, all -> 0x0566 }
            r4.writeInt(r3)     // Catch:{ IOException -> 0x0568, all -> 0x0566 }
            r4.write(r0)     // Catch:{ IOException -> 0x0568, all -> 0x0566 }
            r4.close()     // Catch:{ IOException -> 0x058f }
            goto L_0x058f
        L_0x0566:
            r0 = move-exception
            goto L_0x0591
        L_0x0568:
            r0 = move-exception
            r3 = r4
            goto L_0x056e
        L_0x056b:
            r0 = move-exception
            goto L_0x0590
        L_0x056d:
            r0 = move-exception
        L_0x056e:
            java.lang.String r4 = "Error transporting the ad response"
            l0.e.C(r4, r0)     // Catch:{ all -> 0x056b }
            d7.l r4 = d7.l.B     // Catch:{ all -> 0x056b }
            com.google.android.gms.internal.ads.y6 r4 = r4.f13190g     // Catch:{ all -> 0x056b }
            java.lang.String r5 = "LargeParcelTeleporter.pipeData.1"
            android.content.Context r6 = r4.f8584e     // Catch:{ all -> 0x056b }
            e8.f9 r4 = r4.f8585f     // Catch:{ all -> 0x056b }
            e8.v6 r4 = com.google.android.gms.internal.ads.a5.d(r6, r4)     // Catch:{ all -> 0x056b }
            r4.c(r0, r5)     // Catch:{ all -> 0x056b }
            if (r3 != 0) goto L_0x058c
            if (r2 == 0) goto L_0x058f
            r2.close()     // Catch:{ IOException -> 0x058f }
            goto L_0x058f
        L_0x058c:
            r3.close()     // Catch:{ IOException -> 0x058f }
        L_0x058f:
            return
        L_0x0590:
            r4 = r3
        L_0x0591:
            if (r4 != 0) goto L_0x0599
            if (r2 == 0) goto L_0x059c
            r2.close()     // Catch:{ IOException -> 0x059c }
            goto L_0x059c
        L_0x0599:
            r4.close()     // Catch:{ IOException -> 0x059c }
        L_0x059c:
            throw r0
        L_0x059d:
            d7.l r0 = d7.l.B
            z3.i r0 = r0.f13185b
            java.lang.Object r0 = r1.f13644c
            com.google.android.gms.internal.ads.zzapp r0 = (com.google.android.gms.internal.ads.zzapp) r0
            android.app.Activity r0 = r0.f8770a
            java.lang.Object r2 = r1.f13643b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) r2
            z3.i.b(r0, r2, r3)
            return
        L_0x05af:
            java.lang.Object r0 = r1.f13644c     // Catch:{ RemoteException -> 0x05c3 }
            com.google.android.gms.internal.ads.ri r0 = (com.google.android.gms.internal.ads.ri) r0     // Catch:{ RemoteException -> 0x05c3 }
            com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT> r0 = r0.f8042b     // Catch:{ RemoteException -> 0x05c3 }
            com.google.android.gms.internal.ads.y2 r0 = (com.google.android.gms.internal.ads.y2) r0     // Catch:{ RemoteException -> 0x05c3 }
            java.lang.Object r2 = r1.f13643b     // Catch:{ RemoteException -> 0x05c3 }
            i4.a r2 = (i4.a) r2     // Catch:{ RemoteException -> 0x05c3 }
            int r2 = e.e.e(r2)     // Catch:{ RemoteException -> 0x05c3 }
            r0.h0(r2)     // Catch:{ RemoteException -> 0x05c3 }
            goto L_0x05c9
        L_0x05c3:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            l0.e.F(r2, r0)
        L_0x05c9:
            return
        L_0x05ca:
            java.lang.Object r0 = r1.f13643b
            com.google.android.gms.internal.ads.f2 r0 = (com.google.android.gms.internal.ads.f2) r0
            java.lang.Object r2 = r1.f13644c
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.t7 r0 = r0.f6346a
            r0.a(r2)
            return
        L_0x05d8:
            java.lang.Object r0 = r1.f13643b
            r4 = r0
            r7.j r4 = (r7.j) r4
            java.lang.Object r0 = r1.f13644c
            android.os.IBinder r0 = (android.os.IBinder) r0
            monitor-enter(r4)
            if (r0 != 0) goto L_0x05eb
            java.lang.String r0 = "Null service connection"
            r4.a(r2, r0)     // Catch:{ all -> 0x0603 }
            monitor-exit(r4)     // Catch:{ all -> 0x0603 }
            goto L_0x060e
        L_0x05eb:
            r7.o r5 = new r7.o     // Catch:{ RemoteException -> 0x0605 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x0605 }
            r4.f24712c = r5     // Catch:{ RemoteException -> 0x0605 }
            r0 = 2
            r4.f24710a = r0     // Catch:{ all -> 0x0603 }
            r7.i r0 = r4.f24715f     // Catch:{ all -> 0x0603 }
            java.util.concurrent.ScheduledExecutorService r0 = r0.f24707b     // Catch:{ all -> 0x0603 }
            r7.k r2 = new r7.k     // Catch:{ all -> 0x0603 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0603 }
            r0.execute(r2)     // Catch:{ all -> 0x0603 }
            monitor-exit(r4)     // Catch:{ all -> 0x0603 }
            goto L_0x060e
        L_0x0603:
            r0 = move-exception
            goto L_0x060f
        L_0x0605:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0603 }
            r4.a(r2, r0)     // Catch:{ all -> 0x0603 }
            monitor-exit(r4)     // Catch:{ all -> 0x0603 }
        L_0x060e:
            return
        L_0x060f:
            monitor-exit(r4)     // Catch:{ all -> 0x0603 }
            throw r0
        L_0x0611:
            java.lang.Object r0 = r1.f13643b
            e7.h r0 = (e7.h) r0
            java.lang.Object r2 = r1.f13644c
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            java.lang.Object r0 = r0.f13641c
            com.google.android.gms.ads.internal.overlay.a r0 = (com.google.android.gms.ads.internal.overlay.a) r0
            android.app.Activity r0 = r0.f5625b
            android.view.Window r0 = r0.getWindow()
            r0.setBackgroundDrawable(r2)
            return
        L_0x0627:
            java.lang.Object r0 = r1.f13644c
            o8.g5 r0 = (o8.g5) r0
            com.google.android.gms.measurement.internal.p r0 = r0.f23223c
            java.lang.Object r2 = r1.f13643b
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            com.google.android.gms.measurement.internal.p.v(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i.run():void");
    }

    public i(n6 n6Var, Bitmap bitmap) {
        this.f13643b = n6Var;
        this.f13644c = bitmap;
    }

    public i(t7 t7Var, JSONObject jSONObject) {
        this.f13643b = t7Var;
        this.f13644c = jSONObject;
    }

    public i(w7 w7Var, Map map) {
        this.f13643b = w7Var;
        this.f13644c = map;
    }

    public i(j8 j8Var, zh0 zh0) {
        this.f13643b = j8Var;
        this.f13644c = zh0;
    }

    public i(j9 j9Var, Object obj) {
        this.f13643b = j9Var;
        this.f13644c = obj;
    }

    public i(ld ldVar, cp[] cpVarArr) {
        this.f13643b = ldVar;
        this.f13644c = cpVarArr;
    }

    public i(h hVar, Drawable drawable) {
        this.f13643b = hVar;
        this.f13644c = drawable;
    }

    public i(ia iaVar, Map map) {
        this.f13643b = iaVar;
        this.f13644c = map;
    }

    public i(fn fnVar, co coVar) {
        this.f13643b = fnVar;
        this.f13644c = coVar;
    }

    public i(tn tnVar, ViewGroup viewGroup) {
        this.f13643b = tnVar;
        this.f13644c = viewGroup;
    }

    public i(yq yqVar, d7 d7Var) {
        this.f13643b = yqVar;
        this.f13644c = d7Var;
    }

    public i(r20 r20, String str) {
        this.f13643b = r20;
        this.f13644c = str;
    }

    public i(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13643b = inputStream;
        this.f13644c = parcelFileDescriptor;
    }

    public i(OutputStream outputStream, byte[] bArr) {
        this.f13643b = outputStream;
        this.f13644c = bArr;
    }

    public i(k kVar, d4 d4Var) {
        this.f13644c = kVar;
        this.f13643b = d4Var;
    }

    public i(b4 b4Var, b6 b6Var) {
        this.f13644c = b4Var;
        this.f13643b = b6Var;
    }

    public /* synthetic */ i(s4 s4Var, Bundle bundle) {
        this.f13643b = s4Var;
        this.f13644c = bundle;
    }

    public i(g5 g5Var, ComponentName componentName) {
        this.f13644c = g5Var;
        this.f13643b = componentName;
    }

    public i(j jVar, IBinder iBinder) {
        this.f13643b = jVar;
        this.f13644c = iBinder;
    }

    public i(zzapp zzapp, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f13644c = zzapp;
        this.f13643b = adOverlayInfoParcel;
    }

    public i(ri riVar, a aVar) {
        this.f13644c = riVar;
        this.f13643b = aVar;
    }

    public i(vt vtVar, com.google.android.gms.internal.ads.a aVar) {
        this.f13644c = vtVar;
        this.f13643b = aVar;
    }

    public i(yt ytVar, IOException iOException) {
        this.f13644c = ytVar;
        this.f13643b = iOException;
    }

    public i(su suVar, View view) {
        this.f13644c = suVar;
        this.f13643b = view;
    }

    public i(t9 t9Var, MediaPlayer mediaPlayer) {
        this.f13644c = t9Var;
        this.f13643b = mediaPlayer;
    }

    public i(gf0 gf0, bc0 bc0) {
        this.f13644c = gf0;
        this.f13643b = bc0;
    }

    public i(c cVar, yc0 yc0) {
        this.f13644c = cVar;
        this.f13643b = yc0;
    }
}
