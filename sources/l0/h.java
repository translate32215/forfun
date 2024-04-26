package l0;

import android.support.v4.media.a;
import android.util.Base64;
import androidx.activity.e;
import java.util.List;

/* compiled from: FontRequest */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20973a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20974b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20975c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f20976d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20977e;

    public h(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f20973a = str;
        str2.getClass();
        this.f20974b = str2;
        this.f20975c = str3;
        list.getClass();
        this.f20976d = list;
        this.f20977e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder a10 = a.a("FontRequest {mProviderAuthority: ");
        a10.append(this.f20973a);
        a10.append(", mProviderPackage: ");
        a10.append(this.f20974b);
        a10.append(", mQuery: ");
        a10.append(this.f20975c);
        a10.append(", mCertificates:");
        sb2.append(a10.toString());
        for (int i10 = 0; i10 < this.f20976d.size(); i10++) {
            sb2.append(" [");
            List list = this.f20976d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return e.a(sb2, "}", "mCertificatesArray: 0");
    }
}
