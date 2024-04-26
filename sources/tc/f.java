package tc;

import android.util.SparseIntArray;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;

/* compiled from: ActivityPlayerBindingImpl */
public class f extends e {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f25897z;

    /* renamed from: x  reason: collision with root package name */
    public final FrameLayout f25898x;

    /* renamed from: y  reason: collision with root package name */
    public long f25899y = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25897z = sparseIntArray;
        sparseIntArray.put(R.id.playerView, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.databinding.c r6, android.view.View r7) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = f25897z
            r1 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.j(r6, r7, r1, r0)
            r1 = 1
            r1 = r0[r1]
            com.google.android.exoplayer2.ui.PlayerView r1 = (com.google.android.exoplayer2.ui.PlayerView) r1
            r2 = 0
            r5.<init>(r6, r7, r2, r1)
            r3 = -1
            r5.f25899y = r3
            r6 = r0[r2]
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f25898x = r6
            r0 = 0
            r6.setTag(r0)
            r6 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            r7.setTag(r6, r5)
            monitor-enter(r5)
            r6 = 1
            r5.f25899y = r6     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            r5.l()
            return
        L_0x002e:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.f.<init>(androidx.databinding.c, android.view.View):void");
    }

    public void e() {
        synchronized (this) {
            this.f25899y = 0;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (this.f25899y != 0) {
                return true;
            }
            return false;
        }
    }
}
