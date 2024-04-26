package com.google.gson;

import java.io.IOException;
import jb.a;
import jb.b;
import jb.c;

public abstract class TypeAdapter<T> {
    public final TypeAdapter<T> a() {
        return new TypeAdapter<T>() {
            public T b(a aVar) throws IOException {
                if (aVar.m0() != b.NULL) {
                    return TypeAdapter.this.b(aVar);
                }
                aVar.i0();
                return null;
            }

            public void c(c cVar, T t10) throws IOException {
                if (t10 == null) {
                    cVar.M();
                } else {
                    TypeAdapter.this.c(cVar, t10);
                }
            }
        };
    }

    public abstract T b(a aVar) throws IOException;

    public abstract void c(c cVar, T t10) throws IOException;
}
