package e8;

import android.content.Context;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.da;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.qe;
import com.startapp.b4;
import e7.k;
import f7.d0;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;
import z6.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jd implements ta0<l7> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15135a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f15136b;

    public jd(ab0 ab0, int i10) {
        this.f15135a = i10;
        switch (i10) {
            case 1:
                this.f15136b = ab0;
                return;
            case 2:
                this.f15136b = ab0;
                return;
            case 3:
                this.f15136b = ab0;
                return;
            case 4:
                this.f15136b = ab0;
                return;
            case 5:
                this.f15136b = ab0;
                return;
            case 6:
                this.f15136b = ab0;
                return;
            case 7:
                this.f15136b = ab0;
                return;
            case b4.f10106f:
                this.f15136b = ab0;
                return;
            case 9:
                this.f15136b = ab0;
                return;
            case 10:
                this.f15136b = ab0;
                return;
            case 11:
                this.f15136b = ab0;
                return;
            case 12:
                this.f15136b = ab0;
                return;
            case 13:
                this.f15136b = ab0;
                return;
            case 14:
                this.f15136b = ab0;
                return;
            case 15:
                this.f15136b = ab0;
                return;
            case 16:
                this.f15136b = ab0;
                return;
            case 17:
                this.f15136b = ab0;
                return;
            case 18:
                this.f15136b = ab0;
                return;
            case 19:
                this.f15136b = ab0;
                return;
            case 20:
                this.f15136b = ab0;
                return;
            case 21:
                this.f15136b = ab0;
                return;
            case 22:
                this.f15136b = ab0;
                return;
            case 23:
                this.f15136b = ab0;
                return;
            case 24:
                this.f15136b = ab0;
                return;
            case 25:
                this.f15136b = ab0;
                return;
            case 26:
                this.f15136b = ab0;
                return;
            case 27:
                this.f15136b = ab0;
                return;
            case 28:
                this.f15136b = ab0;
                return;
            case 29:
                this.f15136b = ab0;
                return;
            default:
                this.f15136b = ab0;
                return;
        }
    }

    public static jd a(ab0<d0> ab0) {
        return new jd(ab0, 4);
    }

    public static Set<String> b(qn qnVar) {
        Set<String> set;
        if (qnVar.f16186d != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }

    public static jd c(ab0<Context> ab0) {
        return new jd(ab0, 28);
    }

    public static jd d(ab0<String> ab0) {
        return new jd(ab0, 29);
    }

    public static jd e(ab0<qe> ab0) {
        return new jd(ab0, 5);
    }

    public static jd f(ab0<dj> ab0) {
        return new jd(ab0, 7);
    }

    public static jd g(ab0<d9> ab0) {
        return new jd(ab0, 8);
    }

    public static jd h(ab0<Set<ul<wi>>> ab0) {
        return new jd(ab0, 9);
    }

    public static jd i(ab0<Set<ul<bj>>> ab0) {
        return new jd(ab0, 10);
    }

    public static jd j(ab0<Set<ul<pj>>> ab0) {
        return new jd(ab0, 11);
    }

    public static jd k(ab0<Set<ul<k>>> ab0) {
        return new jd(ab0, 13);
    }

    public static jd l(ab0<Set<ul<qk>>> ab0) {
        return new jd(ab0, 14);
    }

    public static jd m(ab0<Set<ul<a>>> ab0) {
        return new jd(ab0, 15);
    }

    public static jd n(ab0<Set<ul<al>>> ab0) {
        return new jd(ab0, 16);
    }

    public static jd o(ab0<Set<ul<pl>>> ab0) {
        return new jd(ab0, 17);
    }

    public static jd p(ab0<Set<ul<xl>>> ab0) {
        return new jd(ab0, 18);
    }

    public static jd q(ab0<vm> ab0) {
        return new jd(ab0, 20);
    }

    public static jd r(ab0<aj> ab0) {
        return new jd(ab0, 21);
    }

    public final Object get() {
        switch (this.f15135a) {
            case 0:
                Context context = this.f15136b.get();
                return new j7(context, (n2) new p9(context).f15881c);
            case 1:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f15136b.get()));
                jc0.b(unconfigurableScheduledExecutorService, "Cannot return null from a non-@Nullable @Provides method");
                return unconfigurableScheduledExecutorService;
            case 2:
                return new d(this.f15136b.get());
            case 3:
                return new c9((String) this.f15136b.get());
            case 4:
                return new ve((d0) this.f15136b.get());
            case 5:
                try {
                    return new JSONObject(((qe) this.f15136b.get()).f7972y);
                } catch (JSONException unused) {
                    return null;
                }
            case 6:
                return new yg((j8) this.f15136b.get());
            case 7:
                return new lh((dj) this.f15136b.get());
            case b4.f10106f:
                d9 d9Var = (d9) this.f15136b.get();
                jc0.b(d9Var, "Cannot return null from a non-@Nullable @Provides method");
                return d9Var;
            case 9:
                return new ui((Set) this.f15136b.get());
            case 10:
                return new aj((Set) this.f15136b.get());
            case 11:
                return new mj((Set) this.f15136b.get());
            case 12:
                return new sj((Set) this.f15136b.get());
            case 13:
                return new uj((Set) this.f15136b.get());
            case 14:
                return new mk((Set) this.f15136b.get());
            case 15:
                return new vk((Set) this.f15136b.get());
            case 16:
                return new wk((Set) this.f15136b.get());
            case 17:
                return new sl((Set) this.f15136b.get());
            case 18:
                return new wl((Set) this.f15136b.get());
            case 19:
                return new am((Set) this.f15136b.get());
            case 20:
                Set singleton = Collections.singleton(new ul((vm) this.f15136b.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            case 21:
                return new vm((aj) this.f15136b.get());
            case 22:
                return b((qn) this.f15136b.get());
            case 23:
                return new da((jn) this.f15136b.get());
            case 24:
                return new in((da) this.f15136b.get());
            case 25:
                return new hp((jn) this.f15136b.get());
            case 26:
                return new ul((ol) this.f15136b.get(), h9.f14886f);
            case 27:
                return new gb((fb) this.f15136b.get());
            case 28:
                return new nr(this.f15136b.get());
            default:
                u20 u20 = new u20();
                u20.f16842a.put("request_id", (String) this.f15136b.get());
                return u20;
        }
    }
}
