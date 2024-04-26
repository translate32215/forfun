package qc;

import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.b;
import lf.d;
import ud.k;

/* compiled from: LiveDataCallAdapter.kt */
public final class j extends LiveData<e<Object>> {

    /* renamed from: l  reason: collision with root package name */
    public AtomicBoolean f24275l = new AtomicBoolean(false);

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b<Object> f24276m;

    /* compiled from: LiveDataCallAdapter.kt */
    public static final class a implements d<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f24277a;

        public a(j jVar) {
            this.f24277a = jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r1v7, types: [java.util.Date] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(lf.b<java.lang.Object> r5, lf.d0<java.lang.Object> r6) {
            /*
                r4 = this;
                java.lang.String r0 = "call"
                ud.k.f(r5, r0)
                java.lang.String r5 = "response"
                ud.k.f(r6, r5)
                qc.j r5 = r4.f24277a
                boolean r0 = r6.b()
                r1 = 0
                if (r0 == 0) goto L_0x003a
                T r0 = r6.f21324b
                if (r0 == 0) goto L_0x0034
                ke.d0 r6 = r6.f21323a
                int r2 = r6.f20666c
                r3 = 204(0xcc, float:2.86E-43)
                if (r2 != r3) goto L_0x0020
                goto L_0x0034
            L_0x0020:
                qc.f r2 = new qc.f
                ke.r r6 = r6.f20669f
                java.lang.String r3 = "Date"
                java.lang.String r6 = r6.c(r3)
                if (r6 == 0) goto L_0x0030
                java.util.Date r1 = oe.d.a(r6)
            L_0x0030:
                r2.<init>(r0, r1)
                goto L_0x005e
            L_0x0034:
                qc.c r2 = new qc.c
                r2.<init>()
                goto L_0x005e
            L_0x003a:
                ke.e0 r0 = r6.f21325c
                if (r0 != 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                java.lang.String r1 = r0.s()
            L_0x0043:
                if (r1 == 0) goto L_0x004e
                int r0 = r1.length()
                if (r0 != 0) goto L_0x004c
                goto L_0x004e
            L_0x004c:
                r0 = 0
                goto L_0x004f
            L_0x004e:
                r0 = 1
            L_0x004f:
                if (r0 == 0) goto L_0x0055
                ke.d0 r6 = r6.f21323a
                java.lang.String r1 = r6.f20667d
            L_0x0055:
                qc.d r2 = new qc.d
                if (r1 != 0) goto L_0x005b
                java.lang.String r1 = "unknown error"
            L_0x005b:
                r2.<init>(r1)
            L_0x005e:
                r5.j(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.j.a.a(lf.b, lf.d0):void");
        }

        public void b(b<Object> bVar, Throwable th) {
            k.f(bVar, "call");
            k.f(th, "throwable");
            j jVar = this.f24277a;
            String message = th.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            jVar.j(new d(message));
        }
    }

    public j(b<Object> bVar) {
        this.f24276m = bVar;
    }

    public void h() {
        if (this.f24275l.compareAndSet(false, true)) {
            this.f24276m.J(new a(this));
        }
    }
}
