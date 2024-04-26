package a6;

import android.view.View;
import com.google.android.gms.internal.ads.q;
import e8.h1;
import e8.j1;

/* compiled from: AdsLoader */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f123a;

    /* renamed from: b  reason: collision with root package name */
    public int f124b;

    /* renamed from: c  reason: collision with root package name */
    public String f125c;

    public b(String str, Object obj, int i10) {
        this.f125c = str;
        this.f123a = obj;
        this.f124b = i10;
    }

    public static final String a(int i10) {
        return i10 != 100 ? i10 != 200 ? i10 != 206 ? i10 != 400 ? i10 != 404 ? i10 != 412 ? i10 != 416 ? i10 != 500 ? "" : "Internal Server Error" : "Invalid Range" : "Precondition Failed" : "Not Found" : "Bad Request" : "Partial Content" : "OK" : "Continue";
    }

    public static b c(String str, long j10) {
        return new b(str, (Object) Long.valueOf(j10), 2);
    }

    public static b d(String str, boolean z10) {
        return new b(str, (Object) Boolean.valueOf(z10), 1);
    }

    public static b e(String str, String str2) {
        return new b(str, (Object) str2, 4);
    }

    public T b() {
        h1 h1Var = j1.f15083a.get();
        if (h1Var != null) {
            int i10 = q.f7909a[this.f124b - 1];
            if (i10 == 1) {
                return h1Var.b(this.f125c, ((Boolean) this.f123a).booleanValue());
            }
            if (i10 == 2) {
                return h1Var.getLong(this.f125c, ((Long) this.f123a).longValue());
            }
            if (i10 == 3) {
                return h1Var.c(this.f125c, ((Double) this.f123a).doubleValue());
            }
            if (i10 == 4) {
                return h1Var.a(this.f125c, (String) this.f123a);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|13|14|(4:18|(2:20|25)(1:26)|21|15)|24|17|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[Catch:{ Exception -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = ""
            r4.f125c = r0
            r1 = 0
            r4.f124b = r1
            r4.f123a = r0
            java.lang.String r2 = " "
            if (r5 != 0) goto L_0x001f
            java.lang.String r5 = "1.1"
            r4.f125c = r5
            r5 = 500(0x1f4, float:7.0E-43)
            r4.f124b = r5
            java.lang.String r5 = a(r5)
            r4.f123a = r5
            goto L_0x007e
        L_0x001f:
            java.util.StringTokenizer r3 = new java.util.StringTokenizer     // Catch:{ Exception -> 0x007a }
            r3.<init>(r5, r2)     // Catch:{ Exception -> 0x007a }
            boolean r5 = r3.hasMoreTokens()     // Catch:{ Exception -> 0x007a }
            if (r5 != 0) goto L_0x002b
            goto L_0x007e
        L_0x002b:
            java.lang.String r5 = r3.nextToken()     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r5.trim()     // Catch:{ Exception -> 0x007a }
            r4.f125c = r5     // Catch:{ Exception -> 0x007a }
            boolean r5 = r3.hasMoreTokens()     // Catch:{ Exception -> 0x007a }
            if (r5 != 0) goto L_0x003c
            goto L_0x007e
        L_0x003c:
            java.lang.String r5 = r3.nextToken()     // Catch:{ Exception -> 0x007a }
            int r1 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r4.f124b = r1     // Catch:{ Exception -> 0x007a }
        L_0x0046:
            boolean r5 = r3.hasMoreTokens()     // Catch:{ Exception -> 0x007a }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = r0.trim()     // Catch:{ Exception -> 0x007a }
            r4.f123a = r5     // Catch:{ Exception -> 0x007a }
            goto L_0x007e
        L_0x0053:
            int r5 = r0.length()     // Catch:{ Exception -> 0x007a }
            if (r5 < 0) goto L_0x0065
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x007a }
            r5.append(r2)     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x007a }
        L_0x0065:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x007a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = r3.nextToken()     // Catch:{ Exception -> 0x007a }
            r5.append(r0)     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x007a }
            goto L_0x0046
        L_0x007a:
            r5 = move-exception
            ff.a.b(r5)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b.<init>(java.lang.String):void");
    }

    public b(View view, int i10, String str) {
        this.f123a = view;
        this.f124b = i10;
        this.f125c = str;
    }
}
