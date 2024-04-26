package e8;

import android.text.TextUtils;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.oc;
import e.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qu {

    /* renamed from: a  reason: collision with root package name */
    public final b f16204a;

    /* renamed from: b  reason: collision with root package name */
    public final oc f16205b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f16206c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16207d;

    /* renamed from: e  reason: collision with root package name */
    public final qt f16208e;

    public qu(b bVar, oc ocVar, qt qtVar) {
        this.f16204a = bVar;
        this.f16205b = ocVar;
        this.f16207d = ((Boolean) ti0.f16763j.f16769f.a(t.f16547a4)).booleanValue();
        this.f16208e = qtVar;
    }

    public static void a(qu quVar, String str, int i10, long j10, String str2) {
        quVar.getClass();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
        sb2.append(str);
        sb2.append(".");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(str2)) {
            sb3 = g.a(o.a(str2, o.a(sb3, 1)), sb3, ".", str2);
        }
        quVar.f16206c.add(sb3);
    }
}
