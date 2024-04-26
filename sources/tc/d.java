package tc;

import android.util.SparseIntArray;
import com.startapp.startappsdk.R;

/* compiled from: ActivityPkAdBindingImpl */
public class d extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final SparseIntArray f25894y;

    /* renamed from: x  reason: collision with root package name */
    public long f25895x = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25894y = sparseIntArray;
        sparseIntArray.put(R.id.wv, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(androidx.databinding.c r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f25894y
            r1 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.j(r6, r7, r1, r0)
            r1 = 1
            r1 = r0[r1]
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            r2 = 0
            r5.<init>(r6, r7, r2, r1)
            r3 = -1
            r5.f25895x = r3
            r6 = r0[r2]
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            r0 = 0
            r6.setTag(r0)
            r6 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            r7.setTag(r6, r5)
            monitor-enter(r5)
            r6 = 1
            r5.f25895x = r6     // Catch:{ all -> 0x002c }
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            r5.l()
            return
        L_0x002c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.d.<init>(androidx.databinding.c, android.view.View):void");
    }

    public void e() {
        synchronized (this) {
            this.f25895x = 0;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (this.f25895x != 0) {
                return true;
            }
            return false;
        }
    }
}
