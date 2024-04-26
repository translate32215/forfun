package e8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.List;
import l0.e;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kh0 extends a {
    public static final Parcelable.Creator<kh0> CREATOR = new nh0();

    /* renamed from: a  reason: collision with root package name */
    public final String f15289a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15290b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15291c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15292d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15293e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f15294f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15295g;

    /* renamed from: h  reason: collision with root package name */
    public long f15296h;

    /* renamed from: i  reason: collision with root package name */
    public String f15297i;

    /* renamed from: r  reason: collision with root package name */
    public int f15298r;

    public kh0(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f15289a = str;
        this.f15290b = j10;
        this.f15291c = str2 == null ? "" : str2;
        this.f15292d = str3 == null ? "" : str3;
        this.f15293e = str4 == null ? "" : str4;
        this.f15294f = bundle == null ? new Bundle() : bundle;
        this.f15295g = z10;
        this.f15296h = j11;
        this.f15297i = str5;
        this.f15298r = i10;
    }

    public static kh0 i(Uri uri) {
        long j10;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                e.K(sb2.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                j10 = 0;
            } else {
                j10 = Long.parseLong(queryParameter2);
            }
            long j11 = j10;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new kh0(queryParameter, j11, host, str, str2, bundle, equals, 0, "", 0);
        } catch (NullPointerException | NumberFormatException e10) {
            e.D("Unable to parse Uri into cache offering.", e10);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f15289a, false);
        long j10 = this.f15290b;
        parcel.writeInt(524291);
        parcel.writeLong(j10);
        j.g(parcel, 4, this.f15291c, false);
        j.g(parcel, 5, this.f15292d, false);
        j.g(parcel, 6, this.f15293e, false);
        j.c(parcel, 7, this.f15294f, false);
        boolean z10 = this.f15295g;
        parcel.writeInt(262152);
        parcel.writeInt(z10 ? 1 : 0);
        long j11 = this.f15296h;
        parcel.writeInt(524297);
        parcel.writeLong(j11);
        j.g(parcel, 10, this.f15297i, false);
        int i11 = this.f15298r;
        parcel.writeInt(262155);
        parcel.writeInt(i11);
        j.m(parcel, l10);
    }
}
