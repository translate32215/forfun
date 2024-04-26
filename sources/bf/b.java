package bf;

import androidx.leanback.widget.t;
import e8.s30;
import ff.a;
import we.c;
import ze.e;
import ze.f;
import ze.g;

/* compiled from: Disposer */
public class b extends s30 {

    /* renamed from: c  reason: collision with root package name */
    public e f3927c;

    public b(e eVar) {
        this.f3927c = eVar;
    }

    public void run() {
        int i10;
        e eVar = this.f3927c;
        long j10 = 1000;
        long j11 = eVar.f28859h * 1000;
        while (true) {
            if (Thread.currentThread() == ((Thread) this.f16370b)) {
                try {
                    Thread.sleep(j11);
                } catch (InterruptedException unused) {
                }
                g e10 = eVar.e();
                int size = e10.size();
                f[] fVarArr = new f[size];
                int i11 = 0;
                while (i11 < size) {
                    fVarArr[i11] = e10.c(i11);
                    i11++;
                    j10 = 1000;
                }
                int i12 = 0;
                while (i12 < size) {
                    f fVar = fVarArr[i12];
                    fVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    t m10 = fVar.m();
                    long j12 = (currentTimeMillis - (m10 != null ? m10.f2525b : 0)) / j10;
                    t m11 = fVar.m();
                    if (m11 != null) {
                        String a10 = c.a(m11.a(), "Cache-Control");
                        int indexOf = a10.indexOf("max-age");
                        if (indexOf >= 0) {
                            int indexOf2 = a10.indexOf(44, indexOf);
                            if (indexOf2 < 0) {
                                indexOf2 = a10.length();
                            }
                            try {
                                i10 = Integer.parseInt(a10.substring(a10.indexOf("=", indexOf) + 1, indexOf2).trim());
                            } catch (Exception e11) {
                                a.b(e11);
                            }
                        }
                        i10 = 0;
                    } else {
                        i10 = fVar.f().f17850e;
                    }
                    if (((long) (i10 + 60)) < j12) {
                        fVarArr[i12].i();
                        a aVar = a.f18351b;
                        eVar.g(fVarArr[i12]);
                    }
                    i12++;
                    j10 = 1000;
                }
            } else {
                return;
            }
        }
    }
}
