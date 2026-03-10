package p278;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p005j$.util.DesugarCollections;
import p047.AbstractC1703;
import p067.AbstractC1932;
import p265.C3796;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ـˊ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3939 {

    /* JADX INFO: renamed from: ʽ */
    public final byte[] f14513;

    /* JADX INFO: renamed from: ˈ */
    public final Map f14514;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f14515;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f14516;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final int f14517;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f14518;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Uri f14519;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f14520;

    static {
        AbstractC1932.m4952("media3.datasource");
    }

    public C3939(Uri r6, int r7, byte[] r8, Map r9, long r10, long r12, String r14, int r15) {
        boolean r3 = false;
        if (r10 < 0) goto L5;
        boolean r2 = true;
    L6:
        AbstractC4214.m8560(r2);
        if (r10 < 0) goto L9;
        boolean r22 = true;
    L10:
        AbstractC4214.m8560(r22);
        if (r12 <= 0) goto L13;
    L14:
        r3 = true;
    L15:
        AbstractC4214.m8560(r3);
        r6.getClass();
        this.f14519 = r6;
        this.f14518 = r7;
        if (r8 != null) goto L18;
    L20:
        r8 = null;
    L21:
        this.f14513 = r8;
        this.f14514 = DesugarCollections.unmodifiableMap(new HashMap(r9));
        this.f14515 = r10;
        this.f14520 = r12;
        this.f14516 = r14;
        this.f14517 = r15;
        return;
    L18:
        if (r8.length == 0) goto L20;
    L13:
        if (r12 != (-1)) goto L15;
    L9:
        r22 = false;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static String m8073(int r1) {
        if (r1 != 1) goto L5;
        return "GET";
    L5:
        if (r1 != 2) goto L7;
        return "POST";
    L7:
        if (r1 != 3) goto L11;
        return "HEAD";
    L11:
        throw new IllegalStateException();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("DataSpec[");
        r0.append(m8073(this.f14518));
        r0.append(" ");
        r0.append(this.f14519);
        r0.append(", ");
        r0.append(this.f14515);
        r0.append(", ");
        r0.append(this.f14520);
        r0.append(", ");
        r0.append(this.f14516);
        r0.append(", ");
        return AbstractC1703.m4493(r0, this.f14517, "]");
    }

    /* JADX INFO: renamed from: ʽ */
    public final C3939 m8074(long r17) {
        long r1 = this.f14520;
        long r3 = -1;
        if (r1 != (-1)) goto L5;
    L4:
        long r12 = r3;
        if (r17 == 0) goto L9;
    L11:
        long r10 = this.f14515 + r17;
        String r14 = this.f14516;
        int r15 = this.f14517;
        return new C3939(this.f14519, this.f14518, this.f14513, this.f14514, r10, r12, r14, r15);
    L9:
        if (r1 != r12) goto L11;
        return this;
    L5:
        r3 = r1 - r17;
        goto L4
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3796 m8075() {
        C3796 r0 = new C3796();
        r0.f13687 = this.f14519;
        r0.f13691 = this.f14518;
        r0.f13692 = this.f14513;
        r0.f13688 = this.f14514;
        r0.f13690 = this.f14515;
        r0.f13685 = this.f14520;
        r0.f13689 = this.f14516;
        r0.f13686 = this.f14517;
        return r0;
    }
}
