package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import u6.c;
import u6.e;
import v6.e0;

/* compiled from: FileDataSource */
public final class l extends c {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f5519e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f5520f;

    /* renamed from: g  reason: collision with root package name */
    public long f5521g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5522h;

    /* compiled from: FileDataSource */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public l() {
        super(false);
    }

    public static RandomAccessFile q(Uri uri) throws a {
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e10);
            }
            throw new a(e10);
        }
    }

    public Uri M() {
        return this.f5520f;
    }

    public long O(e eVar) throws a {
        try {
            Uri uri = eVar.f26048a;
            this.f5520f = uri;
            o(eVar);
            RandomAccessFile q10 = q(uri);
            this.f5519e = q10;
            q10.seek(eVar.f26053f);
            long j10 = eVar.f26054g;
            if (j10 == -1) {
                j10 = this.f5519e.length() - eVar.f26053f;
            }
            this.f5521g = j10;
            if (j10 >= 0) {
                this.f5522h = true;
                p(eVar);
                return this.f5521g;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5521g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f5519e;
            int i12 = e0.f26436a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, (long) i11));
            if (read > 0) {
                this.f5521g -= (long) read;
                m(read);
            }
            return read;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public void close() throws a {
        this.f5520f = null;
        try {
            RandomAccessFile randomAccessFile = this.f5519e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f5519e = null;
            if (this.f5522h) {
                this.f5522h = false;
                n();
            }
        } catch (IOException e10) {
            throw new a(e10);
        } catch (Throwable th) {
            this.f5519e = null;
            if (this.f5522h) {
                this.f5522h = false;
                n();
            }
            throw th;
        }
    }
}
