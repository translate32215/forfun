package a6;

import android.net.Uri;
import java.util.Arrays;
import v6.e0;

/* compiled from: AdPlaybackState */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f112g = new a((Object) null, new long[0], (C0004a[]) null, 0, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    public final Object f113a = null;

    /* renamed from: b  reason: collision with root package name */
    public final int f114b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f115c;

    /* renamed from: d  reason: collision with root package name */
    public final C0004a[] f116d;

    /* renamed from: e  reason: collision with root package name */
    public final long f117e;

    /* renamed from: f  reason: collision with root package name */
    public final long f118f;

    /* renamed from: a6.a$a  reason: collision with other inner class name */
    /* compiled from: AdPlaybackState */
    public static final class C0004a {

        /* renamed from: a  reason: collision with root package name */
        public final int f119a = -1;

        /* renamed from: b  reason: collision with root package name */
        public final Uri[] f120b = new Uri[0];

        /* renamed from: c  reason: collision with root package name */
        public final int[] f121c = new int[0];

        /* renamed from: d  reason: collision with root package name */
        public final long[] f122d = new long[0];

        public C0004a() {
            v6.a.a(true);
        }

        public int a(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f121c;
                if (i11 >= iArr.length || iArr[i11] == 0 || iArr[i11] == 1) {
                    return i11;
                }
                i11++;
            }
            return i11;
        }

        public boolean b() {
            return this.f119a == -1 || a(-1) < this.f119a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0004a.class != obj.getClass()) {
                return false;
            }
            C0004a aVar = (C0004a) obj;
            if (this.f119a != aVar.f119a || !Arrays.equals(this.f120b, aVar.f120b) || !Arrays.equals(this.f121c, aVar.f121c) || !Arrays.equals(this.f122d, aVar.f122d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f121c);
            return Arrays.hashCode(this.f122d) + ((hashCode + (((this.f119a * 31) + Arrays.hashCode(this.f120b)) * 31)) * 31);
        }
    }

    public a(Object obj, long[] jArr, C0004a[] aVarArr, long j10, long j11) {
        this.f115c = jArr;
        this.f117e = j10;
        this.f118f = j11;
        int length = jArr.length;
        this.f114b = length;
        C0004a[] aVarArr2 = new C0004a[length];
        for (int i10 = 0; i10 < this.f114b; i10++) {
            aVarArr2[i10] = new C0004a();
        }
        this.f116d = aVarArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!e0.a(this.f113a, aVar.f113a) || this.f114b != aVar.f114b || this.f117e != aVar.f117e || this.f118f != aVar.f118f || !Arrays.equals(this.f115c, aVar.f115c) || !Arrays.equals(this.f116d, aVar.f116d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f114b * 31;
        Object obj = this.f113a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return Arrays.hashCode(this.f116d) + ((Arrays.hashCode(this.f115c) + ((((((i10 + hashCode) * 31) + ((int) this.f117e)) * 31) + ((int) this.f118f)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("AdPlaybackState(adsId=");
        a10.append(this.f113a);
        a10.append(", adResumePositionUs=");
        a10.append(this.f117e);
        a10.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f116d.length; i10++) {
            a10.append("adGroup(timeUs=");
            a10.append(this.f115c[i10]);
            a10.append(", ads=[");
            for (int i11 = 0; i11 < this.f116d[i10].f121c.length; i11++) {
                a10.append("ad(state=");
                int i12 = this.f116d[i10].f121c[i11];
                if (i12 == 0) {
                    a10.append('_');
                } else if (i12 == 1) {
                    a10.append('R');
                } else if (i12 == 2) {
                    a10.append('S');
                } else if (i12 == 3) {
                    a10.append('P');
                } else if (i12 != 4) {
                    a10.append('?');
                } else {
                    a10.append('!');
                }
                a10.append(", durationUs=");
                a10.append(this.f116d[i10].f122d[i11]);
                a10.append(')');
                if (i11 < this.f116d[i10].f121c.length - 1) {
                    a10.append(", ");
                }
            }
            a10.append("])");
            if (i10 < this.f116d.length - 1) {
                a10.append(", ");
            }
        }
        a10.append("])");
        return a10.toString();
    }
}
