package e3;

import com.startapp.b4;
import f3.c;
import java.io.IOException;
import t.g;
import z2.b;

/* compiled from: DocumentDataParser */
public class h implements h0<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f13557a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f13558b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public Object a(c cVar, float f10) throws IOException {
        cVar.d();
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        int i10 = 3;
        int i11 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        float f14 = 0.0f;
        boolean z10 = true;
        while (cVar.t()) {
            switch (cVar.T(f13558b)) {
                case 0:
                    str = cVar.J();
                    break;
                case 1:
                    str2 = cVar.J();
                    break;
                case 2:
                    f11 = (float) cVar.v();
                    break;
                case 3:
                    int G = cVar.G();
                    if (G <= 2 && G >= 0) {
                        i10 = g.com$airbnb$lottie$model$DocumentData$Justification$s$values()[G];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                case 4:
                    i11 = cVar.G();
                    break;
                case 5:
                    f12 = (float) cVar.v();
                    break;
                case 6:
                    f13 = (float) cVar.v();
                    break;
                case 7:
                    i12 = p.a(cVar);
                    break;
                case b4.f10106f:
                    i13 = p.a(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.v();
                    break;
                case 10:
                    z10 = cVar.u();
                    break;
                default:
                    cVar.V();
                    cVar.f0();
                    break;
            }
        }
        c cVar2 = cVar;
        cVar.o();
        return new b(str, str2, f11, i10, i11, f12, f13, i12, i13, f14, z10);
    }
}
