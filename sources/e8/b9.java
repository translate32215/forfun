package e8;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.ju;
import com.google.android.gms.internal.ads.ku;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final /* synthetic */ class b9 implements c7, pf0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13905a;

    public b9(byte[] bArr, int i10, e eVar) {
        if (i10 != 1) {
            this.f13905a = bArr;
        } else {
            this.f13905a = bArr;
        }
    }

    public void b(JsonWriter jsonWriter) {
        byte[] bArr = this.f13905a;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String h10 = y8.h(encodeToString);
            if (h10 != null) {
                jsonWriter.name("bodydigest").value(h10);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public ju c() {
        return new ku(this.f13905a);
    }

    public b9(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f13905a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }
}
