package com.google.gson;

import com.google.gson.internal.w;
import java.io.IOException;
import java.io.StringWriter;
import jb.c;

/* compiled from: JsonElement */
public abstract class j {
    public g c() {
        if (this instanceof g) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m f() {
        if (this instanceof m) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o h() {
        if (this instanceof o) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean i() {
        return this instanceof g;
    }

    public boolean j() {
        return this instanceof l;
    }

    public boolean o() {
        return this instanceof m;
    }

    public boolean q() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.h0(true);
            w.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
