package bb;

import j8.w;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f3822p = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f3823a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3824b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3825c;

    /* renamed from: d  reason: collision with root package name */
    public final c f3826d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3827e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3828f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3829g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3830h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3831i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3832j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3833k;

    /* renamed from: l  reason: collision with root package name */
    public final b f3834l;

    /* renamed from: m  reason: collision with root package name */
    public final String f3835m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3836n;

    /* renamed from: o  reason: collision with root package name */
    public final String f3837o;

    /* renamed from: bb.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static final class C0055a {

        /* renamed from: a  reason: collision with root package name */
        public long f3838a = 0;

        /* renamed from: b  reason: collision with root package name */
        public String f3839b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f3840c = "";

        /* renamed from: d  reason: collision with root package name */
        public c f3841d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        public d f3842e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        public String f3843f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f3844g = "";

        /* renamed from: h  reason: collision with root package name */
        public int f3845h = 0;

        /* renamed from: i  reason: collision with root package name */
        public String f3846i = "";

        /* renamed from: j  reason: collision with root package name */
        public b f3847j = b.UNKNOWN_EVENT;

        /* renamed from: k  reason: collision with root package name */
        public String f3848k = "";

        /* renamed from: l  reason: collision with root package name */
        public String f3849l = "";

        public a a() {
            return new a(this.f3838a, this.f3839b, this.f3840c, this.f3841d, this.f3842e, this.f3843f, this.f3844g, 0, this.f3845h, this.f3846i, 0, this.f3847j, this.f3848k, 0, this.f3849l);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum b implements w {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f3854a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f3854a = i10;
        }

        public int a() {
            return this.f3854a;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum c implements w {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f3860a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f3860a = i10;
        }

        public int a() {
            return this.f3860a;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public enum d implements w {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f3866a;

        /* access modifiers changed from: public */
        d(int i10) {
            this.f3866a = i10;
        }

        public int a() {
            return this.f3866a;
        }
    }

    static {
        new C0055a().a();
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f3823a = j10;
        this.f3824b = str;
        this.f3825c = str2;
        this.f3826d = cVar;
        this.f3827e = dVar;
        this.f3828f = str3;
        this.f3829g = str4;
        this.f3830h = i10;
        this.f3831i = i11;
        this.f3832j = str5;
        this.f3833k = j11;
        this.f3834l = bVar;
        this.f3835m = str6;
        this.f3836n = j12;
        this.f3837o = str7;
    }
}
