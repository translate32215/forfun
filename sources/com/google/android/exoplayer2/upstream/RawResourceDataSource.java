package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import u6.c;
import v6.e0;

public final class RawResourceDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f5453e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5454f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f5455g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f5456h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f5457i;

    /* renamed from: j  reason: collision with root package name */
    public long f5458j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5459k;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f5453e = context.getResources();
        this.f5454f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public Uri M() {
        return this.f5455g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long O(u6.e r8) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.a {
        /*
            r7 = this;
            android.net.Uri r0 = r8.f26048a
            r7.f5455g = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = r0.getLastPathSegment()
            r1.getClass()
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0037
            goto L_0x008d
        L_0x0037:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = r0.getPath()
            r1.getClass()
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r1.substring(r2)
        L_0x0054:
            java.lang.String r3 = r0.getHost()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0066
            java.lang.String r3 = ""
            goto L_0x006c
        L_0x0066:
            java.lang.String r5 = ":"
            java.lang.String r3 = j.f.a(r3, r5)
        L_0x006c:
            java.lang.String r1 = androidx.activity.e.a(r4, r3, r1)
            android.content.res.Resources r3 = r7.f5453e
            java.lang.String r4 = r7.f5454f
            java.lang.String r5 = "raw"
            int r1 = r3.getIdentifier(r1, r5, r4)
            if (r1 == 0) goto L_0x007d
            goto L_0x0098
        L_0x007d:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "Resource not found."
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x0085:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x008d:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x00fe }
            r1.getClass()     // Catch:{ NumberFormatException -> 0x00fe }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00fe }
        L_0x0098:
            r7.o(r8)
            android.content.res.Resources r3 = r7.f5453e
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)
            r7.f5456h = r1
            if (r1 == 0) goto L_0x00f2
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r3 = r1.getFileDescriptor()
            r0.<init>(r3)
            r7.f5457i = r0
            long r3 = r1.getStartOffset()     // Catch:{ IOException -> 0x00eb }
            r0.skip(r3)     // Catch:{ IOException -> 0x00eb }
            long r3 = r8.f26053f     // Catch:{ IOException -> 0x00eb }
            long r3 = r0.skip(r3)     // Catch:{ IOException -> 0x00eb }
            long r5 = r8.f26053f     // Catch:{ IOException -> 0x00eb }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
            long r3 = r8.f26054g
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            r7.f5458j = r3
            goto L_0x00dd
        L_0x00ce:
            long r0 = r1.getLength()
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            long r3 = r8.f26053f
            long r5 = r0 - r3
        L_0x00db:
            r7.f5458j = r5
        L_0x00dd:
            r7.f5459k = r2
            r7.p(r8)
            long r0 = r7.f5458j
            return r0
        L_0x00e5:
            java.io.EOFException r8 = new java.io.EOFException     // Catch:{ IOException -> 0x00eb }
            r8.<init>()     // Catch:{ IOException -> 0x00eb }
            throw r8     // Catch:{ IOException -> 0x00eb }
        L_0x00eb:
            r8 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            r0.<init>((java.io.IOException) r8)
            throw r0
        L_0x00f2:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r1 = "Resource is compressed: "
            java.lang.String r0 = androidx.appcompat.widget.x0.a(r1, r0)
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x00fe:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "Resource identifier must be an integer."
            r8.<init>((java.lang.String) r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.O(u6.e):long");
    }

    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5458j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        InputStream inputStream = this.f5457i;
        int i12 = e0.f26436a;
        int read = inputStream.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f5458j;
            if (j11 != -1) {
                this.f5458j = j11 - ((long) read);
            }
            m(read);
            return read;
        } else if (this.f5458j == -1) {
            return -1;
        } else {
            throw new a((IOException) new EOFException());
        }
    }

    public void close() throws a {
        this.f5455g = null;
        try {
            InputStream inputStream = this.f5457i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f5457i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f5456h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f5456h = null;
                if (this.f5459k) {
                    this.f5459k = false;
                    n();
                }
            } catch (IOException e10) {
                throw new a(e10);
            } catch (Throwable th) {
                this.f5456h = null;
                if (this.f5459k) {
                    this.f5459k = false;
                    n();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new a(e11);
        } catch (Throwable th2) {
            this.f5457i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f5456h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f5456h = null;
                if (this.f5459k) {
                    this.f5459k = false;
                    n();
                }
                throw th2;
            } catch (IOException e12) {
                throw new a(e12);
            } catch (Throwable th3) {
                this.f5456h = null;
                if (this.f5459k) {
                    this.f5459k = false;
                    n();
                }
                throw th3;
            }
        }
    }
}
