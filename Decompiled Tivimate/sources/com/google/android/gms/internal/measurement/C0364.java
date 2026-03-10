package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0019;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p047.AbstractC1703;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˎˏ */
/* JADX INFO: loaded from: classes.dex */
public class C0364 implements Iterable, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final C0364 f2031 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public int f2032;

    /* JADX INFO: renamed from: ᴵˊ */
    public final byte[] f2033;

    static {
        f2031 = new C0364(AbstractC0405.f2147);
        int r0 = AbstractC0242.f1739;
    }

    public C0364(byte[] r2) {
        this.f2032 = 0;
        r2.getClass();
        this.f2033 = r2;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static C0364 m1742(byte[] r3, int r4, int r5) {
        m1743(r4, r4 + r5, r3.length);
        byte[] r1 = new byte[r5];
        System.arraycopy(r3, r4, r1, 0, r5);
        return new C0364(r1);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static int m1743(int r3, int r4, int r5) {
        int r1 = r4 - r3;
        if ((((r3 | r4) | r1) | (r5 - r4)) >= 0) goto L12;
        if (r3 < 0) goto L10;
        if (r4 >= r3) goto L8;
        int r0 = String.valueOf(r3).length();
        StringBuilder r2 = new StringBuilder((r0 + 44) + String.valueOf(r4).length());
        r2.append("Beginning index larger than ending index: ");
        r2.append(r3);
        r2.append(", ");
        r2.append(r4);
        throw new IndexOutOfBoundsException(r2.toString());
    L8:
        int r02 = String.valueOf(r4).length();
        StringBuilder r22 = new StringBuilder((r02 + 15) + String.valueOf(r5).length());
        r22.append("End index: ");
        r22.append(r4);
        r22.append(" >= ");
        r22.append(r5);
        throw new IndexOutOfBoundsException(r22.toString());
    L10:
        StringBuilder r03 = new StringBuilder(String.valueOf(r3).length() + 21);
        r03.append("Beginning index: ");
        r03.append(r3);
        r03.append(" < 0");
        throw new IndexOutOfBoundsException(r03.toString());
    L12:
        return r1;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L5;
        return true;
    L5:
        if ((r7 instanceof C0364) == true) goto L8;
    L27:
        return false;
    L8:
        if (mo1293() != ((C0364) r7).mo1293()) goto L27;
        if (mo1293() != 0) goto L14;
        return true;
    L14:
        if ((r7 instanceof C0364) == false) goto L36;
        C0364 r72 = (C0364) r7;
        int r0 = this.f2032;
        int r2 = r72.f2032;
        if (r0 == 0) goto L19;
        if (r2 == 0) goto L19;
        if (r0 != r2) goto L27;
    L19:
        int r02 = mo1293();
        if (r02 <= r72.mo1293()) goto L22;
        int r1 = mo1293();
        StringBuilder r4 = new StringBuilder((String.valueOf(r02).length() + 18) + String.valueOf(r1).length());
        r4.append("Length too large: ");
        r4.append(r02);
        r4.append(r1);
        throw new IllegalArgumentException(r4.toString());
    L22:
        if (r02 > r72.mo1293()) goto L31;
        byte[] r73 = r72.f2033;
        int r22 = 0;
        int r3 = 0;
    L24:
        if (r22 >= r02) goto L40;
        if (this.f2033[r22] != r73[r3]) goto L27;
        r22 = r22 + 1;
        r3 = r3 + 1;
        goto L24
    L40:
        return true;
    L31:
        int r74 = r72.mo1293();
        StringBuilder r42 = new StringBuilder((String.valueOf(r02).length() + 27) + String.valueOf(r74).length());
        r42.append("Ran off end of other: 0, ");
        r42.append(r02);
        r42.append(", ");
        r42.append(r74);
        throw new IllegalArgumentException(r42.toString());
    L36:
        return r7.equals(this);
    }

    public final int hashCode() {
        int r0 = this.f2032;
        if (r0 != 0) goto L11;
        int r02 = mo1293();
        int r1 = 0;
        int r2 = r02;
    L5:
        if (r1 >= r02) goto L7;
        r2 = (r2 * 31) + this.f2033[r1];
        r1 = r1 + 1;
        goto L5
    L7:
        if (r2 != 0) goto L9;
        r2 = 1;
    L9:
        this.f2032 = r2;
        return r2;
    L11:
        return r0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0019(this);
    }

    public final String toString() {
        Locale r0 = Locale.ROOT;
        String r02 = Integer.toHexString(System.identityHashCode(this));
        int r1 = mo1293();
        if (mo1293() > 50) goto L5;
        String r2 = android.support.v4.media.session.ⁱˊ.ʼʼ(this);
    L10:
        StringBuilder r3 = new StringBuilder("<ByteString@");
        r3.append(r02);
        r3.append(" size=");
        r3.append(r1);
        r3.append(" contents=\"");
        return AbstractC1703.m4486(r3, r2, "\">");
    L5:
        int r22 = m1743(0, 47, mo1293());
        if (r22 != 0) goto L8;
        C0364 r23 = f2031;
    L9:
        r2 = android.support.v4.media.session.ⁱˊ.ʼʼ(r23).concat("...");
        goto L10
    L8:
        r23 = new C0270(r22, this.f2033);
        goto L9
    }

    /* JADX INFO: renamed from: ˈ */
    public int mo1293() {
        return this.f2033.length;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public byte mo1294(int r2) {
        return this.f2033[r2];
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public byte mo1295(int r2) {
        return this.f2033[r2];
    }
}
