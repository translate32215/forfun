package t2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import n2.g;

public class k {

    /* renamed from: e  reason: collision with root package name */
    public static final SimpleDateFormat f25493e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public Date f25494a;

    /* renamed from: b  reason: collision with root package name */
    public int f25495b;

    /* renamed from: c  reason: collision with root package name */
    public String f25496c;

    /* renamed from: d  reason: collision with root package name */
    public g f25497d;

    public String a() {
        int i10 = this.f25495b;
        if (i10 == -1) {
            return "Fatal";
        }
        if (i10 == 0) {
            return "Error";
        }
        if (i10 == 1) {
            return "Warn";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    public String toString() {
        return f25493e.format(this.f25494a) + " " + a() + "/" + ((String) this.f25497d.f21852c) + ": " + this.f25496c;
    }
}
