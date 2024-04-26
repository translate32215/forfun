package n5;

import android.util.SparseArray;
import d5.k;
import java.util.Collections;
import java.util.List;
import v6.b0;
import v6.v;
import x4.m0;

/* compiled from: TsPayloadReader */
public interface e0 {

    /* compiled from: TsPayloadReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f22067a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f22068b;

        public a(String str, int i10, byte[] bArr) {
            this.f22067a = str;
            this.f22068b = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f22069a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a> f22070b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f22071c;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.f22069a = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f22070b = list2;
            this.f22071c = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public interface c {
        SparseArray<e0> a();

        e0 b(int i10, b bVar);
    }

    /* compiled from: TsPayloadReader */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f22072a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22073b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22074c;

        /* renamed from: d  reason: collision with root package name */
        public int f22075d;

        /* renamed from: e  reason: collision with root package name */
        public String f22076e;

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f22072a = str;
            this.f22073b = i11;
            this.f22074c = i12;
            this.f22075d = Integer.MIN_VALUE;
            this.f22076e = "";
        }

        public void a() {
            int i10 = this.f22075d;
            this.f22075d = i10 == Integer.MIN_VALUE ? this.f22073b : i10 + this.f22074c;
            this.f22076e = this.f22072a + this.f22075d;
        }

        public String b() {
            if (this.f22075d != Integer.MIN_VALUE) {
                return this.f22076e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i10 = this.f22075d;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void b(b0 b0Var, k kVar, d dVar);

    void c(v vVar, int i10) throws m0;
}
