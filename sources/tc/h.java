package tc;

import android.util.SparseIntArray;
import com.startapp.startappsdk.R;

/* compiled from: ActivityWebBindingImpl */
public class h extends g {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f25902z;

    /* renamed from: y  reason: collision with root package name */
    public long f25903y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25902z = sparseIntArray;
        sparseIntArray.put(R.id.web, 1);
        sparseIntArray.put(R.id.lyt_control, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(androidx.databinding.c r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = f25902z
            r1 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.j(r9, r10, r1, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r5 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.f25903y = r1
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 0
            r9.setTag(r0)
            r9 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            r10.setTag(r9, r8)
            monitor-enter(r8)
            r9 = 1
            r8.f25903y = r9     // Catch:{ all -> 0x0037 }
            monitor-exit(r8)     // Catch:{ all -> 0x0037 }
            r8.l()
            return
        L_0x0037:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0037 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.h.<init>(androidx.databinding.c, android.view.View):void");
    }

    public void e() {
        synchronized (this) {
            this.f25903y = 0;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (this.f25903y != 0) {
                return true;
            }
            return false;
        }
    }
}
