package e8;

import android.util.JsonWriter;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.zh;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class k8 implements q6, c7, zh, j9, mv {

    /* renamed from: a  reason: collision with root package name */
    public final String f15243a;

    public k8(String str, int i10) {
        if (i10 == 1) {
            this.f15243a = str;
        } else if (i10 == 2) {
            this.f15243a = str;
        } else if (i10 == 3) {
            this.f15243a = str;
        } else if (i10 != 4) {
            this.f15243a = str;
        } else {
            this.f15243a = str;
        }
    }

    public void F(Object obj) {
        ((il) obj).Q(this.f15243a);
    }

    public void a(Object obj) {
    }

    public void b(JsonWriter jsonWriter) {
        String str = this.f15243a;
        Object obj = b7.f5991b;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public void d(cw.a aVar) {
        String str = this.f15243a;
        if (aVar.f5971c) {
            aVar.n();
            aVar.f5971c = false;
        }
        cw.F((cw) aVar.f5970b, str);
    }

    public void e(y7 y7Var) {
        y7Var.Y5(this.f15243a);
    }

    public void n(Throwable th) {
        l.B.f13190g.c(th, this.f15243a);
    }
}
