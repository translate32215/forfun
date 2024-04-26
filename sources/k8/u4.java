package k8;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class u4 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f20483a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20484b;

    public u4(Uri uri) {
        this((String) null, uri, false);
    }

    public u4(String str, Uri uri, boolean z10) {
        this.f20483a = uri;
        this.f20484b = z10;
    }

    public final w4<Long> a(String str, long j10) {
        return new q4(this, str, Long.valueOf(j10));
    }

    public final w4<Boolean> b(String str, boolean z10) {
        return new r4(this, str, Boolean.valueOf(z10));
    }
}
