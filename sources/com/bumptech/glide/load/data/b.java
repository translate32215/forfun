package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher */
public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4967a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f4968b;

    /* renamed from: c  reason: collision with root package name */
    public T f4969c;

    public b(AssetManager assetManager, String str) {
        this.f4968b = assetManager;
        this.f4967a = str;
    }

    public void b() {
        T t10 = this.f4969c;
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

    public abstract T d(AssetManager assetManager, String str) throws IOException;

    public a e() {
        return a.LOCAL;
    }

    public void f(f fVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f4968b, this.f4967a);
            this.f4969c = d10;
            aVar.d(d10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }
}
