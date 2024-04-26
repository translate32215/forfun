package o1;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import h3.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.concurrent.ScheduledFuture;
import k3.e;
import m3.w;
import s8.d;
import s8.i;
import ud.k;
import we.f;
import y3.c;

/* compiled from: NavDeepLinkRequest.kt */
public class p implements c, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22794a;

    /* renamed from: b  reason: collision with root package name */
    public Object f22795b;

    /* renamed from: c  reason: collision with root package name */
    public Object f22796c;

    /* renamed from: d  reason: collision with root package name */
    public Object f22797d;

    public p(r7.d dVar, String str, ScheduledFuture scheduledFuture) {
        this.f22794a = 3;
        this.f22795b = dVar;
        this.f22796c = str;
        this.f22797d = scheduledFuture;
    }

    public boolean a() {
        try {
            Object obj = this.f22796c;
            if (((InputStream) obj) != null) {
                ((InputStream) obj).close();
            }
            Object obj2 = this.f22797d;
            if (((OutputStream) obj2) != null) {
                ((OutputStream) obj2).close();
            }
            ((Socket) this.f22795b).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        b bVar = (b) this.f22795b;
        bVar.f18881a = t10;
        bVar.f18882b = t11;
        return this.f22797d;
    }

    public boolean c() {
        Socket socket = (Socket) this.f22795b;
        try {
            this.f22796c = socket.getInputStream();
            this.f22797d = socket.getOutputStream();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean d(f fVar, InputStream inputStream, long j10, long j11, boolean z10) {
        f fVar2 = fVar;
        InputStream inputStream2 = inputStream;
        long j12 = j11;
        fVar2.r(Calendar.getInstance());
        OutputStream outputStream = (OutputStream) this.f22797d;
        try {
            fVar2.q(j12);
            outputStream.write(fVar.v().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z10) {
                outputStream.flush();
                return true;
            }
            boolean k10 = fVar.k();
            if (0 < j10) {
                inputStream.skip(j10);
            }
            byte[] bArr = new byte[524288];
            long j13 = (long) 524288;
            int read = inputStream2.read(bArr, 0, (int) (j13 < j12 ? j13 : j12));
            long j14 = 0;
            while (true) {
                if (read <= 0) {
                    break;
                } else if (j14 >= j12) {
                    break;
                } else {
                    if (k10) {
                        outputStream.write(Long.toHexString((long) read).getBytes());
                        outputStream.write("\r\n".getBytes());
                    }
                    outputStream.write(bArr, 0, read);
                    if (k10) {
                        outputStream.write("\r\n".getBytes());
                    }
                    j14 += (long) read;
                    long j15 = j12 - j14;
                    if (j13 < j15) {
                        j15 = j13;
                    }
                    read = inputStream2.read(bArr, 0, (int) j15);
                }
            }
            if (k10) {
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean e(f fVar, byte[] bArr, long j10, long j11, boolean z10) {
        fVar.r(Calendar.getInstance());
        OutputStream outputStream = (OutputStream) this.f22797d;
        try {
            fVar.q(j11);
            outputStream.write(fVar.v().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z10) {
                outputStream.flush();
                return true;
            }
            boolean k10 = fVar.k();
            if (k10) {
                outputStream.write(Long.toHexString(j11).getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.write(bArr, (int) j10, (int) j11);
            if (k10) {
                outputStream.write("\r\n".getBytes());
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void finalize() {
        switch (this.f22794a) {
            case 4:
                a();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public w<byte[]> m(w<Drawable> wVar, e eVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c) this.f22796c).m(t3.d.d(((BitmapDrawable) drawable).getBitmap(), (n3.e) this.f22795b), eVar);
        }
        if (drawable instanceof x3.c) {
            return ((c) this.f22797d).m(wVar, eVar);
        }
        return null;
    }

    public void s(i iVar) {
        r7.d dVar = (r7.d) this.f22795b;
        String str = (String) this.f22796c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f22797d;
        synchronized (dVar.f24690a) {
            dVar.f24690a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f22794a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("NavDeepLinkRequest");
                sb2.append("{");
                if (((Uri) this.f22795b) != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf((Uri) this.f22795b));
                }
                if (((String) this.f22796c) != null) {
                    sb2.append(" action=");
                    sb2.append((String) this.f22796c);
                }
                if (((String) this.f22797d) != null) {
                    sb2.append(" mimetype=");
                    sb2.append((String) this.f22797d);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                k.e(sb3, "sb.toString()");
                return sb3;
            default:
                return super.toString();
        }
    }

    public p(Object obj) {
        this.f22794a = 1;
        this.f22795b = new b();
        this.f22797d = null;
        this.f22797d = obj;
    }

    public p(n3.e eVar, c cVar, c cVar2) {
        this.f22794a = 2;
        this.f22795b = eVar;
        this.f22796c = cVar;
        this.f22797d = cVar2;
    }

    public p(Socket socket) {
        this.f22794a = 4;
        this.f22795b = null;
        this.f22796c = null;
        this.f22797d = null;
        this.f22795b = socket;
        c();
    }

    public p(Uri uri, String str, String str2) {
        this.f22794a = 0;
        this.f22795b = uri;
        this.f22796c = str;
        this.f22797d = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        this.f22794a = 0;
    }
}
