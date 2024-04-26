package t2;

import com.adcolony.sdk.l;
import org.json.JSONObject;

public class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f25452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f25453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f25454c;

    public e0(l lVar, String str, JSONObject jSONObject) {
        this.f25454c = lVar;
        this.f25452a = str;
        this.f25453b = jSONObject;
    }

    public void run() {
        this.f25454c.c(this.f25452a, this.f25453b);
    }
}
