package com.adcolony.sdk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.f0;
import t2.n1;
import t2.y;

public class n0 {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList<Runnable> f4628a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4629b;

    public class a implements f0 {

        /* renamed from: com.adcolony.sdk.n0$a$a  reason: collision with other inner class name */
        public class C0066a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4631a;

            public C0066a(g gVar) {
                this.f4631a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4631a;
                n0Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                String optString = jSONObject.optString("filepath");
                String optString2 = jSONObject.optString("data");
                boolean equals = jSONObject.optString("encoding").equals("utf8");
                JSONObject a10 = n1.a();
                try {
                    n0Var.d(optString, optString2, equals);
                    r0.k(a10, "success", true);
                    gVar.a(a10).b();
                } catch (IOException unused) {
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public a() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new C0066a(gVar));
        }
    }

    public class b implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4634a;

            public a(g gVar) {
                this.f4634a = gVar;
            }

            public void run() {
                File file = new File(this.f4634a.f4485b.optString("filepath"));
                n0 n0Var = n0.this;
                g gVar = this.f4634a;
                n0Var.getClass();
                f.d().q().c();
                JSONObject jSONObject = new JSONObject();
                if (n0Var.e(file)) {
                    y.a(jSONObject, "success", true, gVar, jSONObject);
                } else {
                    y.a(jSONObject, "success", false, gVar, jSONObject);
                }
                n0.b(n0.this);
            }
        }

        public b() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class c implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4637a;

            public a(g gVar) {
                this.f4637a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4637a;
                n0Var.getClass();
                String optString = gVar.f4485b.optString("filepath");
                JSONObject a10 = n1.a();
                String[] list = new File(optString).list();
                if (list != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : list) {
                        JSONObject jSONObject = new JSONObject();
                        r0.e(jSONObject, "filename", str);
                        if (new File(j.f.a(optString, str)).isDirectory()) {
                            r0.k(jSONObject, "is_folder", true);
                        } else {
                            r0.k(jSONObject, "is_folder", false);
                        }
                        jSONArray.put(jSONObject);
                    }
                    r0.k(a10, "success", true);
                    r0.f(a10, "entries", jSONArray);
                    gVar.a(a10).b();
                } else {
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public c() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class d implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4640a;

            public a(g gVar) {
                this.f4640a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4640a;
                n0Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                String optString = jSONObject.optString("filepath");
                String optString2 = jSONObject.optString("encoding");
                boolean z10 = optString2 != null && optString2.equals("utf8");
                JSONObject a10 = n1.a();
                try {
                    StringBuilder a11 = n0Var.a(optString, z10);
                    r0.k(a10, "success", true);
                    r0.e(a10, "data", a11.toString());
                    gVar.a(a10).b();
                } catch (IOException unused) {
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public d() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class e implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4643a;

            public a(g gVar) {
                this.f4643a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4643a;
                n0Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                String optString = jSONObject.optString("filepath");
                String optString2 = jSONObject.optString("new_filepath");
                JSONObject a10 = n1.a();
                try {
                    if (new File(optString).renameTo(new File(optString2))) {
                        r0.k(a10, "success", true);
                        gVar.a(a10).b();
                    } else {
                        r0.k(a10, "success", false);
                        gVar.a(a10).b();
                    }
                } catch (Exception unused) {
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public e() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class f implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4646a;

            public a(g gVar) {
                this.f4646a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4646a;
                n0Var.getClass();
                String optString = gVar.f4485b.optString("filepath");
                f.d().q().c();
                JSONObject jSONObject = new JSONObject();
                try {
                    r0.k(jSONObject, "result", new File(optString).exists());
                    r0.k(jSONObject, "success", true);
                    gVar.a(jSONObject).b();
                } catch (Exception e10) {
                    r0.k(jSONObject, "result", false);
                    r0.k(jSONObject, "success", false);
                    gVar.a(jSONObject).b();
                    e10.printStackTrace();
                }
                n0.b(n0.this);
            }
        }

        public f() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class g implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4649a;

            public a(g gVar) {
                this.f4649a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4649a;
                n0Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                String optString = jSONObject.optString("filepath");
                JSONObject a10 = n1.a();
                try {
                    int optInt = jSONObject.optInt("offset");
                    int optInt2 = jSONObject.optInt("size");
                    boolean optBoolean = jSONObject.optBoolean("gunzip");
                    String optString2 = jSONObject.optString("output_filepath");
                    InputStream c0Var = new c0(new FileInputStream(optString), optInt, optInt2);
                    if (optBoolean) {
                        c0Var = new GZIPInputStream(c0Var, 1024);
                    }
                    if (optString2.equals("")) {
                        StringBuilder sb2 = new StringBuilder(c0Var.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c0Var.read(bArr, 0, 1024);
                            if (read < 0) {
                                break;
                            }
                            sb2.append(new String(bArr, 0, read, "ISO-8859-1"));
                        }
                        r0.j(a10, "size", sb2.length());
                        r0.e(a10, "data", sb2.toString());
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(optString2);
                        byte[] bArr2 = new byte[1024];
                        int i10 = 0;
                        while (true) {
                            int read2 = c0Var.read(bArr2, 0, 1024);
                            if (read2 < 0) {
                                break;
                            }
                            fileOutputStream.write(bArr2, 0, read2);
                            i10 += read2;
                        }
                        fileOutputStream.close();
                        r0.j(a10, "size", i10);
                    }
                    c0Var.close();
                    r0.k(a10, "success", true);
                    gVar.a(a10).b();
                } catch (IOException unused) {
                    y.a(a10, "success", false, gVar, a10);
                } catch (OutOfMemoryError unused2) {
                    f.d().l().e(0, 0, "Out of memory error - disabling AdColony.", false);
                    f.d().B = true;
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public g() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class h implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4652a;

            public a(g gVar) {
                this.f4652a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4652a;
                n0Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                String optString = jSONObject.optString("filepath");
                String optString2 = jSONObject.optString("bundle_path");
                JSONArray optJSONArray = jSONObject.optJSONArray("bundle_filenames");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONObject a10 = n1.a();
                try {
                    File file = new File(optString2);
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    byte[] bArr = new byte[32];
                    randomAccessFile.readInt();
                    int readInt = randomAccessFile.readInt();
                    JSONArray jSONArray = new JSONArray();
                    byte[] bArr2 = new byte[1024];
                    int i10 = 0;
                    while (i10 < readInt) {
                        randomAccessFile.seek((long) ((i10 * 44) + 8));
                        randomAccessFile.read(bArr);
                        randomAccessFile.readInt();
                        int readInt2 = randomAccessFile.readInt();
                        int readInt3 = randomAccessFile.readInt();
                        jSONArray.put(readInt3);
                        byte[] bArr3 = bArr;
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(optString);
                            String str = optString;
                            sb2.append(optJSONArray.get(i10));
                            String sb3 = sb2.toString();
                            int i11 = readInt;
                            JSONArray jSONArray2 = jSONArray;
                            randomAccessFile.seek((long) readInt2);
                            FileOutputStream fileOutputStream = new FileOutputStream(sb3);
                            int i12 = readInt3 / 1024;
                            int i13 = readInt3 % 1024;
                            int i14 = 0;
                            while (i14 < i12) {
                                randomAccessFile.read(bArr2, 0, 1024);
                                fileOutputStream.write(bArr2, 0, 1024);
                                i14++;
                                optJSONArray = optJSONArray;
                            }
                            randomAccessFile.read(bArr2, 0, i13);
                            fileOutputStream.write(bArr2, 0, i13);
                            fileOutputStream.close();
                            i10++;
                            readInt = i11;
                            bArr = bArr3;
                            optString = str;
                            jSONArray = jSONArray2;
                            optJSONArray = optJSONArray;
                        } catch (JSONException unused) {
                            f.d().l().e(0, 0, "Couldn't extract file name at index " + i10 + " unpacking ad unit bundle at " + optString2, false);
                            r0.k(a10, "success", false);
                            gVar.a(a10).b();
                        }
                    }
                    randomAccessFile.close();
                    file.delete();
                    r0.k(a10, "success", true);
                    r0.f(a10, "file_sizes", jSONArray);
                    gVar.a(a10).b();
                } catch (IOException unused2) {
                    p.f.a(0, 0, j.f.a("Failed to find or open ad unit bundle at path: ", optString2), true);
                    y.a(a10, "success", false, gVar, a10);
                } catch (OutOfMemoryError unused3) {
                    f.d().l().e(0, 0, "Out of memory error - disabling AdColony.", false);
                    f.d().B = true;
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public h() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public class i implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4655a;

            public a(g gVar) {
                this.f4655a = gVar;
            }

            public void run() {
                n0 n0Var = n0.this;
                g gVar = this.f4655a;
                n0Var.getClass();
                String optString = gVar.f4485b.optString("filepath");
                JSONObject a10 = n1.a();
                try {
                    if (new File(optString).mkdir()) {
                        r0.k(a10, "success", true);
                        gVar.a(a10).b();
                    } else {
                        r0.k(a10, "success", false);
                    }
                } catch (Exception unused) {
                    y.a(a10, "success", false, gVar, a10);
                }
                n0.b(n0.this);
            }
        }

        public i() {
        }

        public void a(g gVar) {
            n0.c(n0.this, new a(gVar));
        }
    }

    public static void b(n0 n0Var) {
        n0Var.f4629b = false;
        if (!n0Var.f4628a.isEmpty()) {
            n0Var.f4629b = true;
            n0Var.f4628a.removeLast().run();
        }
    }

    public static void c(n0 n0Var, Runnable runnable) {
        if (!n0Var.f4628a.isEmpty() || n0Var.f4629b) {
            n0Var.f4628a.push(runnable);
            return;
        }
        n0Var.f4629b = true;
        runnable.run();
    }

    public StringBuilder a(String str, boolean z10) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder((int) file.length());
        if (z10) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append("\n");
            } else {
                bufferedReader.close();
                return sb2;
            }
        }
    }

    public void d(String str, String str2, boolean z10) throws IOException {
        BufferedWriter bufferedWriter = z10 ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8")) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public boolean e(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return e(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void f() {
        f.c("FileSystem.save", new a());
        f.c("FileSystem.delete", new b());
        f.c("FileSystem.listing", new c());
        f.c("FileSystem.load", new d());
        f.c("FileSystem.rename", new e());
        f.c("FileSystem.exists", new f());
        f.c("FileSystem.extract", new g());
        f.c("FileSystem.unpack_bundle", new h());
        f.c("FileSystem.create_directory", new i());
    }
}
