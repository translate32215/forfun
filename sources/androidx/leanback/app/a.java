package androidx.leanback.app;

import android.app.Fragment;
import androidx.leanback.app.b;

/* compiled from: BackgroundFragment */
public final class a extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public b f1886a;

    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f1886a;
        if (bVar != null) {
            bVar.e();
            bVar.f1889c = null;
            bVar.f1894h = false;
            b.c cVar = bVar.f1890d;
            if (cVar != null) {
                int i10 = cVar.f1907b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    cVar.f1907b = i11;
                    if (i11 == 0) {
                        cVar.f1906a = null;
                    }
                    bVar.f1890d = null;
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("Can't unref, count ");
                a10.append(cVar.f1907b);
                throw new IllegalStateException(a10.toString());
            }
        }
    }

    public void onResume() {
        super.onResume();
        b bVar = this.f1886a;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void onStart() {
        super.onStart();
        b bVar = this.f1886a;
        if (bVar != null) {
            bVar.i();
        }
    }

    public void onStop() {
        b bVar = this.f1886a;
        if (bVar != null) {
            bVar.e();
        }
        super.onStop();
    }
}
