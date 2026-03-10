package p034;

import p149.AbstractC2788;

/* JADX INFO: renamed from: ʼˊ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public class C1531 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static volatile C1531 f5071;

    static {
        C1531 r0 = new C1531();
        String r1 = System.getProperty("org.tukaani.xz.ArrayCache");
        if (r1 != null) goto L6;
        r1 = "Dummy";
    L6:
        if (r1.equals("Basic") == false) goto L8;
        f5071 = AbstractC1524.f5037;
        return;
    L8:
        if (r1.equals("Dummy") == false) goto L12;
        f5071 = r0;
        return;
    L12:
        throw new Error(AbstractC2788.m6089("Unsupported value '", r1, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void mo4098(byte[] r1) {
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public byte[] mo4099(int r1) {
        return new byte[r1];
    }
}
