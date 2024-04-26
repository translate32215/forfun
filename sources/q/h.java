package q;

import android.view.MotionEvent;
import j.f;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kb.d;

public class h {
    public static List<byte[]> a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000));
        arrayList.add(b(80000000));
        return arrayList;
    }

    public static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static final String c(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf("::");
        if (indexOf < 0) {
            return str.trim();
        }
        return new String(str.getBytes(), 0, indexOf).trim();
    }

    public static String d(String str, String str2) {
        Pattern pattern = d.f20582a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        e.d.b(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf("<!--", i10);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i10 = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i10 = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
        StringBuilder sb2 = new StringBuilder(str3.length() + str2.length() + 16);
        return (!d.c(str2, sb2, d.f20583b, str3, iArr2) && !d.b(str2, sb2, d.f20582a, str3, iArr2) && !d.c(str2, sb2, d.f20585d, str3, iArr2) && !d.b(str2, sb2, d.f20584c, str3, iArr2) && !d.c(str2, sb2, d.f20587f, str3, iArr2) && !d.b(str2, sb2, d.f20586e, str3, iArr2) && !d.b(str2, sb2, d.f20588g, str3, iArr2)) ? f.a(str3, str2) : sb2.toString();
    }

    public static boolean e(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public static boolean f(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }
}
