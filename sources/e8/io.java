package e8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.internal.ads.mg;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class io implements mg<wi0, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f15060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f15061b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ jo f15062c;

    public io(jo joVar, double d10, boolean z10) {
        this.f15062c = joVar;
        this.f15060a = d10;
        this.f15061b = z10;
    }

    public final Object apply(Object obj) {
        jo joVar = this.f15062c;
        byte[] bArr = ((wi0) obj).f17364b;
        double d10 = this.f15060a;
        boolean z10 = this.f15061b;
        joVar.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16672v3)).booleanValue()) {
            options.inJustDecodeBounds = true;
            joVar.a(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                int i11 = i10 - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i11 / ((Integer) ti0.f16763j.f16769f.a(t.f16678w3)).intValue())) / 2);
            }
        }
        return joVar.a(bArr, options);
    }
}
