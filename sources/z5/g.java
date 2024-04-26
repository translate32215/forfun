package z5;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.h;
import d5.o;
import z5.y;

/* compiled from: DefaultMediaSourceFactory */
public final class g implements w {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<w> f28586a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f28587b;

    public g(Context context, o oVar) {
        h hVar = new h(context);
        Class<e.a> cls = e.a.class;
        Class<w> cls2 = w.class;
        SparseArray<w> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (w) DashMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{hVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (w) SsMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{hVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (w) HlsMediaSource.Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{hVar}));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new y.b(hVar, oVar));
        this.f28586a = sparseArray;
        this.f28587b = new int[sparseArray.size()];
        for (int i10 = 0; i10 < this.f28586a.size(); i10++) {
            this.f28587b[i10] = this.f28586a.keyAt(i10);
        }
    }
}
