package e8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.t;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class oo implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final String f15809a;

    /* renamed from: b  reason: collision with root package name */
    public final double f15810b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15811c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15812d;

    public oo(String str, double d10, int i10, int i11) {
        this.f15809a = str;
        this.f15810b = d10;
        this.f15811c = i10;
        this.f15812d = i11;
    }

    public final Object apply(Object obj) {
        String str = this.f15809a;
        return new t(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f15810b, this.f15811c, this.f15812d);
    }
}
