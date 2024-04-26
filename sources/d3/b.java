package d3;

import android.content.Context;
import android.support.v4.media.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12959a;

    public b(Context context) {
        this.f12959a = context.getApplicationContext();
    }

    public static String a(String str, a aVar, boolean z10) {
        String str2;
        StringBuilder a10 = a.a("lottie_cache_");
        a10.append(str.replaceAll("\\W+", ""));
        if (z10) {
            aVar.getClass();
            str2 = ".temp" + aVar.f12958a;
        } else {
            str2 = aVar.f12958a;
        }
        a10.append(str2);
        return a10.toString();
    }

    public final File b() {
        File file = new File(this.f12959a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File c(String str, InputStream inputStream, a aVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(b(), a(str, aVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
