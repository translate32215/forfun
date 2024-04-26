package b6;

import com.google.android.exoplayer2.source.hls.b;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.r;
import java.io.IOException;
import java.util.Arrays;
import v6.e0;
import x4.b0;

/* compiled from: DataChunk */
public abstract class k extends e {

    /* renamed from: j  reason: collision with root package name */
    public byte[] f3629j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f3630k;

    public k(e eVar, u6.e eVar2, int i10, b0 b0Var, int i11, Object obj, byte[] bArr) {
        super(eVar, eVar2, i10, b0Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        k kVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = e0.f26441f;
            kVar = this;
        } else {
            kVar = this;
            bArr2 = bArr;
        }
        kVar.f3629j = bArr2;
    }

    public final void a() throws IOException {
        try {
            this.f3597i.O(this.f3590b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f3630k) {
                byte[] bArr = this.f3629j;
                if (bArr.length < i11 + 16384) {
                    this.f3629j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f3597i.a(this.f3629j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f3630k) {
                ((b.a) this).f5177l = Arrays.copyOf(this.f3629j, i11);
            }
        } finally {
            r rVar = this.f3597i;
            int i12 = e0.f26436a;
            if (rVar != null) {
                try {
                    rVar.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public final void b() {
        this.f3630k = true;
    }
}
