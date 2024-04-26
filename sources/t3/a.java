package t3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.f;
import java.io.IOException;
import k3.e;
import m3.w;

/* compiled from: BitmapDrawableDecoder */
public class a<DataType> implements f<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final f<DataType, Bitmap> f25603a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f25604b;

    public a(Resources resources, f<DataType, Bitmap> fVar) {
        this.f25604b = resources;
        this.f25603a = fVar;
    }

    public w<BitmapDrawable> a(DataType datatype, int i10, int i11, e eVar) throws IOException {
        return t.d(this.f25604b, this.f25603a.a(datatype, i10, i11, eVar));
    }

    public boolean b(DataType datatype, e eVar) throws IOException {
        return this.f25603a.b(datatype, eVar);
    }
}
