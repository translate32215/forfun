package e8;

import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.c2;
import com.google.android.gms.internal.ads.f1;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.o0;
import com.google.android.gms.internal.ads.s0;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.y0;
import s4.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qn {

    /* renamed from: h  reason: collision with root package name */
    public static final qn f16182h = new qn(new i(), (g) null);

    /* renamed from: a  reason: collision with root package name */
    public final s0 f16183a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f16184b;

    /* renamed from: c  reason: collision with root package name */
    public final f1 f16185c;

    /* renamed from: d  reason: collision with root package name */
    public final b1 f16186d;

    /* renamed from: e  reason: collision with root package name */
    public final c2 f16187e;

    /* renamed from: f  reason: collision with root package name */
    public final s.i<String, y0> f16188f;

    /* renamed from: g  reason: collision with root package name */
    public final s.i<String, t0> f16189g;

    public qn(i iVar, g gVar) {
        this.f16183a = (s0) iVar.f24944a;
        this.f16184b = (o0) iVar.f24945b;
        this.f16185c = (f1) iVar.f24946c;
        this.f16188f = new s.i<>((s.i) iVar.f24949f);
        this.f16189g = new s.i<>((s.i) iVar.f24950g);
        this.f16186d = (b1) iVar.f24947d;
        this.f16187e = (c2) iVar.f24948e;
    }

    public final t0 a(String str) {
        return this.f16189g.getOrDefault(str, null);
    }
}
