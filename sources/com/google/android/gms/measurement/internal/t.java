package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class t extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f8880a;

    public t(SSLSocketFactory sSLSocketFactory) {
        this.f8880a = sSLSocketFactory;
    }

    public final Socket createSocket() throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket());
    }

    public final String[] getDefaultCipherSuites() {
        return this.f8880a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f8880a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i10) throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket(str, i10));
    }

    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket(str, i10, inetAddress, i11));
    }

    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket(inetAddress, i10));
    }

    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket(inetAddress, i10, inetAddress2, i11));
    }

    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return new s((SSLSocket) this.f8880a.createSocket(socket, str, i10, z10));
    }
}
