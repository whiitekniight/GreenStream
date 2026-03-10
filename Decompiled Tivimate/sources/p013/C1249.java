package p013;

import java.util.Arrays;
import p005j$.util.Objects;
import p067.AbstractC1947;
import p067.C1942;
import p067.C1973;
import p067.C1978;
import p067.InterfaceC1948;

/* JADX INFO: renamed from: ʻʼ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1249 implements InterfaceC1948 {

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final C1978 f4095 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final C1978 f4096 = null;

    /* JADX INFO: renamed from: ʽ */
    public final long f4097;

    /* JADX INFO: renamed from: ˈ */
    public final long f4098;

    /* JADX INFO: renamed from: ˑﹳ */
    public final byte[] f4099;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f4100;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f4101;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f4102;

    static {
        C1973 r0 = new C1973();
        r0.f6803 = AbstractC1947.m4962("application/id3");
        f4095 = new C1978(r0);
        C1973 r02 = new C1973();
        r02.f6803 = AbstractC1947.m4962("application/x-scte35");
        f4096 = new C1978(r02);
    }

    public C1249(String r1, String r2, long r3, long r5, byte[] r7) {
        this.f4101 = r1;
        this.f4100 = r2;
        this.f4097 = r3;
        this.f4098 = r5;
        this.f4099 = r7;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L21:
        return false;
    L8:
        if (C1249.class != r7.getClass()) goto L21;
        C1249 r72 = (C1249) r7;
        if (this.f4097 != r72.f4097) goto L21;
        if (this.f4098 != r72.f4098) goto L21;
        if (Objects.equals(this.f4101, r72.f4101) == false) goto L21;
        if (Objects.equals(this.f4100, r72.f4100) == false) goto L21;
        if (Arrays.equals(this.f4099, r72.f4099) == false) goto L21;
        return true;
    }

    public final int hashCode() {
        if (this.f4102 != 0) goto L13;
        int r0 = 0;
        String r1 = this.f4101;
        if (r1 == null) goto L7;
        int r12 = r1.hashCode();
    L8:
        int r2 = (527 + r12) * 31;
        String r13 = this.f4100;
        if (r13 == null) goto L11;
        r0 = r13.hashCode();
    L11:
        int r22 = (r2 + r0) * 31;
        long r02 = this.f4097;
        int r23 = (r22 + ((int) (r02 ^ (r02 >>> 32)))) * 31;
        long r03 = this.f4098;
        this.f4102 = Arrays.hashCode(this.f4099) + ((r23 + ((int) (r03 ^ (r03 >>> 32)))) * 31);
        goto L13
    L7:
        r12 = 0;
    L13:
        return this.f4102;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f4101 + ", id=" + this.f4098 + ", durationMs=" + this.f4097 + ", value=" + this.f4100;
    }

    @Override // p067.InterfaceC1948
    /* JADX INFO: renamed from: ʽ */
    public final byte[] mo3501() {
        if (mo3502() != null) goto L5;
        return null;
    L5:
        return this.f4099;
    }

    @Override // p067.InterfaceC1948
    /* JADX INFO: renamed from: ⁱˊ */
    public final C1978 mo3502() {
        String r0 = this.f4101;
        r0.getClass();
        byte r2 = -1;
        switch(r0.hashCode()) {
            case -1468477611: goto L14;
            case -795945609: goto L10;
            case 1303648457: goto L6;
            default: goto L17;
        };
    L17:
        switch(r2) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L21;
            default: goto L18;
        };
    L18:
        return null;
    L21:
        return f4095;
    L23:
        return f4096;
    L6:
        if (r0.equals("https://developer.apple.com/streaming/emsg-id3") == false) goto L17;
        r2 = 2;
        goto L17
    L10:
        if (r0.equals("https://aomedia.org/emsg/ID3") == false) goto L17;
        r2 = 1;
        goto L17
    L14:
        if (r0.equals("urn:scte:scte35:2014:bin") == false) goto L17;
        r2 = 0;
        goto L17
    }

    @Override // p067.InterfaceC1948
    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ void mo3503(C1942 r1) {
    }
}
