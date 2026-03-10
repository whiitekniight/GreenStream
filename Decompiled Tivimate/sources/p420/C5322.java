package p420;

import java.util.Hashtable;
import p020.InterfaceC1320;
import p366.AbstractC4817;

/* JADX INFO: renamed from: ﹳˉ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5322 implements InterfaceC1320 {

    /* JADX INFO: renamed from: ʽ */
    public final int f19084;

    /* JADX INFO: renamed from: ˈ */
    public AbstractC4817 f19085;

    /* JADX INFO: renamed from: ˑﹳ */
    public AbstractC4817 f19086;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final byte[] f19087;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f19088;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC4817 f19089;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final byte[] f19090;

    static {
        Hashtable r0 = new Hashtable();
        r0.put("GOST3411", 32);
        r0.put("MD2", 16);
        r0.put("MD4", 64);
        r0.put("MD5", 64);
        r0.put("RIPEMD128", 64);
        r0.put("RIPEMD160", 64);
        r0.put("SHA-1", 64);
        r0.put("SHA-224", 64);
        r0.put("SHA-256", 64);
        r0.put("SHA-384", 128);
        r0.put("SHA-512", 128);
        r0.put("Tiger", 64);
        r0.put("Whirlpool", 64);
    }

    public C5322(AbstractC4817 r3) {
        this.f19089 = r3;
        int r32 = r3.mo9481();
        this.f19088 = r32;
        this.f19084 = 64;
        this.f19090 = new byte[64];
        this.f19087 = new byte[64 + r32];
    }
}
