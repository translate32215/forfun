package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m7 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public SSLSocketFactory f7444a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k7 f7445b;

    public m7(k7 k7Var) {
        this.f7445b = k7Var;
    }

    public final Socket a(Socket socket) throws SocketException {
        int i10 = this.f7445b.f7208o;
        if (i10 > 0) {
            socket.setReceiveBufferSize(i10);
        }
        this.f7445b.f7209p.add(socket);
        return socket;
    }

    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.f7444a.createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f7444a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f7444a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.f7444a.createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.f7444a.createSocket(str, i10, inetAddress, i11);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.f7444a.createSocket(inetAddress, i10);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.f7444a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(createSocket);
        return createSocket;
    }
}
