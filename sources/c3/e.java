package c3;

import a3.i;
import a3.j;
import b3.b;
import b3.f;
import java.util.List;
import java.util.Locale;
import n2.g;
import u2.d;

/* compiled from: Layer */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f4164a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4165b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4166c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4167d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4168e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4169f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4170g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f4171h;

    /* renamed from: i  reason: collision with root package name */
    public final j f4172i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4173j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4174k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4175l;

    /* renamed from: m  reason: collision with root package name */
    public final float f4176m;

    /* renamed from: n  reason: collision with root package name */
    public final float f4177n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4178o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4179p;

    /* renamed from: q  reason: collision with root package name */
    public final i f4180q;

    /* renamed from: r  reason: collision with root package name */
    public final g f4181r;

    /* renamed from: s  reason: collision with root package name */
    public final a3.b f4182s;

    /* renamed from: t  reason: collision with root package name */
    public final List<h3.a<Float>> f4183t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4184u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4185v;

    /* compiled from: Layer */
    public enum a {
        PRE_COMP,
        IMAGE,
        UNKNOWN
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.util.List<b3.b> r4, u2.d r5, java.lang.String r6, long r7, c3.e.a r9, long r10, java.lang.String r12, java.util.List<b3.f> r13, a3.j r14, int r15, int r16, int r17, float r18, float r19, int r20, int r21, a3.i r22, n2.g r23, java.util.List<h3.a<java.lang.Float>> r24, java.lang.Object r25, a3.b r26, boolean r27) {
        /*
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f4164a = r1
            r1 = r5
            r0.f4165b = r1
            r1 = r6
            r0.f4166c = r1
            r1 = r7
            r0.f4167d = r1
            r1 = r9
            r0.f4168e = r1
            r1 = r10
            r0.f4169f = r1
            r1 = r12
            r0.f4170g = r1
            r1 = r13
            r0.f4171h = r1
            r1 = r14
            r0.f4172i = r1
            r1 = r15
            r0.f4173j = r1
            r1 = r16
            r0.f4174k = r1
            r1 = r17
            r0.f4175l = r1
            r1 = r18
            r0.f4176m = r1
            r1 = r19
            r0.f4177n = r1
            r1 = r20
            r0.f4178o = r1
            r1 = r21
            r0.f4179p = r1
            r1 = r22
            r0.f4180q = r1
            r1 = r23
            r0.f4181r = r1
            r1 = r24
            r0.f4183t = r1
            r1 = r25
            r0.f4184u = r1
            r1 = r26
            r0.f4182s = r1
            r1 = r27
            r0.f4185v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.e.<init>(java.util.List, u2.d, java.lang.String, long, c3.e$a, long, java.lang.String, java.util.List, a3.j, int, int, int, float, float, int, int, a3.i, n2.g, java.util.List, int, a3.b, boolean):void");
    }

    public String a(String str) {
        StringBuilder a10 = android.support.v4.media.a.a(str);
        a10.append(this.f4166c);
        a10.append("\n");
        e e10 = this.f4165b.e(this.f4169f);
        if (e10 != null) {
            a10.append("\t\tParents: ");
            a10.append(e10.f4166c);
            e e11 = this.f4165b.e(e10.f4169f);
            while (e11 != null) {
                a10.append("->");
                a10.append(e11.f4166c);
                e11 = this.f4165b.e(e11.f4169f);
            }
            a10.append(str);
            a10.append("\n");
        }
        if (!this.f4171h.isEmpty()) {
            a10.append(str);
            a10.append("\tMasks: ");
            a10.append(this.f4171h.size());
            a10.append("\n");
        }
        if (!(this.f4173j == 0 || this.f4174k == 0)) {
            a10.append(str);
            a10.append("\tBackground: ");
            a10.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f4173j), Integer.valueOf(this.f4174k), Integer.valueOf(this.f4175l)}));
        }
        if (!this.f4164a.isEmpty()) {
            a10.append(str);
            a10.append("\tShapes:\n");
            for (b next : this.f4164a) {
                a10.append(str);
                a10.append("\t\t");
                a10.append(next);
                a10.append("\n");
            }
        }
        return a10.toString();
    }

    public String toString() {
        return a("");
    }
}
