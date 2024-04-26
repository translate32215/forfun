package v6;

import e8.xd0;
import java.util.Arrays;

/* compiled from: TimedValueQueue */
public final class a0<V> {

    /* renamed from: a  reason: collision with root package name */
    public Object f26420a;

    /* renamed from: b  reason: collision with root package name */
    public V[] f26421b;

    /* renamed from: c  reason: collision with root package name */
    public int f26422c;

    /* renamed from: d  reason: collision with root package name */
    public int f26423d;

    /* JADX WARNING: type inference failed for: r4v0, types: [V[], java.io.InputStream] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(int r1, java.util.List r2, int r3, java.io.InputStream r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f26422c = r1
            r0.f26420a = r2
            r0.f26423d = r3
            r0.f26421b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.a0.<init>(int, java.util.List, int, java.io.InputStream):void");
    }

    public synchronized void a(long j10, V v10) {
        int i10 = this.f26423d;
        if (i10 > 0) {
            if (j10 <= ((long[]) this.f26420a)[((this.f26422c + i10) - 1) % ((Object[]) this.f26421b).length]) {
                b();
            }
        }
        c();
        int i11 = this.f26422c;
        int i12 = this.f26423d;
        V[] vArr = this.f26421b;
        int length = (i11 + i12) % ((Object[]) vArr).length;
        ((long[]) this.f26420a)[length] = j10;
        ((Object[]) vArr)[length] = v10;
        this.f26423d = i12 + 1;
    }

    public synchronized void b() {
        this.f26422c = 0;
        this.f26423d = 0;
        Arrays.fill((Object[]) this.f26421b, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f26421b).length;
        if (this.f26423d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            V[] vArr = new Object[i10];
            int i11 = this.f26422c;
            int i12 = length - i11;
            System.arraycopy((long[]) this.f26420a, i11, jArr, 0, i12);
            System.arraycopy((Object[]) this.f26421b, this.f26422c, vArr, 0, i12);
            int i13 = this.f26422c;
            if (i13 > 0) {
                System.arraycopy((long[]) this.f26420a, 0, jArr, i12, i13);
                System.arraycopy((Object[]) this.f26421b, 0, vArr, i12, this.f26422c);
            }
            this.f26420a = jArr;
            this.f26421b = vArr;
            this.f26422c = 0;
        }
    }

    public V d(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f26423d > 0) {
            long j12 = j10 - ((long[]) this.f26420a)[this.f26422c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = f();
            j11 = j12;
        }
        return v10;
    }

    public synchronized V e(long j10) {
        return d(j10, true);
    }

    public V f() {
        a.d(this.f26423d > 0);
        V[] vArr = this.f26421b;
        int i10 = this.f26422c;
        V v10 = ((Object[]) vArr)[i10];
        ((Object[]) vArr)[i10] = null;
        this.f26422c = (i10 + 1) % ((Object[]) vArr).length;
        this.f26423d--;
        return v10;
    }

    public a0() {
        this(10, 0);
    }

    public a0(int i10, int i11) {
        if (i11 != 2) {
            this.f26420a = new long[i10];
            this.f26421b = new Object[i10];
            return;
        }
        this.f26420a = new xd0[i10];
        this.f26423d = 0;
    }
}
