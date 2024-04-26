package o8;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.leanback.widget.s;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f23329a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23330b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23331c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23332d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23333e;

    /* renamed from: f  reason: collision with root package name */
    public final p f23334f;

    public m(l lVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        p pVar;
        i.e(str2);
        i.e(str3);
        this.f23329a = str2;
        this.f23330b = str3;
        this.f23331c = true == TextUtils.isEmpty(str) ? null : str;
        this.f23332d = j10;
        this.f23333e = j11;
        if (j11 != 0 && j11 > j10) {
            lVar.d().f8800i.b("Event created with reverse previous/current timestamps. appId", h.t(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    lVar.d().f8797f.a("Param name can't be null");
                    it.remove();
                } else {
                    Object o10 = lVar.A().o(str4, bundle2.get(str4));
                    if (o10 == null) {
                        lVar.d().f8800i.b("Param value can't be null", lVar.f8849m.e(str4));
                        it.remove();
                    } else {
                        lVar.A().A(bundle2, str4, o10);
                    }
                }
            }
            pVar = new p(bundle2);
        } else {
            pVar = new p(new Bundle());
        }
        this.f23334f = pVar;
    }

    public final m a(l lVar, long j10) {
        return new m(lVar, this.f23331c, this.f23329a, this.f23330b, this.f23332d, j10, this.f23334f);
    }

    public final String toString() {
        String str = this.f23329a;
        String str2 = this.f23330b;
        String valueOf = String.valueOf(this.f23334f);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(str2).length() + valueOf.length());
        s.a(sb2, "Event{appId='", str, "', name='", str2);
        sb2.append("', params=");
        sb2.append(valueOf);
        sb2.append('}');
        return sb2.toString();
    }

    public m(l lVar, String str, String str2, String str3, long j10, long j11, p pVar) {
        i.e(str2);
        i.e(str3);
        if (pVar != null) {
            this.f23329a = str2;
            this.f23330b = str3;
            this.f23331c = true == TextUtils.isEmpty(str) ? null : str;
            this.f23332d = j10;
            this.f23333e = j11;
            if (j11 != 0 && j11 > j10) {
                lVar.d().f8800i.c("Event created with reverse previous/current timestamps. appId, name", h.t(str2), h.t(str3));
            }
            this.f23334f = pVar;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
