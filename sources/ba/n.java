package ba;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ComparisonChain */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f3760a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final n f3761b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final n f3762c = new b(1);

    /* compiled from: ComparisonChain */
    public static class a extends n {
        public a() {
            super((a) null);
        }

        public n a(int i10, int i11) {
            return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
        }

        public <T> n b(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator) {
            return f(comparator.compare(t10, t11));
        }

        public n c(boolean z10, boolean z11) {
            return f(z10 == z11 ? 0 : z10 ? 1 : -1);
        }

        public n d(boolean z10, boolean z11) {
            return f(z11 == z10 ? 0 : z11 ? 1 : -1);
        }

        public int e() {
            return 0;
        }

        public n f(int i10) {
            if (i10 < 0) {
                return n.f3761b;
            }
            return i10 > 0 ? n.f3762c : n.f3760a;
        }
    }

    /* compiled from: ComparisonChain */
    public static final class b extends n {

        /* renamed from: d  reason: collision with root package name */
        public final int f3763d;

        public b(int i10) {
            super((a) null);
            this.f3763d = i10;
        }

        public n a(int i10, int i11) {
            return this;
        }

        public <T> n b(@NullableDecl T t10, @NullableDecl T t11, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        public n c(boolean z10, boolean z11) {
            return this;
        }

        public n d(boolean z10, boolean z11) {
            return this;
        }

        public int e() {
            return this.f3763d;
        }
    }

    public n(a aVar) {
    }

    public abstract n a(int i10, int i11);

    public abstract <T> n b(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator);

    public abstract n c(boolean z10, boolean z11);

    public abstract n d(boolean z10, boolean z11);

    public abstract int e();
}
