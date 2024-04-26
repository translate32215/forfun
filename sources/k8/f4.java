package k8;

import android.content.Context;
import androidx.leanback.widget.s;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class f4 extends v4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f20204a;

    /* renamed from: b  reason: collision with root package name */
    public final b5<z4<n4>> f20205b;

    public f4(Context context, @Nullable b5<z4<n4>> b5Var) {
        this.f20204a = context;
        this.f20205b = b5Var;
    }

    public final Context a() {
        return this.f20204a;
    }

    @Nullable
    public final b5<z4<n4>> b() {
        return this.f20205b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f20205b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof k8.v4
            r2 = 0
            if (r1 == 0) goto L_0x002e
            k8.v4 r5 = (k8.v4) r5
            android.content.Context r1 = r4.f20204a
            android.content.Context r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            k8.b5<k8.z4<k8.n4>> r1 = r4.f20205b
            if (r1 != 0) goto L_0x0022
            k8.b5 r5 = r5.b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            k8.b5 r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.f4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f20204a.hashCode() ^ 1000003) * 1000003;
        b5<z4<n4>> b5Var = this.f20205b;
        if (b5Var == null) {
            i10 = 0;
        } else {
            i10 = b5Var.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20204a);
        String valueOf2 = String.valueOf(this.f20205b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        s.a(sb2, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
