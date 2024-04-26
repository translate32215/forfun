package k8;

import androidx.fragment.app.a;
import java.io.IOException;
import java.util.logging.Logger;
import k8.f5;
import k8.g5;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class g5<MessageType extends g5<MessageType, BuilderType>, BuilderType extends f5<MessageType, BuilderType>> implements m7 {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void g(java.lang.Iterable<T> r6, java.util.List<? super T> r7) {
        /*
            java.nio.charset.Charset r0 = k8.r6.f20450a
            r6.getClass()
            boolean r0 = r6 instanceof k8.x6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0065
            k8.x6 r6 = (k8.x6) r6
            java.util.List r6 = r6.a()
            r0 = r7
            k8.x6 r0 = (k8.x6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0055
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L_0x0047:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004f
            r0.remove(r1)
            goto L_0x0047
        L_0x004f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0055:
            boolean r5 = r4 instanceof k8.p5
            if (r5 == 0) goto L_0x005f
            k8.p5 r4 = (k8.p5) r4
            r0.v(r4)
            goto L_0x0020
        L_0x005f:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0065:
            boolean r0 = r6 instanceof k8.t7
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0080
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x0080:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0088:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00bd
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        L_0x00af:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b7
            r7.remove(r1)
            goto L_0x00af
        L_0x00b7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00bd:
            r7.add(r4)
            goto L_0x0088
        L_0x00c1:
            return
        L_0x00c2:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.g5.g(java.lang.Iterable, java.util.List):void");
    }

    public final p5 b() {
        try {
            k6 k6Var = (k6) this;
            int c10 = k6Var.c();
            p5 p5Var = p5.f20407b;
            byte[] bArr = new byte[c10];
            Logger logger = t5.f20473b;
            r5 r5Var = new r5(bArr, 0, c10);
            k6Var.m(r5Var);
            if (r5Var.B() == 0) {
                return new o5(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(a.a(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public int f() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        throw null;
    }

    public final byte[] i() {
        try {
            k6 k6Var = (k6) this;
            int c10 = k6Var.c();
            byte[] bArr = new byte[c10];
            Logger logger = t5.f20473b;
            r5 r5Var = new r5(bArr, 0, c10);
            k6Var.m(r5Var);
            if (r5Var.B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(a.a(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
