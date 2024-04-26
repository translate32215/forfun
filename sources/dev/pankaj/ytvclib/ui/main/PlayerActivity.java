package dev.pankaj.ytvclib.ui.main;

import ad.i;
import android.app.PictureInPictureParams;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import be.i;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.b;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.j;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Stream;
import dev.pankaj.ytvclib.ui.dlna.DLNAService;
import gf.j0;
import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kd.o;
import kotlin.reflect.KProperty;
import p5.l;
import p5.p;
import r6.a;
import r6.f;
import r6.j;
import ud.k;
import ud.q;
import ud.u;
import ud.v;
import v6.o;
import x4.a1;
import x4.c0;
import x4.c1;
import x4.e0;
import x4.l0;
import x4.m;
import x4.n0;
import x4.o0;
import x4.p0;
import x4.q0;
import x4.r0;
import x4.t0;
import x4.w;
import x4.y;
import y4.x;
import z5.d0;
import z5.g0;
import z5.r;

/* compiled from: PlayerActivity.kt */
public final class PlayerActivity extends vc.a<tc.e> implements View.OnClickListener, p0, b.d {

    /* renamed from: n0  reason: collision with root package name */
    public static final a f13437n0 = new a((ud.f) null);

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f13438o0;

    /* renamed from: p0  reason: collision with root package name */
    public static CookieManager f13439p0;
    public final kd.d I;
    public final kd.d J = new r0(v.a(zc.c.class), new e(this), new h(this), new f((td.a) null, this));
    public String K = "";
    public String L = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.54 Safari/537.36";
    public String M = "";
    public ImageButton N;
    public ImageButton O;
    public ImageButton P;
    public ImageButton Q;
    public ImageButton R;
    public boolean S;
    public e.a Z;

    /* renamed from: a0  reason: collision with root package name */
    public j f13440a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f13441b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public a1 f13442c0;

    /* renamed from: d0  reason: collision with root package name */
    public r f13443d0;

    /* renamed from: e0  reason: collision with root package name */
    public r6.f f13444e0;

    /* renamed from: f0  reason: collision with root package name */
    public f.c f13445f0;

    /* renamed from: g0  reason: collision with root package name */
    public g0 f13446g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13447h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public int f13448i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public long f13449j0 = -9223372036854775807L;

    /* renamed from: k0  reason: collision with root package name */
    public dev.pankaj.ytvclib.utils.b f13450k0;

    /* renamed from: l0  reason: collision with root package name */
    public final yc.a f13451l0 = new yc.a(new g(this));

    /* renamed from: m0  reason: collision with root package name */
    public WebView f13452m0;

    /* compiled from: PlayerActivity.kt */
    public static final class a {
        public a(ud.f fVar) {
        }
    }

    /* compiled from: PlayerActivity.kt */
    public final class b implements v6.j<m> {
        public b() {
        }

        public Pair a(Throwable th) {
            String string;
            m mVar = (m) th;
            String string2 = PlayerActivity.this.getString(R.string.error_generic);
            k.e(string2, "getString(R.string.error_generic)");
            int i10 = mVar.f27668a;
            if (i10 == 1) {
                v6.a.d(i10 == 1);
                Throwable th2 = mVar.f27676i;
                th2.getClass();
                Exception exc = (Exception) th2;
                if (exc instanceof l.a) {
                    l.a aVar = (l.a) exc;
                    p5.k kVar = aVar.f23919c;
                    if (kVar == null) {
                        if (exc.getCause() instanceof p.c) {
                            string = PlayerActivity.this.getString(R.string.error_querying_decoders);
                            k.e(string, "{\n                      …                        }");
                        } else if (aVar.f23918b) {
                            string = PlayerActivity.this.getString(R.string.error_no_secure_decoder, new Object[]{aVar.f23917a});
                            k.e(string, "{\n                      …                        }");
                        } else {
                            string = PlayerActivity.this.getString(R.string.error_no_decoder, new Object[]{aVar.f23917a});
                            k.e(string, "{\n                      …                        }");
                        }
                        string2 = string;
                    } else {
                        string2 = PlayerActivity.this.getString(R.string.error_instantiating_decoder, new Object[]{kVar.f23877a});
                        k.e(string2, "getString(\n             …                        )");
                    }
                }
            }
            PlayerActivity.this.f13451l0.l();
            Pair create = Pair.create(0, string2);
            k.e(create, "create(0, errorString)");
            return create;
        }
    }

    /* compiled from: PlayerActivity.kt */
    public final class c implements r0.a {
        public c() {
        }

        public /* synthetic */ void C(int i10) {
            q0.j(this, i10);
        }

        public /* synthetic */ void D(boolean z10, int i10) {
            q0.h(this, z10, i10);
        }

        public /* synthetic */ void F(c1 c1Var, int i10) {
            q0.s(this, c1Var, i10);
        }

        public /* synthetic */ void M(boolean z10) {
            q0.q(this, z10);
        }

        public /* synthetic */ void P(boolean z10) {
            q0.b(this, z10);
        }

        public void Q(g0 g0Var, r6.l lVar) {
            k.f(g0Var, "trackGroups");
            k.f(lVar, "trackSelections");
            PlayerActivity playerActivity = PlayerActivity.this;
            a aVar = PlayerActivity.f13437n0;
            playerActivity.W();
            PlayerActivity playerActivity2 = PlayerActivity.this;
            if (g0Var != playerActivity2.f13446g0) {
                r6.f fVar = playerActivity2.f13444e0;
                k.c(fVar);
                j.a aVar2 = fVar.f24655c;
                if (aVar2 != null) {
                    if (aVar2.c(2) == 1) {
                        PlayerActivity.O(PlayerActivity.this, R.string.error_unsupported_video);
                    }
                    if (aVar2.c(1) == 1) {
                        PlayerActivity.O(PlayerActivity.this, R.string.error_unsupported_audio);
                    }
                }
                PlayerActivity.this.f13446g0 = g0Var;
            }
        }

        public /* synthetic */ void V(boolean z10) {
            q0.c(this, z10);
        }

        public void X(m mVar) {
            k.f(mVar, "e");
            PlayerActivity.f13437n0.getClass();
            int i10 = mVar.f27668a;
            boolean z10 = false;
            if (i10 == 0) {
                v6.a.d(i10 == 0);
                Throwable th = mVar.f27676i;
                th.getClass();
                Throwable th2 = (IOException) th;
                while (true) {
                    if (th2 == null) {
                        break;
                    } else if (th2 instanceof z5.b) {
                        z10 = true;
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                }
            }
            if (z10) {
                PlayerActivity.this.Q();
                PlayerActivity.this.S();
                return;
            }
            PlayerActivity.this.W();
        }

        public /* synthetic */ void Z(boolean z10) {
            q0.e(this, z10);
        }

        public /* synthetic */ void b(int i10) {
            q0.k(this, i10);
        }

        public void c(boolean z10, int i10) {
            PlayerActivity playerActivity = PlayerActivity.this;
            a aVar = PlayerActivity.f13437n0;
            playerActivity.W();
            if (i10 == 4) {
                PlayerActivity.this.f13451l0.l();
            }
        }

        public /* synthetic */ void e(boolean z10) {
            q0.f(this, z10);
        }

        public /* synthetic */ void f(o0 o0Var) {
            q0.i(this, o0Var);
        }

        public /* synthetic */ void g(int i10) {
            q0.n(this, i10);
        }

        public /* synthetic */ void k(x4.r0 r0Var, r0.b bVar) {
            q0.a(this, r0Var, bVar);
        }

        public /* synthetic */ void l(List list) {
            q0.r(this, list);
        }

        public /* synthetic */ void n(int i10) {
            q0.o(this, i10);
        }

        public /* synthetic */ void o(c1 c1Var, Object obj, int i10) {
            q0.t(this, c1Var, obj, i10);
        }

        public /* synthetic */ void p(boolean z10) {
            q0.d(this, z10);
        }

        public /* synthetic */ void q() {
            q0.p(this);
        }

        public /* synthetic */ void r(e0 e0Var, int i10) {
            q0.g(this, e0Var, i10);
        }
    }

    /* compiled from: types.kt */
    public static final class d extends gf.e0<zc.f> {
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f13455b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f13455b = componentActivity;
        }

        public Object d() {
            u0 v10 = this.f13455b.v();
            k.e(v10, "viewModelStore");
            return v10;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f13456b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f13456b = componentActivity;
        }

        public Object d() {
            return this.f13456b.l();
        }
    }

    /* compiled from: PlayerActivity.kt */
    public static final class g extends ud.l implements td.l<Stream, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f13457b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(PlayerActivity playerActivity) {
            super(1);
            this.f13457b = playerActivity;
        }

        public Object c(Object obj) {
            Stream stream = (Stream) obj;
            k.f(stream, "it");
            PlayerActivity playerActivity = this.f13457b;
            a aVar = PlayerActivity.f13437n0;
            playerActivity.P(stream, false);
            return o.f20627a;
        }
    }

    /* compiled from: PlayerActivity.kt */
    public static final class h extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f13458b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(PlayerActivity playerActivity) {
            super(0);
            this.f13458b = playerActivity;
        }

        public Object d() {
            return (zc.f) this.f13458b.I.getValue();
        }
    }

    static {
        q qVar = new q(PlayerActivity.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvclib/ui/main/player/viewmodel/PlayerViewModelFactory;", 0);
        v.f26198a.getClass();
        f13438o0 = new ae.g[]{qVar};
        CookieManager cookieManager = new CookieManager();
        f13439p0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public PlayerActivity() {
        super(R.layout.activity_player);
        d dVar = new d();
        ae.g[] gVarArr = j0.f18667a;
        k.g(dVar, "ref");
        this.I = gf.p.a(this, j0.b(dVar.f18662a), (Object) null).a(this, f13438o0[0]);
    }

    public static final void O(PlayerActivity playerActivity, int i10) {
        String string = playerActivity.getString(i10);
        k.e(string, "getString(messageId)");
        Toast.makeText(playerActivity.getApplicationContext(), string, 1).show();
    }

    public final void P(Stream stream, boolean z10) {
        ArrayList arrayList;
        int urlType = stream.getUrlType();
        if (urlType == 4) {
            Intent intent = new Intent(this, YtActivity.class);
            intent.putExtra("stream", stream);
            ((tc.e) L()).f25896w.i();
            startActivity(intent);
            if (z10) {
                finish();
            }
        } else if (urlType == 5) {
            Intent intent2 = new Intent(this, WebActivity.class);
            intent2.putExtra("stream", stream);
            ((tc.e) L()).f25896w.i();
            startActivity(intent2);
            if (z10) {
                finish();
            }
        } else if (urlType != 6) {
            U(stream);
        } else {
            String url = stream.getUrl();
            u uVar = new u();
            uVar.f26197a = "m3u8";
            String[] strArr = {"$$"};
            k.f(url, "<this>");
            k.f(strArr, "delimiters");
            String str = strArr[0];
            if (!(str.length() == 0)) {
                ce.k.r(0);
                int l10 = ce.k.l(url, str, 0, false);
                if (l10 != -1) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int i10 = 0;
                    do {
                        arrayList2.add(url.subSequence(i10, l10).toString());
                        i10 = str.length() + l10;
                        l10 = ce.k.l(url, str, i10, false);
                    } while (l10 != -1);
                    arrayList2.add(url.subSequence(i10, url.length()).toString());
                    arrayList = arrayList2;
                } else {
                    arrayList = ld.h.c(url.toString());
                }
            } else {
                ce.k.r(0);
                Iterable d10 = i.d(new ce.c(url, 0, 0, new ce.j(ld.e.a(strArr), false)));
                ArrayList arrayList3 = new ArrayList(ld.i.f(d10, 10));
                Iterator it = ((i.a) d10).iterator();
                while (it.hasNext()) {
                    zd.c cVar = (zd.c) it.next();
                    k.f(url, "<this>");
                    k.f(cVar, "range");
                    arrayList3.add(url.subSequence(cVar.s().intValue(), cVar.q().intValue() + 1).toString());
                }
                arrayList = arrayList3;
            }
            if (arrayList.size() > 1) {
                url = (String) arrayList.get(0);
                uVar.f26197a = arrayList.get(1);
            }
            M(true);
            WebView webView = new WebView(this);
            this.f13452m0 = webView;
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setUserAgentString(stream.getUserAgent());
                settings.setDomStorageEnabled(true);
            }
            WebView webView2 = this.f13452m0;
            if (webView2 != null) {
                webView2.setWebViewClient(new xc.e(this, arrayList, uVar));
            }
            WebView webView3 = this.f13452m0;
            if (webView3 != null) {
                webView3.loadUrl(url, stream.getHeaders());
            }
        }
    }

    public final void Q() {
        this.f13447h0 = true;
        this.f13448i0 = -1;
        this.f13449j0 = -9223372036854775807L;
    }

    public final zc.c R() {
        return (zc.c) this.J.getValue();
    }

    public final void S() {
        int i10;
        if (this.f13442c0 == null) {
            if (this.f13443d0 != null) {
                r6.f fVar = new r6.f(this, new a.b());
                this.f13444e0 = fVar;
                k.c(fVar);
                f.c cVar = this.f13445f0;
                k.c(cVar);
                fVar.i(cVar);
                this.f13446g0 = null;
                x4.l lVar = new x4.l(this);
                lVar.f27643b = 0;
                a1.b bVar = new a1.b(this, lVar);
                r6.f fVar2 = this.f13444e0;
                k.c(fVar2);
                v6.a.d(!bVar.f27389q);
                bVar.f27376d = fVar2;
                v6.a.d(!bVar.f27389q);
                bVar.f27389q = true;
                a1 a1Var = new a1(bVar);
                a1Var.u(new c());
                z4.d dVar = z4.d.f28337f;
                a1Var.Y();
                if (!a1Var.I) {
                    if (!v6.e0.a(a1Var.f27372z, dVar)) {
                        a1Var.f27372z = dVar;
                        a1Var.P(1, 3, dVar);
                        a1Var.f27359m.c(v6.e0.A(1));
                        y4.v vVar = a1Var.f27356j;
                        x.a e02 = vVar.e0();
                        y4.u uVar = new y4.u(e02, dVar);
                        vVar.f28080e.put(1016, e02);
                        v6.o<x, x.b> oVar = vVar.f28081f;
                        oVar.b(1016, uVar);
                        oVar.a();
                        Iterator<z4.f> it = a1Var.f27352f.iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                    }
                    a1Var.f27358l.c(dVar);
                    boolean k10 = a1Var.k();
                    int e10 = a1Var.f27358l.e(k10, a1Var.W());
                    a1Var.X(k10, e10, a1.M(k10, e10));
                }
                boolean z10 = this.f13447h0;
                a1Var.Y();
                int e11 = a1Var.f27358l.e(z10, a1Var.W());
                a1Var.X(z10, e11, a1.M(z10, e11));
                v6.k kVar = new v6.k(this.f13444e0);
                y4.v vVar2 = a1Var.f27356j;
                vVar2.getClass();
                v6.o<x, x.b> oVar2 = vVar2.f28081f;
                if (!oVar2.f26485h) {
                    oVar2.f26482e.add(new o.c(kVar, oVar2.f26480c));
                }
                this.f13442c0 = a1Var;
                ((tc.e) L()).f25896w.setPlayer(this.f13442c0);
                ((tc.e) L()).f25896w.setRewindIncrementMs(10000);
                ((tc.e) L()).f25896w.setFastForwardIncrementMs(10000);
                ((tc.e) L()).f25896w.setPlaybackPreparer(this);
            } else {
                return;
            }
        }
        boolean z11 = this.f13448i0 != -1;
        if (z11) {
            a1 a1Var2 = this.f13442c0;
            k.c(a1Var2);
            a1Var2.i(this.f13448i0, this.f13449j0);
        }
        a1 a1Var3 = this.f13442c0;
        k.c(a1Var3);
        r rVar = this.f13443d0;
        k.c(rVar);
        boolean z12 = !z11;
        a1Var3.Y();
        List singletonList = Collections.singletonList(rVar);
        int i11 = z12 ? 0 : -1;
        a1Var3.Y();
        a1Var3.f27356j.getClass();
        w wVar = a1Var3.f27349c;
        int J2 = wVar.J();
        long G = wVar.G();
        wVar.f27751s++;
        if (!wVar.f27742j.isEmpty()) {
            wVar.O(0, wVar.f27742j.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < singletonList.size(); i12++) {
            l0.c cVar2 = new l0.c((r) singletonList.get(i12), wVar.f27743k);
            arrayList.add(cVar2);
            wVar.f27742j.add(i12 + 0, new w.a(cVar2.f27664b, cVar2.f27663a.f28611v));
        }
        d0 d10 = wVar.f27755w.d(0, arrayList.size());
        wVar.f27755w = d10;
        t0 t0Var = new t0(wVar.f27742j, d10);
        if (t0Var.q() || i11 < t0Var.f27725e) {
            if (i11 == -1) {
                i10 = J2;
            } else {
                i10 = i11;
                G = -9223372036854775807L;
            }
            n0 M2 = wVar.M(wVar.f27756x, t0Var, wVar.K(t0Var, i10, G));
            int i13 = M2.f27682d;
            if (!(i10 == -1 || i13 == 1)) {
                i13 = (t0Var.q() || i10 >= t0Var.f27725e) ? 4 : 2;
            }
            n0 g10 = M2.g(i13);
            wVar.f27739g.f27772g.Q(17, new y.a(arrayList, wVar.f27755w, i10, x4.f.b(G), (x4.x) null)).sendToTarget();
            wVar.Q(g10, false, 4, 0, 1, false);
            a1Var3.b();
            W();
            return;
        }
        throw new c0((c1) t0Var, i11, -9223372036854775807L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T() {
        /*
            r13 = this;
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "type"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r1 = 1
            r2 = 0
            java.lang.String r4 = "msg"
            java.lang.String r5 = "id"
            if (r0 == r1) goto L_0x009c
            r1 = 2
            if (r0 == r1) goto L_0x0073
            r1 = 3
            if (r0 == r1) goto L_0x0021
            java.lang.String r0 = "data: null"
            ud.k.f(r0, r4)
            goto L_0x00c4
        L_0x0021:
            android.content.Intent r0 = r13.getIntent()
            android.net.Uri r0 = r0.getData()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r7 = r1
            goto L_0x0037
        L_0x002f:
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0036
            goto L_0x002d
        L_0x0036:
            r7 = r0
        L_0x0037:
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r2 = "ua"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0045
            r9 = r1
            goto L_0x0046
        L_0x0045:
            r9 = r0
        L_0x0046:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "direct: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            ud.k.f(r0, r4)
            dev.pankaj.ytvclib.data.model.Stream r0 = new dev.pankaj.ytvclib.data.model.Stream
            r8 = 1
            r10 = 0
            r11 = 16
            r12 = 0
            java.lang.String r6 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.U(r0)
            goto L_0x00c4
        L_0x0073:
            android.content.Intent r0 = r13.getIntent()
            long r0 = r0.getLongExtra(r5, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "event: "
            java.lang.String r2 = ud.k.j(r3, r2)
            ud.k.f(r2, r4)
            zc.c r2 = r13.R()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.getClass()
            ud.k.f(r0, r5)
            androidx.lifecycle.b0<java.lang.String> r1 = r2.f28825f
            r1.l(r0)
            goto L_0x00c4
        L_0x009c:
            android.content.Intent r0 = r13.getIntent()
            long r0 = r0.getLongExtra(r5, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "channel: "
            java.lang.String r2 = ud.k.j(r3, r2)
            ud.k.f(r2, r4)
            zc.c r2 = r13.R()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.getClass()
            ud.k.f(r0, r5)
            androidx.lifecycle.b0<java.lang.String> r1 = r2.f28824e
            r1.l(r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.main.PlayerActivity.T():void");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [z5.r] */
    /* JADX WARNING: type inference failed for: r8v6, types: [com.google.android.exoplayer2.source.dash.DashMediaSource] */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource] */
    /* JADX WARNING: type inference failed for: r4v18, types: [com.google.android.exoplayer2.source.hls.HlsMediaSource] */
    /* JADX WARNING: type inference failed for: r8v8, types: [z5.y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(dev.pankaj.ytvclib.data.model.Stream r21) {
        /*
            r20 = this;
            r1 = r20
            java.util.Map r2 = r21.getHeaders()
            int r0 = r21.getUrlType()
            r3 = 2
            if (r0 != r3) goto L_0x0069
            sc.f r0 = r1.D
            java.lang.String r4 = r21.getUrl()
            java.lang.String r5 = "url"
            ud.k.f(r4, r5)
            if (r0 != 0) goto L_0x001b
            goto L_0x006d
        L_0x001b:
            dev.pankaj.ytvclib.utils.C r5 = dev.pankaj.ytvclib.utils.C.f13466a
            sc.k r6 = r0.d()
            java.lang.String r6 = r6.f()
            sc.k r7 = r0.d()
            java.lang.String r7 = r7.a()
            sc.k r0 = r0.d()
            java.lang.String r8 = r0.g()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0056 }
            java.lang.String r9 = "M/d/y h:mm:ss a"
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ Exception -> 0x0056 }
            r0.<init>(r9, r10)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r9 = "gmt"
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ Exception -> 0x0056 }
            r0.setTimeZone(r9)     // Catch:{ Exception -> 0x0056 }
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x0056 }
            r9.<init>()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r0 = r0.format(r9)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r9 = "{\n            SimpleDate….format(Date())\n        }"
            ud.k.e(r0, r9)     // Catch:{ Exception -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = ""
        L_0x005c:
            java.lang.String r0 = r5.wma(r6, r7, r8, r0)
            java.lang.String r0 = ud.k.j(r4, r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r4 = r0
            goto L_0x006d
        L_0x0069:
            java.lang.String r4 = r21.getUrl()
        L_0x006d:
            r1.K = r4
            java.lang.String r0 = r21.getUserAgent()
            r1.M = r0
            int r0 = r0.length()
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r1.L
            r1.M = r0
        L_0x0086:
            com.google.android.exoplayer2.upstream.j r0 = new com.google.android.exoplayer2.upstream.j
            java.lang.String r6 = r1.M
            r0.<init>(r6)
            r1.f13440a0 = r0
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r5
            r6 = 0
            if (r0 == 0) goto L_0x00ae
            com.google.android.exoplayer2.upstream.j r0 = r1.f13440a0
            if (r0 != 0) goto L_0x009c
            goto L_0x00ae
        L_0x009c:
            com.google.android.exoplayer2.upstream.m$g r7 = r0.f5523a
            if (r7 != 0) goto L_0x00a1
            goto L_0x00ae
        L_0x00a1:
            monitor-enter(r7)
            r7.f5527b = r6     // Catch:{ all -> 0x00ab }
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.f5526a     // Catch:{ all -> 0x00ab }
            r0.putAll(r2)     // Catch:{ all -> 0x00ab }
            monitor-exit(r7)
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00ae:
            com.google.android.exoplayer2.upstream.q$a r0 = new com.google.android.exoplayer2.upstream.q$a
            com.google.android.exoplayer2.upstream.h r2 = new com.google.android.exoplayer2.upstream.h
            com.google.android.exoplayer2.upstream.j r7 = r1.f13440a0
            ud.k.c(r7)
            r2.<init>(r1, r7)
            t4.p r7 = t4.p.f25719d
            r0.<init>(r2, r7)
            r1.Z = r0
            java.lang.String r0 = r1.K
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = "parse(this)"
            ud.k.e(r0, r2)
            int r2 = v6.e0.f26436a
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r7 = 3
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = r0.getPath()
            if (r2 != 0) goto L_0x00dd
            r2 = 3
            goto L_0x00e8
        L_0x00dd:
            int r2 = v6.e0.E(r2)
            goto L_0x00e8
        L_0x00e2:
            java.lang.String r2 = ".null"
            int r2 = v6.e0.E(r2)
        L_0x00e8:
            if (r2 == 0) goto L_0x0249
            if (r2 == r5) goto L_0x01c9
            if (r2 == r3) goto L_0x0136
            if (r2 != r7) goto L_0x0126
            com.google.android.exoplayer2.upstream.e$a r10 = r1.Z
            ud.k.c(r10)
            d5.g r11 = new d5.g
            r11.<init>()
            c5.e r2 = new c5.e
            r2.<init>()
            com.google.android.exoplayer2.upstream.k r13 = new com.google.android.exoplayer2.upstream.k
            r13.<init>()
            r14 = 1048576(0x100000, float:1.469368E-39)
            x4.e0$c r3 = new x4.e0$c
            r3.<init>()
            r3.f27511b = r0
            x4.e0 r9 = r3.a()
            x4.e0$g r0 = r9.f27504b
            r0.getClass()
            x4.e0$g r0 = r9.f27504b
            java.lang.Object r0 = r0.f27561h
            z5.y r0 = new z5.y
            c5.l r12 = r2.b(r9)
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x02f0
        L_0x0126:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Unsupported type: "
            java.lang.String r2 = ud.k.j(r3, r2)
            r0.<init>(r2)
            throw r0
        L_0x0136:
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r2 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            com.google.android.exoplayer2.upstream.e$a r3 = r1.Z
            ud.k.c(r3)
            r2.<init>(r3)
            r2.f5151h = r5
            x4.e0$c r3 = new x4.e0$c
            r3.<init>()
            r3.f27511b = r0
            java.lang.String r0 = "application/x-mpegURL"
            r3.f27512c = r0
            x4.e0 r0 = r3.a()
            x4.e0$g r3 = r0.f27504b
            r3.getClass()
            f6.h r3 = r2.f5146c
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0165
            java.util.List<y5.c> r6 = r2.f5153j
            goto L_0x0169
        L_0x0165:
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
        L_0x0169:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0175
            f6.c r7 = new f6.c
            r7.<init>(r3, r6)
            r3 = r7
        L_0x0175:
            x4.e0$g r7 = r0.f27504b
            java.lang.Object r8 = r7.f27561h
            java.util.List<y5.c> r7 = r7.f27558e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0188
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0188
            r4 = 1
        L_0x0188:
            if (r4 == 0) goto L_0x0195
            x4.e0$c r0 = r0.a()
            r0.b(r6)
            x4.e0 r0 = r0.a()
        L_0x0195:
            r5 = r0
            com.google.android.exoplayer2.source.hls.HlsMediaSource r0 = new com.google.android.exoplayer2.source.hls.HlsMediaSource
            e6.e r6 = r2.f5144a
            e6.f r7 = r2.f5145b
            de.a0 r8 = r2.f5148e
            c5.m r4 = r2.f5149f
            c5.e r4 = (c5.e) r4
            c5.l r9 = r4.b(r5)
            u6.h r10 = r2.f5150g
            f6.i$a r4 = r2.f5147d
            e6.e r11 = r2.f5144a
            t4.l r4 = (t4.l) r4
            r4.getClass()
            f6.b r12 = new f6.b
            r12.<init>(r11, r10, r3)
            long r13 = r2.f5154k
            boolean r3 = r2.f5151h
            int r15 = r2.f5152i
            r16 = 0
            r17 = 0
            r4 = r0
            r11 = r12
            r12 = r13
            r14 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            goto L_0x02f0
        L_0x01c9:
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory r2 = new com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory
            com.google.android.exoplayer2.upstream.e$a r3 = r1.Z
            ud.k.c(r3)
            r2.<init>(r3)
            x4.e0$c r3 = new x4.e0$c
            r3.<init>()
            r3.f27511b = r0
            x4.e0 r0 = r3.a()
            x4.e0$g r3 = r0.f27504b
            r3.getClass()
            g6.b r3 = new g6.b
            r3.<init>()
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x01f7
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
            goto L_0x01f9
        L_0x01f7:
            java.util.List<y5.c> r6 = r2.f5288g
        L_0x01f9:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0206
            y5.b r7 = new y5.b
            r7.<init>(r3, r6)
            r12 = r7
            goto L_0x0207
        L_0x0206:
            r12 = r3
        L_0x0207:
            x4.e0$g r3 = r0.f27504b
            java.lang.Object r7 = r3.f27561h
            java.util.List<y5.c> r3 = r3.f27558e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x021a
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x021a
            r4 = 1
        L_0x021a:
            if (r4 == 0) goto L_0x0227
            x4.e0$c r0 = r0.a()
            r0.b(r6)
            x4.e0 r0 = r0.a()
        L_0x0227:
            r9 = r0
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource r0 = new com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource
            r10 = 0
            com.google.android.exoplayer2.upstream.e$a r11 = r2.f5283b
            com.google.android.exoplayer2.source.smoothstreaming.b$a r13 = r2.f5282a
            de.a0 r14 = r2.f5284c
            c5.m r3 = r2.f5285d
            c5.e r3 = (c5.e) r3
            c5.l r15 = r3.b(r9)
            u6.h r3 = r2.f5286e
            long r4 = r2.f5287f
            r19 = 0
            r8 = r0
            r16 = r3
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            goto L_0x02f0
        L_0x0249:
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            com.google.android.exoplayer2.upstream.e$a r3 = r1.Z
            ud.k.c(r3)
            r2.<init>(r3)
            x4.e0$c r3 = new x4.e0$c
            r3.<init>()
            r3.f27511b = r0
            java.lang.String r0 = "application/dash+xml"
            r3.f27512c = r0
            r3.f27530u = r6
            x4.e0 r0 = r3.a()
            x4.e0$g r3 = r0.f27504b
            r3.getClass()
            d6.c r3 = new d6.c
            r3.<init>()
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x027b
            java.util.List<y5.c> r6 = r2.f5047h
            goto L_0x027f
        L_0x027b:
            x4.e0$g r6 = r0.f27504b
            java.util.List<y5.c> r6 = r6.f27558e
        L_0x027f:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x028c
            y5.b r7 = new y5.b
            r7.<init>(r3, r6)
            r12 = r7
            goto L_0x028d
        L_0x028c:
            r12 = r3
        L_0x028d:
            x4.e0$g r3 = r0.f27504b
            java.lang.Object r7 = r3.f27561h
            java.util.List<y5.c> r3 = r3.f27558e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02a1
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x02a1
            r3 = 1
            goto L_0x02a2
        L_0x02a1:
            r3 = 0
        L_0x02a2:
            x4.e0$f r7 = r0.f27505c
            long r7 = r7.f27549a
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x02b6
            long r7 = r2.f5045f
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x02b6
            r4 = 1
        L_0x02b6:
            if (r3 != 0) goto L_0x02bd
            if (r4 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r9 = r0
            goto L_0x02d1
        L_0x02bd:
            x4.e0$c r0 = r0.a()
            if (r3 == 0) goto L_0x02c6
            r0.b(r6)
        L_0x02c6:
            if (r4 == 0) goto L_0x02cc
            long r3 = r2.f5045f
            r0.f27532w = r3
        L_0x02cc:
            x4.e0 r0 = r0.a()
            goto L_0x02bb
        L_0x02d1:
            com.google.android.exoplayer2.source.dash.DashMediaSource r0 = new com.google.android.exoplayer2.source.dash.DashMediaSource
            r10 = 0
            com.google.android.exoplayer2.upstream.e$a r11 = r2.f5041b
            com.google.android.exoplayer2.source.dash.a$a r13 = r2.f5040a
            de.a0 r14 = r2.f5043d
            c5.m r3 = r2.f5042c
            c5.e r3 = (c5.e) r3
            c5.l r15 = r3.b(r9)
            u6.h r3 = r2.f5044e
            long r4 = r2.f5046g
            r19 = 0
            r8 = r0
            r16 = r3
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
        L_0x02f0:
            r1.f13443d0 = r0
            r20.Q()
            r20.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.main.PlayerActivity.U(dev.pankaj.ytvclib.data.model.Stream):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void V() {
        /*
            r14 = this;
            x4.a1 r0 = r14.f13442c0
            if (r0 == 0) goto L_0x0185
            r6.f r0 = r14.f13444e0
            if (r0 == 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference<r6.f$c> r0 = r0.f24579e
            java.lang.Object r0 = r0.get()
            r6.f$c r0 = (r6.f.c) r0
            r14.f13445f0 = r0
        L_0x0012:
            r14.X()
            x4.a1 r0 = r14.f13442c0
            ud.k.c(r0)
            r0.Y()
            int r1 = v6.e0.f26436a
            r2 = 21
            r3 = 0
            if (r1 >= r2) goto L_0x002d
            android.media.AudioTrack r1 = r0.f27363q
            if (r1 == 0) goto L_0x002d
            r1.release()
            r0.f27363q = r3
        L_0x002d:
            x4.b r1 = r0.f27357k
            r2 = 0
            r1.a(r2)
            x4.b1 r1 = r0.f27359m
            x4.b1$c r4 = r1.f27445e
            if (r4 == 0) goto L_0x0049
            android.content.Context r5 = r1.f27441a     // Catch:{ RuntimeException -> 0x003f }
            r5.unregisterReceiver(r4)     // Catch:{ RuntimeException -> 0x003f }
            goto L_0x0047
        L_0x003f:
            r4 = move-exception
            java.lang.String r5 = "StreamVolumeManager"
            java.lang.String r6 = "Error unregistering stream volume receiver"
            v6.p.d(r5, r6, r4)
        L_0x0047:
            r1.f27445e = r3
        L_0x0049:
            x4.d1 r1 = r0.f27360n
            r1.f27491d = r2
            r1.a()
            x4.e1 r1 = r0.f27361o
            r1.f27565d = r2
            r1.a()
            x4.c r1 = r0.f27358l
            r1.f27453c = r3
            r1.a()
            x4.w r1 = r0.f27349c
            r1.getClass()
            java.lang.String r4 = "ExoPlayerImpl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Release "
            r5.append(r6)
            int r6 = java.lang.System.identityHashCode(r1)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r6 = " ["
            r5.append(r6)
            java.lang.String r6 = "ExoPlayerLib/2.13.3"
            r5.append(r6)
            java.lang.String r6 = "] ["
            r5.append(r6)
            java.lang.String r6 = v6.e0.f26440e
            r5.append(r6)
            java.lang.String r6 = "] ["
            r5.append(r6)
            java.util.HashSet<java.lang.String> r6 = x4.z.f27808a
            java.lang.Class<x4.z> r6 = x4.z.class
            monitor-enter(r6)
            java.lang.String r7 = x4.z.f27809b     // Catch:{ all -> 0x0182 }
            monitor-exit(r6)
            r5.append(r7)
            java.lang.String r6 = "]"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r4, r5)
            x4.y r4 = r1.f27739g
            monitor-enter(r4)
            boolean r5 = r4.G     // Catch:{ all -> 0x017f }
            r6 = 0
            r8 = 1
            if (r5 != 0) goto L_0x00fd
            android.os.HandlerThread r5 = r4.f27773h     // Catch:{ all -> 0x017f }
            boolean r5 = r5.isAlive()     // Catch:{ all -> 0x017f }
            if (r5 != 0) goto L_0x00bd
            goto L_0x00fd
        L_0x00bd:
            b2.t r5 = r4.f27772g     // Catch:{ all -> 0x017f }
            r9 = 7
            r5.U(r9)     // Catch:{ all -> 0x017f }
            long r9 = r4.C     // Catch:{ all -> 0x017f }
            monitor-enter(r4)     // Catch:{ all -> 0x017f }
            v6.b r5 = r4.f27781x     // Catch:{ all -> 0x00fa }
            long r11 = r5.a()     // Catch:{ all -> 0x00fa }
            long r11 = r11 + r9
            r5 = 0
        L_0x00ce:
            boolean r13 = r4.G     // Catch:{ all -> 0x00fa }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x00fa }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x00fa }
            if (r13 != 0) goto L_0x00ec
            int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ec
            r4.wait(r9)     // Catch:{ InterruptedException -> 0x00e2 }
            goto L_0x00e3
        L_0x00e2:
            r5 = 1
        L_0x00e3:
            v6.b r9 = r4.f27781x     // Catch:{ all -> 0x00fa }
            long r9 = r9.a()     // Catch:{ all -> 0x00fa }
            long r9 = r11 - r9
            goto L_0x00ce
        L_0x00ec:
            if (r5 == 0) goto L_0x00f5
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00fa }
            r5.interrupt()     // Catch:{ all -> 0x00fa }
        L_0x00f5:
            monitor-exit(r4)     // Catch:{ all -> 0x017f }
            boolean r5 = r4.G     // Catch:{ all -> 0x017f }
            monitor-exit(r4)
            goto L_0x00ff
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017f }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x00fd:
            monitor-exit(r4)
            r5 = 1
        L_0x00ff:
            if (r5 != 0) goto L_0x010d
            v6.o<x4.r0$a, x4.r0$b> r4 = r1.f27740h
            r5 = 11
            x4.v r9 = x4.v.f27733a
            r4.b(r5, r9)
            r4.a()
        L_0x010d:
            v6.o<x4.r0$a, x4.r0$b> r4 = r1.f27740h
            r4.c()
            b2.t r4 = r1.f27737e
            java.lang.Object r4 = r4.f3445b
            android.os.Handler r4 = (android.os.Handler) r4
            r4.removeCallbacksAndMessages(r3)
            y4.v r4 = r1.f27745m
            if (r4 == 0) goto L_0x0124
            u6.b r5 = r1.f27747o
            r5.g(r4)
        L_0x0124:
            x4.n0 r4 = r1.f27756x
            x4.n0 r4 = r4.g(r8)
            r1.f27756x = r4
            z5.r$a r5 = r4.f27680b
            x4.n0 r4 = r4.a(r5)
            r1.f27756x = r4
            long r9 = r4.f27696r
            r4.f27694p = r9
            x4.n0 r1 = r1.f27756x
            r1.f27695q = r6
            y4.v r1 = r0.f27356j
            y4.x$a r4 = r1.Y()
            android.util.SparseArray<y4.x$a> r5 = r1.f28080e
            r6 = 1036(0x40c, float:1.452E-42)
            r5.put(r6, r4)
            v6.o<y4.x, y4.x$b> r1 = r1.f28081f
            y4.n r5 = new y4.n
            r5.<init>(r4, r2)
            b2.t r1 = r1.f26479b
            java.lang.Object r1 = r1.f3445b
            android.os.Handler r1 = (android.os.Handler) r1
            android.os.Message r1 = r1.obtainMessage(r8, r6, r2, r5)
            r1.sendToTarget()
            r0.O()
            android.view.Surface r1 = r0.f27364r
            if (r1 == 0) goto L_0x016d
            boolean r2 = r0.f27365s
            if (r2 == 0) goto L_0x016b
            r1.release()
        L_0x016b:
            r0.f27364r = r3
        L_0x016d:
            boolean r1 = r0.H
            if (r1 != 0) goto L_0x017e
            java.util.List r1 = java.util.Collections.emptyList()
            r0.C = r1
            r0.I = r8
            r14.f13442c0 = r3
            r14.f13444e0 = r3
            goto L_0x0185
        L_0x017e:
            throw r3
        L_0x017f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0182:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.main.PlayerActivity.V():void");
    }

    public final void W() {
        ImageButton imageButton = this.N;
        if (imageButton != null) {
            imageButton.setEnabled(this.f13442c0 != null && ad.i.y0(this.f13444e0));
        }
    }

    public final void X() {
        a1 a1Var = this.f13442c0;
        if (a1Var != null) {
            k.c(a1Var);
            this.f13447h0 = a1Var.k();
            a1 a1Var2 = this.f13442c0;
            k.c(a1Var2);
            this.f13448i0 = a1Var2.D();
            a1 a1Var3 = this.f13442c0;
            k.c(a1Var3);
            this.f13449j0 = Math.max(0, a1Var3.g());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        k.f(keyEvent, "event");
        return ((tc.e) L()).f25896w.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void o() {
        a1 a1Var = this.f13442c0;
        if (a1Var != null) {
            a1Var.Y();
            a1Var.b();
        }
    }

    public void onBackPressed() {
        sc.a a10;
        sc.f fVar = this.D;
        boolean z10 = false;
        if (!(fVar == null || (a10 = fVar.a()) == null || a10.b() != 2)) {
            z10 = true;
        }
        if (z10) {
            dev.pankaj.ytvclib.utils.b bVar = this.f13450k0;
            if (bVar != null) {
                bVar.g();
            } else {
                k.l("adUtil");
                throw null;
            }
        }
        this.f329g.b();
    }

    public void onClick(View view) {
        r6.f fVar;
        List<f.e> list;
        k.f(view, "view");
        int i10 = 0;
        if (k.a(view, this.O)) {
            Uri parse = Uri.parse(this.K);
            k.e(parse, "parse(this)");
            String str = this.M;
            k.f(this, "activity");
            k.f(parse, "uri");
            k.f(str, "userAgent");
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.instantbits.cast.webvideo");
                intent.putExtra("secure_uri", true);
                intent.putExtra("android.media.intent.extra.HTTP_HEADERS", new String[]{"User-Agent", str});
                startActivity(intent);
                finish();
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
                b.a aVar = new b.a(this);
                AlertController.b bVar = aVar.f441a;
                bVar.f424d = bVar.f421a.getText(R.string.important);
                AlertController.b bVar2 = aVar.f441a;
                bVar2.f426f = "Web Cast Video Player is not installed. Would you like to install it now?";
                oc.a aVar2 = new oc.a((f.i) this, "com.instantbits.cast.webvideo");
                bVar2.f427g = "Yes";
                bVar2.f428h = aVar2;
                bVar2.f429i = "No";
                bVar2.f430j = null;
                aVar.create().show();
            }
        } else if (k.a(view, this.P)) {
            startService(new Intent(getApplicationContext(), DLNAService.class));
            wc.j jVar = wc.j.f27200c;
            List<ze.f> list2 = wc.j.f27201d.f27202a;
            if (list2 != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367057);
                for (ze.f i11 : list2) {
                    arrayAdapter.add(i11.i());
                }
                b.a aVar3 = new b.a(this);
                aVar3.setTitle(getString(R.string.choose_device));
                xc.a aVar4 = new xc.a(list2, this);
                AlertController.b bVar3 = aVar3.f441a;
                bVar3.f432l = arrayAdapter;
                bVar3.f433m = aVar4;
                aVar3.create().show();
            }
        } else if (k.a(view, this.Q)) {
            this.f13441b0 = !this.f13441b0;
            PlayerView playerView = ((tc.e) L()).f25896w;
            if (this.f13441b0) {
                i10 = 3;
            }
            playerView.setResizeMode(i10);
        } else if (k.a(view, this.R)) {
            if (Build.VERSION.SDK_INT >= 26 && getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
            }
        } else if (k.a(view, this.N) && !this.S && (fVar = this.f13444e0) != null && ad.i.y0(fVar)) {
            this.S = true;
            r6.f fVar2 = this.f13444e0;
            xc.b bVar4 = new xc.b(this);
            j.a aVar5 = fVar2.f24655c;
            aVar5.getClass();
            ad.i iVar = new ad.i();
            f.c cVar = fVar2.f24579e.get();
            ad.h hVar = new ad.h(cVar, aVar5, iVar, fVar2);
            iVar.F0 = R.string.track_selection_title;
            iVar.G0 = hVar;
            iVar.H0 = bVar4;
            for (int i12 = 0; i12 < aVar5.f24656a; i12++) {
                if (ad.i.x0(aVar5, i12)) {
                    int i13 = aVar5.f24658c[i12];
                    g0 g0Var = aVar5.f24659d[i12];
                    i.b bVar5 = new i.b();
                    boolean a10 = cVar.a(i12);
                    f.e b10 = cVar.b(i12, g0Var);
                    bVar5.f277p0 = aVar5;
                    bVar5.f278q0 = i12;
                    bVar5.f275n0 = a10;
                    if (b10 == null) {
                        list = Collections.emptyList();
                    } else {
                        list = Collections.singletonList(b10);
                    }
                    bVar5.f276o0 = list;
                    bVar5.f279r0 = true;
                    bVar5.f280s0 = false;
                    iVar.D0.put(i12, bVar5);
                    iVar.E0.add(Integer.valueOf(i13));
                }
            }
            iVar.w0(F(), (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            java.net.CookieHandler r0 = java.net.CookieHandler.getDefault()
            java.net.CookieManager r1 = f13439p0
            if (r0 == r1) goto L_0x000e
            java.net.CookieHandler.setDefault(r1)
        L_0x000e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            if (r0 < r1) goto L_0x001f
            android.view.Window r0 = r6.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r0.layoutInDisplayCutoutMode = r2
        L_0x001f:
            dev.pankaj.ytvclib.utils.b$c r0 = dev.pankaj.ytvclib.utils.b.f13468i
            sc.f r1 = r6.D
            dev.pankaj.ytvclib.utils.b r0 = r0.a(r6, r1)
            r6.f13450k0 = r0
            sc.f r0 = r6.D
            r1 = 0
            if (r0 != 0) goto L_0x002f
            goto L_0x003e
        L_0x002f:
            sc.a r0 = r0.a()
            if (r0 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            int r0 = r0.b()
            if (r0 != r2) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0054
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            xc.c r3 = new xc.c
            r3.<init>(r6, r1)
            r4 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r3, r4)
        L_0x0054:
            com.google.android.exoplayer2.upstream.j r0 = new com.google.android.exoplayer2.upstream.j
            java.lang.String r3 = r6.L
            r0.<init>(r3)
            r6.f13440a0 = r0
            com.google.android.exoplayer2.upstream.h r3 = new com.google.android.exoplayer2.upstream.h
            r3.<init>(r6, r0)
            r6.Z = r3
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            com.google.android.exoplayer2.ui.PlayerView r0 = r0.f25896w
            r0.setControllerVisibilityListener(r6)
            dev.pankaj.ytvclib.ui.main.PlayerActivity$b r3 = new dev.pankaj.ytvclib.ui.main.PlayerActivity$b
            r3.<init>()
            r0.setErrorMessageProvider(r3)
            r0.requestFocus()
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.O = r0
            if (r0 != 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r0.setOnClickListener(r6)
        L_0x0093:
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131427572(0x7f0b00f4, float:1.8476764E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.P = r0
            if (r0 != 0) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            r0.setOnClickListener(r6)
        L_0x00ac:
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131427958(0x7f0b0276, float:1.8477547E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.Q = r0
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r0.setOnClickListener(r6)
        L_0x00c5:
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131427941(0x7f0b0265, float:1.8477512E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.R = r0
            if (r0 != 0) goto L_0x00db
            goto L_0x00ee
        L_0x00db:
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            java.lang.String r4 = "android.software.picture_in_picture"
            boolean r3 = r3.hasSystemFeature(r4)
            if (r3 == 0) goto L_0x00e9
            r3 = 0
            goto L_0x00eb
        L_0x00e9:
            r3 = 8
        L_0x00eb:
            r0.setVisibility(r3)
        L_0x00ee:
            android.widget.ImageButton r0 = r6.R
            if (r0 != 0) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            r0.setOnClickListener(r6)
        L_0x00f6:
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131428001(0x7f0b02a1, float:1.8477634E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.N = r0
            if (r0 != 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r0.setOnClickListener(r6)
        L_0x010f:
            androidx.databinding.ViewDataBinding r0 = r6.L()
            tc.e r0 = (tc.e) r0
            android.view.View r0 = r0.f1452d
            r3 = 2131428047(0x7f0b02cf, float:1.8477727E38)
            android.view.View r0 = r0.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setHasFixedSize(r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r2.<init>(r1, r1)
            r0.setLayoutManager(r2)
            yc.a r1 = r6.f13451l0
            r0.setAdapter(r1)
            zc.c r1 = r6.R()
            kd.d r1 = r1.f28826g
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.a0 r1 = (androidx.lifecycle.a0) r1
            t4.j r2 = new t4.j
            r2.<init>((dev.pankaj.ytvclib.ui.main.PlayerActivity) r6, (androidx.recyclerview.widget.RecyclerView) r0)
            r1.f(r6, r2)
            if (r7 == 0) goto L_0x016c
            java.lang.String r0 = "track_selector_parameters"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            r6.f$c r0 = (r6.f.c) r0
            r6.f13445f0 = r0
            java.lang.String r0 = "auto_play"
            boolean r0 = r7.getBoolean(r0)
            r6.f13447h0 = r0
            java.lang.String r0 = "window"
            int r0 = r7.getInt(r0)
            r6.f13448i0 = r0
            java.lang.String r0 = "position"
            long r0 = r7.getLong(r0)
            r6.f13449j0 = r0
            goto L_0x017a
        L_0x016c:
            r6.f$d r7 = new r6.f$d
            r7.<init>(r6)
            r6.f$c r7 = r7.b()
            r6.f13445f0 = r7
            r6.Q()
        L_0x017a:
            r6.T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.ytvclib.ui.main.PlayerActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13443d0 = null;
    }

    public void onNewIntent(Intent intent) {
        k.f(intent, "intent");
        super.onNewIntent(intent);
        V();
        Q();
        setIntent(intent);
    }

    public void onPause() {
        super.onPause();
        if (v6.e0.f26436a <= 23) {
            View view = ((tc.e) L()).f25896w.f5345d;
            if (view instanceof t6.f) {
                ((t6.f) view).onPause();
            }
            V();
        }
    }

    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        k.f(configuration, "newConfig");
        super.onPictureInPictureModeChanged(z10, configuration);
        if (z10) {
            ((tc.e) L()).f25896w.d();
        } else {
            ((tc.e) L()).f25896w.i();
        }
    }

    public void onResume() {
        super.onResume();
        if (v6.e0.f26436a <= 23 || this.f13442c0 == null) {
            S();
            View view = ((tc.e) L()).f25896w.f5345d;
            if (view instanceof t6.f) {
                ((t6.f) view).onResume();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        k.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        r6.f fVar = this.f13444e0;
        if (fVar != null) {
            this.f13445f0 = fVar.f24579e.get();
        }
        X();
        bundle.putParcelable("track_selector_parameters", this.f13445f0);
        bundle.putBoolean("auto_play", this.f13447h0);
        bundle.putInt("window", this.f13448i0);
        bundle.putLong("position", this.f13449j0);
    }

    public void onStart() {
        super.onStart();
        if (v6.e0.f26436a > 23) {
            S();
            View view = ((tc.e) L()).f25896w.f5345d;
            if (view instanceof t6.f) {
                ((t6.f) view).onResume();
            }
        }
    }

    public void onStop() {
        super.onStop();
        if (v6.e0.f26436a > 23) {
            View view = ((tc.e) L()).f25896w.f5345d;
            if (view instanceof t6.f) {
                ((t6.f) view).onPause();
            }
            V();
        }
    }

    public void x(int i10) {
        if (i10 == 0) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }
}
