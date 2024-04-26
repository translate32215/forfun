package v7;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.x;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f26573a;

    public /* synthetic */ e0(x xVar) {
        this.f26573a = xVar;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f26573a.f5892d) {
                c0 c0Var = (c0) message.obj;
                d0 d0Var = (d0) this.f26573a.f5892d.get(c0Var);
                if (d0Var != null && d0Var.f26557a.isEmpty()) {
                    if (d0Var.f26559c) {
                        d0Var.f26563g.f5894f.removeMessages(1, d0Var.f26561e);
                        x xVar = d0Var.f26563g;
                        xVar.f5895g.c(xVar.f5893e, d0Var);
                        d0Var.f26559c = false;
                        d0Var.f26558b = 2;
                    }
                    this.f26573a.f5892d.remove(c0Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f26573a.f5892d) {
                c0 c0Var2 = (c0) message.obj;
                d0 d0Var2 = (d0) this.f26573a.f5892d.get(c0Var2);
                if (d0Var2 != null && d0Var2.f26558b == 3) {
                    String valueOf = String.valueOf(c0Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName componentName = d0Var2.f26562f;
                    if (componentName == null) {
                        c0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c0Var2.f26554b;
                        i.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    d0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
