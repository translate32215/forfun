package com.startapp.networkTest.data.radio;

import com.startapp.networkTest.enums.CellConnectionStatus;
import com.startapp.networkTest.enums.CellNetworkTypes;
import java.io.Serializable;

/* compiled from: Sta */
public class CellInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 9173460790954950419L;
    public int Arfcn = -1;
    public int CdmaBaseStationId = -1;
    public int CdmaBaseStationLatitude = Integer.MAX_VALUE;
    public int CdmaBaseStationLongitude = Integer.MAX_VALUE;
    public int CdmaDbm = Integer.MAX_VALUE;
    public int CdmaEcio = Integer.MAX_VALUE;
    public int CdmaNetworkId = -1;
    public int CdmaSystemId = -1;
    public CellConnectionStatus CellConnectionStatus = CellConnectionStatus.Unknown;
    public long CellId = -1;
    public long CellInfoAge = -1;
    public CellNetworkTypes CellNetworkType = CellNetworkTypes.Unknown;
    public int Cid = -1;
    public int Dbm = Integer.MAX_VALUE;
    public int EvdoDbm = Integer.MAX_VALUE;
    public int EvdoEcio = Integer.MAX_VALUE;
    public int EvdoSnr = -1;
    public int GsmBsic = -1;
    public boolean IsRegistered;
    public int Lac = -1;
    public int LteBand = -1;
    public int LteCqi = -1;
    public float LteDonwloadFrequency = 0.0f;
    public int LteDownloadEarfcn = -1;
    public int LtePci = -1;
    public int LteRsrq = Integer.MAX_VALUE;
    public int LteRssi = Integer.MAX_VALUE;
    public int LteRssnr = Integer.MAX_VALUE;
    public int LteTac = -1;
    public int LteTimingAdvance = -1;
    public int LteUploadEarfcn = -1;
    public float LteUploadFrequency = 0.0f;
    public int Mcc = -1;
    public int Mnc = -1;
    public int NrCsiRsrp = Integer.MAX_VALUE;
    public int NrCsiRsrq = Integer.MAX_VALUE;
    public int NrCsiSinr = Integer.MAX_VALUE;
    public int NrSsRsrp = Integer.MAX_VALUE;
    public int NrSsRsrq = Integer.MAX_VALUE;
    public int NrSsSinr = Integer.MAX_VALUE;
    public int Psc = -1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
