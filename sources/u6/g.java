package u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import ba.p0;
import ba.s;
import ba.t;
import ba.u;
import c1.c;
import com.google.android.exoplayer2.upstream.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import u6.b;
import v6.e0;
import v6.w;
import z4.h;

/* compiled from: DefaultBandwidthMeter */
public final class g implements b, i {

    /* renamed from: n  reason: collision with root package name */
    public static final t<String, Integer> f26067n = i();

    /* renamed from: o  reason: collision with root package name */
    public static final s<Long> f26068o = s.D(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* renamed from: p  reason: collision with root package name */
    public static final s<Long> f26069p = s.D(218000L, 159000L, 145000L, 130000L, 112000L);

    /* renamed from: q  reason: collision with root package name */
    public static final s<Long> f26070q = s.D(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* renamed from: r  reason: collision with root package name */
    public static final s<Long> f26071r = s.D(4800000L, 2700000L, 1800000L, 1200000L, 630000L);

    /* renamed from: s  reason: collision with root package name */
    public static final s<Long> f26072s = s.D(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    /* renamed from: t  reason: collision with root package name */
    public static g f26073t;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26074a;

    /* renamed from: b  reason: collision with root package name */
    public final u<Integer, Long> f26075b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a.C0257a f26076c;

    /* renamed from: d  reason: collision with root package name */
    public final w f26077d;

    /* renamed from: e  reason: collision with root package name */
    public final v6.b f26078e;

    /* renamed from: f  reason: collision with root package name */
    public int f26079f;

    /* renamed from: g  reason: collision with root package name */
    public long f26080g;

    /* renamed from: h  reason: collision with root package name */
    public long f26081h;

    /* renamed from: i  reason: collision with root package name */
    public int f26082i;

    /* renamed from: j  reason: collision with root package name */
    public long f26083j;

    /* renamed from: k  reason: collision with root package name */
    public long f26084k;

    /* renamed from: l  reason: collision with root package name */
    public long f26085l;

    /* renamed from: m  reason: collision with root package name */
    public long f26086m;

    /* compiled from: DefaultBandwidthMeter */
    public static class a extends BroadcastReceiver {

        /* renamed from: c  reason: collision with root package name */
        public static a f26087c;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f26088a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<WeakReference<g>> f26089b = new ArrayList<>();

        public final void a() {
            for (int size = this.f26089b.size() - 1; size >= 0; size--) {
                if (((g) this.f26089b.get(size).get()) == null) {
                    this.f26089b.remove(size);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(u6.g r11) {
            /*
                r10 = this;
                ba.t<java.lang.String, java.lang.Integer> r0 = u6.g.f26067n
                monitor-enter(r11)
                android.content.Context r0 = r11.f26074a     // Catch:{ all -> 0x005c }
                r1 = 0
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000e
            L_0x000a:
                int r0 = v6.e0.v(r0)     // Catch:{ all -> 0x005c }
            L_0x000e:
                int r2 = r11.f26082i     // Catch:{ all -> 0x005c }
                if (r2 != r0) goto L_0x0014
                monitor-exit(r11)
                goto L_0x005b
            L_0x0014:
                r11.f26082i = r0     // Catch:{ all -> 0x005c }
                r2 = 1
                if (r0 == r2) goto L_0x005a
                if (r0 == 0) goto L_0x005a
                r2 = 8
                if (r0 != r2) goto L_0x0020
                goto L_0x005a
            L_0x0020:
                long r2 = r11.j(r0)     // Catch:{ all -> 0x005c }
                r11.f26085l = r2     // Catch:{ all -> 0x005c }
                v6.b r0 = r11.f26078e     // Catch:{ all -> 0x005c }
                long r2 = r0.a()     // Catch:{ all -> 0x005c }
                int r0 = r11.f26079f     // Catch:{ all -> 0x005c }
                if (r0 <= 0) goto L_0x0037
                long r4 = r11.f26080g     // Catch:{ all -> 0x005c }
                long r4 = r2 - r4
                int r0 = (int) r4     // Catch:{ all -> 0x005c }
                r5 = r0
                goto L_0x0038
            L_0x0037:
                r5 = 0
            L_0x0038:
                long r6 = r11.f26081h     // Catch:{ all -> 0x005c }
                long r8 = r11.f26085l     // Catch:{ all -> 0x005c }
                r4 = r11
                r4.l(r5, r6, r8)     // Catch:{ all -> 0x005c }
                r11.f26080g = r2     // Catch:{ all -> 0x005c }
                r2 = 0
                r11.f26081h = r2     // Catch:{ all -> 0x005c }
                r11.f26084k = r2     // Catch:{ all -> 0x005c }
                r11.f26083j = r2     // Catch:{ all -> 0x005c }
                v6.w r0 = r11.f26077d     // Catch:{ all -> 0x005c }
                java.util.ArrayList<v6.w$b> r2 = r0.f26524b     // Catch:{ all -> 0x005c }
                r2.clear()     // Catch:{ all -> 0x005c }
                r2 = -1
                r0.f26526d = r2     // Catch:{ all -> 0x005c }
                r0.f26527e = r1     // Catch:{ all -> 0x005c }
                r0.f26528f = r1     // Catch:{ all -> 0x005c }
                monitor-exit(r11)
                goto L_0x005b
            L_0x005a:
                monitor-exit(r11)
            L_0x005b:
                return
            L_0x005c:
                r0 = move-exception
                monitor-exit(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.g.a.b(u6.g):void");
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                a();
                for (int i10 = 0; i10 < this.f26089b.size(); i10++) {
                    g gVar = (g) this.f26089b.get(i10).get();
                    if (gVar != null) {
                        b(gVar);
                    }
                }
            }
        }
    }

    @Deprecated
    public g() {
        this((Context) null, p0.f3768g, 2000, v6.b.f26424a, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v90, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v98, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v99, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v102, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v106, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v108, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v109, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v110, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v111, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v112, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v114, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v115, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v116, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v118, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v119, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v120, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v121, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v122, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v123, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v124, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v125, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v126, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v127, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v128, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v129, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v130, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v131, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v132, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v133, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v134, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v135, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v136, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v137, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v138, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v142, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v143, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v144, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v145, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v146, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v147, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v148, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v149, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v150, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v151, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v152, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v153, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v154, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v155, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v156, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v157, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v158, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v159, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v160, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v161, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v162, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v163, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v164, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v165, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v166, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v167, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v168, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v169, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v170, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v171, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v172, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v173, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v174, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v175, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v176, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v177, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v178, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v179, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v181, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v182, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v183, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v184, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v185, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v186, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v187, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v188, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v189, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v190, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v191, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v192, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v193, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v194, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v195, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v196, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v197, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v198, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v199, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v200, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v201, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v202, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v203, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v204, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v205, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v206, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v207, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v208, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v209, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v210, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v211, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v212, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v213, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v214, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v215, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v216, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v217, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v219, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v220, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v221, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v222, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v223, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v224, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v225, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v226, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v227, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v228, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v229, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v230, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v231, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v232, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v233, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v234, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v235, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v236, resolved type: java.lang.Integer[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Integer[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ba.t<java.lang.String, java.lang.Integer> i() {
        /*
            ba.t$a r0 = ba.t.f()
            r1 = 5
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2[r5] = r4
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2[r3] = r8
            r2[r7] = r6
            r9 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r2[r9] = r6
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r2[r11] = r8
            java.lang.String r13 = "AD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r4
            java.lang.String r13 = "AE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "AF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "AG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "AI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "AL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "AM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "AO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "AR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "AS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r10
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "AT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r4
            java.lang.String r13 = "AU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "AW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "AX"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "AZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "BA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "BB"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "BD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "BE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "BG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "BH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "BI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "BJ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "BM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "BN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BQ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "BR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "BS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "BW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "BY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "BZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r10
            java.lang.String r13 = "CA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "CD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "CF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "CG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r6
            java.lang.String r13 = "CH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "CI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "CK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "CL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "CM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r10
            java.lang.String r13 = "CN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "CO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "CR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "CU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "CV"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "CW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "CY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "CZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r6
            java.lang.String r13 = "DE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "DJ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "DK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "DM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "DO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "DZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "EC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "EE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "EG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "EH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "ER"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "ES"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "ET"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r6
            java.lang.String r13 = "FI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "FJ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "FK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "FM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "FO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "FR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "GA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "GB"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "GD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "GE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "GF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "GG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "GH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "GI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "GL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "GM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "GN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "GP"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "GQ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "GR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "GT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "GU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "GW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "GY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "HK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "HN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "HR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "HT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "HU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "ID"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "IE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "IL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "IM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r4
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "IN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "IO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "IQ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "IR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "IS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "IT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "JE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "JM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "JO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r10
            java.lang.String r13 = "JP"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "KE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "KG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "KH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "KI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "KM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "KN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "KP"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r4
            java.lang.String r13 = "KR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r4
            java.lang.String r13 = "KW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "KY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "KZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "LA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "LB"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "LC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "LI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "LK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "LR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "LS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "LT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "LU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "LV"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "LY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r4
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "MA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "MC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "MD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "ME"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "MF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "MH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "MK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "ML"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "MM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "MN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "MO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "MP"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MQ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r6
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "MR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "MS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "MT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r4
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "MV"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "MW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MX"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "MZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "NA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "NC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "NE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "NF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "NG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "NI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r6
            java.lang.String r13 = "NL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "NO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "NP"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "NR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "NU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r12
            java.lang.String r13 = "NZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "OM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "PA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "PE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "PF"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "PG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r12
            java.lang.String r13 = "PH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "PK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "PL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "PM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r12
            java.lang.String r13 = "PR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "PS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "PT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "PW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "PY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "QA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r6
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "RE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "RO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "RS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "RU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "RW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "SA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SB"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r6
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "SC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "SD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "SE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r12
            java.lang.String r13 = "SG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "SI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SJ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "SK"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "SL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "SN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "SO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r10
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "SR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "ST"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "SV"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "SX"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "SY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r12
            r2[r7] = r10
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "SZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "TC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "TD"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "TG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r10
            r2[r11] = r6
            java.lang.String r13 = "TH"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "TJ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "TL"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "TM"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "TN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "TO"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "TR"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r10
            r2[r7] = r4
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "TT"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "TV"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r6
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r4
            java.lang.String r13 = "TW"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r10
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "TZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r10
            r2[r7] = r6
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r13 = "UA"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r13 = "UG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r10
            r2[r9] = r10
            r2[r11] = r10
            java.lang.String r13 = "US"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "UY"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r6
            r2[r7] = r10
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "UZ"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "VC"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "VE"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "VG"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "VI"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r6
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r13 = "VN"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r4
            r2[r7] = r10
            r2[r9] = r4
            r2[r11] = r8
            java.lang.String r13 = "VU"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r4
            r2[r7] = r12
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r13 = "WS"
            r0.b(r13, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r4
            r2[r3] = r4
            r2[r7] = r4
            r2[r9] = r6
            r2[r11] = r8
            java.lang.String r6 = "XK"
            r0.b(r6, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r12
            r2[r3] = r12
            r2[r7] = r12
            r2[r9] = r12
            r2[r11] = r8
            java.lang.String r6 = "YE"
            r0.b(r6, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r4
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r4 = "YT"
            r0.b(r4, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r8
            r2[r3] = r10
            r2[r7] = r8
            r2[r9] = r8
            r2[r11] = r8
            java.lang.String r4 = "ZA"
            r0.b(r4, r2)
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r2[r5] = r10
            r2[r3] = r8
            r2[r7] = r8
            r2[r9] = r10
            r2[r11] = r8
            java.lang.String r4 = "ZM"
            r0.b(r4, r2)
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r1[r5] = r10
            r1[r3] = r10
            r1[r7] = r10
            r1[r9] = r10
            r1[r11] = r8
            java.lang.String r2 = "ZW"
            r0.b(r2, r1)
            ba.t r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.i():ba.t");
    }

    public static boolean k(e eVar, boolean z10) {
        if (!z10) {
            return false;
        }
        return !((eVar.f26056i & 8) == 8);
    }

    public i a() {
        return this;
    }

    public void b(e eVar, e eVar2, boolean z10) {
    }

    public synchronized void c(e eVar, e eVar2, boolean z10, int i10) {
        if (k(eVar2, z10)) {
            this.f26081h += (long) i10;
        }
    }

    public void d(Handler handler, b.a aVar) {
        b.a.C0257a aVar2 = this.f26076c;
        aVar2.getClass();
        aVar2.a(aVar);
        aVar2.f26040a.add(new b.a.C0257a.C0258a(handler, aVar));
    }

    public synchronized long e() {
        return this.f26085l;
    }

    public synchronized void f(e eVar, e eVar2, boolean z10) {
        if (k(eVar2, z10)) {
            if (this.f26079f == 0) {
                this.f26080g = this.f26078e.a();
            }
            this.f26079f++;
        }
    }

    public void g(b.a aVar) {
        this.f26076c.a(aVar);
    }

    public synchronized void h(e eVar, e eVar2, boolean z10) {
        if (k(eVar2, z10)) {
            v6.a.d(this.f26079f > 0);
            long a10 = this.f26078e.a();
            int i10 = (int) (a10 - this.f26080g);
            this.f26083j += (long) i10;
            long j10 = this.f26084k;
            long j11 = this.f26081h;
            this.f26084k = j10 + j11;
            if (i10 > 0) {
                this.f26077d.a((int) Math.sqrt((double) j11), (((float) j11) * 8000.0f) / ((float) i10));
                if (this.f26083j >= 2000 || this.f26084k >= 524288) {
                    this.f26085l = (long) this.f26077d.b(0.5f);
                }
                l(i10, this.f26081h, this.f26085l);
                this.f26080g = a10;
                this.f26081h = 0;
            }
            this.f26079f--;
        }
    }

    public final long j(int i10) {
        Long l10 = this.f26075b.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f26075b.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void l(int i10, long j10, long j11) {
        if (i10 != 0 || j10 != 0 || j11 != this.f26086m) {
            this.f26086m = j11;
            Iterator<b.a.C0257a.C0258a> it = this.f26076c.f26040a.iterator();
            while (it.hasNext()) {
                b.a.C0257a.C0258a next = it.next();
                if (!next.f26043c) {
                    next.f26041a.post(new h(next, i10, j10, j11));
                }
            }
        }
    }

    public g(Context context, Map<Integer, Long> map, int i10, v6.b bVar, boolean z10) {
        Context context2;
        int i11;
        a aVar;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f26074a = context2;
        this.f26075b = u.a(map);
        this.f26076c = new b.a.C0257a();
        this.f26077d = new w(i10);
        this.f26078e = bVar;
        if (context == null) {
            i11 = 0;
        } else {
            i11 = e0.v(context);
        }
        this.f26082i = i11;
        this.f26085l = j(i11);
        if (context != null && z10) {
            a aVar2 = a.f26087c;
            synchronized (a.class) {
                if (a.f26087c == null) {
                    a.f26087c = new a();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(a.f26087c, intentFilter);
                }
                aVar = a.f26087c;
            }
            synchronized (aVar) {
                aVar.a();
                aVar.f26089b.add(new WeakReference(this));
                aVar.f26088a.post(new c(aVar, this));
            }
        }
    }
}
