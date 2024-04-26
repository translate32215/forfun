package e8;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.e;
import java.util.Random;
import java.util.WeakHashMap;
import u.b;
import z3.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ti0 {

    /* renamed from: j  reason: collision with root package name */
    public static ti0 f16763j = new ti0();

    /* renamed from: a  reason: collision with root package name */
    public final y8 f16764a;

    /* renamed from: b  reason: collision with root package name */
    public final m30 f16765b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16766c;

    /* renamed from: d  reason: collision with root package name */
    public final r f16767d;

    /* renamed from: e  reason: collision with root package name */
    public final s f16768e;

    /* renamed from: f  reason: collision with root package name */
    public final e f16769f;

    /* renamed from: g  reason: collision with root package name */
    public final f9 f16770g;

    /* renamed from: h  reason: collision with root package name */
    public final Random f16771h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakHashMap<b, String> f16772i;

    public ti0() {
        y8 y8Var = new y8();
        m30 m30 = new m30(new di0(), new ei0(), new gj0(), new c2(), new s7(), new g(1), new j6(), new f2());
        r rVar = new r();
        s sVar = new s();
        e eVar = new e();
        String m10 = y8.m();
        f9 f9Var = new f9(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        WeakHashMap<b, String> weakHashMap = new WeakHashMap<>();
        this.f16764a = y8Var;
        this.f16765b = m30;
        this.f16767d = rVar;
        this.f16768e = sVar;
        this.f16769f = eVar;
        this.f16766c = m10;
        this.f16770g = f9Var;
        this.f16771h = random;
        this.f16772i = weakHashMap;
    }

    public static e a() {
        return f16763j.f16769f;
    }
}
