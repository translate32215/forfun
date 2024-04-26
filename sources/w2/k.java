package w2;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import b3.g;
import java.util.ArrayList;
import java.util.List;
import x2.n;

@TargetApi(19)
/* compiled from: MergePathsContent */
public class k implements l, i {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26943a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f26944b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f26945c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final List<l> f26946d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final g f26947e;

    public k(g gVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f26947e = gVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    @TargetApi(19)
    public final void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f26944b.reset();
        this.f26943a.reset();
        for (int size = this.f26946d.size() - 1; size >= 1; size--) {
            l lVar = this.f26946d.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                List<l> g10 = cVar.g();
                for (int size2 = g10.size() - 1; size2 >= 0; size2--) {
                    Path i10 = g10.get(size2).i();
                    n nVar = cVar.f26895k;
                    if (nVar != null) {
                        matrix2 = nVar.e();
                    } else {
                        cVar.f26887c.reset();
                        matrix2 = cVar.f26887c;
                    }
                    i10.transform(matrix2);
                    this.f26944b.addPath(i10);
                }
            } else {
                this.f26944b.addPath(lVar.i());
            }
        }
        l lVar2 = this.f26946d.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> g11 = cVar2.g();
            for (int i11 = 0; i11 < g11.size(); i11++) {
                Path i12 = g11.get(i11).i();
                n nVar2 = cVar2.f26895k;
                if (nVar2 != null) {
                    matrix = nVar2.e();
                } else {
                    cVar2.f26887c.reset();
                    matrix = cVar2.f26887c;
                }
                i12.transform(matrix);
                this.f26943a.addPath(i12);
            }
        } else {
            this.f26943a.set(lVar2.i());
        }
        this.f26945c.op(this.f26943a, this.f26944b, op);
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < this.f26946d.size(); i10++) {
            this.f26946d.get(i10).f(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.ListIterator<w2.b> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            w2.b r0 = (w2.b) r0
            boolean r1 = r0 instanceof w2.l
            if (r1 == 0) goto L_0x000d
            java.util.List<w2.l> r1 = r2.f26946d
            w2.l r0 = (w2.l) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.g(java.util.ListIterator):void");
    }

    public Path i() {
        this.f26945c.reset();
        g gVar = this.f26947e;
        if (gVar.f3494c) {
            return this.f26945c;
        }
        int ordinal = gVar.f3493b.ordinal();
        if (ordinal == 0) {
            for (int i10 = 0; i10 < this.f26946d.size(); i10++) {
                this.f26945c.addPath(this.f26946d.get(i10).i());
            }
        } else if (ordinal == 1) {
            b(Path.Op.UNION);
        } else if (ordinal == 2) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            b(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            b(Path.Op.XOR);
        }
        return this.f26945c;
    }
}
