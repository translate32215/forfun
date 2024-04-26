package oe;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import le.c;

/* compiled from: HttpDate */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f23696a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f23697b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f23698c;

    /* compiled from: HttpDate */
    public class a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(c.f21274n);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f23697b = strArr;
        f23698c = new DateFormat[strArr.length];
    }

    public static Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f23696a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f23697b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f23698c;
                DateFormat dateFormat = dateFormatArr[i10];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f23697b[i10], Locale.US);
                    dateFormat.setTimeZone(c.f21274n);
                    dateFormatArr[i10] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
