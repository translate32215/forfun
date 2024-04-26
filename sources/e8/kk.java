package e8;

import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.uc;
import e.e;
import java.nio.ByteBuffer;
import java.util.Date;
import t.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kk extends cr {

    /* renamed from: i  reason: collision with root package name */
    public int f15299i;

    /* renamed from: r  reason: collision with root package name */
    public Date f15300r;

    /* renamed from: s  reason: collision with root package name */
    public Date f15301s;

    /* renamed from: t  reason: collision with root package name */
    public long f15302t;

    /* renamed from: u  reason: collision with root package name */
    public long f15303u;

    /* renamed from: v  reason: collision with root package name */
    public double f15304v = 1.0d;

    /* renamed from: w  reason: collision with root package name */
    public float f15305w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    public qa0 f15306x = qa0.f16106j;

    /* renamed from: y  reason: collision with root package name */
    public long f15307y;

    public kk() {
        super("mvhd");
    }

    public final void e(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get();
        if (i10 < 0) {
            i10 += 256;
        }
        this.f15299i = i10;
        uc.f(byteBuffer);
        byteBuffer.get();
        if (!this.f6136b) {
            c();
        }
        if (this.f15299i == 1) {
            this.f15300r = e.h(uc.g(byteBuffer));
            this.f15301s = e.h(uc.g(byteBuffer));
            this.f15302t = uc.e(byteBuffer);
            this.f15303u = uc.g(byteBuffer);
        } else {
            this.f15300r = e.h(uc.e(byteBuffer));
            this.f15301s = e.h(uc.e(byteBuffer));
            this.f15302t = uc.e(byteBuffer);
            this.f15303u = uc.e(byteBuffer);
        }
        this.f15304v = uc.h(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f15305w = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        uc.f(byteBuffer);
        uc.e(byteBuffer);
        uc.e(byteBuffer);
        double h10 = uc.h(byteBuffer);
        double h11 = uc.h(byteBuffer);
        double i11 = uc.i(byteBuffer);
        this.f15306x = new qa0(h10, h11, uc.h(byteBuffer), uc.h(byteBuffer), i11, uc.i(byteBuffer), uc.i(byteBuffer), uc.h(byteBuffer), uc.h(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f15307y = uc.e(byteBuffer);
    }

    public final String toString() {
        StringBuilder a10 = f.a("MovieHeaderBox[", "creationTime=");
        a10.append(this.f15300r);
        a10.append(";");
        a10.append("modificationTime=");
        a10.append(this.f15301s);
        a10.append(";");
        a10.append("timescale=");
        a10.append(this.f15302t);
        a10.append(";");
        a10.append("duration=");
        a10.append(this.f15303u);
        a10.append(";");
        a10.append("rate=");
        a10.append(this.f15304v);
        a10.append(";");
        a10.append("volume=");
        a10.append(this.f15305w);
        a10.append(";");
        a10.append("matrix=");
        a10.append(this.f15306x);
        a10.append(";");
        a10.append("nextTrackId=");
        a10.append(this.f15307y);
        a10.append("]");
        return a10.toString();
    }
}
