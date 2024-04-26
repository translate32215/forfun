package v7;

import android.content.Context;
import android.util.SparseIntArray;
import s7.e;
import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f26590a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public e f26591b;

    public o(e eVar) {
        if (eVar != null) {
            this.f26591b = eVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final int a(Context context, a.f fVar) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (fVar != null) {
            int i10 = 0;
            if (!fVar.f()) {
                return 0;
            }
            int g10 = fVar.g();
            int i11 = this.f26590a.get(g10, -1);
            if (i11 == -1) {
                int i12 = 0;
                while (true) {
                    if (i12 >= this.f26590a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f26590a.keyAt(i12);
                    if (keyAt > g10 && this.f26590a.get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                }
                i11 = i10 == -1 ? this.f26591b.d(context, g10) : i10;
                this.f26590a.put(g10, i11);
            }
            return i11;
        } else {
            throw new NullPointerException("null reference");
        }
    }
}
