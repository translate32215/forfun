package e8;

import d7.l;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j10 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<s10<?>> f15085a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final int f15086b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15087c;

    /* renamed from: d  reason: collision with root package name */
    public final b20 f15088d;

    public j10(int i10, int i11) {
        this.f15086b = i10;
        this.f15087c = i11;
        this.f15088d = new b20();
    }

    public final int a() {
        c();
        return this.f15085a.size();
    }

    public final s10<?> b() {
        b20 b20 = this.f15088d;
        b20.getClass();
        b20.f13871c = l.B.f13193j.b();
        b20.f13872d++;
        c();
        if (this.f15085a.isEmpty()) {
            return null;
        }
        s10<?> remove = this.f15085a.remove();
        if (remove != null) {
            b20 b202 = this.f15088d;
            b202.f13873e++;
            b202.f13870b.f6281a = true;
        }
        return remove;
    }

    public final void c() {
        while (!this.f15085a.isEmpty()) {
            if (l.B.f13193j.b() - this.f15085a.getFirst().f16367d >= ((long) this.f15087c)) {
                b20 b20 = this.f15088d;
                b20.f13874f++;
                b20.f13870b.f6282b++;
                this.f15085a.remove();
            } else {
                return;
            }
        }
    }
}
