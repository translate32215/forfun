package v6;

import aa.c;
import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.startapp.b4;
import j.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import x4.m0;

/* compiled from: Util */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f26436a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f26437b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f26438c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f26439d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f26440e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f26441f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f26442g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f26443h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f26444i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: j  reason: collision with root package name */
    public static HashMap<String, String> f26445j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f26446k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f26447l = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f26448m = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f26449n = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i10 = 31;
        } else {
            i10 = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        f26436a = i10;
        String str2 = Build.DEVICE;
        f26437b = str2;
        String str3 = Build.MANUFACTURER;
        f26438c = str3;
        String str4 = Build.MODEL;
        f26439d = str4;
        f26440e = str2 + ", " + str4 + ", " + str3 + ", " + i10;
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static int A(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case b4.f10106f:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String B(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        if (j13 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j12), Long.valueOf(j11)}).toString();
    }

    public static String C(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            p.b("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static byte[] D(String str) {
        return str.getBytes(c.f178c);
    }

    public static int E(String str) {
        String V = V(str);
        if (V.endsWith(".mpd")) {
            return 0;
        }
        if (V.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f26444i.matcher(V);
        if (!matcher.matches()) {
            return 3;
        }
        String group = matcher.group(2);
        if (group == null) {
            return 1;
        }
        if (group.contains("format=mpd-time-csf")) {
            return 0;
        }
        if (group.contains("format=m3u8-aapl")) {
            return 2;
        }
        return 1;
    }

    public static boolean F(v vVar, v vVar2, Inflater inflater) {
        if (vVar.a() <= 0) {
            return false;
        }
        if (vVar2.f26518a.length < vVar.a()) {
            vVar2.b(vVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(vVar.f26518a, vVar.f26519b, vVar.a());
        int i10 = 0;
        while (true) {
            try {
                byte[] bArr = vVar2.f26518a;
                i10 += inflater.inflate(bArr, i10, bArr.length - i10);
                if (inflater.finished()) {
                    vVar2.C(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else {
                    byte[] bArr2 = vVar2.f26518a;
                    if (i10 == bArr2.length) {
                        vVar2.b(bArr2.length * 2);
                    }
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean G(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean H(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean I(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean J(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String K(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String V = V(str);
        int i10 = 0;
        String str2 = S(V, "-")[0];
        if (f26445j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f26446k.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i11 = 0;
            while (true) {
                String[] strArr = f26446k;
                if (i11 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i11], strArr[i11 + 1]);
                i11 += 2;
            }
            f26445j = hashMap;
        }
        String str4 = f26445j.get(str2);
        if (str4 != null) {
            StringBuilder a10 = a.a(str4);
            a10.append(V.substring(str2.length()));
            V = a10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return V;
        }
        while (true) {
            String[] strArr2 = f26447l;
            if (i10 >= strArr2.length) {
                return V;
            }
            if (V.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + V.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static <T> T[] L(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return Arrays.copyOf(tArr, i10);
    }

    public static long M(String str) throws m0 {
        Matcher matcher = f26442g.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder a10 = a.a("0.");
                a10.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(a10.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i10 != 0 ? timeInMillis - ((long) (i10 * 60000)) : timeInMillis;
        }
        throw new m0(f.a("Invalid date/time format: ", str));
    }

    public static boolean N(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> void O(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        } else if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static long P(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        double d10 = (double) j11;
        double d11 = (double) j12;
        Double.isNaN(d10);
        Double.isNaN(d11);
        double d12 = (double) j10;
        Double.isNaN(d12);
        return (long) (d12 * (d10 / d11));
    }

    public static void Q(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = (double) j10;
            double d11 = (double) j11;
            Double.isNaN(d10);
            Double.isNaN(d11);
            double d12 = d10 / d11;
            while (i10 < jArr.length) {
                double d13 = (double) jArr[i10];
                Double.isNaN(d13);
                jArr[i10] = (long) (d13 * d12);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static String[] R(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] S(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] T(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return R(str.trim(), "(\\s*,\\s*)");
    }

    public static byte[] U(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String V(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static long W(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0009
            r5 = r0 ^ -1
            goto L_0x001b
        L_0x0009:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x0009
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r5 = r0 + -1
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0024
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0024:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e0.b(long[], long, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int c(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e0.c(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int d(q qVar, long j10, boolean z10, boolean z11) {
        int i10;
        int f10 = qVar.f() - 1;
        int i11 = 0;
        while (i11 <= f10) {
            int i12 = (i11 + f10) >>> 1;
            if (qVar.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                f10 = i12 - 1;
            }
        }
        if (z10 && (i10 = f10 + 1) < qVar.f() && qVar.c(i10) == j10) {
            return i10;
        }
        if (!z11 || f10 != -1) {
            return f10;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e0.e(int[], int, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e0.f(long[], long, boolean, boolean):int");
    }

    public static int g(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int i(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(Object[] objArr, Object obj) {
        for (Object a10 : objArr) {
            if (a(a10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static Handler l() {
        return m((Handler.Callback) null);
    }

    public static Handler m(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        a.f(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, c.f178c);
    }

    public static String p(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, c.f178c);
    }

    public static int q(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case b4.f10106f:
                int i11 = f26436a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int r(String str, int i10) {
        int i11 = 0;
        for (String e10 : T(str)) {
            if (i10 == s.i(s.e(e10))) {
                i11++;
            }
        }
        return i11;
    }

    public static String s(String str, int i10) {
        String[] T = T(str);
        if (T.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T) {
            if (i10 == s.i(s.e(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Looper t() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long u(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        double d10 = (double) j10;
        double d11 = (double) f10;
        Double.isNaN(d10);
        Double.isNaN(d11);
        return Math.round(d10 * d11);
    }

    public static int v(Context context) {
        ConnectivityManager connectivityManager;
        int i10 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (!(type == 4 || type == 5)) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case b4.f10106f:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 18:
                    return 2;
                case 20:
                    if (f26436a >= 29) {
                        i10 = 9;
                    }
                    return i10;
                default:
                    return 6;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static long w(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static int x(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int y(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long z(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        double d10 = (double) j10;
        double d11 = (double) f10;
        Double.isNaN(d10);
        Double.isNaN(d11);
        return Math.round(d10 / d11);
    }
}
