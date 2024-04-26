package b6;

import android.util.Log;
import b6.f;
import d5.h;
import z5.a0;

/* compiled from: BaseMediaChunkOutput */
public final class c implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3570a;

    /* renamed from: b  reason: collision with root package name */
    public final a0[] f3571b;

    public c(int[] iArr, a0[] a0VarArr) {
        this.f3570a = iArr;
        this.f3571b = a0VarArr;
    }

    public void a(long j10) {
        for (a0 a0Var : this.f3571b) {
            if (a0Var.H != j10) {
                a0Var.H = j10;
                a0Var.A = true;
            }
        }
    }

    public d5.a0 b(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f3570a;
            if (i12 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new h();
            } else if (i11 == iArr[i12]) {
                return this.f3571b[i12];
            } else {
                i12++;
            }
        }
    }
}
