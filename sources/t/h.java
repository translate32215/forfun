package t;

import android.support.v4.media.a;
import java.util.Arrays;

/* compiled from: SolverVariable */
public class h implements Comparable<h> {

    /* renamed from: u  reason: collision with root package name */
    public static int f25311u = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25312a;

    /* renamed from: b  reason: collision with root package name */
    public int f25313b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f25314c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f25315d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f25316e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25317f = false;

    /* renamed from: g  reason: collision with root package name */
    public float[] f25318g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public float[] f25319h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public int f25320i;

    /* renamed from: r  reason: collision with root package name */
    public b[] f25321r = new b[16];

    /* renamed from: s  reason: collision with root package name */
    public int f25322s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f25323t = 0;

    public h(int i10) {
        this.f25320i = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f25322s;
            if (i10 >= i11) {
                b[] bVarArr = this.f25321r;
                if (i11 >= bVarArr.length) {
                    this.f25321r = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f25321r;
                int i12 = this.f25322s;
                bVarArr2[i12] = bVar;
                this.f25322s = i12 + 1;
                return;
            } else if (this.f25321r[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f25322s;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f25321r[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f25321r;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f25322s--;
                return;
            }
            i11++;
        }
    }

    public void c() {
        this.f25320i = 5;
        this.f25315d = 0;
        this.f25313b = -1;
        this.f25314c = -1;
        this.f25316e = 0.0f;
        this.f25317f = false;
        int i10 = this.f25322s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25321r[i11] = null;
        }
        this.f25322s = 0;
        this.f25323t = 0;
        this.f25312a = false;
        Arrays.fill(this.f25319h, 0.0f);
    }

    public int compareTo(Object obj) {
        return this.f25313b - ((h) obj).f25313b;
    }

    public void f(c cVar, float f10) {
        this.f25316e = f10;
        this.f25317f = true;
        int i10 = this.f25322s;
        this.f25314c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25321r[i11].k(cVar, this, false);
        }
        this.f25322s = 0;
    }

    public final void i(c cVar, b bVar) {
        int i10 = this.f25322s;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f25321r[i11].l(cVar, bVar, false);
        }
        this.f25322s = 0;
    }

    public String toString() {
        StringBuilder a10 = a.a("");
        a10.append(this.f25313b);
        return a10.toString();
    }
}
