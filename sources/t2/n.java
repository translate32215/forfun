package t2;

import android.util.Log;
import com.adcolony.sdk.r0;
import com.adcolony.sdk.u;
import java.util.Date;

public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f25530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f25531c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f25532d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f25533e;

    public n(m mVar, int i10, String str, int i11, boolean z10) {
        this.f25533e = mVar;
        this.f25529a = i10;
        this.f25530b = str;
        this.f25531c = i11;
        this.f25532d = z10;
    }

    public void run() {
        m mVar = this.f25533e;
        int i10 = this.f25529a;
        String str = this.f25530b;
        int i11 = this.f25531c;
        if (mVar.f25518d != null) {
            if (i11 == 3 && mVar.b(r0.n(mVar.f25515a, Integer.toString(i10)), 3)) {
                u uVar = mVar.f25518d;
                synchronized (uVar) {
                    k kVar = new k();
                    kVar.f25495b = 3;
                    kVar.f25497d = uVar.f4790f;
                    kVar.f25496c = str;
                    if (kVar.f25494a == null) {
                        kVar.f25494a = new Date(System.currentTimeMillis());
                    }
                    uVar.c(kVar);
                }
            } else if (i11 == 2 && mVar.b(r0.n(mVar.f25515a, Integer.toString(i10)), 2)) {
                u uVar2 = mVar.f25518d;
                synchronized (uVar2) {
                    k kVar2 = new k();
                    kVar2.f25495b = 2;
                    kVar2.f25497d = uVar2.f4790f;
                    kVar2.f25496c = str;
                    if (kVar2.f25494a == null) {
                        kVar2.f25494a = new Date(System.currentTimeMillis());
                    }
                    uVar2.c(kVar2);
                }
            } else if (i11 == 1 && mVar.b(r0.n(mVar.f25515a, Integer.toString(i10)), 1)) {
                u uVar3 = mVar.f25518d;
                synchronized (uVar3) {
                    k kVar3 = new k();
                    kVar3.f25495b = 1;
                    kVar3.f25497d = uVar3.f4790f;
                    kVar3.f25496c = str;
                    if (kVar3.f25494a == null) {
                        kVar3.f25494a = new Date(System.currentTimeMillis());
                    }
                    uVar3.c(kVar3);
                }
            } else if (i11 == 0 && mVar.b(r0.n(mVar.f25515a, Integer.toString(i10)), 0)) {
                u uVar4 = mVar.f25518d;
                synchronized (uVar4) {
                    k kVar4 = new k();
                    kVar4.f25495b = 0;
                    kVar4.f25497d = uVar4.f4790f;
                    kVar4.f25496c = str;
                    if (kVar4.f25494a == null) {
                        kVar4.f25494a = new Date(System.currentTimeMillis());
                    }
                    uVar4.c(kVar4);
                }
            }
        }
        int i12 = 0;
        while (i12 <= this.f25530b.length() / 4000) {
            int i13 = i12 * 4000;
            i12++;
            int min = Math.min(i12 * 4000, this.f25530b.length());
            if (this.f25531c == 3) {
                m mVar2 = this.f25533e;
                if (mVar2.c(r0.n(mVar2.f25515a, Integer.toString(this.f25529a)), 3, this.f25532d)) {
                    Log.d("AdColony [TRACE]", this.f25530b.substring(i13, min));
                }
            }
            if (this.f25531c == 2) {
                m mVar3 = this.f25533e;
                if (mVar3.c(r0.n(mVar3.f25515a, Integer.toString(this.f25529a)), 2, this.f25532d)) {
                    Log.i("AdColony [INFO]", this.f25530b.substring(i13, min));
                }
            }
            if (this.f25531c == 1) {
                m mVar4 = this.f25533e;
                if (mVar4.c(r0.n(mVar4.f25515a, Integer.toString(this.f25529a)), 1, this.f25532d)) {
                    Log.w("AdColony [WARNING]", this.f25530b.substring(i13, min));
                }
            }
            if (this.f25531c == 0) {
                m mVar5 = this.f25533e;
                if (mVar5.c(r0.n(mVar5.f25515a, Integer.toString(this.f25529a)), 0, this.f25532d)) {
                    Log.e("AdColony [ERROR]", this.f25530b.substring(i13, min));
                }
            }
            if (this.f25531c == -1 && m.f25513f >= -1) {
                Log.e("AdColony [FATAL]", this.f25530b.substring(i13, min));
            }
        }
    }
}
