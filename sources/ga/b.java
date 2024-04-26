package ga;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: AbtExperimentInfo */
public class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f18603g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final DateFormat f18604h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f18605a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18606b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18607c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f18608d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18609e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18610f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f18605a = str;
        this.f18606b = str2;
        this.f18607c = str3;
        this.f18608d = date;
        this.f18609e = j10;
        this.f18610f = j11;
    }
}
