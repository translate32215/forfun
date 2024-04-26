package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.t;
import ib.a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements t {

    /* renamed from: a  reason: collision with root package name */
    public final h f9860a;

    public JsonAdapterAnnotationTypeAdapterFactory(h hVar) {
        this.f9860a = hVar;
    }

    public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
        fb.a aVar2 = (fb.a) aVar.f19348a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f9860a, gson, aVar, aVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.TypeAdapter<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.TypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.TypeAdapter<?> b(com.google.gson.internal.h r9, com.google.gson.Gson r10, ib.a<?> r11, fb.a r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            ib.a r1 = new ib.a
            r1.<init>(r0)
            com.google.gson.internal.t r9 = r9.a(r1)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L_0x0018
            com.google.gson.TypeAdapter r9 = (com.google.gson.TypeAdapter) r9
            goto L_0x0072
        L_0x0018:
            boolean r0 = r9 instanceof com.google.gson.t
            if (r0 == 0) goto L_0x0023
            com.google.gson.t r9 = (com.google.gson.t) r9
            com.google.gson.TypeAdapter r9 = r9.a(r10, r11)
            goto L_0x0072
        L_0x0023:
            boolean r0 = r9 instanceof com.google.gson.q
            if (r0 != 0) goto L_0x0058
            boolean r1 = r9 instanceof com.google.gson.i
            if (r1 == 0) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = android.support.v4.media.a.a(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r9
            com.google.gson.q r0 = (com.google.gson.q) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r9 instanceof com.google.gson.i
            if (r0 == 0) goto L_0x0068
            r1 = r9
            com.google.gson.i r1 = (com.google.gson.i) r1
        L_0x0068:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r9 == 0) goto L_0x007e
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x007e
            com.google.gson.TypeAdapter r9 = r9.a()
        L_0x007e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.b(com.google.gson.internal.h, com.google.gson.Gson, ib.a, fb.a):com.google.gson.TypeAdapter");
    }
}
