package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s extends SSLSocket {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocket f8879a;

    public s(SSLSocket sSLSocket) {
        this.f8879a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f8879a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f8879a.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f8879a.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f8879a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f8879a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f8879a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f8879a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f8879a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f8879a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f8879a.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f8879a.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f8879a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f8879a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f8879a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f8879a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f8879a.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f8879a.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f8879a.getOutputStream();
    }

    public final int getPort() {
        return this.f8879a.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f8879a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f8879a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f8879a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f8879a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f8879a.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.f8879a.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f8879a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f8879a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f8879a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f8879a.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f8879a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f8879a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f8879a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f8879a.isBound();
    }

    public final boolean isClosed() {
        return this.f8879a.isClosed();
    }

    public final boolean isConnected() {
        return this.f8879a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f8879a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f8879a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f8879a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i10) throws IOException {
        this.f8879a.sendUrgentData(i10);
    }

    public final void setEnableSessionCreation(boolean z10) {
        this.f8879a.setEnableSessionCreation(z10);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f8879a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f8879a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f8879a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z10) throws SocketException {
        this.f8879a.setKeepAlive(z10);
    }

    public final void setNeedClientAuth(boolean z10) {
        this.f8879a.setNeedClientAuth(z10);
    }

    public final void setOOBInline(boolean z10) throws SocketException {
        this.f8879a.setOOBInline(z10);
    }

    public final void setPerformancePreferences(int i10, int i11, int i12) {
        this.f8879a.setPerformancePreferences(i10, i11, i12);
    }

    public final synchronized void setReceiveBufferSize(int i10) throws SocketException {
        this.f8879a.setReceiveBufferSize(i10);
    }

    public final void setReuseAddress(boolean z10) throws SocketException {
        this.f8879a.setReuseAddress(z10);
    }

    public final synchronized void setSendBufferSize(int i10) throws SocketException {
        this.f8879a.setSendBufferSize(i10);
    }

    public final void setSoLinger(boolean z10, int i10) throws SocketException {
        this.f8879a.setSoLinger(z10, i10);
    }

    public final synchronized void setSoTimeout(int i10) throws SocketException {
        this.f8879a.setSoTimeout(i10);
    }

    public final void setTcpNoDelay(boolean z10) throws SocketException {
        this.f8879a.setTcpNoDelay(z10);
    }

    public final void setTrafficClass(int i10) throws SocketException {
        this.f8879a.setTrafficClass(i10);
    }

    public final void setUseClientMode(boolean z10) {
        this.f8879a.setUseClientMode(z10);
    }

    public final void setWantClientAuth(boolean z10) {
        this.f8879a.setWantClientAuth(z10);
    }

    public final void shutdownInput() throws IOException {
        this.f8879a.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f8879a.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.f8879a.startHandshake();
    }

    public final String toString() {
        return this.f8879a.toString();
    }

    public final void connect(SocketAddress socketAddress, int i10) throws IOException {
        this.f8879a.connect(socketAddress, i10);
    }
}
