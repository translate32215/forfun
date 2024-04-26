package x2;

import android.graphics.Path;
import android.graphics.PointF;
import h3.a;
import u2.d;

/* compiled from: PathKeyframe */
public class h extends a<PointF> {

    /* renamed from: o  reason: collision with root package name */
    public Path f27268o;

    /* renamed from: p  reason: collision with root package name */
    public final a<PointF> f27269p;

    public h(d dVar, a<PointF> aVar) {
        super(dVar, aVar.f18868b, aVar.f18869c, aVar.f18870d, aVar.f18871e, aVar.f18872f);
        this.f27269p = aVar;
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r12.f18868b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
            r12 = this;
            T r0 = r12.f18869c
            if (r0 == 0) goto L_0x001b
            T r1 = r12.f18868b
            if (r1 == 0) goto L_0x001b
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r2 = r0
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.y
            boolean r0 = r1.equals(r2, r0)
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            T r1 = r12.f18869c
            if (r1 == 0) goto L_0x0076
            if (r0 != 0) goto L_0x0076
            T r0 = r12.f18868b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            h3.a<android.graphics.PointF> r2 = r12.f27269p
            android.graphics.PointF r3 = r2.f18879m
            android.graphics.PointF r2 = r2.f18880n
            android.graphics.PathMeasure r4 = g3.g.f18436a
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r5 = r0.x
            float r6 = r0.y
            r4.moveTo(r5, r6)
            if (r3 == 0) goto L_0x006d
            if (r2 == 0) goto L_0x006d
            float r5 = r3.length()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            float r5 = r2.length()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x006d
        L_0x0051:
            float r5 = r0.x
            float r6 = r3.x
            float r6 = r6 + r5
            float r0 = r0.y
            float r3 = r3.y
            float r7 = r0 + r3
            float r10 = r1.x
            float r0 = r2.x
            float r8 = r10 + r0
            float r11 = r1.y
            float r0 = r2.y
            float r9 = r11 + r0
            r5 = r4
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            goto L_0x0074
        L_0x006d:
            float r0 = r1.x
            float r1 = r1.y
            r4.lineTo(r0, r1)
        L_0x0074:
            r12.f27268o = r4
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.h.e():void");
    }
}
