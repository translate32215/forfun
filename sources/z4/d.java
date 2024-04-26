package z4;

import android.media.AudioAttributes;
import v6.e0;

/* compiled from: AudioAttributes */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f28337f = new d(0, 0, 1, 1, (a) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f28338a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28339b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28340c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28341d;

    /* renamed from: e  reason: collision with root package name */
    public AudioAttributes f28342e;

    public d(int i10, int i11, int i12, int i13, a aVar) {
        this.f28338a = i10;
        this.f28339b = i11;
        this.f28340c = i12;
        this.f28341d = i13;
    }

    public AudioAttributes a() {
        if (this.f28342e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f28338a).setFlags(this.f28339b).setUsage(this.f28340c);
            if (e0.f26436a >= 29) {
                usage.setAllowedCapturePolicy(this.f28341d);
            }
            this.f28342e = usage.build();
        }
        return this.f28342e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f28338a == dVar.f28338a && this.f28339b == dVar.f28339b && this.f28340c == dVar.f28340c && this.f28341d == dVar.f28341d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f28338a) * 31) + this.f28339b) * 31) + this.f28340c) * 31) + this.f28341d;
    }
}
