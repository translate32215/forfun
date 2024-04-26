package x6;

import a5.f;
import java.nio.ByteBuffer;
import v6.e0;
import v6.v;
import x4.b0;
import x4.e;
import x4.m;

/* compiled from: CameraMotionRenderer */
public final class b extends e {

    /* renamed from: t  reason: collision with root package name */
    public final f f27851t = new f(1);

    /* renamed from: u  reason: collision with root package name */
    public final v f27852u = new v();

    /* renamed from: v  reason: collision with root package name */
    public long f27853v;

    /* renamed from: w  reason: collision with root package name */
    public a f27854w;

    /* renamed from: x  reason: collision with root package name */
    public long f27855x;

    public b() {
        super(6);
    }

    public void C() {
        a aVar = this.f27854w;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void E(long j10, boolean z10) {
        this.f27855x = Long.MIN_VALUE;
        a aVar = this.f27854w;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void I(b0[] b0VarArr, long j10, long j11) {
        this.f27853v = j11;
    }

    public String a() {
        return "CameraMotionRenderer";
    }

    public boolean d() {
        return k();
    }

    public int h(b0 b0Var) {
        return "application/x-camera-motion".equals(b0Var.f27408t) ? 4 : 0;
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) {
        float[] fArr;
        while (!k() && this.f27855x < 100000 + j10) {
            this.f27851t.t();
            if (J(B(), this.f27851t, false) == -4 && !this.f27851t.r()) {
                f fVar = this.f27851t;
                this.f27855x = fVar.f88e;
                if (this.f27854w != null && !fVar.q()) {
                    this.f27851t.w();
                    ByteBuffer byteBuffer = this.f27851t.f86c;
                    int i10 = e0.f26436a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        this.f27852u.B(byteBuffer.array(), byteBuffer.limit());
                        this.f27852u.D(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(this.f27852u.h());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f27854w.a(this.f27855x - this.f27853v, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void n(int i10, Object obj) throws m {
        if (i10 == 7) {
            this.f27854w = (a) obj;
        }
    }
}
