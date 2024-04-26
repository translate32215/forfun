package qe;

import android.support.v4.media.a;
import java.io.IOException;
import le.b;
import qe.g;
import re.f;

/* compiled from: Http2Connection */
public class m extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f24381b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.C0229g f24382c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(g.C0229g gVar, String str, Object[] objArr, q qVar) {
        super(str, objArr);
        this.f24382c = gVar;
        this.f24381b = qVar;
    }

    public void a() {
        try {
            g.this.f24331b.b(this.f24381b);
        } catch (IOException e10) {
            f fVar = f.f24794a;
            StringBuilder a10 = a.a("Http2Connection.Listener failure for ");
            a10.append(g.this.f24333d);
            fVar.l(4, a10.toString(), e10);
            try {
                this.f24381b.c(b.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
