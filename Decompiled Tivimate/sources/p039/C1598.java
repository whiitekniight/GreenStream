package p039;

import com.google.android.gms.internal.play_billing.AbstractC0542;
import com.google.android.gms.internal.play_billing.C0558;
import com.google.android.gms.internal.play_billing.EnumC0607;

/* JADX INFO: renamed from: ʼٴ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1598 {

    /* JADX INFO: renamed from: ʽ */
    public String f5308;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f5309;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f5310;

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1582 m4238() {
        C1582 r0 = new C1582();
        r0.f5232 = 0;
        r0.f5231 = "";
        return r0;
    }

    public final String toString() {
        int r0 = this.f5310;
        int r1 = AbstractC0542.f2330;
        C0558 r12 = EnumC0607.f2432;
        Integer r02 = Integer.valueOf(r0);
        if (r12.containsKey(r02) == true) goto L5;
        EnumC0607 r03 = EnumC0607.f2434;
    L7:
        return "Response Code: " + r03.toString() + ", Debug Message: " + this.f5308;
    L5:
        r03 = (EnumC0607) r12.get(r02);
        goto L7
    }
}
