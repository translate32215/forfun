package e8;

import android.net.Uri;
import androidx.appcompat.widget.o;
import j4.e;
import java.util.Arrays;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qf0 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f16161a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f16162b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16163c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16164d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16165e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16166f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16167g;

    public qf0(Uri uri, long j10, long j11, String str) {
        this(uri, (byte[]) null, j10, j10, j11, (String) null, 0);
    }

    public final boolean a() {
        return (this.f16167g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16161a);
        String arrays = Arrays.toString(this.f16162b);
        long j10 = this.f16163c;
        long j11 = this.f16164d;
        long j12 = this.f16165e;
        String str = this.f16166f;
        int i10 = this.f16167g;
        StringBuilder a10 = e.a(o.a(str, o.a(arrays, valueOf.length() + 93)), "DataSpec[", valueOf, ", ", arrays);
        a10.append(", ");
        a10.append(j10);
        a10.append(", ");
        a10.append(j11);
        a10.append(", ");
        a10.append(j12);
        a10.append(", ");
        a10.append(str);
        a10.append(", ");
        a10.append(i10);
        a10.append("]");
        return a10.toString();
    }

    public qf0(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        a.a(z10);
        this.f16161a = uri;
        this.f16162b = bArr;
        this.f16163c = j10;
        this.f16164d = j11;
        this.f16165e = j12;
        this.f16166f = str;
        this.f16167g = i10;
    }
}
