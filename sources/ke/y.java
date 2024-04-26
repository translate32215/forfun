package ke;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import ke.s;
import oe.f;
import oe.i;
import ve.c;

/* compiled from: RealCall */
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    public final w f20870a;

    /* renamed from: b  reason: collision with root package name */
    public final i f20871b;

    /* renamed from: c  reason: collision with root package name */
    public final c f20872c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public n f20873d;

    /* renamed from: e  reason: collision with root package name */
    public final z f20874e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20875f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20876g;

    /* compiled from: RealCall */
    public class a extends c {
        public a() {
        }

        public void m() {
            y.this.cancel();
        }
    }

    /* compiled from: RealCall */
    public final class b extends le.b {

        /* renamed from: b  reason: collision with root package name */
        public final e f20878b;

        static {
            Class<y> cls = y.class;
        }

        public b(e eVar) {
            super("OkHttp %s", y.this.b());
            this.f20878b = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ IOException -> 0x004b, all -> 0x0023, all -> 0x008b }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ IOException -> 0x004b, all -> 0x0023, all -> 0x008b }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[Catch:{ IOException -> 0x004b, all -> 0x0023, all -> 0x008b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                ke.y r0 = ke.y.this
                ve.c r0 = r0.f20872c
                r0.i()
                r0 = 0
                ke.y r1 = ke.y.this     // Catch:{ IOException -> 0x004b, all -> 0x0023 }
                ke.d0 r0 = r1.a()     // Catch:{ IOException -> 0x004b, all -> 0x0023 }
                r1 = 1
                ke.e r2 = r5.f20878b     // Catch:{ IOException -> 0x0021, all -> 0x001d }
                ke.y r3 = ke.y.this     // Catch:{ IOException -> 0x0021, all -> 0x001d }
                lf.t$a r2 = (lf.t.a) r2     // Catch:{ IOException -> 0x0021, all -> 0x001d }
                r2.b(r3, r0)     // Catch:{ IOException -> 0x0021, all -> 0x001d }
            L_0x0018:
                ke.y r0 = ke.y.this
                ke.w r0 = r0.f20870a
                goto L_0x0085
            L_0x001d:
                r0 = move-exception
                r1 = r0
                r0 = 1
                goto L_0x0024
            L_0x0021:
                r0 = move-exception
                goto L_0x004e
            L_0x0023:
                r1 = move-exception
            L_0x0024:
                ke.y r2 = ke.y.this     // Catch:{ all -> 0x008b }
                r2.cancel()     // Catch:{ all -> 0x008b }
                if (r0 != 0) goto L_0x004a
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x008b }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r2.<init>()     // Catch:{ all -> 0x008b }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x008b }
                r2.append(r1)     // Catch:{ all -> 0x008b }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008b }
                r0.<init>(r2)     // Catch:{ all -> 0x008b }
                ke.e r2 = r5.f20878b     // Catch:{ all -> 0x008b }
                ke.y r3 = ke.y.this     // Catch:{ all -> 0x008b }
                lf.t$a r2 = (lf.t.a) r2     // Catch:{ all -> 0x008b }
                r2.a(r3, r0)     // Catch:{ all -> 0x008b }
            L_0x004a:
                throw r1     // Catch:{ all -> 0x008b }
            L_0x004b:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x004e:
                ke.y r2 = ke.y.this     // Catch:{ all -> 0x008b }
                java.io.IOException r0 = r2.c(r0)     // Catch:{ all -> 0x008b }
                if (r1 == 0) goto L_0x0074
                re.f r1 = re.f.f24794a     // Catch:{ all -> 0x008b }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r3.<init>()     // Catch:{ all -> 0x008b }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x008b }
                ke.y r4 = ke.y.this     // Catch:{ all -> 0x008b }
                java.lang.String r4 = r4.d()     // Catch:{ all -> 0x008b }
                r3.append(r4)     // Catch:{ all -> 0x008b }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008b }
                r1.l(r2, r3, r0)     // Catch:{ all -> 0x008b }
                goto L_0x0018
            L_0x0074:
                ke.y r1 = ke.y.this     // Catch:{ all -> 0x008b }
                ke.n r1 = r1.f20873d     // Catch:{ all -> 0x008b }
                r1.getClass()     // Catch:{ all -> 0x008b }
                ke.e r1 = r5.f20878b     // Catch:{ all -> 0x008b }
                ke.y r2 = ke.y.this     // Catch:{ all -> 0x008b }
                lf.t$a r1 = (lf.t.a) r1     // Catch:{ all -> 0x008b }
                r1.a(r2, r0)     // Catch:{ all -> 0x008b }
                goto L_0x0018
            L_0x0085:
                ke.l r0 = r0.f20818a
                r0.a(r5)
                return
            L_0x008b:
                r0 = move-exception
                ke.y r1 = ke.y.this
                ke.w r1 = r1.f20870a
                ke.l r1 = r1.f20818a
                r1.a(r5)
                goto L_0x0097
            L_0x0096:
                throw r0
            L_0x0097:
                goto L_0x0096
            */
            throw new UnsupportedOperationException("Method not decompiled: ke.y.b.a():void");
        }
    }

    public y(w wVar, z zVar, boolean z10) {
        this.f20870a = wVar;
        this.f20874e = zVar;
        this.f20875f = z10;
        this.f20871b = new i(wVar, z10);
        a aVar = new a();
        this.f20872c = aVar;
        aVar.g((long) wVar.E, TimeUnit.MILLISECONDS);
    }

    public d0 a() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20870a.f20822e);
        arrayList.add(this.f20871b);
        arrayList.add(new oe.a(this.f20870a.f20826i));
        arrayList.add(new me.b(this.f20870a.f20827r));
        arrayList.add(new ne.a(this.f20870a));
        if (!this.f20875f) {
            arrayList.addAll(this.f20870a.f20823f);
        }
        arrayList.add(new oe.b(this.f20875f));
        z zVar = this.f20874e;
        n nVar = this.f20873d;
        w wVar = this.f20870a;
        d0 a10 = new f(arrayList, (ne.f) null, (oe.c) null, (ne.c) null, 0, zVar, this, nVar, wVar.F, wVar.G, wVar.H).a(zVar);
        if (!this.f20871b.f23717d) {
            return a10;
        }
        le.c.e(a10);
        throw new IOException("Canceled");
    }

    public String b() {
        s.a l10 = this.f20874e.f20880a.l("/...");
        l10.getClass();
        l10.f20792b = s.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        l10.f20793c = s.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return l10.a().f20790i;
    }

    @Nullable
    public IOException c(@Nullable IOException iOException) {
        if (!this.f20872c.k()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void cancel() {
        oe.c cVar;
        ne.c cVar2;
        i iVar = this.f20871b;
        iVar.f23717d = true;
        ne.f fVar = iVar.f23715b;
        if (fVar != null) {
            synchronized (fVar.f22522d) {
                fVar.f22531m = true;
                cVar = fVar.f22532n;
                cVar2 = fVar.f22528j;
            }
            if (cVar != null) {
                cVar.cancel();
            } else if (cVar2 != null) {
                le.c.f(cVar2.f22496d);
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        w wVar = this.f20870a;
        y yVar = new y(wVar, this.f20874e, this.f20875f);
        yVar.f20873d = ((o) wVar.f20824g).f20769a;
        return yVar;
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20871b.f23717d ? "canceled " : "");
        sb2.append(this.f20875f ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(b());
        return sb2.toString();
    }
}
