package v6;

import android.text.TextUtils;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeTypes */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<a> f26493a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f26494b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes */
    public static final class a {
    }

    /* compiled from: MimeTypes */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f26495a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26496b;

        public b(int i10, int i11) {
            this.f26495a = i10;
            this.f26496b = i11;
        }
    }

    public static boolean a(String str, String str2) {
        b g10;
        int b10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case b4.f10106f:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (g10 = g(str2)) == null || (b10 = z4.a.b(g10.f26496b)) == 0 || b10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String e10 : e0.T(str)) {
            String e11 = e(e10);
            if (e11 != null && k(e11)) {
                return e11;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] T = e0.T(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : T) {
            if (str2.equals(e(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int d(String str, String str2) {
        b g10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (g10 = g(str2)) == null) {
                    return 0;
                }
                return z4.a.b(g10.f26496b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case b4.f10106f:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        b g10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String V = e0.V(str.trim());
        if (V.startsWith("avc1") || V.startsWith("avc3")) {
            return "video/avc";
        }
        if (V.startsWith("hev1") || V.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (V.startsWith("dvav") || V.startsWith("dva1") || V.startsWith("dvhe") || V.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (V.startsWith("av01")) {
            return "video/av01";
        }
        if (V.startsWith("vp9") || V.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (V.startsWith("vp8") || V.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (V.startsWith("mp4a")) {
            if (V.startsWith("mp4a.") && (g10 = g(V)) != null) {
                str2 = f(g10.f26495a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (V.startsWith("ac-3") || V.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (V.startsWith("ec-3") || V.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (V.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (V.startsWith("ac-4") || V.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (V.startsWith("dtsc") || V.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (V.startsWith("dtsh") || V.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (V.startsWith("opus")) {
                return "audio/opus";
            }
            if (V.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (V.startsWith("flac")) {
                return "audio/flac";
            }
            if (V.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (V.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (V.contains("cea708")) {
                return "application/cea-708";
            }
            if (V.contains("eia608") || V.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f26493a.size();
            for (int i10 = 0; i10 < size; i10++) {
                f26493a.get(i10).getClass();
                if (V.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    public static String f(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static b g(String str) {
        Matcher matcher = f26494b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i10 = Integer.parseInt(group2);
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f26493a.size();
        for (int i10 = 0; i10 < size; i10++) {
            f26493a.get(i10).getClass();
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String e10 : e0.T(str)) {
            String e11 = e(e10);
            if (e11 != null && m(e11)) {
                return e11;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(h(str));
    }
}
