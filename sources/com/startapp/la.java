package com.startapp;

import androidx.activity.e;
import com.startapp.networkTest.enums.AnonymizationLevel;
import j.f;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class la {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10813a = "la";

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10814a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10814a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10814a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10814a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.la.a.<clinit>():void");
        }
    }

    public static String a(InetAddress inetAddress) {
        String hostAddress = inetAddress.getHostAddress();
        if (inetAddress instanceof Inet4Address) {
            return hostAddress.substring(0, hostAddress.lastIndexOf(46)) + ".xxx";
        }
        String str = "";
        if (!(inetAddress instanceof Inet6Address)) {
            return str;
        }
        String[] split = hostAddress.split(":");
        int length = split.length - 4;
        if (length < 0) {
            length = 0;
        }
        for (int i10 = 0; i10 < length; i10++) {
            str = e.a(b1.a(str), split[i10], ":");
        }
        return f.a(str, "x:x:x:x");
    }

    public static String b(String str) {
        if (str.length() != 32) {
            return str;
        }
        return str.substring(0, 7) + "-" + str.substring(7, 11) + "-" + str.substring(11, 15) + "-" + str.substring(15, 19) + "-" + str.substring(19, 31);
    }

    public static boolean c(String str) {
        return str == null || str.length() == 0;
    }

    public static String d(String str) {
        return (str.length() <= 1 || !str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
    }

    public static String a(String str, AnonymizationLevel anonymizationLevel) {
        if (str == null) {
            str = "";
        }
        int i10 = a.f10814a[anonymizationLevel.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "" : str;
        }
        if (str.length() <= 3) {
            return "***";
        }
        return str.substring(0, str.length() - 3) + "***";
    }

    public static String a(String str) {
        return str == null ? "" : str.replaceAll("[\u0000-\u001f]", "").trim();
    }

    public static String a(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        int i10 = 0;
        for (String length : list) {
            i10 += length.length();
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        for (String append : list) {
            stringBuffer.append(append);
        }
        return stringBuffer.toString();
    }

    public static String[] a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && str.length() > 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String a(InputStream inputStream, String str) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    bufferedReader.close();
                    return stringWriter.toString();
                }
            }
        } catch (Throwable th) {
            x2.a(th);
            return null;
        }
    }
}
