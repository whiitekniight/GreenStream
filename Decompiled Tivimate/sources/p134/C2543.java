package p134;

import java.util.List;

/* JADX INFO: renamed from: ˈˋ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2543 extends AbstractC2566 {

    /* JADX INFO: renamed from: ʼˎ */
    public final List f9011;

    /* JADX INFO: renamed from: ʽ */
    public final int f9012;

    /* JADX INFO: renamed from: ˈ */
    public final int f9013;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f9014;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final long f9015;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final String f9016;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9017;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f9018;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f9019;

    public C2543(int r1, String r2, int r3, int r4, long r5, long r7, long r9, String r11, List r12) {
        this.f9018 = r1;
        this.f9017 = r2;
        this.f9012 = r3;
        this.f9013 = r4;
        this.f9014 = r5;
        this.f9019 = r7;
        this.f9015 = r9;
        this.f9016 = r11;
        this.f9011 = r12;
    }

    public final boolean equals(Object r9) {
        if (r9 != this) goto L6;
        return true;
    L6:
        if ((r9 instanceof AbstractC2566) == false) goto L34;
        C2543 r92 = (C2543) ((AbstractC2566) r9);
        List r1 = r92.f9011;
        String r3 = r92.f9016;
        int r4 = r92.f9018;
        if (this.f9018 != r4) goto L34;
        if (this.f9017.equals(r92.f9017) == false) goto L34;
        if (this.f9012 != r92.f9012) goto L34;
        if (this.f9013 != r92.f9013) goto L34;
        if (this.f9014 != r92.f9014) goto L34;
        if (this.f9019 != r92.f9019) goto L34;
        if (this.f9015 != r92.f9015) goto L34;
        String r93 = this.f9016;
        if (r93 != null) goto L26;
        if (r3 != null) goto L34;
    L27:
        List r94 = this.f9011;
        if (r94 != null) goto L32;
        if (r1 != null) goto L34;
    L33:
        return true;
    L32:
        if (r94.equals(r1) == false) goto L34;
    L26:
        if (r93.equals(r3) == true) goto L27;
    L34:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((((this.f9018 ^ 1000003) * 1000003) ^ this.f9017.hashCode()) * 1000003) ^ this.f9012) * 1000003) ^ this.f9013) * 1000003;
        long r2 = this.f9014;
        int r02 = (r0 ^ ((int) (r2 ^ (r2 >>> 32)))) * 1000003;
        long r22 = this.f9019;
        int r03 = (r02 ^ ((int) (r22 ^ (r22 >>> 32)))) * 1000003;
        long r23 = this.f9015;
        int r04 = (r03 ^ ((int) (r23 ^ (r23 >>> 32)))) * 1000003;
        int r24 = 0;
        String r3 = this.f9016;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r05 = (r04 ^ r32) * 1000003;
        List r1 = this.f9011;
        if (r1 == null) goto L11;
        r24 = r1.hashCode();
    L11:
        return r05 ^ r24;
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f9018 + ", processName=" + this.f9017 + ", reasonCode=" + this.f9012 + ", importance=" + this.f9013 + ", pss=" + this.f9014 + ", rss=" + this.f9019 + ", timestamp=" + this.f9015 + ", traceFile=" + this.f9016 + ", buildIdMappingForArch=" + this.f9011 + "}";
    }
}
