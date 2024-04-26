package v6;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tc.a;
import ud.k;
import v6.o;
import wc.i;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26474a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26475b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f26476c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f26477d;

    public /* synthetic */ n(ControlActivity controlActivity, String str, int i10) {
        this.f26475b = controlActivity;
        this.f26477d = str;
        this.f26476c = i10;
    }

    public /* synthetic */ n(CopyOnWriteArraySet copyOnWriteArraySet, int i10, o.a aVar) {
        this.f26475b = copyOnWriteArraySet;
        this.f26476c = i10;
        this.f26477d = aVar;
    }

    public final void run() {
        switch (this.f26474a) {
            case 0:
                int i10 = this.f26476c;
                o.a aVar = (o.a) this.f26477d;
                Iterator it = ((CopyOnWriteArraySet) this.f26475b).iterator();
                while (it.hasNext()) {
                    o.c cVar = (o.c) it.next();
                    if (!cVar.f26489d) {
                        if (i10 != -1) {
                            cVar.f26487b.f26497a.append(i10, true);
                        }
                        cVar.f26488c = true;
                        aVar.c(cVar.f26486a);
                    }
                }
                return;
            default:
                ControlActivity controlActivity = (ControlActivity) this.f26475b;
                int i11 = this.f26476c;
                int i12 = i.f27198b;
                k.f(controlActivity, "this$0");
                int i13 = ControlActivity.R;
                ((a) controlActivity.L()).A.setText((String) this.f26477d);
                ((a) controlActivity.L()).B.setProgress(i11);
                return;
        }
    }
}
