package m6;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import androidx.appcompat.widget.z0;
import com.startapp.b4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v6.e0;
import v6.p;

/* compiled from: SsaStyle */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f21733a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21734b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f21735c;

    /* renamed from: d  reason: collision with root package name */
    public final float f21736d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21737e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21738f;

    /* compiled from: SsaStyle */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21739a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21740b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21741c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21742d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21743e;

        /* renamed from: f  reason: collision with root package name */
        public final int f21744f;

        /* renamed from: g  reason: collision with root package name */
        public final int f21745g;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f21739a = i10;
            this.f21740b = i11;
            this.f21741c = i12;
            this.f21742d = i13;
            this.f21743e = i14;
            this.f21744f = i15;
            this.f21745g = i16;
        }
    }

    /* compiled from: SsaStyle */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f21746a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b  reason: collision with root package name */
        public static final Pattern f21747b = Pattern.compile(e0.n("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c  reason: collision with root package name */
        public static final Pattern f21748c = Pattern.compile(e0.n("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d  reason: collision with root package name */
        public static final Pattern f21749d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String str2;
            String str3;
            Matcher matcher = f21747b.matcher(str);
            Matcher matcher2 = f21748c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }
    }

    public c(String str, int i10, Integer num, float f10, boolean z10, boolean z11) {
        this.f21733a = str;
        this.f21734b = i10;
        this.f21735c = num;
        this.f21736d = f10;
        this.f21737e = z10;
        this.f21738f = z11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case b4.f10106f:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        z0.a("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            p.d("SsaStyle", "Failed to parse bold/italic: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long j10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            v6.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(da.a.a(((j10 >> 24) & 255) ^ 255), da.a.a(j10 & 255), da.a.a((j10 >> 8) & 255), da.a.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            p.d("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
