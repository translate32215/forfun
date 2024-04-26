package tc;

import android.util.SparseIntArray;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;

/* compiled from: ListStreamBindingImpl */
public class j extends i {
    public static final SparseIntArray A;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f25906y;

    /* renamed from: z  reason: collision with root package name */
    public long f25907z = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(androidx.databinding.c r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = A
            r1 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.j(r6, r7, r1, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r5.<init>(r6, r7, r2, r1)
            r3 = -1
            r5.f25907z = r3
            r6 = r0[r2]
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f25906y = r6
            r0 = 0
            r6.setTag(r0)
            r6 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            r7.setTag(r6, r5)
            monitor-enter(r5)
            r6 = 1
            r5.f25907z = r6     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            r5.l()
            return
        L_0x002e:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.j.<init>(androidx.databinding.c, android.view.View):void");
    }

    public void e() {
        synchronized (this) {
            this.f25907z = 0;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (this.f25907z != 0) {
                return true;
            }
            return false;
        }
    }
}
