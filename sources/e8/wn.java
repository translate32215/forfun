package e8;

import android.view.View;
import com.google.android.gms.internal.ads.j1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wn implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final cp f17374a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17375b;

    /* renamed from: c  reason: collision with root package name */
    public j1 f17376c;

    /* renamed from: d  reason: collision with root package name */
    public f3<Object> f17377d;

    /* renamed from: e  reason: collision with root package name */
    public String f17378e;

    /* renamed from: f  reason: collision with root package name */
    public Long f17379f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f17380g;

    public wn(cp cpVar, b bVar) {
        this.f17374a = cpVar;
        this.f17375b = bVar;
    }

    public final void a() {
        View view;
        this.f17378e = null;
        this.f17379f = null;
        WeakReference<View> weakReference = this.f17380g;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f17380g = null;
        }
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f17380g;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f17378e == null || this.f17379f == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f17378e);
                hashMap.put("time_interval", String.valueOf(this.f17375b.b() - this.f17379f.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f17374a.b("sendMessageToNativeJs", hashMap);
            }
            a();
        }
    }
}
