package p257;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p083.C2114;
import p289.AbstractC4011;

/* JADX INFO: renamed from: יʻ.ʾˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C3742 extends AbstractC3769 {

    /* JADX INFO: renamed from: ˈٴ */
    public final C3759 f13480;

    /* JADX INFO: renamed from: ˊʻ */
    public final Integer f13481;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final C2114 f13482;

    public C3742(C3759 r1, C2114 r2, Integer r3) {
        this.f13480 = r1;
        this.f13482 = r2;
        this.f13481 = r3;
    }

    /* JADX INFO: renamed from: ٴᵢ */
    public static C3742 m7793(C3759 r2, Integer r3) {
        C3744 r0 = r2.f13571;
        if (r0 != C3744.f13505) goto L9;
        if (r3 == null) goto L7;
        C2114 r02 = C2114.m5123(ByteBuffer.allocate(5).put((byte) 1).putInt(r3.intValue()).array());
    L13:
        return new C3742(r2, r02, r3);
    L7:
        throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
    L9:
        if (r0 != C3744.f13494) goto L17;
        if (r3 != null) goto L15;
        r02 = C2114.m5123(new byte[0]);
        goto L13
    L15:
        throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    L17:
        throw new GeneralSecurityException("Unknown Variant: " + r0);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final AbstractC4011 m7794() {
        return this.f13480;
    }

    @Override // p257.AbstractC3769
    /* JADX INFO: renamed from: ˊʻ */
    public final C2114 mo7792() {
        return this.f13482;
    }
}
