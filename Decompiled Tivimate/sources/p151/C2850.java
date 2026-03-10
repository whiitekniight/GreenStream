package p151;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ʼי.ﹳٴ;

/* JADX INFO: renamed from: ˉˋ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2850 {

    /* JADX INFO: renamed from: ʼˎ */
    public final byte[] f10081;

    /* JADX INFO: renamed from: ʽ */
    public final C2853 f10082;

    /* JADX INFO: renamed from: ˆʾ */
    public final byte[] f10083;

    /* JADX INFO: renamed from: ˈ */
    public final long f10084;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f10085;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Integer f10086;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final String f10087;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Integer f10088;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f10089;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Map f10090;

    public C2850(String r1, Integer r2, C2853 r3, long r4, long r6, HashMap r8, Integer r9, String r10, byte[] r11, byte[] r12) {
        this.f10089 = r1;
        this.f10088 = r2;
        this.f10082 = r3;
        this.f10084 = r4;
        this.f10085 = r6;
        this.f10090 = r8;
        this.f10086 = r9;
        this.f10087 = r10;
        this.f10081 = r11;
        this.f10083 = r12;
    }

    public final boolean equals(Object r9) {
        if (r9 != this) goto L6;
        return true;
    L6:
        if ((r9 instanceof C2850) == false) goto L40;
        C2850 r92 = (C2850) r9;
        String r1 = r92.f10087;
        Integer r3 = r92.f10086;
        Integer r4 = r92.f10088;
        if (this.f10089.equals(r92.f10089) == false) goto L40;
        Integer r5 = this.f10088;
        if (r5 != null) goto L14;
        if (r4 != null) goto L40;
    L16:
        if (this.f10082.equals(r92.f10082) == false) goto L40;
        if (this.f10084 != r92.f10084) goto L40;
        if (this.f10085 != r92.f10085) goto L40;
        if (this.f10090.equals(r92.f10090) == false) goto L40;
        Integer r42 = this.f10086;
        if (r42 != null) goto L28;
        if (r3 != null) goto L40;
    L29:
        String r32 = this.f10087;
        if (r32 != null) goto L34;
        if (r1 != null) goto L40;
    L36:
        if (Arrays.equals(this.f10081, r92.f10081) == false) goto L40;
        if (Arrays.equals(this.f10083, r92.f10083) == false) goto L40;
        return true;
    L34:
        if (r32.equals(r1) == false) goto L40;
    L28:
        if (r42.equals(r3) == false) goto L40;
    L14:
        if (r5.equals(r4) == true) goto L16;
    L40:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f10089.hashCode() ^ 1000003) * 1000003;
        int r2 = 0;
        Integer r3 = this.f10088;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r02 = (((r0 ^ r32) * 1000003) ^ this.f10082.hashCode()) * 1000003;
        long r33 = this.f10084;
        int r03 = (r02 ^ ((int) (r33 ^ (r33 >>> 32)))) * 1000003;
        long r34 = this.f10085;
        int r04 = (((r03 ^ ((int) (r34 ^ (r34 >>> 32)))) * 1000003) ^ this.f10090.hashCode()) * 1000003;
        Integer r35 = this.f10086;
        if (r35 != null) goto L9;
        int r36 = 0;
    L10:
        int r05 = (r04 ^ r36) * 1000003;
        String r37 = this.f10087;
        if (r37 == null) goto L15;
        r2 = r37.hashCode();
    L15:
        return ((((r05 ^ r2) * 1000003) ^ Arrays.hashCode(this.f10081)) * 1000003) ^ Arrays.hashCode(this.f10083);
    L9:
        r36 = r35.hashCode();
        goto L10
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f10089 + ", code=" + this.f10088 + ", encodedPayload=" + this.f10082 + ", eventMillis=" + this.f10084 + ", uptimeMillis=" + this.f10085 + ", autoMetadata=" + this.f10090 + ", productId=" + this.f10086 + ", pseudonymousId=" + this.f10087 + ", experimentIdsClear=" + Arrays.toString(this.f10081) + ", experimentIdsEncrypted=" + Arrays.toString(this.f10083) + "}";
    }

    /* JADX INFO: renamed from: ʽ */
    public final ﹳٴ m6158() {
        ﹳٴ r0 = new ﹳٴ();
        String r1 = this.f10089;
        if (r1 == null) goto L11;
        r0.ʽ = r1;
        r0.ﹳٴ = this.f10088;
        r0.ⁱˊ = this.f10086;
        r0.ᵔᵢ = this.f10087;
        r0.ʼˎ = this.f10081;
        r0.ˆʾ = this.f10083;
        C2853 r12 = this.f10082;
        if (r12 == null) goto L9;
        r0.ˈ = r12;
        r0.ˑﹳ = Long.valueOf(this.f10084);
        r0.ﾞᴵ = Long.valueOf(this.f10085);
        r0.ᵎﹶ = new HashMap(this.f10090);
        return r0;
    L9:
        throw new NullPointerException("Null encodedPayload");
    L11:
        throw new NullPointerException("Null transportName");
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m6159(String r2) {
        String r22 = (String) this.f10090.get(r2);
        if (r22 != null) goto L7;
        return 0;
    L7:
        return Integer.valueOf(r22).intValue();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final String m6160(String r2) {
        String r22 = (String) this.f10090.get(r2);
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}
