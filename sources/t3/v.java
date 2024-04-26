package t3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import n3.b;

/* compiled from: RecyclableBufferedInputStream */
public class v extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public volatile byte[] f25674a;

    /* renamed from: b  reason: collision with root package name */
    public int f25675b;

    /* renamed from: c  reason: collision with root package name */
    public int f25676c;

    /* renamed from: d  reason: collision with root package name */
    public int f25677d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f25678e;

    /* renamed from: f  reason: collision with root package name */
    public final b f25679f;

    /* compiled from: RecyclableBufferedInputStream */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public v(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f25679f = bVar;
        this.f25674a = (byte[]) bVar.f(65536, byte[].class);
    }

    public static IOException i() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10;
        int i11 = this.f25677d;
        if (i11 == -1 || this.f25678e - i11 >= (i10 = this.f25676c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f25677d = -1;
                this.f25678e = 0;
                this.f25675b = read;
            }
            return read;
        }
        if (i11 == 0 && i10 > bArr.length && this.f25675b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i10) {
                i10 = length;
            }
            byte[] bArr2 = (byte[]) this.f25679f.f(i10, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f25674a = bArr2;
            this.f25679f.put(bArr);
            bArr = bArr2;
        } else if (i11 > 0) {
            System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
        }
        int i12 = this.f25678e - this.f25677d;
        this.f25678e = i12;
        this.f25677d = 0;
        this.f25675b = 0;
        int read2 = inputStream.read(bArr, i12, bArr.length - i12);
        int i13 = this.f25678e;
        if (read2 > 0) {
            i13 += read2;
        }
        this.f25675b = i13;
        return read2;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f25674a == null || inputStream == null) {
            i();
            throw null;
        }
        return (this.f25675b - this.f25678e) + inputStream.available();
    }

    public void close() throws IOException {
        if (this.f25674a != null) {
            this.f25679f.put(this.f25674a);
            this.f25674a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        if (this.f25674a != null) {
            this.f25679f.put(this.f25674a);
            this.f25674a = null;
        }
    }

    public synchronized void mark(int i10) {
        this.f25676c = Math.max(this.f25676c, i10);
        this.f25677d = this.f25678e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f25674a     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f25678e     // Catch:{ all -> 0x003d }
            int r4 = r6.f25675b     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f25674a     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f25674a     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            i()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f25675b     // Catch:{ all -> 0x003d }
            int r2 = r6.f25678e     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f25678e = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            i()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f25674a != null) {
            int i10 = this.f25677d;
            if (-1 != i10) {
                this.f25678e = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f25678e + " markLimit: " + this.f25676c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0;
        }
        byte[] bArr = this.f25674a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i10 = this.f25675b;
                int i11 = this.f25678e;
                if (((long) (i10 - i11)) >= j10) {
                    this.f25678e = (int) (((long) i11) + j10);
                    return j10;
                }
                long j11 = ((long) i10) - ((long) i11);
                this.f25678e = i10;
                if (this.f25677d == -1 || j10 > ((long) this.f25676c)) {
                    long skip = inputStream.skip(j10 - j11);
                    if (skip > 0) {
                        this.f25677d = -1;
                    }
                    return j11 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j11;
                } else {
                    int i12 = this.f25675b;
                    int i13 = this.f25678e;
                    if (((long) (i12 - i13)) >= j10 - j11) {
                        this.f25678e = (int) ((((long) i13) + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + ((long) i12)) - ((long) i13);
                    this.f25678e = i12;
                    return j12;
                }
            } else {
                i();
                throw null;
            }
        } else {
            i();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f25674a     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f25678e     // Catch:{ all -> 0x008e }
            int r4 = r7.f25675b     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f25678e     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f25678e = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f25677d     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.a(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.f25674a     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.f25674a     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            i()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x0063:
            int r4 = r7.f25675b     // Catch:{ all -> 0x008e }
            int r5 = r7.f25678e     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f25678e     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f25678e = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            i()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008a:
            i()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0092
        L_0x0091:
            throw r8
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v.read(byte[], int, int):int");
    }
}
