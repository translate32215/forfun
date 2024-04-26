package org.cybergarage.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import we.d;
import we.f;

public abstract class Parser {
    public abstract Node parse(InputStream inputStream) throws ParserException;

    public Node parse(URL url) throws ParserException {
        String host = url.getHost();
        int port = url.getPort();
        if (port == -1) {
            port = 80;
        }
        String path = url.getPath();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Length", "0");
            if (host != null) {
                httpURLConnection.setRequestProperty("HOST", host);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            Node parse = parse(inputStream);
            inputStream.close();
            httpURLConnection.disconnect();
            return parse;
        } catch (Exception unused) {
            d dVar = new d();
            dVar.f27214f = "GET";
            dVar.f27215g = path;
            f A = dVar.A(host, port);
            if (A.y()) {
                return parse((InputStream) new ByteArrayInputStream(new String((byte[]) A.f13214e).getBytes()));
            }
            throw new ParserException("HTTP comunication failed: no answer from peer.Unable to retrive resoure -> " + url.toString());
        }
    }

    public Node parse(File file) throws ParserException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Node parse = parse((InputStream) fileInputStream);
            fileInputStream.close();
            return parse;
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }

    public Node parse(String str) throws ParserException {
        try {
            return parse((InputStream) new ByteArrayInputStream(str.getBytes()));
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }
}
