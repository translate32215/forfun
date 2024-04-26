package c5;

import android.net.Uri;
import c5.d;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.k;
import da.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import x4.e0;
import x4.f;

/* compiled from: DefaultDrmSessionManagerProvider */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4312a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public e0.e f4313b;

    /* renamed from: c  reason: collision with root package name */
    public l f4314c;

    public final l a(e0.e eVar) {
        e0.e eVar2 = eVar;
        i.a aVar = new i.a();
        aVar.f5513b = null;
        Uri uri = eVar2.f27542b;
        v vVar = new v(uri == null ? null : uri.toString(), eVar2.f27546f, aVar);
        for (Map.Entry next : eVar2.f27543c.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            str.getClass();
            str2.getClass();
            synchronized (vVar.f4355d) {
                vVar.f4355d.put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = f.f27569d;
        int i10 = u.f4348d;
        k kVar = new k();
        UUID uuid2 = eVar2.f27541a;
        t tVar = t.f4347a;
        uuid2.getClass();
        boolean z10 = eVar2.f27544d;
        boolean z11 = eVar2.f27545e;
        int[] b10 = a.b(eVar2.f27547g);
        for (int i11 : b10) {
            boolean z12 = true;
            if (!(i11 == 2 || i11 == 1)) {
                z12 = false;
            }
            v6.a.a(z12);
        }
        d dVar = new d(uuid2, tVar, vVar, hashMap, z10, (int[]) b10.clone(), z11, kVar, 300000, (d.a) null);
        byte[] bArr = eVar2.f27548h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        v6.a.d(dVar.f4296m.isEmpty());
        dVar.f4305v = 0;
        dVar.f4306w = copyOf;
        return dVar;
    }

    public l b(e0 e0Var) {
        l lVar;
        e0Var.f27504b.getClass();
        e0.e eVar = e0Var.f27504b.f27556c;
        if (eVar == null || v6.e0.f26436a < 18) {
            return l.f4335a;
        }
        synchronized (this.f4312a) {
            if (!v6.e0.a(eVar, this.f4313b)) {
                this.f4313b = eVar;
                this.f4314c = a(eVar);
            }
            lVar = this.f4314c;
            lVar.getClass();
        }
        return lVar;
    }
}
