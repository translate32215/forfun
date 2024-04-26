package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: SnackbarManager */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static b f9398d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9399a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9400b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f9401c;

    /* compiled from: SnackbarManager */
    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            c cVar = (c) message.obj;
            synchronized (bVar.f9399a) {
                if (bVar.f9401c == cVar || cVar == null) {
                    cVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    /* compiled from: SnackbarManager */
    public interface C0098b {
    }

    /* compiled from: SnackbarManager */
    public static class c {
    }

    public static b a() {
        if (f9398d == null) {
            f9398d = new b();
        }
        return f9398d;
    }

    public final boolean b(C0098b bVar) {
        if (this.f9401c == null || bVar == null) {
            return false;
        }
        throw null;
    }
}
