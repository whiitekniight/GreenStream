package p223;

import p022.AbstractC1327;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ˎﾞ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3463 {

    /* JADX INFO: renamed from: ʽ */
    public final String f12323;

    /* JADX INFO: renamed from: ˈ */
    public final String f12324;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f12325;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f12326;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f12327;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f12328;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f12329;

    public C3463(String r1, int r2, String r3, String r4, long r5, long r7, String r9) {
        this.f12328 = r1;
        this.f12327 = r2;
        this.f12323 = r3;
        this.f12324 = r4;
        this.f12325 = r5;
        this.f12329 = r7;
        this.f12326 = r9;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof C3463) == false) goto L38;
        C3463 r62 = (C3463) r6;
        String r0 = r62.f12326;
        String r1 = r62.f12324;
        String r2 = r62.f12323;
        String r3 = r62.f12328;
        String r4 = this.f12328;
        if (r4 != null) goto L11;
        if (r3 == null) goto L13;
        return false;
    L13:
        if (AbstractC1327.m3732(this.f12327, r62.f12327) == false) goto L44;
        String r32 = this.f12323;
        if (r32 != null) goto L19;
        if (r2 != null) goto L45;
    L20:
        String r22 = this.f12324;
        if (r22 != null) goto L25;
        if (r1 == null) goto L27;
        return false;
    L27:
        if (this.f12325 == r62.f12325) goto L29;
        return false;
    L29:
        if (this.f12329 != r62.f12329) goto L50;
        String r63 = this.f12326;
        if (r63 != null) goto L35;
        if (r0 != null) goto L51;
        return true;
    L51:
        return false;
    L35:
        if (r63.equals(r0) == false) goto L52;
        return true;
    L52:
        return false;
    L50:
        return false;
    L25:
        if (r22.equals(r1) == true) goto L27;
        return false;
    L45:
        return false;
    L19:
        if (r32.equals(r2) == true) goto L20;
        return false;
    L44:
        return false;
    L11:
        if (r4.equals(r3) == true) goto L13;
        return false;
    L38:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f12328;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (((r12 ^ 1000003) * 1000003) ^ AbstractC1327.m3729(this.f12327)) * 1000003;
        String r3 = this.f12323;
        if (r3 != null) goto L9;
        int r32 = 0;
    L10:
        int r14 = (r13 ^ r32) * 1000003;
        String r33 = this.f12324;
        if (r33 != null) goto L13;
        int r34 = 0;
    L14:
        int r15 = (r14 ^ r34) * 1000003;
        long r35 = this.f12325;
        int r16 = (r15 ^ ((int) (r35 ^ (r35 >>> 32)))) * 1000003;
        long r36 = this.f12329;
        int r17 = (r16 ^ ((int) (r36 ^ (r36 >>> 32)))) * 1000003;
        String r2 = this.f12326;
        if (r2 == null) goto L19;
        r0 = r2.hashCode();
    L19:
        return r0 ^ r17;
    L13:
        r34 = r33.hashCode();
        goto L14
    L9:
        r32 = r3.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        r0.append(this.f12328);
        r0.append(", registrationStatus=");
        int r2 = this.f12327;
        if (r2 != 1) goto L5;
        String r1 = "ATTEMPT_MIGRATION";
    L18:
        r0.append(r1);
        r0.append(", authToken=");
        r0.append(this.f12323);
        r0.append(", refreshToken=");
        r0.append(this.f12324);
        r0.append(", expiresInSecs=");
        r0.append(this.f12325);
        r0.append(", tokenCreationEpochInSecs=");
        r0.append(this.f12329);
        r0.append(", fisError=");
        return AbstractC1703.m4486(r0, this.f12326, "}");
    L5:
        if (r2 != 2) goto L7;
        r1 = "NOT_GENERATED";
        goto L18
    L7:
        if (r2 != 3) goto L9;
        r1 = "UNREGISTERED";
        goto L18
    L9:
        if (r2 != 4) goto L11;
        r1 = "REGISTERED";
        goto L18
    L11:
        if (r2 == 5) goto L13;
        r1 = "null";
        goto L18
    L13:
        r1 = "REGISTER_ERROR";
        goto L18
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3464 m7218() {
        C3464 r0 = new C3464();
        r0.f12335 = this.f12328;
        r0.f12334 = this.f12327;
        r0.f12330 = this.f12323;
        r0.f12331 = this.f12324;
        r0.f12332 = Long.valueOf(this.f12325);
        r0.f12336 = Long.valueOf(this.f12329);
        r0.f12333 = this.f12326;
        return r0;
    }
}
