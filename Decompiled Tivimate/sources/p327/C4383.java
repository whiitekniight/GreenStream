package p327;

import java.util.Map;
import p164.AbstractC2935;
import p341.InterfaceC4589;

/* JADX INFO: renamed from: ᴵʼ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4383 extends AbstractC2935 implements InterfaceC4589 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C4383 f16106 = null;

    static {
        f16106 = new C4383(1);
    }

    @Override // p341.InterfaceC4589
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo4555(Object r8) {
        Map.Entry r82 = (Map.Entry) r8;
        Object r0 = r82.getValue();
        if ((r0 instanceof byte[]) == false) goto L11;
        byte[] r02 = (byte[]) r0;
        StringBuilder r1 = new StringBuilder();
        r1.append("[");
        int r2 = r02.length;
        int r3 = 0;
        int r4 = 0;
    L5:
        if (r3 >= r2) goto L10;
        byte r5 = r02[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L9;
        r1.append(", ");
    L9:
        r1.append(String.valueOf(r5));
        r3 = r3 + 1;
        goto L5
    L10:
        r1.append("]");
        String r03 = r1.toString();
    L13:
        return "  " + ((C4379) r82.getKey()).f16101 + " = " + r03;
    L11:
        r03 = String.valueOf(r82.getValue());
        goto L13
    }
}
