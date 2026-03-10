package p441;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: renamed from: ﹶˆ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C5572 implements InterfaceC5574 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f20123;

    /* JADX INFO: renamed from: ᴵˊ */
    public final InterfaceC5566 f20124;

    public /* synthetic */ C5572(InterfaceC5566 r1, int r2) {
        this.f20123 = r2;
        this.f20124 = r1;
    }

    @Override // p441.InterfaceC5574
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo10708(String r8) {
        switch(this.f20123) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        String[] r0 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r3 >= 3) goto L11;
        Provider r4 = Security.getProvider(r0[r3]);
        if (r4 == null) goto L10;
        r1.add(r4);
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        int r02 = r1.size();
        Exception r32 = null;
    L12:
        if (r2 >= r02) goto L20;
        Object r42 = r1.get(r2);
        r2 = r2 + 1;
        return this.f20124.mo9717(r8, (Provider) r42);
    L16:
        e = move-exception;
        if (r32 != null) goto L12;
        r32 = e;
        goto L12
    L20:
        throw new GeneralSecurityException("No good Provider found.", r32);
    L21:
        String[] r03 = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList r12 = new ArrayList();
        int r22 = 0;
        int r33 = 0;
    L23:
        if (r33 >= 2) goto L28;
        Provider r43 = Security.getProvider(r03[r33]);
        if (r43 == null) goto L27;
        r12.add(r43);
    L27:
        r33 = r33 + 1;
        goto L23
    L28:
        int r04 = r12.size();
        Exception r44 = null;
    L29:
        InterfaceC5566 r5 = this.f20124;
        if (r22 >= r04) goto L38;
        Object r6 = r12.get(r22);
        r22 = r22 + 1;
        return r5.mo9717(r8, (Provider) r6);
    L34:
        e = move-exception;
        if (r44 != null) goto L29;
        r44 = e;
        goto L29
    L38:
        return r5.mo9717(r8, null);
    }
}
