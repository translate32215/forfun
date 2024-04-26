package q6;

import android.support.v4.media.a;
import java.util.regex.Pattern;
import v6.e0;
import v6.v;
import x4.m0;

/* compiled from: WebvttParserUtil */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f24210a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        String g10 = vVar.g();
        return g10 != null && g10.startsWith("WEBVTT");
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) throws NumberFormatException {
        int i10 = e0.f26436a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String parseLong : e0.R(split[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void d(v vVar) throws m0 {
        int i10 = vVar.f26519b;
        if (!a(vVar)) {
            vVar.D(i10);
            StringBuilder a10 = a.a("Expected WEBVTT. Got ");
            a10.append(vVar.g());
            throw new m0(a10.toString());
        }
    }
}
