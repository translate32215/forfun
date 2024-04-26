package ke;

import java.io.IOException;
import javax.annotation.Nullable;
import ve.g;

/* compiled from: RequestBody */
public class b0 extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f20644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f20645b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f20646c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f20647d;

    public b0(u uVar, int i10, byte[] bArr, int i11) {
        this.f20644a = uVar;
        this.f20645b = i10;
        this.f20646c = bArr;
        this.f20647d = i11;
    }

    public long a() {
        return (long) this.f20645b;
    }

    @Nullable
    public u b() {
        return this.f20644a;
    }

    public void c(g gVar) throws IOException {
        gVar.g(this.f20646c, this.f20647d, this.f20645b);
    }
}
