package de;

/* compiled from: JobSupport.kt */
public class z0 extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13342b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var) {
        super(true);
        b1 r10;
        boolean z10 = true;
        B(w0Var);
        j x10 = x();
        k kVar = x10 instanceof k ? (k) x10 : null;
        b1 r11 = kVar == null ? null : kVar.r();
        if (r11 == null) {
            z10 = false;
        } else {
            while (true) {
                if (!r11.q()) {
                    j x11 = r11.x();
                    k kVar2 = x11 instanceof k ? (k) x11 : null;
                    if (kVar2 == null) {
                        r10 = null;
                        continue;
                    } else {
                        r10 = kVar2.r();
                        continue;
                    }
                    if (r11 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z10 = false;
        }
        this.f13342b = z10;
    }

    public boolean q() {
        return this.f13342b;
    }

    public boolean r() {
        return true;
    }
}
