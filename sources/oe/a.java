package oe;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import ke.c0;
import ke.d0;
import ke.j;
import ke.k;
import ke.r;
import ke.t;
import ke.u;
import ke.z;
import le.c;
import ve.m;
import ve.p;

/* compiled from: BridgeInterceptor */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final k f23693a;

    public a(k kVar) {
        this.f23693a = kVar;
    }

    public d0 a(t.a aVar) throws IOException {
        boolean z10;
        f fVar = (f) aVar;
        z zVar = fVar.f23704f;
        zVar.getClass();
        z.a aVar2 = new z.a(zVar);
        c0 c0Var = zVar.f20883d;
        if (c0Var != null) {
            u b10 = c0Var.b();
            if (b10 != null) {
                aVar2.b("Content-Type", b10.f20801a);
            }
            long a10 = c0Var.a();
            if (a10 != -1) {
                aVar2.b("Content-Length", Long.toString(a10));
                aVar2.f20888c.c("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.f20888c.c("Content-Length");
            }
        }
        if (zVar.f20882c.c("Host") == null) {
            aVar2.b("Host", c.n(zVar.f20880a, false));
        }
        if (zVar.f20882c.c("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (zVar.f20882c.c("Accept-Encoding") == null && zVar.f20882c.c("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        ((k.a) this.f23693a).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int size = emptyList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append("; ");
                }
                j jVar = (j) emptyList.get(i10);
                sb2.append(jVar.f20753a);
                sb2.append('=');
                sb2.append(jVar.f20754b);
            }
            aVar2.b("Cookie", sb2.toString());
        }
        if (zVar.f20882c.c("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/3.12.8");
        }
        d0 b11 = fVar.b(aVar2.a(), fVar.f23700b, fVar.f23701c, fVar.f23702d);
        e.d(this.f23693a, zVar.f20880a, b11.f20669f);
        d0.a aVar3 = new d0.a(b11);
        aVar3.f20677a = zVar;
        if (z10) {
            String c10 = b11.f20669f.c("Content-Encoding");
            String str = null;
            if (c10 == null) {
                c10 = null;
            }
            if ("gzip".equalsIgnoreCase(c10) && e.b(b11)) {
                m mVar = new m(b11.f20670g.o());
                r.a e10 = b11.f20669f.e();
                e10.c("Content-Encoding");
                e10.c("Content-Length");
                List<String> list = e10.f20780a;
                r.a aVar4 = new r.a();
                Collections.addAll(aVar4.f20780a, (String[]) list.toArray(new String[list.size()]));
                aVar3.f20682f = aVar4;
                String c11 = b11.f20669f.c("Content-Type");
                if (c11 != null) {
                    str = c11;
                }
                Logger logger = p.f26761a;
                aVar3.f20683g = new g(str, -1, new ve.t(mVar));
            }
        }
        return aVar3.a();
    }
}
