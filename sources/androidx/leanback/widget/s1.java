package androidx.leanback.widget;

import android.os.Parcelable;
import android.util.SparseArray;
import s.g;

/* compiled from: ViewsStateBundle */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    public int f2521a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2522b = 100;

    /* renamed from: c  reason: collision with root package name */
    public g<String, SparseArray<Parcelable>> f2523c;

    public void a() {
        int i10;
        int i11;
        int i12 = this.f2521a;
        if (i12 == 2) {
            if (this.f2522b > 0) {
                g<String, SparseArray<Parcelable>> gVar = this.f2523c;
                if (gVar != null) {
                    synchronized (gVar) {
                        i11 = gVar.f24824c;
                    }
                    if (i11 == this.f2522b) {
                        return;
                    }
                }
                this.f2523c = new g<>(this.f2522b);
                return;
            }
            throw new IllegalArgumentException();
        } else if (i12 == 3 || i12 == 1) {
            g<String, SparseArray<Parcelable>> gVar2 = this.f2523c;
            if (gVar2 != null) {
                synchronized (gVar2) {
                    i10 = gVar2.f24824c;
                }
                if (i10 == Integer.MAX_VALUE) {
                    return;
                }
            }
            this.f2523c = new g<>(Integer.MAX_VALUE);
        } else {
            this.f2523c = null;
        }
    }

    public void b() {
        g<String, SparseArray<Parcelable>> gVar = this.f2523c;
        if (gVar != null) {
            gVar.e(-1);
        }
    }

    public void c(int i10) {
        int i11;
        g<String, SparseArray<Parcelable>> gVar = this.f2523c;
        if (gVar != null) {
            synchronized (gVar) {
                i11 = gVar.f24823b;
            }
            if (i11 != 0) {
                this.f2523c.d(Integer.toString(i10));
            }
        }
    }
}
