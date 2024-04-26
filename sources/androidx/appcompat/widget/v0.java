package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1113a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1114b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1115c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1116d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1117e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1118f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1119g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1120h = false;

    public void a(int i10, int i11) {
        this.f1115c = i10;
        this.f1116d = i11;
        this.f1120h = true;
        if (this.f1119g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1113a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1114b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1113a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1114b = i11;
        }
    }
}
