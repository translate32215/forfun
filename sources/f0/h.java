package f0;

import android.util.Log;
import f0.g;
import x4.c;
import z4.d;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18054a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18055b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18056c;

    public /* synthetic */ h(g.f fVar, int i10) {
        this.f18055b = fVar;
        this.f18056c = i10;
    }

    public /* synthetic */ h(c.a aVar, int i10) {
        this.f18055b = aVar;
        this.f18056c = i10;
    }

    public final void run() {
        switch (this.f18054a) {
            case 0:
                ((g.f) this.f18055b).d(this.f18056c);
                return;
            default:
                int i10 = this.f18056c;
                c cVar = c.this;
                cVar.getClass();
                boolean z10 = true;
                if (i10 == -3 || i10 == -2) {
                    if (i10 != -2) {
                        d dVar = cVar.f27454d;
                        if (dVar == null || dVar.f28338a != 1) {
                            z10 = false;
                        }
                        if (!z10) {
                            cVar.d(3);
                            return;
                        }
                    }
                    cVar.b(0);
                    cVar.d(2);
                    return;
                } else if (i10 == -1) {
                    cVar.b(-1);
                    cVar.a();
                    return;
                } else if (i10 != 1) {
                    Log.w("AudioFocusManager", "Unknown focus change type: " + i10);
                    return;
                } else {
                    cVar.d(1);
                    cVar.b(1);
                    return;
                }
        }
    }
}
