package ab;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.g;
import s8.f;
import ta.a;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class m implements a.C0252a, f {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseMessaging f230a;

    public m(FirebaseMessaging firebaseMessaging, int i10) {
        if (i10 != 1) {
            this.f230a = firebaseMessaging;
        } else {
            this.f230a = firebaseMessaging;
        }
    }

    public void a(Object obj) {
        g gVar = (g) obj;
        if (this.f230a.f9701g.b()) {
            gVar.f();
        }
    }
}
