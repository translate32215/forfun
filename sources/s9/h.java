package s9;

import x3.d;

/* compiled from: RoundedCornerTreatment */
public class h extends d {
    public h() {
        super(6);
    }

    public void a(l lVar, float f10, float f11, float f12) {
        lVar.e(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        lVar.a(0.0f, 0.0f, f13, f13, 180.0f, f10);
    }
}
