package n1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.activity.e;
import j.f;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import n1.h;

/* compiled from: MultiDexExtractor */
public final class g implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f21820a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21821b;

    /* renamed from: c  reason: collision with root package name */
    public final File f21822c;

    /* renamed from: d  reason: collision with root package name */
    public final RandomAccessFile f21823d;

    /* renamed from: e  reason: collision with root package name */
    public final FileChannel f21824e;

    /* renamed from: f  reason: collision with root package name */
    public final FileLock f21825f;

    /* compiled from: MultiDexExtractor */
    public static class a extends File {

        /* renamed from: a  reason: collision with root package name */
        public long f21826a = -1;

        public a(File file, String str) {
            super(file, str);
        }
    }

    public g(File file, File file2) throws IOException {
        StringBuilder a10 = android.support.v4.media.a.a("MultiDexExtractor(");
        a10.append(file.getPath());
        a10.append(", ");
        a10.append(file2.getPath());
        a10.append(")");
        Log.i("MultiDex", a10.toString());
        this.f21820a = file;
        this.f21822c = file2;
        this.f21821b = o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f21823d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f21824e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f21825f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                a(this.f21824e);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                a(this.f21824e);
                throw e;
            } catch (Error e12) {
                e = e12;
                a(this.f21824e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            a(this.f21823d);
            throw e13;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(f.a("tmp-", str), ".zip", file.getParentFile());
        StringBuilder a10 = android.support.v4.media.a.a("Extracting ");
        a10.append(createTempFile.getPath());
        Log.i("MultiDex", a10.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    a(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            a(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    public static long i(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* JADX INFO: finally extract failed */
    public static long o(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            h.a a10 = h.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = a10.f21828b;
            randomAccessFile.seek(a10.f21827a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j10));
            while (true) {
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j10 -= (long) read;
                if (j10 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void v(Context context, String str, long j10, long j11, List<a> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j10);
        edit.putLong(e.a(new StringBuilder(), str, "crc"), j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (a next : list) {
            edit.putLong(str + "dex.crc." + i10, next.f21826a);
            edit.putLong(str + "dex.time." + i10, next.lastModified());
            i10++;
        }
        edit.commit();
    }

    public void close() throws IOException {
        this.f21825f.release();
        this.f21824e.close();
        this.f21823d.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x007e A[SYNTHETIC, Splitter:B:10:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<? extends java.io.File> s(android.content.Context r13, java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            java.io.File r1 = r12.f21820a
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r15)
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r12.f21825f
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x00d6
            if (r15 != 0) goto L_0x009c
            java.io.File r0 = r12.f21820a
            long r2 = r12.f21821b
            r4 = 4
            java.lang.String r5 = "multidex.version"
            android.content.SharedPreferences r4 = r13.getSharedPreferences(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r6 = "timestamp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = -1
            long r8 = r4.getLong(r5, r6)
            long r10 = i(r0)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r5 = "crc"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            long r4 = r4.getLong(r0, r6)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 != 0) goto L_0x009c
            java.util.List r13 = r12.t(r13, r14)     // Catch:{ IOException -> 0x0083 }
            goto L_0x00bc
        L_0x0083:
            r15 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r15)
            java.util.List r15 = r12.u()
            java.io.File r0 = r12.f21820a
            long r4 = i(r0)
            long r6 = r12.f21821b
            r2 = r13
            r3 = r14
            r8 = r15
            v(r2, r3, r4, r6, r8)
            goto L_0x00bb
        L_0x009c:
            if (r15 == 0) goto L_0x00a4
            java.lang.String r15 = "Forced extraction must be performed."
            android.util.Log.i(r1, r15)
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r15 = "Detected that extraction must be performed."
            android.util.Log.i(r1, r15)
        L_0x00a9:
            java.util.List r15 = r12.u()
            java.io.File r0 = r12.f21820a
            long r4 = i(r0)
            long r6 = r12.f21821b
            r2 = r13
            r3 = r14
            r8 = r15
            v(r2, r3, r4, r6, r8)
        L_0x00bb:
            r13 = r15
        L_0x00bc:
            java.lang.String r14 = "load found "
            java.lang.StringBuilder r14 = android.support.v4.media.a.a(r14)
            int r15 = r13.size()
            r14.append(r15)
            java.lang.String r15 = " secondary dex files"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.i(r1, r14)
            return r13
        L_0x00d6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "MultiDexExtractor was closed"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.g.s(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public final List<a> t(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f21820a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + -1);
        int i11 = 2;
        while (i11 <= i10) {
            a aVar = new a(this.f21822c, k0.g.a(str3, i11, ".zip"));
            if (aVar.isFile()) {
                aVar.f21826a = o(aVar);
                long j10 = sharedPreferences.getLong(str2 + "dex.crc." + i11, -1);
                long j11 = sharedPreferences.getLong(str2 + "dex.time." + i11, -1);
                long lastModified = aVar.lastModified();
                if (j11 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (j10 == aVar.f21826a) {
                        arrayList.add(aVar);
                        i11++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str2 + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + aVar.f21826a);
            }
            StringBuilder a10 = android.support.v4.media.a.a("Missing extracted secondary dex file '");
            a10.append(aVar.getPath());
            a10.append("'");
            throw new IOException(a10.toString());
        }
        return arrayList;
    }

    public final List<a> u() throws IOException {
        a aVar;
        boolean z10;
        String str = this.f21820a.getName() + ".classes";
        File[] listFiles = this.f21822c.listFiles(new f(this));
        if (listFiles == null) {
            StringBuilder a10 = android.support.v4.media.a.a("Failed to list secondary dex dir content (");
            a10.append(this.f21822c.getPath());
            a10.append(").");
            Log.w("MultiDex", a10.toString());
        } else {
            for (File file : listFiles) {
                StringBuilder a11 = android.support.v4.media.a.a("Trying to delete old file ");
                a11.append(file.getPath());
                a11.append(" of size ");
                a11.append(file.length());
                Log.i("MultiDex", a11.toString());
                if (!file.delete()) {
                    StringBuilder a12 = android.support.v4.media.a.a("Failed to delete old file ");
                    a12.append(file.getPath());
                    Log.w("MultiDex", a12.toString());
                } else {
                    StringBuilder a13 = android.support.v4.media.a.a("Deleted old file ");
                    a13.append(file.getPath());
                    Log.i("MultiDex", a13.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f21820a);
        int i10 = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                aVar = new a(this.f21822c, str + i10 + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i11 = 0;
                z10 = false;
                while (i11 < 3 && !z10) {
                    i11++;
                    d(zipFile, entry, aVar, str);
                    aVar.f21826a = o(aVar);
                    z10 = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(aVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(aVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(aVar.f21826a);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (z10) {
                    i10++;
                    entry = zipFile.getEntry("classes" + i10 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to close resource", e10);
            }
            return arrayList;
        } catch (IOException e11) {
            Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e11);
            z10 = false;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e12) {
                Log.w("MultiDex", "Failed to close resource", e12);
            }
            throw th;
        }
    }
}
