package e8;

import androidx.appcompat.widget.o;
import j4.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class od0 extends pd0 {
    public final long P0;
    public final List<qd0> Q0 = new ArrayList();
    public final List<od0> R0 = new ArrayList();

    public od0(int i10, long j10) {
        super(i10);
        this.P0 = j10;
    }

    public final qd0 b(int i10) {
        int size = this.Q0.size();
        for (int i11 = 0; i11 < size; i11++) {
            qd0 qd0 = this.Q0.get(i11);
            if (qd0.f15996a == i10) {
                return qd0;
            }
        }
        return null;
    }

    public final od0 c(int i10) {
        int size = this.R0.size();
        for (int i11 = 0; i11 < size; i11++) {
            od0 od0 = this.R0.get(i11);
            if (od0.f15996a == i10) {
                return od0;
            }
        }
        return null;
    }

    public final String toString() {
        String a10 = pd0.a(this.f15996a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        StringBuilder a11 = e.a(o.a(arrays2, o.a(arrays, o.a(a10, 22))), a10, " leaves: ", arrays, " containers: ");
        a11.append(arrays2);
        return a11.toString();
    }
}
