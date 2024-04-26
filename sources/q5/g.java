package q5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m3.t;
import q5.a;
import v6.e0;
import x4.b0;
import x4.e;

/* compiled from: MetadataRenderer */
public final class g extends e implements Handler.Callback {
    public int A;
    public c B;
    public boolean C;
    public boolean D;
    public long E;

    /* renamed from: t  reason: collision with root package name */
    public final d f24153t;

    /* renamed from: u  reason: collision with root package name */
    public final f f24154u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f24155v;

    /* renamed from: w  reason: collision with root package name */
    public final e f24156w;

    /* renamed from: x  reason: collision with root package name */
    public final a[] f24157x;

    /* renamed from: y  reason: collision with root package name */
    public final long[] f24158y;

    /* renamed from: z  reason: collision with root package name */
    public int f24159z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, Looper looper) {
        super(5);
        Handler handler;
        d dVar = d.f24151a;
        fVar.getClass();
        this.f24154u = fVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = e0.f26436a;
            handler = new Handler(looper, this);
        }
        this.f24155v = handler;
        this.f24153t = dVar;
        this.f24156w = new e();
        this.f24157x = new a[5];
        this.f24158y = new long[5];
    }

    public void C() {
        Arrays.fill(this.f24157x, (Object) null);
        this.f24159z = 0;
        this.A = 0;
        this.B = null;
    }

    public void E(long j10, boolean z10) {
        Arrays.fill(this.f24157x, (Object) null);
        this.f24159z = 0;
        this.A = 0;
        this.C = false;
        this.D = false;
    }

    public void I(b0[] b0VarArr, long j10, long j11) {
        this.B = this.f24153t.i(b0VarArr[0]);
    }

    public final void K(a aVar, List<a.b> list) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f24150a;
            if (i10 < bVarArr.length) {
                b0 F = bVarArr[i10].F();
                if (F == null || !this.f24153t.h(F)) {
                    list.add(aVar.f24150a[i10]);
                } else {
                    c i11 = this.f24153t.i(F);
                    byte[] I = aVar.f24150a[i10].I();
                    I.getClass();
                    this.f24156w.t();
                    this.f24156w.v(I.length);
                    ByteBuffer byteBuffer = this.f24156w.f86c;
                    int i12 = e0.f26436a;
                    byteBuffer.put(I);
                    this.f24156w.w();
                    a a10 = i11.a(this.f24156w);
                    if (a10 != null) {
                        K(a10, list);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public String a() {
        return "MetadataRenderer";
    }

    public boolean d() {
        return this.D;
    }

    public int h(b0 b0Var) {
        if (!this.f24153t.h(b0Var)) {
            return 0;
        }
        return (b0Var.M == null ? 4 : 2) | 0 | 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f24154u.i((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) {
        if (!this.C && this.A < 5) {
            this.f24156w.t();
            t B2 = B();
            int J = J(B2, this.f24156w, false);
            if (J == -4) {
                if (this.f24156w.r()) {
                    this.C = true;
                } else {
                    e eVar = this.f24156w;
                    eVar.f24152i = this.E;
                    eVar.w();
                    c cVar = this.B;
                    int i10 = e0.f26436a;
                    a a10 = cVar.a(this.f24156w);
                    if (a10 != null) {
                        ArrayList arrayList = new ArrayList(a10.f24150a.length);
                        K(a10, arrayList);
                        if (!arrayList.isEmpty()) {
                            a aVar = new a((List<? extends a.b>) arrayList);
                            int i11 = this.f24159z;
                            int i12 = this.A;
                            int i13 = (i11 + i12) % 5;
                            this.f24157x[i13] = aVar;
                            this.f24158y[i13] = this.f24156w.f88e;
                            this.A = i12 + 1;
                        }
                    }
                }
            } else if (J == -5) {
                b0 b0Var = (b0) B2.f21666b;
                b0Var.getClass();
                this.E = b0Var.f27412x;
            }
        }
        if (this.A > 0) {
            long[] jArr = this.f24158y;
            int i14 = this.f24159z;
            if (jArr[i14] <= j10) {
                a aVar2 = this.f24157x[i14];
                int i15 = e0.f26436a;
                Handler handler = this.f24155v;
                if (handler != null) {
                    handler.obtainMessage(0, aVar2).sendToTarget();
                } else {
                    this.f24154u.i(aVar2);
                }
                a[] aVarArr = this.f24157x;
                int i16 = this.f24159z;
                aVarArr[i16] = null;
                this.f24159z = (i16 + 1) % 5;
                this.A--;
            }
        }
        if (this.C && this.A == 0) {
            this.D = true;
        }
    }
}
