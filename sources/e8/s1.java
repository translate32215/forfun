package e8;

import a7.d;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.google.android.gms.internal.ads.z;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class s1 extends d.b {

    /* renamed from: a  reason: collision with root package name */
    public final z f16358a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f16359b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f16360c;

    /* renamed from: d  reason: collision with root package name */
    public final double f16361d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16362e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16363f;

    public s1(z zVar) {
        Drawable drawable;
        int i10;
        this.f16358a = zVar;
        Uri uri = null;
        try {
            a y32 = zVar.y3();
            if (y32 != null) {
                drawable = (Drawable) b.z0(y32);
                this.f16359b = drawable;
                uri = this.f16358a.M();
                this.f16360c = uri;
                double d10 = 1.0d;
                d10 = this.f16358a.O0();
                this.f16361d = d10;
                int i11 = -1;
                i10 = this.f16358a.getWidth();
                this.f16362e = i10;
                i11 = this.f16358a.getHeight();
                this.f16363f = i11;
            }
        } catch (RemoteException e10) {
            e.C("", e10);
        }
        drawable = null;
        this.f16359b = drawable;
        try {
            uri = this.f16358a.M();
        } catch (RemoteException e11) {
            e.C("", e11);
        }
        this.f16360c = uri;
        double d102 = 1.0d;
        try {
            d102 = this.f16358a.O0();
        } catch (RemoteException e12) {
            e.C("", e12);
        }
        this.f16361d = d102;
        int i112 = -1;
        try {
            i10 = this.f16358a.getWidth();
        } catch (RemoteException e13) {
            e.C("", e13);
            i10 = -1;
        }
        this.f16362e = i10;
        try {
            i112 = this.f16358a.getHeight();
        } catch (RemoteException e14) {
            e.C("", e14);
        }
        this.f16363f = i112;
    }

    public final Drawable a() {
        return this.f16359b;
    }

    public final int b() {
        return this.f16363f;
    }

    public final double c() {
        return this.f16361d;
    }

    public final Uri d() {
        return this.f16360c;
    }

    public final int e() {
        return this.f16362e;
    }
}
