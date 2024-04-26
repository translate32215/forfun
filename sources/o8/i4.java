package o8;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.i;
import k8.a1;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class i4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23262a;

    /* renamed from: b  reason: collision with root package name */
    public String f23263b;

    /* renamed from: c  reason: collision with root package name */
    public String f23264c;

    /* renamed from: d  reason: collision with root package name */
    public String f23265d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f23266e;

    /* renamed from: f  reason: collision with root package name */
    public long f23267f;

    /* renamed from: g  reason: collision with root package name */
    public a1 f23268g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23269h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f23270i;

    /* renamed from: j  reason: collision with root package name */
    public String f23271j;

    public i4(Context context, a1 a1Var, Long l10) {
        Context applicationContext = context.getApplicationContext();
        i.h(applicationContext);
        this.f23262a = applicationContext;
        this.f23270i = l10;
        if (a1Var != null) {
            this.f23268g = a1Var;
            this.f23263b = a1Var.f20058f;
            this.f23264c = a1Var.f20057e;
            this.f23265d = a1Var.f20056d;
            this.f23269h = a1Var.f20055c;
            this.f23267f = a1Var.f20054b;
            this.f23271j = a1Var.f20060h;
            Bundle bundle = a1Var.f20059g;
            if (bundle != null) {
                this.f23266e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
