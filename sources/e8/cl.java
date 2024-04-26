package e8;

import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.i9;
import com.startapp.b4;
import e7.k;
import java.util.Collections;
import java.util.Set;
import k7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cl implements ta0<Set<ul<k>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14162a;

    /* renamed from: b  reason: collision with root package name */
    public final i9 f14163b;

    public cl(i9 i9Var, int i10) {
        this.f14162a = i10;
        switch (i10) {
            case 1:
                this.f14163b = i9Var;
                return;
            case 2:
                this.f14163b = i9Var;
                return;
            case 3:
                this.f14163b = i9Var;
                return;
            case 4:
                this.f14163b = i9Var;
                return;
            case 5:
                this.f14163b = i9Var;
                return;
            case 6:
                this.f14163b = i9Var;
                return;
            case 7:
                this.f14163b = i9Var;
                return;
            case b4.f10106f:
                this.f14163b = i9Var;
                return;
            default:
                this.f14163b = i9Var;
                return;
        }
    }

    public static cl a(i9 i9Var) {
        return new cl(i9Var, 8);
    }

    public static cl b(i9 i9Var) {
        return new cl(i9Var, 0);
    }

    public static cl c(i9 i9Var) {
        return new cl(i9Var, 1);
    }

    public static cl d(i9 i9Var) {
        return new cl(i9Var, 2);
    }

    public static cl e(i9 i9Var) {
        return new cl(i9Var, 3);
    }

    public static cl f(i9 i9Var) {
        return new cl(i9Var, 4);
    }

    public static cl g(i9 i9Var) {
        return new cl(i9Var, 5);
    }

    public static cl h(i9 i9Var) {
        return new cl(i9Var, 6);
    }

    public static cl i(i9 i9Var) {
        return new cl(i9Var, 7);
    }

    public final Object get() {
        switch (this.f14162a) {
            case 0:
                Set<ul<k>> set = this.f14163b.f7037k;
                jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
                return set;
            case 1:
                Set<ul<wh0>> set2 = this.f14163b.f7027a;
                jc0.b(set2, "Cannot return null from a non-@Nullable @Provides method");
                return set2;
            case 2:
                Set<ul<wi>> set3 = this.f14163b.f7033g;
                jc0.b(set3, "Cannot return null from a non-@Nullable @Provides method");
                return set3;
            case 3:
                Set<ul<li>> set4 = this.f14163b.f7028b;
                jc0.b(set4, "Cannot return null from a non-@Nullable @Provides method");
                return set4;
            case 4:
                Set<ul<a>> set5 = this.f14163b.f7034h;
                jc0.b(set5, "Cannot return null from a non-@Nullable @Provides method");
                return set5;
            case 5:
                Set<ul<e9>> set6 = this.f14163b.f7036j;
                jc0.b(set6, "Cannot return null from a non-@Nullable @Provides method");
                return set6;
            case 6:
                Set<ul<z6.a>> set7 = this.f14163b.f7035i;
                jc0.b(set7, "Cannot return null from a non-@Nullable @Provides method");
                return set7;
            case 7:
                i9 i9Var = this.f14163b;
                i9Var.getClass();
                return i9Var;
            default:
                Set emptySet = Collections.emptySet();
                jc0.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
                return emptySet;
        }
    }
}
