package p320;

import java.util.Arrays;

/* JADX INFO: renamed from: ᐧٴ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C4245 extends AbstractC4251 {

    /* JADX INFO: renamed from: ʼˎ */
    public final AbstractC4250 f15574;

    /* JADX INFO: renamed from: ʽ */
    public final AbstractC4234 f15575;

    /* JADX INFO: renamed from: ˈ */
    public final long f15576;

    /* JADX INFO: renamed from: ˑﹳ */
    public final byte[] f15577;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final long f15578;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final AbstractC4252 f15579;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Integer f15580;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f15581;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f15582;

    public C4245(long r1, Integer r3, AbstractC4234 r4, long r5, byte[] r7, String r8, long r9, AbstractC4252 r11, AbstractC4250 r12) {
        this.f15581 = r1;
        this.f15580 = r3;
        this.f15575 = r4;
        this.f15576 = r5;
        this.f15577 = r7;
        this.f15582 = r8;
        this.f15578 = r9;
        this.f15579 = r11;
        this.f15574 = r12;
    }

    public final boolean equals(Object r13) {
        if (r13 != this) goto L6;
        return true;
    L6:
        if ((r13 instanceof AbstractC4251) == false) goto L50;
        AbstractC4251 r132 = (AbstractC4251) r13;
        C4245 r1 = (C4245) r132;
        AbstractC4250 r3 = r1.f15574;
        AbstractC4252 r4 = r1.f15579;
        String r5 = r1.f15582;
        AbstractC4234 r6 = r1.f15575;
        Integer r7 = r1.f15580;
        long r8 = r1.f15581;
        if (this.f15581 != r8) goto L50;
        Integer r82 = this.f15580;
        if (r82 != null) goto L14;
        if (r7 != null) goto L50;
    L15:
        AbstractC4234 r72 = this.f15575;
        if (r72 != null) goto L20;
        if (r6 != null) goto L50;
    L22:
        if (this.f15576 != r1.f15576) goto L50;
        if ((r132 instanceof C4245) == false) goto L26;
        byte[] r133 = ((C4245) r132).f15577;
    L28:
        if (Arrays.equals(this.f15577, r133) == false) goto L50;
        String r134 = this.f15582;
        if (r134 != null) goto L34;
        if (r5 != null) goto L50;
    L36:
        if (this.f15578 != r1.f15578) goto L50;
        AbstractC4252 r135 = this.f15579;
        if (r135 != null) goto L42;
        if (r4 != null) goto L50;
    L43:
        AbstractC4250 r136 = this.f15574;
        if (r136 != null) goto L48;
        if (r3 != null) goto L50;
    L49:
        return true;
    L48:
        if (r136.equals(r3) == false) goto L50;
    L42:
        if (r135.equals(r4) == false) goto L50;
    L34:
        if (r134.equals(r5) == false) goto L50;
    L26:
        r133 = r1.f15577;
        goto L28
    L20:
        if (r72.equals(r6) == false) goto L50;
    L14:
        if (r82.equals(r7) == true) goto L15;
    L50:
        return false;
    }

    public final int hashCode() {
        long r0 = this.f15581;
        int r02 = (((int) (r0 ^ (r0 >>> 32))) ^ 1000003) * 1000003;
        int r3 = 0;
        Integer r4 = this.f15580;
        if (r4 != null) goto L5;
        int r42 = 0;
    L6:
        int r03 = (r02 ^ r42) * 1000003;
        AbstractC4234 r43 = this.f15575;
        if (r43 != null) goto L9;
        int r44 = 0;
    L10:
        int r04 = (r03 ^ r44) * 1000003;
        long r45 = this.f15576;
        int r05 = (((r04 ^ ((int) (r45 ^ (r45 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f15577)) * 1000003;
        String r46 = this.f15582;
        if (r46 != null) goto L13;
        int r47 = 0;
    L14:
        int r06 = (r05 ^ r47) * 1000003;
        long r48 = this.f15578;
        int r07 = (r06 ^ ((int) (r48 ^ (r48 >>> 32)))) * 1000003;
        AbstractC4252 r2 = this.f15579;
        if (r2 != null) goto L17;
        int r22 = 0;
    L18:
        int r08 = (r07 ^ r22) * 1000003;
        AbstractC4250 r1 = this.f15574;
        if (r1 == null) goto L23;
        r3 = r1.hashCode();
    L23:
        return r08 ^ r3;
    L17:
        r22 = r2.hashCode();
        goto L18
    L13:
        r47 = r46.hashCode();
        goto L14
    L9:
        r44 = r43.hashCode();
        goto L10
    L5:
        r42 = r4.hashCode();
        goto L6
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f15581 + ", eventCode=" + this.f15580 + ", complianceData=" + this.f15575 + ", eventUptimeMs=" + this.f15576 + ", sourceExtension=" + Arrays.toString(this.f15577) + ", sourceExtensionJsonProto3=" + this.f15582 + ", timezoneOffsetSeconds=" + this.f15578 + ", networkConnectionInfo=" + this.f15579 + ", experimentIds=" + this.f15574 + "}";
    }
}
