package e8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.d;
import java.util.concurrent.Executor;
import l0.e;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jo {

    /* renamed from: a  reason: collision with root package name */
    public final b f15177a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15178b;

    public jo(d dVar, b bVar, Executor executor) {
        this.f15177a = bVar;
        this.f15178b = executor;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        long a10 = this.f15177a.a();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long a11 = this.f15177a.a();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j10 = a11 - a10;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append("Decoded image w: ");
            sb2.append(width);
            sb2.append(" h:");
            sb2.append(height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            e.H(sb2.toString());
        }
        return decodeByteArray;
    }
}
