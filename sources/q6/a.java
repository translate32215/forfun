package q6;

import java.util.regex.Pattern;
import v6.v;

/* compiled from: CssParser */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f24160c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a  reason: collision with root package name */
    public final v f24161a = new v();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f24162b = new StringBuilder();

    public static String a(v vVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = vVar.f26519b;
        int i11 = vVar.f26520c;
        while (i10 < i11 && !z10) {
            char c10 = (char) vVar.f26518a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        vVar.E(i10 - vVar.f26519b);
        return sb2.toString();
    }

    public static String b(v vVar, StringBuilder sb2) {
        c(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String a10 = a(vVar, sb2);
        if (!"".equals(a10)) {
            return a10;
        }
        StringBuilder a11 = android.support.v4.media.a.a("");
        a11.append((char) vVar.s());
        return a11.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[LOOP:1: B:2:0x0002->B:35:0x0068, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0001 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(v6.v r8) {
        /*
            r0 = 1
        L_0x0001:
            r1 = 1
        L_0x0002:
            int r2 = r8.a()
            if (r2 <= 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            int r1 = r8.f26519b
            byte[] r2 = r8.f26518a
            byte r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L_0x0028
            r2 = 10
            if (r1 == r2) goto L_0x0028
            r2 = 12
            if (r1 == r2) goto L_0x0028
            r2 = 13
            if (r1 == r2) goto L_0x0028
            r2 = 32
            if (r1 == r2) goto L_0x0028
            r1 = 0
            goto L_0x002c
        L_0x0028:
            r8.E(r0)
            r1 = 1
        L_0x002c:
            if (r1 != 0) goto L_0x0001
            int r1 = r8.f26519b
            int r2 = r8.f26520c
            byte[] r4 = r8.f26518a
            int r5 = r1 + 2
            if (r5 > r2) goto L_0x0064
            int r5 = r1 + 1
            byte r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L_0x0064
            int r1 = r5 + 1
            byte r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L_0x0064
        L_0x0048:
            int r5 = r1 + 1
            if (r5 >= r2) goto L_0x005c
            byte r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L_0x005a
            byte r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L_0x005a
            int r2 = r5 + 1
            r1 = r2
            goto L_0x0048
        L_0x005a:
            r1 = r5
            goto L_0x0048
        L_0x005c:
            int r1 = r8.f26519b
            int r2 = r2 - r1
            r8.E(r2)
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r1 == 0) goto L_0x0068
            goto L_0x0001
        L_0x0068:
            r1 = 0
            goto L_0x0002
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.a.c(v6.v):void");
    }
}
