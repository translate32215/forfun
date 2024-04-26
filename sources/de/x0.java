package de;

import java.util.concurrent.CancellationException;
import ud.k;

/* compiled from: Exceptions.kt */
public final class x0 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f13341a;

    public x0(String str, Throwable th, w0 w0Var) {
        super(str);
        this.f13341a = w0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                if (!k.a(x0Var.getMessage(), getMessage()) || !k.a(x0Var.f13341a, this.f13341a) || !k.a(x0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        k.c(message);
        int hashCode = (this.f13341a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f13341a;
    }
}
