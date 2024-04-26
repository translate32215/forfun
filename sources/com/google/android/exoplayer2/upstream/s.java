package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import u6.c;
import u6.e;

/* compiled from: UdpDataSource */
public final class s extends c {

    /* renamed from: e  reason: collision with root package name */
    public final int f5561e = 8000;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f5562f;

    /* renamed from: g  reason: collision with root package name */
    public final DatagramPacket f5563g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f5564h;

    /* renamed from: i  reason: collision with root package name */
    public DatagramSocket f5565i;

    /* renamed from: j  reason: collision with root package name */
    public MulticastSocket f5566j;

    /* renamed from: k  reason: collision with root package name */
    public InetAddress f5567k;

    /* renamed from: l  reason: collision with root package name */
    public InetSocketAddress f5568l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5569m;

    /* renamed from: n  reason: collision with root package name */
    public int f5570n;

    /* compiled from: UdpDataSource */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public s() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f5562f = bArr;
        this.f5563g = new DatagramPacket(bArr, 0, 2000);
    }

    public Uri M() {
        return this.f5564h;
    }

    public long O(e eVar) throws a {
        Uri uri = eVar.f26048a;
        this.f5564h = uri;
        String host = uri.getHost();
        int port = this.f5564h.getPort();
        o(eVar);
        try {
            this.f5567k = InetAddress.getByName(host);
            this.f5568l = new InetSocketAddress(this.f5567k, port);
            if (this.f5567k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f5568l);
                this.f5566j = multicastSocket;
                multicastSocket.joinGroup(this.f5567k);
                this.f5565i = this.f5566j;
            } else {
                this.f5565i = new DatagramSocket(this.f5568l);
            }
            try {
                this.f5565i.setSoTimeout(this.f5561e);
                this.f5569m = true;
                p(eVar);
                return -1;
            } catch (SocketException e10) {
                throw new a(e10);
            }
        } catch (IOException e11) {
            throw new a(e11);
        }
    }

    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5570n == 0) {
            try {
                this.f5565i.receive(this.f5563g);
                int length = this.f5563g.getLength();
                this.f5570n = length;
                m(length);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int length2 = this.f5563g.getLength();
        int i12 = this.f5570n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f5562f, length2 - i12, bArr, i10, min);
        this.f5570n -= min;
        return min;
    }

    public void close() {
        this.f5564h = null;
        MulticastSocket multicastSocket = this.f5566j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f5567k);
            } catch (IOException unused) {
            }
            this.f5566j = null;
        }
        DatagramSocket datagramSocket = this.f5565i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5565i = null;
        }
        this.f5567k = null;
        this.f5568l = null;
        this.f5570n = 0;
        if (this.f5569m) {
            this.f5569m = false;
            n();
        }
    }
}
