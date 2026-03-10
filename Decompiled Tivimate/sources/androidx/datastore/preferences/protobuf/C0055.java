package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.AbstractC0002;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p047.AbstractC1703;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public class C0055 implements Iterable, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final C0055 f480 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final C0036 f481 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public int f482;

    /* JADX INFO: renamed from: ᴵˊ */
    public final byte[] f483;

    static {
        f480 = new C0055(AbstractC0014.f388);
        if (AbstractC0010.m215() == false) goto L5;
        C0036 r0 = new C0036(1);
    L6:
        f481 = r0;
        return;
    L5:
        r0 = new C0036(0);
        goto L6
    }

    public C0055(byte[] r2) {
        this.f482 = 0;
        r2.getClass();
        this.f483 = r2;
    }

    /* JADX INFO: renamed from: ˈ */
    public static C0055 m353(byte[] r3, int r4, int r5) {
        m354(r4, r4 + r5, r3.length);
        switch(f481.f429) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
    L7:
        return new C0055(r1);
    L5:
        r1 = Arrays.copyOfRange(r3, r4, r5 + r4);
        goto L7
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m354(int r3, int r4, int r5) {
        int r0 = r4 - r3;
        if ((((r3 | r4) | r0) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L11;
        if (r4 >= r3) goto L9;
        throw new IndexOutOfBoundsException(AbstractC0002.m14(r3, r4, "Beginning index larger than ending index: ", ", "));
    L9:
        throw new IndexOutOfBoundsException(AbstractC0002.m14(r4, r5, "End index: ", " >= "));
    L11:
        throw new IndexOutOfBoundsException(AbstractC1703.m4484(r3, "Beginning index: ", " < 0"));
    L12:
        return r0;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof C0055) == true) goto L8;
        return false;
    L8:
        if (size() == ((C0055) r6).size()) goto L11;
        return false;
    L11:
        if (size() != 0) goto L14;
        return true;
    L14:
        if ((r6 instanceof C0055) == false) goto L38;
        C0055 r62 = (C0055) r6;
        int r0 = this.f482;
        int r1 = r62.f482;
        if (r0 == 0) goto L20;
        if (r1 == 0) goto L20;
        if (r0 == r1) goto L20;
        return false;
    L20:
        int r02 = size();
        if (r02 > r62.size()) goto L36;
        if (r02 > r62.size()) goto L33;
        byte[] r12 = r62.f483;
        int r2 = mo358() + r02;
        int r03 = mo358();
        int r63 = r62.mo358();
    L25:
        if (r03 >= r2) goto L45;
        if (this.f483[r03] != r12[r63]) goto L43;
        r03 = r03 + 1;
        r63 = r63 + 1;
        goto L25
    L43:
        return false;
    L45:
        return true;
    L33:
        StringBuilder r04 = AbstractC0002.m16(r02, "Ran off end of other: 0, ", ", ");
        r04.append(r62.size());
        throw new IllegalArgumentException(r04.toString());
    L36:
        throw new IllegalArgumentException("Length too large: " + r02 + size());
    L38:
        return r6.equals(this);
    }

    public final int hashCode() {
        int r0 = this.f482;
        if (r0 != 0) goto L12;
        int r02 = size();
        int r1 = mo358();
        int r3 = r02;
        int r2 = r1;
    L6:
        if (r2 >= (r1 + r02)) goto L8;
        r3 = (r3 * 31) + this.f483[r2];
        r2 = r2 + 1;
        goto L6
    L8:
        if (r3 != 0) goto L10;
        r3 = 1;
    L10:
        this.f482 = r3;
        return r3;
    L12:
        return r0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0019(this);
    }

    public int size() {
        return this.f483.length;
    }

    public final String toString() {
        Locale r0 = Locale.ROOT;
        String r02 = Integer.toHexString(System.identityHashCode(this));
        int r1 = size();
        if (size() > 50) goto L5;
        String r2 = com.bumptech.glide.ʽ.ˈ(this);
    L10:
        StringBuilder r3 = new StringBuilder("<ByteString@");
        r3.append(r02);
        r3.append(" size=");
        r3.append(r1);
        r3.append(" contents=\"");
        return AbstractC1703.m4486(r3, r2, "\">");
    L5:
        StringBuilder r22 = new StringBuilder();
        int r32 = m354(0, 47, size());
        if (r32 != 0) goto L8;
        C0055 r33 = f480;
    L9:
        r22.append(com.bumptech.glide.ʽ.ˈ(r33));
        r22.append("...");
        r2 = r22.toString();
        goto L10
    L8:
        r33 = new C0069(this.f483, mo358(), r32);
        goto L9
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public void mo355(int r3, byte[] r4) {
        System.arraycopy(this.f483, 0, r4, 0, r3);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public byte mo356(int r2) {
        return this.f483[r2];
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public byte mo357(int r2) {
        return this.f483[r2];
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public int mo358() {
        return 0;
    }
}
