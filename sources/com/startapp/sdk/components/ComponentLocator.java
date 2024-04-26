package com.startapp.sdk.components;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.startapp.b1;
import com.startapp.b9;
import com.startapp.c2;
import com.startapp.c3;
import com.startapp.c6;
import com.startapp.d3;
import com.startapp.d5;
import com.startapp.e2;
import com.startapp.g7;
import com.startapp.ga;
import com.startapp.h4;
import com.startapp.i6;
import com.startapp.i7;
import com.startapp.j1;
import com.startapp.jb;
import com.startapp.k9;
import com.startapp.l4;
import com.startapp.ld;
import com.startapp.m5;
import com.startapp.md;
import com.startapp.o4;
import com.startapp.p9;
import com.startapp.pa;
import com.startapp.r3;
import com.startapp.s3;
import com.startapp.sa;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.SchedulerService;
import com.startapp.t3;
import com.startapp.u4;
import com.startapp.ub;
import com.startapp.w9;
import com.startapp.x4;
import com.startapp.x8;
import com.startapp.y1;
import com.startapp.y3;
import com.startapp.z1;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ComponentLocator {
    public static final z1<ComponentLocator, Context> L = new k();
    public final y1<Executor> A;
    public final y1<Executor> B;
    public final y1<r3> C;
    public final y1<com.startapp.sdk.adsbase.e> D;
    public final y1<com.startapp.sdk.adsbase.e> E;
    public final y1<com.startapp.s> F;
    public final y1<com.startapp.l> G;
    public final y1<com.startapp.sdk.adsbase.crashreport.b> H;
    public final y1<ub> I;
    public final y1<com.startapp.sdk.ads.video.h> J;
    public final y1<c3<Context, List<String>, TrackingParams, h4>> K;

    /* renamed from: a  reason: collision with root package name */
    public final y1<md> f12459a;

    /* renamed from: b  reason: collision with root package name */
    public final y1<ld> f12460b;

    /* renamed from: c  reason: collision with root package name */
    public final y1<c6> f12461c;

    /* renamed from: d  reason: collision with root package name */
    public final y1<x4> f12462d;

    /* renamed from: e  reason: collision with root package name */
    public final y1<pa> f12463e;

    /* renamed from: f  reason: collision with root package name */
    public final y1<sa> f12464f;

    /* renamed from: g  reason: collision with root package name */
    public final y1<AdvertisingIdResolver> f12465g;

    /* renamed from: h  reason: collision with root package name */
    public final y1<x8> f12466h;

    /* renamed from: i  reason: collision with root package name */
    public final y1<e2> f12467i;

    /* renamed from: j  reason: collision with root package name */
    public final y1<d5> f12468j;

    /* renamed from: k  reason: collision with root package name */
    public final y1<w9> f12469k = new f(this);

    /* renamed from: l  reason: collision with root package name */
    public final y1<jb> f12470l;

    /* renamed from: m  reason: collision with root package name */
    public final y1<com.startapp.c0> f12471m;

    /* renamed from: n  reason: collision with root package name */
    public final y1<y3> f12472n;

    /* renamed from: o  reason: collision with root package name */
    public final y1<ga> f12473o;

    /* renamed from: p  reason: collision with root package name */
    public final y1<com.startapp.x> f12474p;

    /* renamed from: q  reason: collision with root package name */
    public final y1<o4> f12475q;

    /* renamed from: r  reason: collision with root package name */
    public final y1<j1> f12476r;

    /* renamed from: s  reason: collision with root package name */
    public final y1<p9> f12477s;

    /* renamed from: t  reason: collision with root package name */
    public final y1<c2> f12478t;

    /* renamed from: u  reason: collision with root package name */
    public final y1<b9> f12479u;

    /* renamed from: v  reason: collision with root package name */
    public final y1<m5> f12480v;

    /* renamed from: w  reason: collision with root package name */
    public final y1<i6> f12481w;

    /* renamed from: x  reason: collision with root package name */
    public final y1<r3> f12482x;

    /* renamed from: y  reason: collision with root package name */
    public final y1<Executor> f12483y;

    /* renamed from: z  reason: collision with root package name */
    public final y1<Executor> f12484z;

    /* compiled from: Sta */
    public class a extends y1<sa> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12485b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d3 f12486c;

        public a(Context context, d3 d3Var) {
            this.f12485b = context;
            this.f12486c = d3Var;
        }

        public Object a() {
            return new sa(this.f12485b, ComponentLocator.this.h(), new com.startapp.sdk.adsbase.e(this.f12485b.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0), (e.b) null), ComponentLocator.this.f(), this.f12486c);
        }
    }

    /* compiled from: Sta */
    public class a0 extends y1<com.startapp.sdk.adsbase.e> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12488b;

        public a0(ComponentLocator componentLocator, Context context) {
            this.f12488b = context;
        }

        public Object a() {
            return new com.startapp.sdk.adsbase.e(this.f12488b.getSharedPreferences("com.startapp.sdk", 0), (e.b) null);
        }
    }

    /* compiled from: Sta */
    public class b extends y1<AdvertisingIdResolver> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12489b;

        public b(ComponentLocator componentLocator, Context context) {
            this.f12489b = context;
        }

        public Object a() {
            return new AdvertisingIdResolver(this.f12489b, new j0("air"), new a(this));
        }
    }

    /* compiled from: Sta */
    public class b0 extends y1<com.startapp.sdk.adsbase.e> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12490b;

        public b0(ComponentLocator componentLocator, Context context) {
            this.f12490b = context;
        }

        public Object a() {
            return new com.startapp.sdk.adsbase.e(this.f12490b.getSharedPreferences("com.startapp.sdk.extras", 0), new p(this));
        }
    }

    /* compiled from: Sta */
    public class c extends y1<x8> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12491b;

        public c(ComponentLocator componentLocator, Context context) {
            this.f12491b = context;
        }

        public Object a() {
            return new x8(this.f12491b, new b(this));
        }
    }

    /* compiled from: Sta */
    public class c0 extends y1<com.startapp.s> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12492b;

        public c0(ComponentLocator componentLocator, Context context) {
            this.f12492b = context;
        }

        public Object a() {
            return new com.startapp.s(this.f12492b);
        }
    }

    /* compiled from: Sta */
    public class d extends y1<e2> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12493b;

        public d(Context context) {
            this.f12493b = context;
        }

        public Object a() {
            return new e2(this.f12493b, ComponentLocator.this.d());
        }
    }

    /* compiled from: Sta */
    public class d0 extends y1<com.startapp.l> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12495b;

        public d0(ComponentLocator componentLocator, Context context) {
            this.f12495b = context;
        }

        public Object a() {
            return new com.startapp.l(this.f12495b, new q(this));
        }
    }

    /* compiled from: Sta */
    public class e extends y1<d5> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12496b;

        public e(ComponentLocator componentLocator, Context context) {
            this.f12496b = context;
        }

        public Object a() {
            return new d5(new com.startapp.sdk.adsbase.e(this.f12496b.getSharedPreferences("StartApp-54ff24db2aee60b9", 0), (e.b) null));
        }
    }

    /* compiled from: Sta */
    public class e0 extends y1<ub> {
        public e0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new ub();
        }
    }

    /* compiled from: Sta */
    public class f extends y1<w9> {
        public f(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new w9();
        }
    }

    /* compiled from: Sta */
    public class f0 extends y1<com.startapp.sdk.ads.video.h> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12497b;

        public f0(Context context) {
            this.f12497b = context;
        }

        public Object a() {
            return new com.startapp.sdk.ads.video.h(this.f12497b, ComponentLocator.this.f12484z.b(), com.startapp.sdk.adsbase.cache.d.f12250h);
        }
    }

    /* compiled from: Sta */
    public class g extends y1<jb> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12499b;

        public g(Context context) {
            this.f12499b = context;
        }

        public Object a() {
            return new jb(this.f12499b.getPackageName(), new com.startapp.sdk.adsbase.e(this.f12499b.getSharedPreferences("StartApp-fba1a5307d96ef31", 0), (e.b) null), ComponentLocator.a(0, 1, "tlp", 5), ComponentLocator.this.m(), ComponentLocator.this.a(), ComponentLocator.this.v(), new c(this));
        }
    }

    /* compiled from: Sta */
    public class g0 extends y1<md> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12501b;

        public g0(ComponentLocator componentLocator, Context context) {
            this.f12501b = context;
        }

        public Object a() {
            return new md(this.f12501b);
        }
    }

    /* compiled from: Sta */
    public class h extends y1<com.startapp.c0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12502b;

        public h(ComponentLocator componentLocator, Context context) {
            this.f12502b = context;
        }

        public Object a() {
            return new com.startapp.c0(new com.startapp.sdk.adsbase.e(this.f12502b.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0), (e.b) null));
        }
    }

    /* compiled from: Sta */
    public class h0 extends y1<c3<Context, List<String>, TrackingParams, h4>> {
        public h0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return new s(this);
        }
    }

    /* compiled from: Sta */
    public class i extends y1<y3> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12503b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ y1 f12504c;

        public i(Context context, y1 y1Var) {
            this.f12503b = context;
            this.f12504c = y1Var;
        }

        public Object a() {
            AdvertisingIdResolver a10 = ComponentLocator.this.a();
            ub v10 = ComponentLocator.this.v();
            c6 n10 = ComponentLocator.this.n();
            Context context = this.f12503b;
            return new y3(a10, v10, n10, new g7(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-770c613f81fb5b52", 0), (e.b) null), new i7(this.f12503b, "StartApp-ac51a09f00e0f80c"), (Executor) this.f12504c.b(), new d(this)), new e(this));
        }
    }

    /* compiled from: Sta */
    public class i0 implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* compiled from: Sta */
    public class j extends y1<ga> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12506b;

        public j(ComponentLocator componentLocator, Context context) {
            this.f12506b = context;
        }

        public Object a() {
            Context context = this.f12506b;
            return new ga(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0), (e.b) null), new f(this));
        }
    }

    /* compiled from: Sta */
    public class j0 implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f12507a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f12508b;

        public j0(String str) {
            this.f12508b = str;
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder a10 = b1.a("startapp-");
            a10.append(this.f12508b);
            a10.append("-");
            a10.append(this.f12507a.incrementAndGet());
            return new Thread(runnable, a10.toString());
        }
    }

    /* compiled from: Sta */
    public class k extends z1<ComponentLocator, Context> {
    }

    /* compiled from: Sta */
    public class k0 extends y1<ld> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12509b;

        public k0(Context context) {
            this.f12509b = context;
        }

        public Object a() {
            return new ld(this.f12509b, ComponentLocator.this.w());
        }
    }

    /* compiled from: Sta */
    public class l extends y1<com.startapp.x> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12511b;

        public l(ComponentLocator componentLocator, Context context) {
            this.f12511b = context;
        }

        public Object a() {
            return new com.startapp.x(this.f12511b);
        }
    }

    /* compiled from: Sta */
    public class l0 extends y1<r3> {
        public l0(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("db");
        }
    }

    /* compiled from: Sta */
    public class m extends y1<o4> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12512b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ y1 f12513c;

        public m(Context context, y1 y1Var) {
            this.f12512b = context;
            this.f12513c = y1Var;
        }

        public Object a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5, TimeUnit.SECONDS, new PriorityBlockingQueue(), new j0("info"));
            i iVar = new i(this, threadPoolExecutor);
            c2 e10 = ComponentLocator.this.e();
            Context context = this.f12512b;
            ComponentLocator componentLocator = ComponentLocator.this;
            return new o4(new l4(this.f12512b, "StartApp-d6864f2502af7851"), (r3) this.f12513c.b(), threadPoolExecutor, iVar, e10, new u4(context, componentLocator.f12472n, componentLocator.f12466h), new j(this));
        }
    }

    /* compiled from: Sta */
    public class m0 extends y1<c6> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12515b;

        public m0(ComponentLocator componentLocator, Context context) {
            this.f12515b = context;
        }

        public Object a() {
            return new c6(this.f12515b);
        }
    }

    /* compiled from: Sta */
    public class n extends y1<j1> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12516b;

        public n(Context context) {
            this.f12516b = context;
        }

        public Object a() {
            return new j1(this.f12516b, ComponentLocator.this.d(), new com.startapp.sdk.adsbase.e(this.f12516b.getSharedPreferences("StartApp-dfeaf103310003d9", 0), (e.b) null), ComponentLocator.this.f(), ComponentLocator.this.h(), new k(this));
        }
    }

    /* compiled from: Sta */
    public class n0 extends y1<x4> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12518b;

        public n0(ComponentLocator componentLocator, Context context) {
            this.f12518b = context;
        }

        public Object a() {
            return new x4(this.f12518b);
        }
    }

    /* compiled from: Sta */
    public class o extends y1<p9> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12519b;

        public o(Context context) {
            this.f12519b = context;
        }

        public Object a() {
            Context context = this.f12519b;
            return new p9(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-6cd3cac226013e8e", 0), (e.b) null), ComponentLocator.this.f(), ComponentLocator.this.h(), new l(this));
        }
    }

    /* compiled from: Sta */
    public class o0 implements d3<TelephonyMetadata> {
        public o0(ComponentLocator componentLocator) {
        }

        public Object call() {
            return MetaData.f12393k.M();
        }
    }

    /* compiled from: Sta */
    public class p extends y1<c2> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12521b;

        public p(ComponentLocator componentLocator, Context context) {
            this.f12521b = context;
        }

        public Object a() {
            return new c2(this.f12521b, new m(this));
        }
    }

    /* compiled from: Sta */
    public class p0 extends y1<pa> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12522b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d3 f12523c;

        public p0(Context context, d3 d3Var) {
            this.f12522b = context;
            this.f12523c = d3Var;
        }

        public Object a() {
            Context context = this.f12522b;
            return new pa(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-6d5362e8ecc8a910", 0), (e.b) null), ComponentLocator.this.h(), ComponentLocator.this.f(), this.f12523c, new t(this));
        }
    }

    /* compiled from: Sta */
    public class q extends y1<b9> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12525b;

        public q(Context context) {
            this.f12525b = context;
        }

        public Object a() {
            return new b9(this.f12525b, ComponentLocator.this.j(), new n(this));
        }
    }

    /* compiled from: Sta */
    public class r extends y1<m5> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12527b;

        public r(ComponentLocator componentLocator, Context context) {
            this.f12527b = context;
        }

        public Object a() {
            Pair pair;
            Context context = this.f12527b;
            com.startapp.sdk.jobs.f fVar = new com.startapp.sdk.jobs.f(context);
            if (Build.VERSION.SDK_INT >= 21) {
                pair = new Pair(new com.startapp.sdk.jobs.c(context, SchedulerService.class), fVar);
            } else {
                pair = new Pair(fVar, fVar);
            }
            return new m5((k9) pair.first, (k9) pair.second);
        }
    }

    /* compiled from: Sta */
    public class s extends y1<i6> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12528b;

        public s(ComponentLocator componentLocator, Context context) {
            this.f12528b = context;
        }

        public Object a() {
            Context context = this.f12528b;
            return new i6(context, new com.startapp.sdk.adsbase.e(context.getSharedPreferences("StartApp-b36110d5cb803404", 0), (e.b) null), new o(this), new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Sta */
    public class t extends y1<r3> {
        public t(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("core");
        }
    }

    /* compiled from: Sta */
    public class u extends y1<Executor> {
        public u(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 4, "net-api", 10);
        }
    }

    /* compiled from: Sta */
    public class v extends y1<com.startapp.sdk.adsbase.crashreport.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f12529b;

        public v(ComponentLocator componentLocator, Context context) {
            this.f12529b = context;
        }

        public Object a() {
            ANRRemoteConfig e10 = MetaData.f12393k.e();
            com.startapp.sdk.adsbase.crashreport.b bVar = new com.startapp.sdk.adsbase.crashreport.b(e10 != null ? e10.c() : 2000, e10 != null && e10.g());
            if (e10 != null && e10.e()) {
                bVar.f12325b = new g(this, e10);
                bVar.f12324a = new com.startapp.sdk.adsbase.crashreport.a(this.f12529b, "com.startapp.", e10.h(), e10.a(), e10.d());
                if (e10.f()) {
                    bVar.f12327d = new h(this);
                }
                bVar.start();
            }
            return bVar;
        }
    }

    /* compiled from: Sta */
    public class w extends y1<Executor> {
        public w(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 2, "net-media", 10);
        }
    }

    /* compiled from: Sta */
    public class x extends y1<Executor> {
        public x(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 2, "disk", 5);
        }
    }

    /* compiled from: Sta */
    public class y extends y1<Executor> {
        public y(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a(0, 4, "generic", 5);
        }
    }

    /* compiled from: Sta */
    public class z extends y1<r3> {
        public z(ComponentLocator componentLocator) {
        }

        public Object a() {
            return ComponentLocator.a("dc");
        }
    }

    public ComponentLocator(Context context) {
        this.H = new v(this, context);
        this.f12459a = new g0(this, context);
        this.f12460b = new k0(context);
        l0 l0Var = new l0(this);
        this.f12461c = new m0(this, context);
        this.f12462d = new n0(this, context);
        o0 o0Var = new o0(this);
        this.f12463e = new p0(context, o0Var);
        this.f12464f = new a(context, o0Var);
        this.f12465g = new b(this, context);
        this.f12466h = new c(this, context);
        this.f12467i = new d(context);
        this.f12468j = new e(this, context);
        this.f12470l = new g(context);
        this.f12471m = new h(this, context);
        this.f12472n = new i(context, l0Var);
        this.f12473o = new j(this, context);
        this.f12474p = new l(this, context);
        this.f12475q = new m(context, l0Var);
        this.f12476r = new n(context);
        this.f12477s = new o(context);
        this.f12478t = new p(this, context);
        this.f12479u = new q(context);
        this.f12480v = new r(this, context);
        this.f12481w = new s(this, context);
        this.f12482x = new t(this);
        this.f12483y = new u(this);
        this.f12484z = new w(this);
        this.A = new x(this);
        this.B = new y(this);
        this.C = new z(this);
        this.D = new a0(this, context);
        this.E = new b0(this, context);
        this.F = new c0(this, context);
        this.G = new d0(this, context);
        this.I = new e0(this);
        this.J = new f0(context);
        this.K = new h0(this);
    }

    public static ComponentLocator a(Context context) {
        z1<ComponentLocator, Context> z1Var = L;
        T t10 = z1Var.f12907a;
        if (t10 == null) {
            synchronized (z1Var) {
                t10 = z1Var.f12907a;
                if (t10 == null) {
                    Context a10 = com.startapp.j0.a(context);
                    if (a10 != null) {
                        context = a10;
                    }
                    t10 = new ComponentLocator(context);
                    z1Var.f12907a = t10;
                }
            }
        }
        return (ComponentLocator) t10;
    }

    public com.startapp.x b() {
        return this.f12474p.b();
    }

    public com.startapp.c0 c() {
        return this.f12471m.b();
    }

    public com.startapp.sdk.adsbase.e d() {
        return this.D.b();
    }

    public c2 e() {
        return this.f12478t.b();
    }

    public e2 f() {
        return this.f12467i.b();
    }

    public r3 g() {
        return this.f12482x.b();
    }

    public r3 h() {
        return this.C.b();
    }

    public Executor i() {
        return this.A.b();
    }

    public Executor j() {
        return this.B.b();
    }

    public y3 k() {
        return this.f12472n.b();
    }

    public o4 l() {
        return this.f12475q.b();
    }

    public m5 m() {
        return this.f12480v.b();
    }

    public c6 n() {
        return this.f12461c.b();
    }

    public i6 o() {
        return this.f12481w.b();
    }

    public Executor p() {
        return this.f12483y.b();
    }

    public x8 q() {
        return this.f12466h.b();
    }

    public b9 r() {
        return this.f12479u.b();
    }

    public w9 s() {
        return this.f12469k.b();
    }

    public pa t() {
        return this.f12463e.b();
    }

    public sa u() {
        return this.f12464f.b();
    }

    public ub v() {
        return this.I.b();
    }

    public md w() {
        return this.f12459a.b();
    }

    public static ThreadFactory b(String str) {
        return new j0(str);
    }

    public AdvertisingIdResolver a() {
        return this.f12465g.b();
    }

    public static Executor a(int i10, int i11, String str, long j10) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i11, j10, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                public boolean offer(Object obj) {
                    return tryTransfer((Runnable) obj);
                }
            }, new j0(str), new i0());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i11 < 2) {
            return Executors.newSingleThreadExecutor(new j0(str));
        } else {
            return Executors.newCachedThreadPool(new j0(str));
        }
    }

    public static r3 a(String str) {
        t3 t3Var = new t3(j.f.a("startapp-", str));
        t3Var.start();
        return new s3(new Handler(t3Var.getLooper()));
    }
}
