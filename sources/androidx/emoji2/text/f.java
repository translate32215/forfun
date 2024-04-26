package androidx.emoji2.text;

import a5.g;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.emoji2.text.k;
import ba.o0;
import ba.s;
import c5.j;
import com.google.firebase.remoteconfig.internal.b;
import java.util.concurrent.ThreadPoolExecutor;
import v6.e0;
import w6.s;
import x4.b0;
import x4.i0;
import x4.r0;
import y4.v;
import z4.k;
import z5.n;
import z5.r;
import z5.v;
import z7.a;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1526a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1527b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1528c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1529d;

    public /* synthetic */ f(EmojiCompatInitializer.b bVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1527b = bVar;
        this.f1528c = hVar;
        this.f1529d = threadPoolExecutor;
    }

    public /* synthetic */ f(j.a aVar, j jVar, Exception exc) {
        this.f1527b = aVar;
        this.f1528c = jVar;
        this.f1529d = exc;
    }

    public /* synthetic */ f(s.a aVar, b0 b0Var, g gVar) {
        this.f1527b = aVar;
        this.f1528c = b0Var;
        this.f1529d = gVar;
    }

    public /* synthetic */ f(i0 i0Var, s.a aVar, r.a aVar2) {
        this.f1527b = i0Var;
        this.f1528c = aVar;
        this.f1529d = aVar2;
    }

    public /* synthetic */ f(k.a aVar, b0 b0Var, g gVar) {
        this.f1527b = aVar;
        this.f1528c = b0Var;
        this.f1529d = gVar;
    }

    public /* synthetic */ f(v.a aVar, v vVar, n nVar) {
        this.f1527b = aVar;
        this.f1528c = vVar;
        this.f1529d = nVar;
    }

    public /* synthetic */ f(a aVar, String str, b bVar) {
        this.f1527b = aVar;
        this.f1528c = str;
        this.f1529d = bVar;
    }

    public final void run() {
        switch (this.f1526a) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1527b;
                e.h hVar = (e.h) this.f1528c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1529d;
                bVar.getClass();
                try {
                    k a10 = c.a(bVar.f1502a);
                    if (a10 != null) {
                        k.b bVar2 = (k.b) a10.f1521a;
                        synchronized (bVar2.f1553d) {
                            bVar2.f1555f = threadPoolExecutor;
                        }
                        a10.f1521a.a(new g(bVar, hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                r.a aVar = (r.a) this.f1529d;
                y4.v vVar = ((i0) this.f1527b).f27615c;
                ba.s c10 = ((s.a) this.f1528c).c();
                v.a aVar2 = vVar.f28079d;
                r0 r0Var = vVar.f28082g;
                r0Var.getClass();
                aVar2.getClass();
                aVar2.f28085b = ba.s.z(c10);
                if (!c10.isEmpty()) {
                    aVar2.f28088e = (r.a) ((o0) c10).get(0);
                    aVar.getClass();
                    aVar2.f28089f = aVar;
                }
                if (aVar2.f28087d == null) {
                    aVar2.f28087d = v.a.b(r0Var, aVar2.f28085b, aVar2.f28088e, aVar2.f28084a);
                }
                aVar2.d(r0Var.z());
                return;
            case 2:
                z4.k kVar = ((k.a) this.f1527b).f28366b;
                int i10 = e0.f26436a;
                kVar.A((b0) this.f1528c, (g) this.f1529d);
                return;
            case 3:
                j.a aVar3 = (j.a) this.f1527b;
                ((j) this.f1528c).N(aVar3.f4330a, aVar3.f4331b, (Exception) this.f1529d);
                return;
            case 4:
                v.a aVar4 = (v.a) this.f1527b;
                ((z5.v) this.f1528c).O(aVar4.f28648a, aVar4.f28649b, (n) this.f1529d);
                return;
            case 5:
                w6.s sVar = ((s.a) this.f1527b).f27133b;
                int i11 = e0.f26436a;
                sVar.I((b0) this.f1528c, (g) this.f1529d);
                return;
            default:
                int i12 = eb.e.f17823e;
                ((a) this.f1527b).a((String) this.f1528c, (b) this.f1529d);
                return;
        }
    }
}
