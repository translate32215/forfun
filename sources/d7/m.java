package d7;

import android.content.Context;
import ff.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Calendar;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;
import we.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public Object f13210a;

    /* renamed from: b  reason: collision with root package name */
    public String f13211b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f13212c;

    /* renamed from: d  reason: collision with root package name */
    public String f13213d;

    /* renamed from: e  reason: collision with root package name */
    public Object f13214e;

    public m(Context context, String str) {
        this.f13210a = context.getApplicationContext();
        this.f13211b = str;
        this.f13212c = new TreeMap();
    }

    public long[] a() {
        String str;
        long[] jArr = {0, 0, 0};
        if (!j()) {
            return jArr;
        }
        c e10 = e("Content-Range");
        String str2 = "";
        if (e10 == null) {
            str = str2;
        } else {
            str = e10.f27213b;
        }
        if (str.length() <= 0) {
            c e11 = e("Range");
            if (e11 != null) {
                str2 = e11.f27213b;
            }
            str = str2;
        }
        if (str.length() <= 0) {
            return jArr;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " =");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        stringTokenizer.nextToken(" ");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[0] = Long.parseLong(stringTokenizer.nextToken(" -"));
        } catch (NumberFormatException unused) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[1] = Long.parseLong(stringTokenizer.nextToken("-/"));
        } catch (NumberFormatException unused2) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[2] = Long.parseLong(stringTokenizer.nextToken("/"));
        } catch (NumberFormatException unused3) {
        }
        return jArr;
    }

    public String b() {
        String str;
        String lowerCase;
        int indexOf;
        c e10 = e("Content-Type");
        String str2 = "";
        if (e10 == null) {
            str = str2;
        } else {
            str = e10.f27213b;
        }
        if (str != null && (indexOf = lowerCase.indexOf("charset")) >= 0) {
            int i10 = indexOf + 7 + 1;
            String str3 = new String((lowerCase = str.toLowerCase()).getBytes(), i10, lowerCase.length() - i10);
            if (str3.length() >= 0) {
                if (str3.charAt(0) == '\"') {
                    str3 = str3.substring(1, str3.length() - 1);
                }
                if (str3.length() >= 0) {
                    str2 = str3.charAt(str3.length() - 1) == '\"' ? str3.substring(0, str3.length() - 1) : str3;
                }
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return new String((byte[]) this.f13214e);
        }
        try {
            return new String((byte[]) this.f13214e, str2);
        } catch (Exception e11) {
            a.b(e11);
            return new String((byte[]) this.f13214e);
        }
    }

    public String c(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(this.f13213d, " ");
        String str = "";
        for (int i11 = 0; i11 <= i10; i11++) {
            if (!stringTokenizer.hasMoreTokens()) {
                return "";
            }
            str = stringTokenizer.nextToken();
        }
        return str;
    }

    public c d(int i10) {
        return (c) ((Vector) this.f13210a).get(i10);
    }

    public c e(String str) {
        int h10 = h();
        for (int i10 = 0; i10 < h10; i10++) {
            c d10 = d(i10);
            if (d10.f27212a.equalsIgnoreCase(str)) {
                return d10;
            }
        }
        return null;
    }

    public String f() {
        StringBuffer stringBuffer = new StringBuffer();
        int h10 = h();
        for (int i10 = 0; i10 < h10; i10++) {
            c d10 = d(i10);
            stringBuffer.append(String.valueOf(d10.f27212a) + ": " + d10.f27213b + "\r\n");
        }
        return stringBuffer.toString();
    }

    public long g(String str) {
        c e10 = e(str);
        if (e10 == null) {
            return 0;
        }
        try {
            return Long.parseLong(e10.f27213b);
        } catch (Exception e11) {
            a.b(e11);
            return 0;
        }
    }

    public int h() {
        return ((Vector) this.f13210a).size();
    }

    public String i(String str, String str2, String str3) {
        String str4;
        c e10 = e(str);
        if (e10 == null) {
            str4 = "";
        } else {
            str4 = e10.f27213b;
        }
        if (str4.startsWith(str2)) {
            str4 = str4.substring(1, str4.length());
        }
        return str4.endsWith(str3) ? str4.substring(0, str4.length() - 1) : str4;
    }

    public boolean j() {
        if (!(e("Content-Range") != null)) {
            if (!(e("Range") != null)) {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        String str;
        if (!(e("Transfer-Encoding") != null)) {
            return false;
        }
        c e10 = e("Transfer-Encoding");
        if (e10 == null) {
            str = "";
        } else {
            str = e10.f27213b;
        }
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("Chunked");
    }

    public String l(BufferedInputStream bufferedInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1];
        try {
            int read = bufferedInputStream.read(bArr);
            while (true) {
                if (read <= 0) {
                    break;
                } else if (bArr[0] == 10) {
                    break;
                } else {
                    if (bArr[0] != 13) {
                        byteArrayOutputStream.write(bArr[0]);
                    }
                    read = bufferedInputStream.read(bArr);
                }
            }
        } catch (InterruptedIOException unused) {
        } catch (IOException e10) {
            a.b(e10);
        }
        return byteArrayOutputStream.toString();
    }

    public void m(m mVar) {
        this.f13213d = mVar.f13213d;
        ((Vector) this.f13210a).clear();
        this.f13210a = new Vector();
        int h10 = mVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((Vector) this.f13210a).add(mVar.d(i10));
        }
        byte[] bArr = (byte[]) mVar.f13214e;
        this.f13214e = bArr;
        q((long) bArr.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0 A[Catch:{ Exception -> 0x017d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(java.io.InputStream r20, boolean r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x017d }
            r0 = r20
            r3.<init>(r0)     // Catch:{ Exception -> 0x017d }
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
            if (r0 == 0) goto L_0x017c
            int r4 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r4 > 0) goto L_0x0018
            goto L_0x017c
        L_0x0018:
            r1.f13213d = r0     // Catch:{ Exception -> 0x017d }
            a6.b r4 = new a6.b     // Catch:{ Exception -> 0x017d }
            r4.<init>(r0)     // Catch:{ Exception -> 0x017d }
            int r0 = r4.f124b     // Catch:{ Exception -> 0x017d }
            r4 = 100
            r5 = 58
            java.lang.String r6 = ""
            r7 = 1
            if (r0 != r4) goto L_0x0089
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
        L_0x002e:
            if (r0 == 0) goto L_0x0079
            int r4 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r4 > 0) goto L_0x0037
            goto L_0x0079
        L_0x0037:
            int r4 = r0.indexOf(r5)     // Catch:{ Exception -> 0x017d }
            if (r4 >= 0) goto L_0x0040
            r0 = r6
            r4 = r0
            goto L_0x0063
        L_0x0040:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x017d }
            byte[] r9 = r0.getBytes()     // Catch:{ Exception -> 0x017d }
            r8.<init>(r9, r2, r4)     // Catch:{ Exception -> 0x017d }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x017d }
            byte[] r10 = r0.getBytes()     // Catch:{ Exception -> 0x017d }
            int r11 = r4 + 1
            int r0 = r0.length()     // Catch:{ Exception -> 0x017d }
            int r0 = r0 - r4
            int r0 = r0 + -1
            r9.<init>(r10, r11, r0)     // Catch:{ Exception -> 0x017d }
            java.lang.String r0 = r8.trim()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r9.trim()     // Catch:{ Exception -> 0x017d }
        L_0x0063:
            if (r0 == 0) goto L_0x006e
            int r8 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r8 > 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            if (r8 == 0) goto L_0x0074
            r1.s(r0, r4)     // Catch:{ Exception -> 0x017d }
        L_0x0074:
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
            goto L_0x002e
        L_0x0079:
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
            if (r0 == 0) goto L_0x0088
            int r4 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r4 <= 0) goto L_0x0088
            r1.f13213d = r0     // Catch:{ Exception -> 0x017d }
            goto L_0x0089
        L_0x0088:
            return r7
        L_0x0089:
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
        L_0x008d:
            if (r0 == 0) goto L_0x00d8
            int r4 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r4 > 0) goto L_0x0096
            goto L_0x00d8
        L_0x0096:
            int r4 = r0.indexOf(r5)     // Catch:{ Exception -> 0x017d }
            if (r4 >= 0) goto L_0x009f
            r0 = r6
            r4 = r0
            goto L_0x00c2
        L_0x009f:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x017d }
            byte[] r9 = r0.getBytes()     // Catch:{ Exception -> 0x017d }
            r8.<init>(r9, r2, r4)     // Catch:{ Exception -> 0x017d }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x017d }
            byte[] r10 = r0.getBytes()     // Catch:{ Exception -> 0x017d }
            int r11 = r4 + 1
            int r0 = r0.length()     // Catch:{ Exception -> 0x017d }
            int r0 = r0 - r4
            int r0 = r0 + -1
            r9.<init>(r10, r11, r0)     // Catch:{ Exception -> 0x017d }
            java.lang.String r0 = r8.trim()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r9.trim()     // Catch:{ Exception -> 0x017d }
        L_0x00c2:
            if (r0 == 0) goto L_0x00cd
            int r8 = r0.length()     // Catch:{ Exception -> 0x017d }
            if (r8 > 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8 = 1
            goto L_0x00ce
        L_0x00cd:
            r8 = 0
        L_0x00ce:
            if (r8 == 0) goto L_0x00d3
            r1.s(r0, r4)     // Catch:{ Exception -> 0x017d }
        L_0x00d3:
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x017d }
            goto L_0x008d
        L_0x00d8:
            if (r21 == 0) goto L_0x00e2
            byte[] r0 = r6.getBytes()     // Catch:{ Exception -> 0x017d }
            r1.p(r0, r2)     // Catch:{ Exception -> 0x017d }
            return r7
        L_0x00e2:
            boolean r4 = r19.k()     // Catch:{ Exception -> 0x017d }
            r5 = 16
            r8 = 0
            if (r4 == 0) goto L_0x00fd
            java.lang.String r0 = r1.l(r3)     // Catch:{ Exception -> 0x00fb }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x00fb }
            long r10 = java.lang.Long.parseLong(r0, r5)     // Catch:{ Exception -> 0x00fb }
            goto L_0x0103
        L_0x00fb:
            r10 = r8
            goto L_0x0103
        L_0x00fd:
            java.lang.String r0 = "Content-Length"
            long r10 = r1.g(r0)     // Catch:{ Exception -> 0x017d }
        L_0x0103:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x017d }
            r6.<init>()     // Catch:{ Exception -> 0x017d }
        L_0x0108:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0114
            byte[] r0 = r6.toByteArray()     // Catch:{ Exception -> 0x017d }
            r1.p(r0, r2)     // Catch:{ Exception -> 0x017d }
            return r7
        L_0x0114:
            r0 = 524288(0x80000, float:7.34684E-40)
            long r12 = (long) r0     // Catch:{ Exception -> 0x017d }
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            r14 = r12
            goto L_0x011e
        L_0x011d:
            r14 = r10
        L_0x011e:
            int r0 = (int) r14     // Catch:{ Exception -> 0x017d }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x017d }
            r14 = r8
        L_0x0122:
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 < 0) goto L_0x0127
            goto L_0x0146
        L_0x0127:
            long r16 = r10 - r14
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x012f
            r7 = r12
            goto L_0x0131
        L_0x012f:
            r7 = r16
        L_0x0131:
            int r8 = (int) r7
            int r7 = r3.read(r0, r2, r8)     // Catch:{ Exception -> 0x0142 }
            if (r7 >= 0) goto L_0x0139
            goto L_0x0146
        L_0x0139:
            r6.write(r0, r2, r7)     // Catch:{ Exception -> 0x0142 }
            long r7 = (long) r7
            long r14 = r14 + r7
            r7 = 1
            r8 = 0
            goto L_0x0122
        L_0x0142:
            r0 = move-exception
            ff.a.b(r0)     // Catch:{ Exception -> 0x017d }
        L_0x0146:
            if (r4 == 0) goto L_0x0176
            r7 = 0
        L_0x014a:
            r0 = 2
            long r9 = (long) r0     // Catch:{ Exception -> 0x017d }
            long r11 = r9 - r7
            long r11 = r3.skip(r11)     // Catch:{ Exception -> 0x017d }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            long r7 = r7 + r11
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x014a
        L_0x015e:
            java.lang.String r7 = r1.l(r3)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x0178 }
            byte[] r9 = r7.getBytes()     // Catch:{ Exception -> 0x0178 }
            int r7 = r7.length()     // Catch:{ Exception -> 0x0178 }
            int r7 = r7 - r0
            r8.<init>(r9, r2, r7)     // Catch:{ Exception -> 0x0178 }
            long r7 = java.lang.Long.parseLong(r8, r5)     // Catch:{ Exception -> 0x0178 }
            r10 = r7
            goto L_0x0179
        L_0x0176:
            r13 = 0
        L_0x0178:
            r10 = r13
        L_0x0179:
            r8 = r13
            r7 = 1
            goto L_0x0108
        L_0x017c:
            return r2
        L_0x017d:
            r0 = move-exception
            ff.a.b(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.m.n(java.io.InputStream, boolean):boolean");
    }

    public void o(String str) {
        p(str.getBytes(), true);
    }

    public void p(byte[] bArr, boolean z10) {
        this.f13214e = bArr;
        if (z10) {
            q((long) bArr.length);
        }
    }

    public void q(long j10) {
        s("Content-Length", Long.toString(j10));
    }

    public void r(Calendar calendar) {
        int i10 = calendar.get(7) - 1;
        String str = "";
        StringBuilder sb2 = new StringBuilder(String.valueOf((i10 < 0 || i10 >= 7) ? str : we.a.f27211b[i10]));
        sb2.append(", ");
        sb2.append(we.a.a(calendar.get(5)));
        sb2.append(" ");
        int i11 = calendar.get(2) + 0;
        if (i11 >= 0 && i11 < 12) {
            str = we.a.f27210a[i11];
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(Integer.toString(calendar.get(1)));
        sb2.append(" ");
        sb2.append(we.a.a(calendar.get(11)));
        sb2.append(":");
        sb2.append(we.a.a(calendar.get(12)));
        sb2.append(":");
        sb2.append(we.a.a(calendar.get(13)));
        sb2.append(" GMT");
        s("Date", sb2.toString());
    }

    public void s(String str, String str2) {
        c e10 = e(str);
        if (e10 != null) {
            e10.f27213b = str2;
            return;
        }
        ((Vector) this.f13210a).add(new c(str, str2));
    }

    public void t(String str, int i10) {
        if (xe.a.d(str)) {
            str = "[" + str + "]";
        }
        s("HOST", String.valueOf(str) + ":" + Integer.toString(i10));
    }

    public void u(String str, String str2, String str3, String str4) {
        if (!str2.startsWith(str3)) {
            str2 = str3 + str2;
        }
        if (!str2.endsWith(str4)) {
            str2 = str2 + str4;
        }
        s(str, str2);
    }

    public m() {
        this.f13213d = "";
        this.f13210a = new Vector();
        this.f13214e = new byte[0];
        this.f13212c = null;
        this.f13211b = "1.1";
        this.f13212c = null;
    }
}
