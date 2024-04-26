package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import u6.c;
import u6.e;
import v6.e0;

/* compiled from: ContentDataSource */
public final class b extends c {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f5465e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f5466f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f5467g;

    /* renamed from: h  reason: collision with root package name */
    public FileInputStream f5468h;

    /* renamed from: i  reason: collision with root package name */
    public long f5469i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5470j;

    /* compiled from: ContentDataSource */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(Context context) {
        super(false);
        this.f5465e = context.getContentResolver();
    }

    public Uri M() {
        return this.f5466f;
    }

    public long O(e eVar) throws a {
        try {
            Uri uri = eVar.f26048a;
            this.f5466f = uri;
            o(eVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f5465e.openAssetFileDescriptor(uri, "r");
            this.f5467g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f5468h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(eVar.f26053f + startOffset) - startOffset;
                if (skip == eVar.f26053f) {
                    long j10 = eVar.f26054g;
                    if (j10 != -1) {
                        this.f5469i = j10;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f5469i = -1;
                            } else {
                                long position = size - channel.position();
                                this.f5469i = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j11 = length - skip;
                            this.f5469i = j11;
                            if (j11 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f5470j = true;
                    p(eVar);
                    return this.f5469i;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + uri);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5469i;
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
        FileInputStream fileInputStream = this.f5468h;
        int i12 = e0.f26436a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f5469i;
            if (j11 != -1) {
                this.f5469i = j11 - ((long) read);
            }
            m(read);
            return read;
        } else if (this.f5469i == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }

    public void close() throws a {
        this.f5466f = null;
        try {
            FileInputStream fileInputStream = this.f5468h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f5468h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f5467g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f5467g = null;
                if (this.f5470j) {
                    this.f5470j = false;
                    n();
                }
            } catch (IOException e10) {
                throw new a(e10);
            } catch (Throwable th) {
                this.f5467g = null;
                if (this.f5470j) {
                    this.f5470j = false;
                    n();
                }
                throw th;
            }
        } catch (IOException e11) {
            throw new a(e11);
        } catch (Throwable th2) {
            this.f5468h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f5467g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f5467g = null;
                if (this.f5470j) {
                    this.f5470j = false;
                    n();
                }
                throw th2;
            } catch (IOException e12) {
                throw new a(e12);
            } catch (Throwable th3) {
                this.f5467g = null;
                if (this.f5470j) {
                    this.f5470j = false;
                    n();
                }
                throw th3;
            }
        }
    }
}
