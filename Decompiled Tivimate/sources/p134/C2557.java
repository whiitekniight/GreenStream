package p134;

import android.os.Build;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ˑʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C2557 {

    /* JADX INFO: renamed from: ʽ */
    public final long f9067;

    /* JADX INFO: renamed from: ˈ */
    public final long f9068;

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean f9069;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f9070;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f9071;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f9072;

    public C2557(int r4, int r5, long r6, long r8, boolean r10, int r11) {
        String r0 = Build.MODEL;
        String r1 = Build.MANUFACTURER;
        String r2 = Build.PRODUCT;
        this.f9071 = r4;
        if (r0 == null) goto L13;
        this.f9070 = r5;
        this.f9067 = r6;
        this.f9068 = r8;
        this.f9069 = r10;
        this.f9072 = r11;
        if (r1 == null) goto L11;
        if (r2 == null) goto L9;
        return;
    L9:
        throw new NullPointerException("Null modelClass");
    L11:
        throw new NullPointerException("Null manufacturer");
    L13:
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L5;
        return true;
    L5:
        if ((r5 instanceof C2557) == false) goto L26;
        C2557 r52 = (C2557) r5;
        if (this.f9071 != r52.f9071) goto L29;
        String r0 = Build.MODEL;
        if (r0.equals(r0) == true) goto L11;
        return false;
    L11:
        if (this.f9070 == r52.f9070) goto L13;
        return false;
    L13:
        if (this.f9067 == r52.f9067) goto L15;
        return false;
    L15:
        if (this.f9068 == r52.f9068) goto L17;
        return false;
    L17:
        if (this.f9069 == r52.f9069) goto L19;
        return false;
    L19:
        if (this.f9072 != r52.f9072) goto L35;
        String r53 = Build.MANUFACTURER;
        if (r53.equals(r53) == false) goto L36;
        String r54 = Build.PRODUCT;
        if (r54.equals(r54) == false) goto L37;
        return true;
    L37:
        return false;
    L36:
        return false;
    L35:
        return false;
    L29:
        return false;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((this.f9071 ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f9070) * 1000003;
        long r2 = this.f9067;
        int r02 = (r0 ^ ((int) (r2 ^ (r2 >>> 32)))) * 1000003;
        long r22 = this.f9068;
        int r03 = (r02 ^ ((int) (r22 ^ (r22 >>> 32)))) * 1000003;
        if (this.f9069 == false) goto L5;
        int r23 = 1231;
    L7:
        return ((((((r03 ^ r23) * 1000003) ^ this.f9072) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    L5:
        r23 = 1237;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("DeviceData{arch=");
        r0.append(this.f9071);
        r0.append(", model=");
        r0.append(Build.MODEL);
        r0.append(", availableProcessors=");
        r0.append(this.f9070);
        r0.append(", totalRam=");
        r0.append(this.f9067);
        r0.append(", diskSpace=");
        r0.append(this.f9068);
        r0.append(", isEmulator=");
        r0.append(this.f9069);
        r0.append(", state=");
        r0.append(this.f9072);
        r0.append(", manufacturer=");
        r0.append(Build.MANUFACTURER);
        r0.append(", modelClass=");
        return AbstractC1703.m4486(r0, Build.PRODUCT, "}");
    }
}
