package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher */
public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4989a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f4990b;

    /* renamed from: c  reason: collision with root package name */
    public T f4991c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f4990b = contentResolver;
        this.f4989a = uri;
    }

    public void b() {
        T t10 = this.f4991c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10) throws IOException;

    public void cancel() {
    }

    public abstract T d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public a e() {
        return a.LOCAL;
    }

    public final void f(f fVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f4989a, this.f4990b);
            this.f4991c = d10;
            aVar.d(d10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }
}
