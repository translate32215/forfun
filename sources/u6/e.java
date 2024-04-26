package u6;

import android.net.Uri;
import android.support.v4.media.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f26048a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26049b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26050c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f26051d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f26052e;

    /* renamed from: f  reason: collision with root package name */
    public final long f26053f;

    /* renamed from: g  reason: collision with root package name */
    public final long f26054g;

    /* renamed from: h  reason: collision with root package name */
    public final String f26055h;

    /* renamed from: i  reason: collision with root package name */
    public final int f26056i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f26057j;

    public e(Uri uri, long j10, long j11) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j10, j11, (String) null, 0, (Object) null);
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public e b(long j10) {
        long j11 = this.f26054g;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        return new e(this.f26048a, this.f26049b, this.f26050c, this.f26051d, this.f26052e, this.f26053f + j10, j13, this.f26055h, this.f26056i, this.f26057j);
    }

    public String toString() {
        StringBuilder a10 = a.a("DataSpec[");
        a10.append(a(this.f26050c));
        a10.append(" ");
        a10.append(this.f26048a);
        a10.append(", ");
        a10.append(this.f26053f);
        a10.append(", ");
        a10.append(this.f26054g);
        a10.append(", ");
        a10.append(this.f26055h);
        a10.append(", ");
        return v.e.a(a10, this.f26056i, "]");
    }

    public e(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        boolean z10 = true;
        v6.a.a(j13 + j14 >= 0);
        v6.a.a(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z10 = false;
        }
        v6.a.a(z10);
        this.f26048a = uri;
        this.f26049b = j13;
        this.f26050c = i10;
        this.f26051d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f26052e = Collections.unmodifiableMap(new HashMap(map));
        this.f26053f = j14;
        this.f26054g = j15;
        this.f26055h = str;
        this.f26056i = i11;
        this.f26057j = obj;
    }
}
