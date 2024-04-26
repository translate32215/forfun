package tc;

import android.util.SparseIntArray;
import com.startapp.startappsdk.R;

/* compiled from: ActivityControlBindingImpl */
public class b extends a {
    public static final SparseIntArray E;
    public long D = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.top, 2);
        sparseIntArray.put(R.id.position, 3);
        sparseIntArray.put(R.id.progress, 4);
        sparseIntArray.put(R.id.duration, 5);
        sparseIntArray.put(R.id.rew, 6);
        sparseIntArray.put(R.id.play, 7);
        sparseIntArray.put(R.id.pause, 8);
        sparseIntArray.put(R.id.ffwd, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.databinding.c r17, android.view.View r18) {
        /*
            r16 = this;
            r14 = r16
            r0 = r18
            android.util.SparseIntArray r1 = E
            r2 = 10
            r3 = r17
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.j(r3, r0, r2, r1)
            r1 = 5
            r1 = r15[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 9
            r1 = r15[r1]
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r1 = 8
            r1 = r15[r1]
            r7 = r1
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7
            r1 = 7
            r1 = r15[r1]
            r8 = r1
            android.widget.ImageButton r8 = (android.widget.ImageButton) r8
            r1 = 3
            r1 = r15[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 4
            r1 = r15[r1]
            r10 = r1
            android.widget.SeekBar r10 = (android.widget.SeekBar) r10
            r1 = 6
            r1 = r15[r1]
            r11 = r1
            android.widget.ImageButton r11 = (android.widget.ImageButton) r11
            r1 = 1
            r1 = r15[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 2
            r1 = r15[r1]
            r13 = r1
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r4 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.D = r1
            r1 = 0
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r1 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            r0.setTag(r1, r14)
            monitor-enter(r16)
            r0 = 1
            r14.D = r0     // Catch:{ all -> 0x006d }
            monitor-exit(r16)     // Catch:{ all -> 0x006d }
            r16.l()
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x006d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.b.<init>(androidx.databinding.c, android.view.View):void");
    }

    public void e() {
        synchronized (this) {
            this.D = 0;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }
}
