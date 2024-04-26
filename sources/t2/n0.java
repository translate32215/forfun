package t2;

import com.adcolony.sdk.b;
import com.adcolony.sdk.f;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.r;
import com.adcolony.sdk.r0;
import java.math.BigDecimal;
import org.json.JSONObject;

public class n0 implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f25534a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25535a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f25536b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f25537c;

        public a(String str, String str2, float f10) {
            this.f25535a = str;
            this.f25536b = str2;
            this.f25537c = f10;
        }

        public void run() {
            if (this.f25535a.equals(n0.this.f25534a.f4765o)) {
                n0.this.f25534a.c(this.f25536b, this.f25537c);
                return;
            }
            b bVar = f.d().g().f4528d.get(this.f25535a);
            r omidManager = bVar != null ? bVar.getOmidManager() : null;
            if (omidManager != null) {
                omidManager.c(this.f25536b, this.f25537c);
            }
        }
    }

    public n0(r rVar) {
        this.f25534a = rVar;
    }

    public void a(g gVar) {
        JSONObject a10 = r0.a(gVar.f25479b, (String) null);
        String optString = a10.optString("event_type");
        float floatValue = BigDecimal.valueOf(a10.optDouble("duration", 0.0d)).floatValue();
        boolean optBoolean = a10.optBoolean("replay");
        boolean equals = a10.optString("skip_type").equals("dec");
        String optString2 = a10.optString("asi");
        if (optString.equals("skip") && equals) {
            this.f25534a.f4761k = true;
        } else if (!optBoolean || (!optString.equals("start") && !optString.equals("first_quartile") && !optString.equals("midpoint") && !optString.equals("third_quartile") && !optString.equals("complete"))) {
            j0.h(new a(optString2, optString, floatValue));
        }
    }
}
