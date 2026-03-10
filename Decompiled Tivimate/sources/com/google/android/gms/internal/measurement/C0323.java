package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0323 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ int f1980 = 0;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f1981;

    static {
    }

    public C0323(int r1) {
        this.f1981 = r1;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L6;
        return true;
    L6:
        if ((r3 instanceof C0323) == false) goto L13;
        int r32 = ((C0323) r3).f1981;
        int r1 = this.f1981;
        if (r1 == 0) goto L12;
        if (r1 != r32) goto L15;
        return true;
    L15:
        return false;
    L12:
        throw null;
    L13:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f1981;
        if (r0 == 0) goto L7;
        return ((r0 ^ (-485106924)) * 583896283) ^ 1;
    L7:
        throw null;
    }

    public final String toString() {
        int r0 = this.f1981;
        if (r0 != 1) goto L5;
        String r02 = "ALL_CHECKS";
    L15:
        int r2 = "".length() + 73;
        int r3 = (r02.length() + r2) + 91;
        StringBuilder r32 = new StringBuilder(("READ_AND_WRITE".length() + r3) + 1);
        r32.append("FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=");
        r32.append(r02);
        r32.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        r32.append("READ_AND_WRITE");
        r32.append("}");
        return r32.toString();
    L5:
        if (r0 != 2) goto L7;
        r02 = "SKIP_COMPLIANCE_CHECK";
        goto L15
    L7:
        if (r0 != 3) goto L9;
        r02 = "SKIP_SECURITY_CHECK";
        goto L15
    L9:
        if (r0 == 4) goto L11;
        r02 = "null";
        goto L15
    L11:
        r02 = "NO_CHECKS";
        goto L15
    }
}
