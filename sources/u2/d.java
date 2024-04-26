package u2;

import android.graphics.Rect;
import c3.e;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import s.f;
import s.j;
import z2.c;
import z2.h;

/* compiled from: LottieComposition */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f25919a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f25920b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f25921c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, f> f25922d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, c> f25923e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f25924f;

    /* renamed from: g  reason: collision with root package name */
    public j<z2.d> f25925g;

    /* renamed from: h  reason: collision with root package name */
    public f<e> f25926h;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f25927i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f25928j;

    /* renamed from: k  reason: collision with root package name */
    public float f25929k;

    /* renamed from: l  reason: collision with root package name */
    public float f25930l;

    /* renamed from: m  reason: collision with root package name */
    public float f25931m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f25932n;

    /* renamed from: o  reason: collision with root package name */
    public int f25933o = 0;

    public void a(String str) {
        g3.c.a(str);
        this.f25920b.add(str);
    }

    public float b() {
        return (float) ((long) ((c() / this.f25931m) * 1000.0f));
    }

    public float c() {
        return this.f25930l - this.f25929k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r3.substring(0, r3.length() - 1).equalsIgnoreCase(r7) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z2.h d(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List<z2.h> r0 = r6.f25924f
            r0.size()
            r0 = 0
            r1 = 0
        L_0x0007:
            java.util.List<z2.h> r2 = r6.f25924f
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0044
            java.util.List<z2.h> r2 = r6.f25924f
            java.lang.Object r2 = r2.get(r1)
            z2.h r2 = (z2.h) r2
            java.lang.String r3 = r2.f28238a
            boolean r3 = r3.equalsIgnoreCase(r7)
            r4 = 1
            if (r3 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r3 = r2.f28238a
            java.lang.String r5 = "\r"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r2.f28238a
            int r5 = r3.length()
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r0, r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            if (r4 == 0) goto L_0x0041
            return r2
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0044:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.d(java.lang.String):z2.h");
    }

    public e e(long j10) {
        return this.f25926h.f(j10, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e a10 : this.f25927i) {
            sb2.append(a10.a("\t"));
        }
        return sb2.toString();
    }
}
