package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.j;
import java.io.IOException;
import java.io.Writer;
import jb.c;

/* compiled from: Streams */
public final class w {
    public static void a(j jVar, c cVar) throws IOException {
        TypeAdapters.C.c(cVar, jVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams */
    public static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f9984a;

        /* renamed from: b  reason: collision with root package name */
        public final C0112a f9985b = new C0112a();

        /* renamed from: com.google.gson.internal.w$a$a  reason: collision with other inner class name */
        /* compiled from: Streams */
        public static class C0112a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            public char[] f9986a;

            public char charAt(int i10) {
                return this.f9986a[i10];
            }

            public int length() {
                return this.f9986a.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f9986a, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f9984a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0112a aVar = this.f9985b;
            aVar.f9986a = cArr;
            this.f9984a.append(aVar, i10, i11 + i10);
        }

        public void write(int i10) throws IOException {
            this.f9984a.append((char) i10);
        }
    }
}
