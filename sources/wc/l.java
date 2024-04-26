package wc;

import android.text.TextUtils;
import ud.k;
import ze.a;
import ze.c;
import ze.f;
import ze.h;

/* compiled from: MultiPointController.kt */
public final class l implements k {
    public boolean a(f fVar) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("Stop")) == null) {
            return false;
        }
        b10.e("InstanceID", 0);
        return b10.d();
    }

    public boolean b(f fVar, String str) {
        a b10;
        a b11;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("SetAVTransportURI")) == null || (b11 = n10.b("Play")) == null || TextUtils.isEmpty(str)) {
            return false;
        }
        b10.e("InstanceID", 0);
        c a10 = b10.a("CurrentURI");
        if (a10 != null) {
            a10.e(str);
        }
        b10.e("CurrentURIMetaData", 0);
        if (!b10.d()) {
            return false;
        }
        b11.e("InstanceID", 0);
        c a11 = b11.a("Speed");
        if (a11 != null) {
            a11.e("1");
        }
        return b11.d();
    }

    public boolean c(f fVar, String str) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("Seek")) == null) {
            return false;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        c a11 = b10.a("Unit");
        if (a11 != null) {
            a11.e("ABS_TIME");
        }
        c a12 = b10.a("Target");
        if (a12 != null) {
            a12.e(str);
        }
        boolean d10 = b10.d();
        if (d10) {
            return d10;
        }
        c a13 = b10.a("Unit");
        if (a13 != null) {
            a13.e("REL_TIME");
        }
        c a14 = b10.a("Target");
        if (a14 != null) {
            a14.e(str);
        }
        return b10.d();
    }

    public boolean d(f fVar, int i10) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:RenderingControl:1");
        if (n10 == null || (b10 = n10.b("SetVolume")) == null) {
            return false;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        c a11 = b10.a("Channel");
        if (a11 != null) {
            a11.e("Master");
        }
        b10.e("DesiredVolume", i10);
        return b10.d();
    }

    public String e(f fVar) {
        a b10;
        String str;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("GetPositionInfo")) == null) {
            return null;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        if (!b10.d()) {
            return null;
        }
        c a11 = b10.a("AbsTime");
        if (a11 == null) {
            str = "";
        } else {
            str = a11.b();
        }
        return str;
    }

    public boolean f(f fVar) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("Pause")) == null) {
            return false;
        }
        b10.e("InstanceID", 0);
        return b10.d();
    }

    public int g(f fVar) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:RenderingControl:1");
        if (n10 == null || (b10 = n10.b("GetVolume")) == null) {
            return -1;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        c a11 = b10.a("Channel");
        if (a11 != null) {
            a11.e("Master");
        }
        if (!b10.d()) {
            return -1;
        }
        c a12 = b10.a("CurrentVolume");
        if (a12 == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a12.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public String h(f fVar) {
        a b10;
        String str;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("GetMediaInfo")) == null) {
            return null;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        if (!b10.d()) {
            return null;
        }
        c a11 = b10.a("MediaDuration");
        if (a11 == null) {
            str = "";
        } else {
            str = a11.b();
        }
        return str;
    }

    public boolean i(f fVar, String str) {
        a b10;
        k.c(fVar);
        h n10 = fVar.n("urn:schemas-upnp-org:service:AVTransport:1");
        if (n10 == null || (b10 = n10.b("Seek")) == null) {
            return false;
        }
        c a10 = b10.a("InstanceID");
        if (a10 != null) {
            a10.e("0");
        }
        c a11 = b10.a("Unit");
        if (a11 != null) {
            a11.e("ABS_TIME");
        }
        c a12 = b10.a("Target");
        if (a12 != null) {
            a12.e(str);
        }
        b10.d();
        a b11 = n10.b("Play");
        if (b11 == null) {
            return false;
        }
        b11.e("InstanceID", 0);
        c a13 = b11.a("Speed");
        if (a13 != null) {
            a13.e("1");
        }
        return b11.d();
    }
}
