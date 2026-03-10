package p320;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᐧٴ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C4243 extends AbstractC4242 {

    /* JADX INFO: renamed from: ʽ */
    public final C4254 f15565;

    /* JADX INFO: renamed from: ˈ */
    public final Integer f15566;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f15567;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f15568;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f15569;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final ArrayList f15570;

    public C4243(long r2, long r4, C4254 r6, Integer r7, String r8, ArrayList r9) {
        EnumC4247 r0 = EnumC4247.f15583;
        this.f15569 = r2;
        this.f15568 = r4;
        this.f15565 = r6;
        this.f15566 = r7;
        this.f15567 = r8;
        this.f15570 = r9;
    }

    public final boolean equals(Object r10) {
        if (r10 != this) goto L5;
        return true;
    L5:
        if ((r10 instanceof AbstractC4242) == false) goto L30;
        C4243 r102 = (C4243) ((AbstractC4242) r10);
        Object r0 = EnumC4247.f15583;
        ArrayList r1 = r102.f15570;
        String r2 = r102.f15567;
        Integer r3 = r102.f15566;
        C4254 r4 = r102.f15565;
        long r5 = r102.f15569;
        if (this.f15569 == r5) goto L9;
        return false;
    L9:
        if (this.f15568 == r102.f15568) goto L11;
        return false;
    L11:
        if (this.f15565.equals(r4) == false) goto L35;
        Integer r103 = this.f15566;
        if (r103 != null) goto L17;
        if (r3 != null) goto L36;
    L18:
        String r104 = this.f15567;
        if (r104 != null) goto L23;
        if (r2 == null) goto L25;
        return false;
    L25:
        if (this.f15570.equals(r1) == true) goto L27;
        return false;
    L27:
        if (r0.equals(r0) == false) goto L41;
        return true;
    L41:
        return false;
    L23:
        if (r104.equals(r2) == true) goto L25;
        return false;
    L36:
        return false;
    L17:
        if (r103.equals(r3) == true) goto L18;
        return false;
    L35:
        return false;
    L30:
        return false;
    }

    public final int hashCode() {
        long r0 = this.f15569;
        long r3 = this.f15568;
        int r02 = (((((((int) (r0 ^ (r0 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (r3 ^ (r3 >>> 32)))) * 1000003) ^ this.f15565.hashCode()) * 1000003;
        int r2 = 0;
        Integer r32 = this.f15566;
        if (r32 != null) goto L5;
        int r33 = 0;
    L6:
        int r03 = (r02 ^ r33) * 1000003;
        String r34 = this.f15567;
        if (r34 == null) goto L11;
        r2 = r34.hashCode();
    L11:
        return ((((r03 ^ r2) * 1000003) ^ this.f15570.hashCode()) * 1000003) ^ EnumC4247.f15583.hashCode();
    L5:
        r33 = r32.hashCode();
        goto L6
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f15569 + ", requestUptimeMs=" + this.f15568 + ", clientInfo=" + this.f15565 + ", logSource=" + this.f15566 + ", logSourceName=" + this.f15567 + ", logEvents=" + this.f15570 + ", qosTier=" + EnumC4247.f15583 + "}";
    }
}
