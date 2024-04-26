package v6;

import a5.d;
import a5.g;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import q.b;
import q5.a;
import r6.j;
import r6.l;
import t.f;
import x4.b0;
import x4.c1;
import x4.e0;
import x4.m;
import x4.o0;
import x4.r0;
import y4.w;
import y4.x;
import z5.f0;
import z5.g0;
import z5.n;

/* compiled from: EventLogger */
public class k implements x {

    /* renamed from: e  reason: collision with root package name */
    public static final NumberFormat f26463e;

    /* renamed from: a  reason: collision with root package name */
    public final j f26464a;

    /* renamed from: b  reason: collision with root package name */
    public final c1.c f26465b = new c1.c();

    /* renamed from: c  reason: collision with root package name */
    public final c1.b f26466c = new c1.b();

    /* renamed from: d  reason: collision with root package name */
    public final long f26467d = SystemClock.elapsedRealtime();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        f26463e = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public k(j jVar) {
        this.f26464a = jVar;
    }

    public static String h0(long j10) {
        return j10 == -9223372036854775807L ? "?" : f26463e.format((double) (((float) j10) / 1000.0f));
    }

    public void A(x.a aVar, int i10, long j10, long j11) {
        Log.e("EventLogger", f0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11, (Throwable) null));
    }

    public void B(x.a aVar, z5.k kVar, n nVar, IOException iOException, boolean z10) {
        Log.e("EventLogger", f0(aVar, "internalError", "loadError", iOException));
    }

    public /* synthetic */ void C(x.a aVar, int i10, d dVar) {
        w.c(this, aVar, i10, dVar);
    }

    public void D(x.a aVar, boolean z10) {
        Log.d("EventLogger", f0(aVar, "isPlaying", Boolean.toString(z10), (Throwable) null));
    }

    public void E(x.a aVar, boolean z10) {
        Log.d("EventLogger", f0(aVar, "shuffleModeEnabled", Boolean.toString(z10), (Throwable) null));
    }

    public void F(x.a aVar, z5.k kVar, n nVar) {
    }

    public /* synthetic */ void G(x.a aVar, int i10, b0 b0Var) {
        w.f(this, aVar, i10, b0Var);
    }

    public void H(x.a aVar, m mVar) {
        Log.e("EventLogger", f0(aVar, "playerFailed", (String) null, mVar));
    }

    public void I(x.a aVar, z4.d dVar) {
        Log.d("EventLogger", f0(aVar, "audioAttributes", dVar.f28338a + "," + dVar.f28339b + "," + dVar.f28340c + "," + dVar.f28341d, (Throwable) null));
    }

    public void J(x.a aVar, d dVar) {
        Log.d("EventLogger", f0(aVar, "videoDisabled", (String) null, (Throwable) null));
    }

    public void K(x.a aVar, d dVar) {
        Log.d("EventLogger", f0(aVar, "audioDisabled", (String) null, (Throwable) null));
    }

    public /* synthetic */ void L(r0 r0Var, x.b bVar) {
        w.g(this, r0Var, bVar);
    }

    public void M(x.a aVar, z5.k kVar, n nVar) {
    }

    public void N(x.a aVar, int i10, long j10) {
        Log.d("EventLogger", f0(aVar, "droppedFrames", Integer.toString(i10), (Throwable) null));
    }

    public void O(x.a aVar, int i10) {
        Log.d("EventLogger", f0(aVar, "state", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE", (Throwable) null));
    }

    public /* synthetic */ void P(x.a aVar, int i10, String str, long j10) {
        w.e(this, aVar, i10, str, j10);
    }

    public void Q(x.a aVar, b0 b0Var, g gVar) {
        Log.d("EventLogger", f0(aVar, "audioInputFormat", b0.e(b0Var), (Throwable) null));
    }

    public void R(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "seekStarted", (String) null, (Throwable) null));
    }

    public void S(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "drmKeysLoaded", (String) null, (Throwable) null));
    }

    public /* synthetic */ void T(x.a aVar, boolean z10, int i10) {
        w.i(this, aVar, z10, i10);
    }

    public void U(x.a aVar, a aVar2) {
        StringBuilder a10 = android.support.v4.media.a.a("metadata [");
        a10.append(g0(aVar));
        Log.d("EventLogger", a10.toString());
        i0(aVar2, "  ");
        Log.d("EventLogger", "]");
    }

    public /* synthetic */ void V(x.a aVar, Exception exc) {
        w.b(this, aVar, exc);
    }

    public void W(x.a aVar, boolean z10) {
        Log.d("EventLogger", f0(aVar, "skipSilenceEnabled", Boolean.toString(z10), (Throwable) null));
    }

    public void X(x.a aVar, e0 e0Var, int i10) {
        StringBuilder a10 = android.support.v4.media.a.a("mediaItem [");
        a10.append(g0(aVar));
        a10.append(", reason=");
        a10.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        a10.append("]");
        Log.d("EventLogger", a10.toString());
    }

    public void Y(x.a aVar, int i10) {
        Log.d("EventLogger", f0(aVar, "positionDiscontinuity", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION", (Throwable) null));
    }

    public void Z(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "drmSessionAcquired", (String) null, (Throwable) null));
    }

    public void a(x.a aVar, int i10) {
        Log.d("EventLogger", f0(aVar, "repeatMode", i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF", (Throwable) null));
    }

    public void a0(x.a aVar, int i10, int i11, int i12, float f10) {
        Log.d("EventLogger", f0(aVar, "videoSize", i10 + ", " + i11, (Throwable) null));
    }

    public void b(x.a aVar, z5.k kVar, n nVar) {
    }

    public /* synthetic */ void b0(x.a aVar) {
        w.h(this, aVar);
    }

    public void c(x.a aVar, d dVar) {
        Log.d("EventLogger", f0(aVar, "videoEnabled", (String) null, (Throwable) null));
    }

    public void c0(x.a aVar, boolean z10, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        Log.d("EventLogger", f0(aVar, "playWhenReady", sb2.toString(), (Throwable) null));
    }

    public /* synthetic */ void d(x.a aVar, long j10, int i10) {
        w.k(this, aVar, j10, i10);
    }

    public void d0(x.a aVar, String str, long j10) {
        Log.d("EventLogger", f0(aVar, "audioDecoderInitialized", str, (Throwable) null));
    }

    public void e(x.a aVar, String str, long j10) {
        Log.d("EventLogger", f0(aVar, "videoDecoderInitialized", str, (Throwable) null));
    }

    public void e0(x.a aVar, boolean z10) {
        Log.d("EventLogger", f0(aVar, "loading", Boolean.toString(z10), (Throwable) null));
    }

    public void f(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "drmSessionReleased", (String) null, (Throwable) null));
    }

    public final String f0(x.a aVar, String str, String str2, Throwable th) {
        StringBuilder a10 = f.a(str, " [");
        a10.append(g0(aVar));
        String sb2 = a10.toString();
        if (str2 != null) {
            sb2 = b.a(sb2, ", ", str2);
        }
        String c10 = p.c(th);
        if (!TextUtils.isEmpty(c10)) {
            StringBuilder a11 = f.a(sb2, "\n  ");
            a11.append(c10.replace("\n", "\n  "));
            a11.append(10);
            sb2 = a11.toString();
        }
        return j.f.a(sb2, "]");
    }

    public void g(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "drmKeysRemoved", (String) null, (Throwable) null));
    }

    public final String g0(x.a aVar) {
        StringBuilder a10 = android.support.v4.media.a.a("window=");
        a10.append(aVar.f28092c);
        String sb2 = a10.toString();
        if (aVar.f28093d != null) {
            StringBuilder a11 = f.a(sb2, ", period=");
            a11.append(aVar.f28091b.b(aVar.f28093d.f28627a));
            sb2 = a11.toString();
            if (aVar.f28093d.a()) {
                StringBuilder a12 = f.a(sb2, ", adGroup=");
                a12.append(aVar.f28093d.f28628b);
                StringBuilder a13 = f.a(a12.toString(), ", ad=");
                a13.append(aVar.f28093d.f28629c);
                sb2 = a13.toString();
            }
        }
        StringBuilder a14 = android.support.v4.media.a.a("eventTime=");
        a14.append(h0(aVar.f28090a - this.f26467d));
        a14.append(", mediaPos=");
        a14.append(h0(aVar.f28094e));
        a14.append(", ");
        a14.append(sb2);
        return a14.toString();
    }

    public /* synthetic */ void h(x.a aVar, long j10) {
        w.a(this, aVar, j10);
    }

    public void i(x.a aVar, int i10, int i11) {
        Log.d("EventLogger", f0(aVar, "surfaceSize", i10 + ", " + i11, (Throwable) null));
    }

    public final void i0(a aVar, String str) {
        for (a.b append : aVar.f24150a) {
            StringBuilder a10 = android.support.v4.media.a.a(str);
            a10.append(append);
            Log.d("EventLogger", a10.toString());
        }
    }

    public void j(x.a aVar, Surface surface) {
        Log.d("EventLogger", f0(aVar, "renderedFirstFrame", String.valueOf(surface), (Throwable) null));
    }

    public void k(x.a aVar, b0 b0Var, g gVar) {
        Log.d("EventLogger", f0(aVar, "videoInputFormat", b0.e(b0Var), (Throwable) null));
    }

    public void l(x.a aVar, d dVar) {
        Log.d("EventLogger", f0(aVar, "audioEnabled", (String) null, (Throwable) null));
    }

    public void m(x.a aVar, n nVar) {
        Log.d("EventLogger", f0(aVar, "downstreamFormat", b0.e(nVar.f28622c), (Throwable) null));
    }

    public void n(x.a aVar, int i10) {
        Log.d("EventLogger", f0(aVar, "playbackSuppressionReason", i10 != 0 ? i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE", (Throwable) null));
    }

    public void o(x.a aVar, n nVar) {
        Log.d("EventLogger", f0(aVar, "upstreamDiscarded", b0.e(nVar.f28622c), (Throwable) null));
    }

    public void p(x.a aVar, int i10, long j10, long j11) {
    }

    public void q(x.a aVar) {
        Log.d("EventLogger", f0(aVar, "drmKeysRestored", (String) null, (Throwable) null));
    }

    public void r(x.a aVar, g0 g0Var, l lVar) {
        k kVar;
        String str;
        k kVar2 = this;
        j jVar = kVar2.f26464a;
        j.a aVar2 = jVar != null ? jVar.f24655c : null;
        if (aVar2 == null) {
            Log.d("EventLogger", kVar2.f0(aVar, "tracks", "[]", (Throwable) null));
            return;
        }
        x.a aVar3 = aVar;
        StringBuilder a10 = android.support.v4.media.a.a("tracks [");
        a10.append(g0(aVar));
        Log.d("EventLogger", a10.toString());
        int i10 = aVar2.f24656a;
        int i11 = 0;
        while (true) {
            String str2 = "  ]";
            String str3 = " [";
            if (i11 < i10) {
                g0 g0Var2 = aVar2.f24659d[i11];
                int i12 = i10;
                r6.k kVar3 = lVar.f24664b[i11];
                if (g0Var2.f28589a == 0) {
                    StringBuilder a11 = android.support.v4.media.a.a("  ");
                    a11.append(aVar2.f24657b[i11]);
                    a11.append(" []");
                    Log.d("EventLogger", a11.toString());
                    kVar = kVar2;
                } else {
                    StringBuilder a12 = android.support.v4.media.a.a("  ");
                    String str4 = "[ ]";
                    a12.append(aVar2.f24657b[i11]);
                    a12.append(str3);
                    Log.d("EventLogger", a12.toString());
                    int i13 = 0;
                    while (i13 < g0Var2.f28589a) {
                        f0 f0Var = g0Var2.f28590b[i13];
                        g0 g0Var3 = g0Var2;
                        int i14 = f0Var.f28583a;
                        String str5 = str2;
                        int a13 = aVar2.a(i11, i13, false);
                        if (i14 < 2) {
                            str = "N/A";
                        } else if (a13 == 0) {
                            str = "NO";
                        } else if (a13 == 8) {
                            str = "YES_NOT_SEAMLESS";
                        } else if (a13 == 16) {
                            str = "YES";
                        } else {
                            throw new IllegalStateException();
                        }
                        Log.d("EventLogger", "    Group:" + i13 + ", adaptive_supported=" + str + str3);
                        int i15 = 0;
                        while (i15 < f0Var.f28583a) {
                            String str6 = kVar3 != null && kVar3.j() == f0Var && kVar3.t(i15) != -1 ? "[X]" : str4;
                            String a14 = x4.f.a(aVar2.b(i11, i13, i15));
                            String str7 = str3;
                            Log.d("EventLogger", "      " + str6 + " Track:" + i15 + ", " + b0.e(f0Var.f28584b[i15]) + ", supported=" + a14);
                            i15++;
                            str3 = str7;
                        }
                        String str8 = str3;
                        Log.d("EventLogger", "    ]");
                        i13++;
                        g0Var2 = g0Var3;
                        str2 = str5;
                    }
                    String str9 = str2;
                    if (kVar3 != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= kVar3.length()) {
                                break;
                            }
                            a aVar4 = kVar3.c(i16).f27406r;
                            if (aVar4 != null) {
                                Log.d("EventLogger", "    Metadata [");
                                kVar = this;
                                kVar.i0(aVar4, "      ");
                                Log.d("EventLogger", "    ]");
                                break;
                            }
                            i16++;
                        }
                    }
                    kVar = this;
                    Log.d("EventLogger", str9);
                }
                i11++;
                i10 = i12;
                kVar2 = kVar;
            } else {
                String str10 = "[ ]";
                String str11 = str3;
                k kVar4 = kVar2;
                String str12 = str2;
                g0 g0Var4 = aVar2.f24662g;
                if (g0Var4.f28589a > 0) {
                    Log.d("EventLogger", "  Unmapped [");
                    int i17 = 0;
                    while (i17 < g0Var4.f28589a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("    Group:");
                        sb2.append(i17);
                        String str13 = str11;
                        sb2.append(str13);
                        Log.d("EventLogger", sb2.toString());
                        f0 f0Var2 = g0Var4.f28590b[i17];
                        int i18 = 0;
                        while (i18 < f0Var2.f28583a) {
                            String a15 = x4.f.a(0);
                            Log.d("EventLogger", "      " + str10 + " Track:" + i18 + ", " + b0.e(f0Var2.f28584b[i18]) + ", supported=" + a15);
                            i18++;
                            g0Var4 = g0Var4;
                        }
                        g0 g0Var5 = g0Var4;
                        Log.d("EventLogger", "    ]");
                        i17++;
                        str11 = str13;
                    }
                    Log.d("EventLogger", str12);
                }
                Log.d("EventLogger", "]");
                return;
            }
        }
    }

    public /* synthetic */ void s(x.a aVar, int i10, d dVar) {
        w.d(this, aVar, i10, dVar);
    }

    public void t(x.a aVar, o0 o0Var) {
        Log.d("EventLogger", f0(aVar, "playbackParameters", o0Var.toString(), (Throwable) null));
    }

    public void u(x.a aVar, int i10) {
        int i11 = aVar.f28091b.i();
        int p10 = aVar.f28091b.p();
        StringBuilder a10 = android.support.v4.media.a.a("timeline [");
        a10.append(g0(aVar));
        a10.append(", periodCount=");
        a10.append(i11);
        a10.append(", windowCount=");
        a10.append(p10);
        a10.append(", reason=");
        a10.append(i10 != 0 ? i10 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        Log.d("EventLogger", a10.toString());
        for (int i12 = 0; i12 < Math.min(i11, 3); i12++) {
            aVar.f28091b.f(i12, this.f26466c);
            Log.d("EventLogger", "  period [" + h0(x4.f.c(this.f26466c.f27465d)) + "]");
        }
        if (i11 > 3) {
            Log.d("EventLogger", "  ...");
        }
        for (int i13 = 0; i13 < Math.min(p10, 3); i13++) {
            aVar.f28091b.n(i13, this.f26465b);
            Log.d("EventLogger", "  window [" + h0(this.f26465b.b()) + ", seekable=" + this.f26465b.f27477h + ", dynamic=" + this.f26465b.f27478i + "]");
        }
        if (p10 > 3) {
            Log.d("EventLogger", "  ...");
        }
        Log.d("EventLogger", "]");
    }

    public void v(x.a aVar, Exception exc) {
        Log.e("EventLogger", f0(aVar, "internalError", "drmSessionManagerError", exc));
    }

    public /* synthetic */ void w(x.a aVar) {
        w.j(this, aVar);
    }

    public void x(x.a aVar, List<a> list) {
        StringBuilder a10 = android.support.v4.media.a.a("staticMetadata [");
        a10.append(g0(aVar));
        Log.d("EventLogger", a10.toString());
        for (int i10 = 0; i10 < list.size(); i10++) {
            a aVar2 = list.get(i10);
            if (aVar2.f24150a.length != 0) {
                Log.d("EventLogger", "  Metadata:" + i10 + " [");
                i0(aVar2, "    ");
                Log.d("EventLogger", "  ]");
            }
        }
        Log.d("EventLogger", "]");
    }

    public void y(x.a aVar, String str) {
        Log.d("EventLogger", f0(aVar, "videoDecoderReleased", str, (Throwable) null));
    }

    public void z(x.a aVar, String str) {
        Log.d("EventLogger", f0(aVar, "audioDecoderReleased", str, (Throwable) null));
    }
}
