package qe;

import java.io.IOException;
import le.c;
import ve.i;

/* compiled from: Http2 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f24316a = i.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f24317b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f24318c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f24319d = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f24319d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = c.m("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f24318c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f24318c;
            strArr3[i13 | 8] = androidx.activity.e.a(new StringBuilder(), strArr3[i13], "|PADDED");
        }
        String[] strArr4 = f24318c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f24318c;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i17]);
                sb2.append('|');
                strArr5[i18 | 8] = androidx.activity.e.a(sb2, strArr5[i15], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f24318c;
            if (i10 < strArr6.length) {
                if (strArr6[i10] == null) {
                    strArr6[i10] = f24319d[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z10, int i10, int i11, byte b10, byte b11) {
        String str;
        String[] strArr = f24317b;
        String m10 = b10 < strArr.length ? strArr[b10] : c.m("0x%02x", Byte.valueOf(b10));
        if (b11 == 0) {
            str = "";
        } else {
            if (!(b10 == 2 || b10 == 3)) {
                if (b10 == 4 || b10 == 6) {
                    str = b11 == 1 ? "ACK" : f24319d[b11];
                } else if (!(b10 == 7 || b10 == 8)) {
                    String[] strArr2 = f24318c;
                    String str2 = b11 < strArr2.length ? strArr2[b11] : f24319d[b11];
                    str = (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = f24319d[b11];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = m10;
        objArr[4] = str;
        return c.m("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException b(String str, Object... objArr) {
        throw new IllegalArgumentException(c.m(str, objArr));
    }

    public static IOException c(String str, Object... objArr) throws IOException {
        throw new IOException(c.m(str, objArr));
    }
}
