package e8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.t7;
import com.startapp.b4;
import d7.l;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k7.a;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class je implements ta0<qf> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15137a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f15138b;

    public je(ab0 ab0, int i10) {
        this.f15137a = i10;
        switch (i10) {
            case 1:
                this.f15138b = ab0;
                return;
            case 2:
                this.f15138b = ab0;
                return;
            case 3:
                this.f15138b = ab0;
                return;
            case 4:
                this.f15138b = ab0;
                return;
            case 5:
                this.f15138b = ab0;
                return;
            case 6:
                this.f15138b = ab0;
                return;
            case 7:
                this.f15138b = ab0;
                return;
            case b4.f10106f:
                this.f15138b = ab0;
                return;
            case 9:
                this.f15138b = ab0;
                return;
            case 10:
                this.f15138b = ab0;
                return;
            case 11:
                this.f15138b = ab0;
                return;
            case 12:
                this.f15138b = ab0;
                return;
            case 13:
                this.f15138b = ab0;
                return;
            case 14:
                this.f15138b = ab0;
                return;
            case 15:
                this.f15138b = ab0;
                return;
            case 16:
                this.f15138b = ab0;
                return;
            case 17:
                this.f15138b = ab0;
                return;
            case 18:
                this.f15138b = ab0;
                return;
            case 19:
                this.f15138b = ab0;
                return;
            case 20:
                this.f15138b = ab0;
                return;
            case 21:
                this.f15138b = ab0;
                return;
            case 22:
                this.f15138b = ab0;
                return;
            case 23:
                this.f15138b = ab0;
                return;
            case 24:
                this.f15138b = ab0;
                return;
            case 25:
                this.f15138b = ab0;
                return;
            case 26:
                this.f15138b = ab0;
                return;
            case 27:
                this.f15138b = ab0;
                return;
            case 28:
                this.f15138b = ab0;
                return;
            case 29:
                this.f15138b = ab0;
                return;
            default:
                this.f15138b = ab0;
                return;
        }
    }

    public static je a(ab0<t7> ab0) {
        return new je(ab0, 12);
    }

    public static je b(ab0<Context> ab0) {
        return new je(ab0, 15);
    }

    public static je c(ab0<Context> ab0) {
        return new je(ab0, 16);
    }

    public static je d(ab0<Context> ab0) {
        return new je(ab0, 17);
    }

    public static je e(ab0<xs> ab0) {
        return new je(ab0, 18);
    }

    public static je f(ab0<w00> ab0) {
        return new je(ab0, 21);
    }

    public static je g(ab0<Set<String>> ab0) {
        return new je(ab0, 22);
    }

    public static je h(ab0<o50> ab0) {
        return new je(ab0, 23);
    }

    public static je i(ab0<o50> ab0) {
        return new je(ab0, 24);
    }

    public static je j(ab0<String> ab0) {
        return new je(ab0, 25);
    }

    public static je k(ab0<Set<ul<q20>>> ab0) {
        return new je(ab0, 29);
    }

    public static je l(ab0<m2> ab0) {
        return new je(ab0, 1);
    }

    public static ApplicationInfo m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        jc0.b(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    public static String n(Context context) {
        String packageName = context.getPackageName();
        jc0.b(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    public static <AdT> je o(ab0<Map<String, lt<AdT>>> ab0) {
        return new je(ab0, 3);
    }

    public static je p(ab0<Set<ul<wh0>>> ab0) {
        return new je(ab0, 4);
    }

    public static je q(ab0<Set<ul<zi>>> ab0) {
        return new je(ab0, 5);
    }

    public static je r(ab0<Set<ul<li>>> ab0) {
        return new je(ab0, 6);
    }

    public static je s(ab0<Set<ul<a>>> ab0) {
        return new je(ab0, 7);
    }

    public static je t(ab0<Set<ul<tk>>> ab0) {
        return new je(ab0, 8);
    }

    public final Object get() {
        boolean z10;
        switch (this.f15137a) {
            case 0:
                return new qf(this.f15138b.get(), l.B.f13200q.b());
            case 1:
                return new c5(((m2) this.f15138b.get()).f7437a);
            case 2:
                if (((w00) this.f15138b.get()).a() != null) {
                    z10 = ((Boolean) ti0.f16763j.f16769f.a(t.F0)).booleanValue();
                } else {
                    z10 = ((Boolean) ti0.f16763j.f16769f.a(t.U2)).booleanValue();
                }
                return Boolean.valueOf(z10);
            case 3:
                return new dh((Map) this.f15138b.get());
            case 4:
                return new ki((Set) this.f15138b.get());
            case 5:
                return new yi((Set) this.f15138b.get());
            case 6:
                return new dj((Set) this.f15138b.get());
            case 7:
                return new oj((Set) this.f15138b.get());
            case b4.f10106f:
                return new pk((Set) this.f15138b.get());
            case 9:
                return new fl((Set) this.f15138b.get());
            case 10:
                return new ul((ol) this.f15138b.get(), h9.f14886f);
            case 11:
                return new mn((qe) this.f15138b.get());
            case 12:
                return new vp((t7) this.f15138b.get());
            case 13:
                return new yp((Executor) this.f15138b.get());
            case 14:
                return new vq((b) this.f15138b.get());
            case 15:
                return m(this.f15138b.get());
            case 16:
                return n(this.f15138b.get());
            case 17:
                return new us(this.f15138b.get());
            case 18:
                return new at((xs) this.f15138b.get());
            case 19:
                return new jv((Executor) this.f15138b.get());
            case 20:
                return new ov((t20) this.f15138b.get());
            case 21:
                return new iw((w00) this.f15138b.get());
            case 22:
                return new iw((Set) this.f15138b.get());
            case 23:
                return new cx((o50) this.f15138b.get());
            case 24:
                return new gx((o50) this.f15138b.get());
            case 25:
                return new cx((String) this.f15138b.get());
            case 26:
                return new uy(this.f15138b.get());
            case 27:
                return new cz((o50) this.f15138b.get());
            case 28:
                return new hz((i10) this.f15138b.get());
            default:
                return new p20((Set) this.f15138b.get());
        }
    }
}
