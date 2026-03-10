package p331;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p133.AbstractC2509;
import p241.C3608;
import p351.AbstractC4711;

/* JADX INFO: renamed from: ᴵˈ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4409 extends AbstractC4711 {
    public static final Parcelable.Creator<C4409> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final long f16136;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f16137;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f16138;

    static {
        CREATOR = new ٴﹶ(1);
    }

    public C4409() {
        this.f16137 = "CLIENT_TELEMETRY";
        this.f16136 = 1;
        this.f16138 = -1;
    }

    public C4409(long r1, String r3, int r4) {
        this.f16137 = r3;
        this.f16138 = r4;
        this.f16136 = r1;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof C4409) == false) goto L14;
        C4409 r72 = (C4409) r7;
        String r0 = r72.f16137;
        String r2 = this.f16137;
        if (r2 != null) goto L7;
    L8:
        if (r2 != null) goto L14;
        if (r0 != null) goto L14;
    L11:
        if (m8807() != r72.m8807()) goto L14;
        return true;
    L7:
        if (r2.equals(r0) == true) goto L11;
    L14:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16137, Long.valueOf(m8807())});
    }

    public final String toString() {
        C3608 r0 = new C3608(this);
        r0.m7558(this.f16137, "name");
        r0.m7558(Long.valueOf(m8807()), "version");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r62 = AbstractC2509.m5769(r5, 20293);
        AbstractC2509.m5765(r5, 1, this.f16137);
        AbstractC2509.m5756(r5, 2, 4);
        r5.writeInt(this.f16138);
        long r0 = m8807();
        AbstractC2509.m5756(r5, 3, 8);
        r5.writeLong(r0);
        AbstractC2509.m5758(r5, r62);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final long m8807() {
        long r2 = this.f16136;
        if (r2 == (-1)) goto L5;
        return r2;
    L5:
        return this.f16138;
    }
}
