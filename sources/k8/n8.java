package k8;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class n8 extends l8<m8, m8> {
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((m8) obj).a();
    }

    public final int b(Object obj) {
        m8 m8Var = (m8) obj;
        int i10 = m8Var.f20332d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < m8Var.f20329a; i12++) {
            int i13 = m8Var.f20330b[i12];
            int b10 = t5.b(8);
            int h10 = ((p5) m8Var.f20331c[i12]).h();
            i11 += t5.b(h10) + h10 + t5.b(24) + t5.b(i13 >>> 3) + t5.b(16) + b10 + b10;
        }
        m8Var.f20332d = i11;
        return i11;
    }

    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return ((k6) obj).zzc;
    }

    public final Object d(Object obj, Object obj2) {
        m8 m8Var = (m8) obj2;
        if (m8Var.equals(m8.f20328f)) {
            return obj;
        }
        m8 m8Var2 = (m8) obj;
        int i10 = m8Var2.f20329a + m8Var.f20329a;
        int[] copyOf = Arrays.copyOf(m8Var2.f20330b, i10);
        System.arraycopy(m8Var.f20330b, 0, copyOf, m8Var2.f20329a, m8Var.f20329a);
        Object[] copyOf2 = Arrays.copyOf(m8Var2.f20331c, i10);
        System.arraycopy(m8Var.f20331c, 0, copyOf2, m8Var2.f20329a, m8Var.f20329a);
        return new m8(i10, copyOf, copyOf2, true);
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return m8.b();
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((m8) obj).c(i10 << 3, Long.valueOf(j10));
    }

    public final void g(Object obj) {
        ((k6) obj).zzc.f20333e = false;
    }

    public final /* bridge */ /* synthetic */ void h(Object obj, Object obj2) {
        ((k6) obj).zzc = (m8) obj2;
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, u5 u5Var) throws IOException {
        ((m8) obj).d(u5Var);
    }
}
