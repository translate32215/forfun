package q6;

import h6.b;
import h6.c;
import h6.e;
import h6.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import q6.e;
import v6.e0;
import v6.v;

/* compiled from: Mp4WebvttDecoder */
public final class b extends c {

    /* renamed from: n  reason: collision with root package name */
    public final v f24163n = new v();

    public b() {
        super("Mp4WebvttDecoder");
    }

    public e k(byte[] bArr, int i10, boolean z10) throws g {
        h6.b bVar;
        v vVar = this.f24163n;
        vVar.f26518a = bArr;
        vVar.f26520c = i10;
        vVar.f26519b = 0;
        ArrayList arrayList = new ArrayList();
        while (this.f24163n.a() > 0) {
            if (this.f24163n.a() >= 8) {
                int f10 = this.f24163n.f();
                if (this.f24163n.f() == 1987343459) {
                    v vVar2 = this.f24163n;
                    int i11 = f10 - 8;
                    CharSequence charSequence = null;
                    b.C0156b bVar2 = null;
                    while (i11 > 0) {
                        if (i11 >= 8) {
                            int f11 = vVar2.f();
                            int f12 = vVar2.f();
                            int i12 = f11 - 8;
                            String p10 = e0.p(vVar2.f26518a, vVar2.f26519b, i12);
                            vVar2.E(i12);
                            i11 = (i11 - 8) - i12;
                            if (f12 == 1937011815) {
                                e.C0225e eVar = new e.C0225e();
                                e.e(p10, eVar);
                                bVar2 = eVar.a();
                            } else if (f12 == 1885436268) {
                                charSequence = e.f((String) null, p10.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new g("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (bVar2 != null) {
                        bVar2.f18938a = charSequence;
                        bVar = bVar2.a();
                    } else {
                        Pattern pattern = e.f24183a;
                        e.C0225e eVar2 = new e.C0225e();
                        eVar2.f24198c = charSequence;
                        bVar = eVar2.a().a();
                    }
                    arrayList.add(bVar);
                } else {
                    this.f24163n.E(f10 - 8);
                }
            } else {
                throw new g("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new i6.e(arrayList, 2);
    }
}
