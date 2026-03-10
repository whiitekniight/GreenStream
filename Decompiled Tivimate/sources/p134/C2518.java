package p134;

import p241.C3608;

/* JADX INFO: renamed from: ˈˋ.ʻˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C2518 {

    /* JADX INFO: renamed from: ʽ */
    public final String f8889;

    /* JADX INFO: renamed from: ˈ */
    public final String f8890;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f8891;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8892;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f8893;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final C3608 f8894;

    public C2518(String r1, String r2, String r3, String r4, int r5, C3608 r6) {
        if (r1 == null) goto L19;
        this.f8893 = r1;
        if (r2 == null) goto L17;
        this.f8892 = r2;
        if (r3 == null) goto L15;
        this.f8889 = r3;
        if (r4 == null) goto L13;
        this.f8890 = r4;
        this.f8891 = r5;
        this.f8894 = r6;
        return;
    L13:
        throw new NullPointerException("Null installUuid");
    L15:
        throw new NullPointerException("Null versionName");
    L17:
        throw new NullPointerException("Null versionCode");
    L19:
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof C2518) == false) goto L20;
        C2518 r32 = (C2518) r3;
        if (this.f8893.equals(r32.f8893) == true) goto L9;
        return false;
    L9:
        if (this.f8892.equals(r32.f8892) == true) goto L11;
        return false;
    L11:
        if (this.f8889.equals(r32.f8889) == true) goto L13;
        return false;
    L13:
        if (this.f8890.equals(r32.f8890) == true) goto L15;
        return false;
    L15:
        if (this.f8891 == r32.f8891) goto L17;
        return false;
    L17:
        if (this.f8894.equals(r32.f8894) == false) goto L28;
        return true;
    L28:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f8893.hashCode() ^ 1000003) * 1000003) ^ this.f8892.hashCode()) * 1000003) ^ this.f8889.hashCode()) * 1000003) ^ this.f8890.hashCode()) * 1000003) ^ this.f8891) * 1000003) ^ this.f8894.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8893 + ", versionCode=" + this.f8892 + ", versionName=" + this.f8889 + ", installUuid=" + this.f8890 + ", deliveryMechanism=" + this.f8891 + ", developmentPlatformProvider=" + this.f8894 + "}";
    }
}
