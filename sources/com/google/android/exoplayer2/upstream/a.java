package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import u6.c;
import u6.e;
import v6.e0;

/* compiled from: AssetDataSource */
public final class a extends c {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f5460e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f5461f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f5462g;

    /* renamed from: h  reason: collision with root package name */
    public long f5463h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5464i;

    /* renamed from: com.google.android.exoplayer2.upstream.a$a  reason: collision with other inner class name */
    /* compiled from: AssetDataSource */
    public static final class C0081a extends IOException {
        public C0081a(IOException iOException) {
            super(iOException);
        }
    }

    public a(Context context) {
        super(false);
        this.f5460e = context.getAssets();
    }

    public Uri M() {
        return this.f5461f;
    }

    public long O(e eVar) throws C0081a {
        try {
            Uri uri = eVar.f26048a;
            this.f5461f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            o(eVar);
            InputStream open = this.f5460e.open(path, 1);
            this.f5462g = open;
            if (open.skip(eVar.f26053f) >= eVar.f26053f) {
                long j10 = eVar.f26054g;
                if (j10 != -1) {
                    this.f5463h = j10;
                } else {
                    long available = (long) this.f5462g.available();
                    this.f5463h = available;
                    if (available == 2147483647L) {
                        this.f5463h = -1;
                    }
                }
                this.f5464i = true;
                p(eVar);
                return this.f5463h;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new C0081a(e10);
        }
    }

    public int a(byte[] bArr, int i10, int i11) throws C0081a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5463h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new C0081a(e10);
            }
        }
        InputStream inputStream = this.f5462g;
        int i12 = e0.f26436a;
        int read = inputStream.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f5463h;
            if (j11 != -1) {
                this.f5463h = j11 - ((long) read);
            }
            m(read);
            return read;
        } else if (this.f5463h == -1) {
            return -1;
        } else {
            throw new C0081a(new EOFException());
        }
    }

    public void close() throws C0081a {
        this.f5461f = null;
        try {
            InputStream inputStream = this.f5462g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f5462g = null;
            if (this.f5464i) {
                this.f5464i = false;
                n();
            }
        } catch (IOException e10) {
            throw new C0081a(e10);
        } catch (Throwable th) {
            this.f5462g = null;
            if (this.f5464i) {
                this.f5464i = false;
                n();
            }
            throw th;
        }
    }
}
