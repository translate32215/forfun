package t3;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.f;
import java.io.IOException;
import k3.e;
import m3.w;
import t3.r;

/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class u implements f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f25673a;

    public u(l lVar) {
        this.f25673a = lVar;
    }

    public w a(Object obj, int i10, int i11, e eVar) throws IOException {
        l lVar = this.f25673a;
        return lVar.b(new r.b((ParcelFileDescriptor) obj, lVar.f25647d, lVar.f25646c), i10, i11, eVar, l.f25641k);
    }

    public boolean b(Object obj, e eVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        this.f25673a.getClass();
        return ParcelFileDescriptorRewinder.c();
    }
}
