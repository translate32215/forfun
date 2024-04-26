package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gl;
import e8.f80;
import e8.r60;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class al extends ti<hl, gl> {
    public al(Class cls) {
        super(cls);
    }

    public final void a(cq cqVar) throws GeneralSecurityException {
        hl hlVar = (hl) cqVar;
        yk.h(hlVar.z());
        if (hlVar.y() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final Object b(cq cqVar) throws GeneralSecurityException {
        hl hlVar = (hl) cqVar;
        gl.a E = gl.E();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        gl.z((gl) E.f5970b);
        byte[] a10 = r60.a(hlVar.y());
        mp I = mp.I(a10, 0, a10.length);
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        gl.B((gl) E.f5970b, I);
        kl z10 = hlVar.z();
        if (E.f5971c) {
            E.n();
            E.f5971c = false;
        }
        gl.A((gl) E.f5970b, z10);
        return (gl) ((aq) E.j());
    }

    public final /* synthetic */ cq c(mp mpVar) throws f80 {
        return hl.B(mpVar, up.a());
    }
}
