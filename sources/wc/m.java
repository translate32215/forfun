package wc;

import ce.i;
import java.util.List;
import ud.k;
import ze.e;
import ze.f;

/* compiled from: SearchThread.kt */
public final class m extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final e f27204a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27205b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27206c;

    /* renamed from: d  reason: collision with root package name */
    public int f27207d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f27208e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final bf.a f27209f;

    /* compiled from: SearchThread.kt */
    public static final class a implements bf.a {
        public void a(f fVar) {
            k.f(fVar, "dev");
            k.f("control point add a device..." + fVar.h() + fVar.i(), "msg");
            j jVar = j.f27200c;
            j jVar2 = j.f27201d;
            synchronized (jVar2) {
                k.f(fVar, "d");
                int i10 = 0;
                if (i.c("urn:schemas-upnp-org:device:MediaRenderer:1", fVar.h(), true)) {
                    List<f> list = jVar2.f27202a;
                    k.c(list);
                    int size = list.size();
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        if (!i.c(fVar.t(), jVar2.f27202a.get(i10).t(), true)) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                    jVar2.f27202a.add(fVar);
                    k.f(k.j("Devices add a device", fVar.h()), "msg");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(ze.f r9) {
            /*
                r8 = this;
                java.lang.String r0 = "dev"
                ud.k.f(r9, r0)
                java.lang.String r0 = "control point remove a device"
                java.lang.String r1 = "msg"
                ud.k.f(r0, r1)
                wc.j r0 = wc.j.f27200c
                wc.j r0 = wc.j.f27201d
                monitor-enter(r0)
                java.lang.String r1 = "d"
                ud.k.f(r9, r1)     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = r9.h()     // Catch:{ all -> 0x0076 }
                java.lang.String r2 = "urn:schemas-upnp-org:device:MediaRenderer:1"
                r3 = 1
                boolean r1 = ce.i.c(r2, r1, r3)     // Catch:{ all -> 0x0076 }
                if (r1 != 0) goto L_0x0025
                monitor-exit(r0)
                goto L_0x0075
            L_0x0025:
                java.util.List<ze.f> r1 = r0.f27202a     // Catch:{ all -> 0x0076 }
                ud.k.c(r1)     // Catch:{ all -> 0x0076 }
                int r1 = r1.size()     // Catch:{ all -> 0x0076 }
                r2 = 0
                r4 = 0
            L_0x0030:
                if (r4 >= r1) goto L_0x0074
                int r5 = r4 + 1
                java.util.List<ze.f> r6 = r0.f27202a     // Catch:{ all -> 0x0076 }
                java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0076 }
                ze.f r6 = (ze.f) r6     // Catch:{ all -> 0x0076 }
                java.lang.String r6 = r6.t()     // Catch:{ all -> 0x0076 }
                java.lang.String r7 = r9.t()     // Catch:{ all -> 0x0076 }
                boolean r6 = ce.i.c(r7, r6, r3)     // Catch:{ all -> 0x0076 }
                if (r6 == 0) goto L_0x0072
                java.util.List<ze.f> r9 = r0.f27202a     // Catch:{ all -> 0x0076 }
                java.lang.Object r9 = r9.remove(r4)     // Catch:{ all -> 0x0076 }
                ze.f r9 = (ze.f) r9     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = "Devices remove a device"
                java.lang.String r4 = "msg"
                ud.k.f(r1, r4)     // Catch:{ all -> 0x0076 }
                ze.f r1 = r0.f27203b     // Catch:{ all -> 0x0076 }
                if (r1 == 0) goto L_0x006c
                ud.k.c(r1)     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = r1.t()     // Catch:{ all -> 0x0076 }
                java.lang.String r9 = r9.t()     // Catch:{ all -> 0x0076 }
                boolean r2 = ce.i.c(r1, r9, r3)     // Catch:{ all -> 0x0076 }
            L_0x006c:
                if (r2 == 0) goto L_0x0074
                r9 = 0
                r0.f27203b = r9     // Catch:{ all -> 0x0076 }
                goto L_0x0074
            L_0x0072:
                r4 = r5
                goto L_0x0030
            L_0x0074:
                monitor-exit(r0)
            L_0x0075:
                return
            L_0x0076:
                r9 = move-exception
                monitor-exit(r0)
                goto L_0x007a
            L_0x0079:
                throw r9
            L_0x007a:
                goto L_0x0079
            */
            throw new UnsupportedOperationException("Method not decompiled: wc.m.a.b(ze.f):void");
        }
    }

    public m(e eVar) {
        this.f27204a = eVar;
        a aVar = new a();
        this.f27209f = aVar;
        k.c(eVar);
        eVar.f28862k.add(aVar);
    }

    public void run() {
        e eVar;
        while (this.f27205b && (eVar = this.f27204a) != null) {
            try {
                if (this.f27206c) {
                    k.c(eVar);
                    eVar.i("upnp:rootdevice", 3);
                    k.f("controlpoint search...", "msg");
                } else {
                    k.c(eVar);
                    eVar.k();
                    boolean j10 = this.f27204a.j();
                    k.f(k.j("controlpoint start:", Boolean.valueOf(j10)), "msg");
                    if (j10) {
                        this.f27206c = true;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            synchronized (this.f27208e) {
                try {
                    int i10 = this.f27207d + 1;
                    this.f27207d = i10;
                    if (i10 >= 5) {
                        this.f27208e.wait(3600000);
                    } else {
                        this.f27208e.wait(15000);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }
}
