package zd;

import java.util.NoSuchElementException;
import ld.q;

/* compiled from: ProgressionIterators.kt */
public final class b extends q {

    /* renamed from: a  reason: collision with root package name */
    public final int f28842a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28843b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28844c;

    /* renamed from: d  reason: collision with root package name */
    public int f28845d;

    public b(int i10, int i11, int i12) {
        this.f28842a = i12;
        this.f28843b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f28844c = z10;
        this.f28845d = !z10 ? i11 : i10;
    }

    public int a() {
        int i10 = this.f28845d;
        if (i10 != this.f28843b) {
            this.f28845d = this.f28842a + i10;
        } else if (this.f28844c) {
            this.f28844c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f28844c;
    }
}
