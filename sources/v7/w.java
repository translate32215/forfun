package v7;

import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public Object f26600a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26601b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f26602c;

    public w(b bVar, Object obj) {
        this.f26602c = bVar;
        this.f26600a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        synchronized (this) {
            this.f26600a = null;
        }
        synchronized (this.f26602c.f5833t) {
            this.f26602c.f5833t.remove(this);
        }
    }
}
