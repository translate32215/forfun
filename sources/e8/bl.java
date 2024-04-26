package e8;

import com.google.android.gms.internal.ads.i9;
import com.startapp.b4;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bl implements ta0<Set<ul<bj>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14037a;

    /* renamed from: b  reason: collision with root package name */
    public final i9 f14038b;

    public bl(i9 i9Var, int i10) {
        this.f14037a = i10;
        switch (i10) {
            case 1:
                this.f14038b = i9Var;
                return;
            case 2:
                this.f14038b = i9Var;
                return;
            case 3:
                this.f14038b = i9Var;
                return;
            case 4:
                this.f14038b = i9Var;
                return;
            case 5:
                this.f14038b = i9Var;
                return;
            case 6:
                this.f14038b = i9Var;
                return;
            case 7:
                this.f14038b = i9Var;
                return;
            case b4.f10106f:
                this.f14038b = i9Var;
                return;
            default:
                this.f14038b = i9Var;
                return;
        }
    }

    public static bl a(i9 i9Var) {
        return new bl(i9Var, 0);
    }

    public static bl b(i9 i9Var) {
        return new bl(i9Var, 1);
    }

    public static bl c(i9 i9Var) {
        return new bl(i9Var, 2);
    }

    public static bl d(i9 i9Var) {
        return new bl(i9Var, 3);
    }

    public static bl e(i9 i9Var) {
        return new bl(i9Var, 4);
    }

    public static bl f(i9 i9Var) {
        return new bl(i9Var, 5);
    }

    public static bl g(i9 i9Var) {
        return new bl(i9Var, 7);
    }

    public final Object get() {
        switch (this.f14037a) {
            case 0:
                Set emptySet = Collections.emptySet();
                jc0.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
                return emptySet;
            case 1:
                Set emptySet2 = Collections.emptySet();
                jc0.b(emptySet2, "Cannot return null from a non-@Nullable @Provides method");
                return emptySet2;
            case 2:
                Set emptySet3 = Collections.emptySet();
                jc0.b(emptySet3, "Cannot return null from a non-@Nullable @Provides method");
                return emptySet3;
            case 3:
                Set<ul<pi>> set = this.f14038b.f7032f;
                jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
                return set;
            case 4:
                Set<ul<zi>> set2 = this.f14038b.f7029c;
                jc0.b(set2, "Cannot return null from a non-@Nullable @Provides method");
                return set2;
            case 5:
                Set<ul<pj>> set3 = this.f14038b.f7031e;
                jc0.b(set3, "Cannot return null from a non-@Nullable @Provides method");
                return set3;
            case 6:
                Set<ul<tj>> set4 = this.f14038b.f7030d;
                jc0.b(set4, "Cannot return null from a non-@Nullable @Provides method");
                return set4;
            case 7:
                Set emptySet4 = Collections.emptySet();
                jc0.b(emptySet4, "Cannot return null from a non-@Nullable @Provides method");
                return emptySet4;
            default:
                return this.f14038b.f7039m;
        }
    }
}
