package kf;

import ae.c;
import gf.l;
import ud.k;
import ud.n;
import ud.v;

/* compiled from: KodeinContainerImpl.kt */
public final /* synthetic */ class h extends n {
    public h(l.e eVar) {
        super(eVar);
    }

    public String a() {
        return "fullDescription";
    }

    public Object get() {
        l.e eVar = (l.e) this.f26182b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.c());
        eVar.a(sb2, gf.n.f18685i);
        String sb3 = sb2.toString();
        k.b(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public c j() {
        return v.a(l.e.class);
    }

    public String l() {
        return "getFullDescription()Ljava/lang/String;";
    }
}
