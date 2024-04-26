package s9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import r9.a;
import s9.l;

/* compiled from: ShapePath */
public class k extends l.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f25158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f25159c;

    public k(l lVar, List list, Matrix matrix) {
        this.f25158b = list;
        this.f25159c = matrix;
    }

    public void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        for (l.f a10 : this.f25158b) {
            a10.a(this.f25159c, aVar, i10, canvas);
        }
    }
}
