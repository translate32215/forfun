package ve;

import javax.annotation.Nullable;

/* compiled from: Segment */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26774a;

    /* renamed from: b  reason: collision with root package name */
    public int f26775b;

    /* renamed from: c  reason: collision with root package name */
    public int f26776c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26777d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26778e;

    /* renamed from: f  reason: collision with root package name */
    public u f26779f;

    /* renamed from: g  reason: collision with root package name */
    public u f26780g;

    public u() {
        this.f26774a = new byte[8192];
        this.f26778e = true;
        this.f26777d = false;
    }

    @Nullable
    public final u a() {
        u uVar = this.f26779f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f26780g;
        uVar3.f26779f = uVar;
        this.f26779f.f26780g = uVar3;
        this.f26779f = null;
        this.f26780g = null;
        return uVar2;
    }

    public final u b(u uVar) {
        uVar.f26780g = this;
        uVar.f26779f = this.f26779f;
        this.f26779f.f26780g = uVar;
        this.f26779f = uVar;
        return uVar;
    }

    public final u c() {
        this.f26777d = true;
        return new u(this.f26774a, this.f26775b, this.f26776c, true, false);
    }

    public final void d(u uVar, int i10) {
        if (uVar.f26778e) {
            int i11 = uVar.f26776c;
            if (i11 + i10 > 8192) {
                if (!uVar.f26777d) {
                    int i12 = uVar.f26775b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = uVar.f26774a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        uVar.f26776c -= uVar.f26775b;
                        uVar.f26775b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f26774a, this.f26775b, uVar.f26774a, uVar.f26776c, i10);
            uVar.f26776c += i10;
            this.f26775b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public u(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f26774a = bArr;
        this.f26775b = i10;
        this.f26776c = i11;
        this.f26777d = z10;
        this.f26778e = z11;
    }
}
