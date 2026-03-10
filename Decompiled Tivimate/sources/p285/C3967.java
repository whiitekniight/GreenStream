package p285;

import com.google.android.gms.internal.play_billing.י;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p289.InterfaceC4018;
import p342.EnumC4633;
import p416.AbstractC5287;

/* JADX INFO: renamed from: ـᵔ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3967 implements InterfaceC4018 {

    /* JADX INFO: renamed from: ʽ */
    public final byte[] f14615;

    /* JADX INFO: renamed from: ⁱˊ */
    public final EnumC4633 f14616;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC4018 f14617;

    public C3967(InterfaceC4018 r1, EnumC4633 r2, byte[] r3) {
        this.f14617 = r1;
        this.f14616 = r2;
        this.f14615 = r3;
    }

    @Override // p289.InterfaceC4018
    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] mo7258(byte[] r4, byte[] r5) {
        EnumC4633 r0 = this.f14616;
        EnumC4633 r1 = EnumC4633.f16523;
        InterfaceC4018 r2 = this.f14617;
        if (r0 != r1) goto L7;
        return r2.mo7258(r4, r5);
    L7:
        if (AbstractC5287.m10317(this.f14615, r4) == false) goto L11;
        return r2.mo7258(Arrays.copyOfRange(r4, 5, r4.length), r5);
    L11:
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // p289.InterfaceC4018
    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] mo7259(byte[] r4, byte[] r5) {
        EnumC4633 r0 = this.f14616;
        EnumC4633 r1 = EnumC4633.f16523;
        InterfaceC4018 r2 = this.f14617;
        if (r0 != r1) goto L7;
        return r2.mo7259(r4, r5);
    L7:
        return י.ﾞʻ(new byte[][]{this.f14615, r2.mo7259(r4, r5)});
    }
}
