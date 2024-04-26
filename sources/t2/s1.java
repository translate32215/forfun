package t2;

import android.net.Uri;
import com.adcolony.sdk.g;
import java.io.File;

public class s1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t1 f25568a;

    public s1(t1 t1Var) {
        this.f25568a = t1Var;
    }

    public void a(g gVar) {
        if (t1.a(this.f25568a, gVar)) {
            t1 t1Var = this.f25568a;
            t1Var.getClass();
            t1Var.f25579i = gVar.f4485b.optString("filepath");
            t1Var.setImageURI(Uri.fromFile(new File(t1Var.f25579i)));
        }
    }
}
