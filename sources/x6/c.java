package x6;

import android.opengl.Matrix;
import android.os.IBinder;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.we;
import e8.mt;
import e8.ot;
import e8.qe0;
import e8.t;
import e8.ti0;
import e8.zh0;
import e8.zu;
import v6.a0;

/* compiled from: FrameRotationQueue */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27856a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27857b;

    /* renamed from: c  reason: collision with root package name */
    public final a0<float[]> f27858c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27859d;

    /* JADX WARNING: type inference failed for: r1v0, types: [v6.a0<float[]>, e8.zu] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.zu r1, e8.mt r2, com.google.android.gms.internal.ads.d7 r3) {
        /*
            r0 = this;
            r0.f27858c = r1
            r0.f27856a = r2
            r0.f27857b = r3
            r0.<init>()
            r1 = 0
            r0.f27859d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c.<init>(e8.zu, e8.mt, com.google.android.gms.internal.ads.d7):void");
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    public void b(int i10) {
        if (!this.f27859d) {
            d(new zh0(i10, zu.c(((mt) this.f27856a).f15549a, i10), "undefined", (zh0) null, (IBinder) null));
        }
    }

    public synchronized void c(int i10, String str) {
        if (!this.f27859d) {
            this.f27859d = true;
            if (str == null) {
                str = zu.c(((mt) this.f27856a).f15549a, i10);
            }
            d(new zh0(i10, str, "undefined", (zh0) null, (IBinder) null));
        }
    }

    public void d(zh0 zh0) {
        we weVar = we.INTERNAL_ERROR;
        if (((Boolean) ti0.f16763j.f16769f.a(t.Q2)).booleanValue()) {
            weVar = we.NO_FILL;
        }
        ((d7) this.f27857b).c(new ot(weVar, zh0));
    }

    public c(Object obj, qe0 qe0) {
        this.f27859d = false;
        this.f27856a = obj;
        this.f27857b = qe0;
        this.f27858c = null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.r5, v6.a0<float[]>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e8.r5 r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27859d = r0
            r0 = 0
            r1.f27856a = r0
            r1.f27857b = r0
            r1.f27858c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c.<init>(e8.r5):void");
    }

    public c() {
        this.f27856a = new float[16];
        this.f27857b = new float[16];
        this.f27858c = new a0<>();
    }
}
