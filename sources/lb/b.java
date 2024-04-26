package lb;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import mb.h;
import ob.a;
import ob.f;
import z3.g;

public final class b extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21241a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioManager f21242b;

    /* renamed from: c  reason: collision with root package name */
    public final g f21243c;

    /* renamed from: d  reason: collision with root package name */
    public final a f21244d;

    /* renamed from: e  reason: collision with root package name */
    public float f21245e;

    public b(Handler handler, Context context, g gVar, a aVar) {
        super(handler);
        this.f21241a = context;
        this.f21242b = (AudioManager) context.getSystemService("audio");
        this.f21243c = gVar;
        this.f21244d = aVar;
    }

    public final float a() {
        int streamVolume = this.f21242b.getStreamVolume(3);
        int streamMaxVolume = this.f21242b.getStreamMaxVolume(3);
        this.f21243c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        a aVar = this.f21244d;
        float f10 = this.f21245e;
        f fVar = (f) aVar;
        fVar.f23669a = f10;
        if (fVar.f23673e == null) {
            fVar.f23673e = a.f23656c;
        }
        for (h hVar : fVar.f23673e.b()) {
            hVar.f21783e.b(f10);
        }
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a10 != this.f21245e) {
            this.f21245e = a10;
            b();
        }
    }
}
