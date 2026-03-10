package p107;

import com.google.android.gms.internal.play_billing.ʽﹳ;
import com.google.android.gms.internal.play_billing.י;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p022.AbstractC1327;
import ﹳי.ʽ;

/* JADX INFO: renamed from: ˆʽ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2361 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final CharSequence f8459;

    /* JADX INFO: renamed from: ʾˋ */
    public int f8460;

    /* JADX INFO: renamed from: ˈٴ */
    public final AbstractC2369 f8461;

    /* JADX INFO: renamed from: ˊʻ */
    public int f8462;

    /* JADX INFO: renamed from: ٴᵢ */
    public final /* synthetic */ ʽ f8463;

    /* JADX INFO: renamed from: ᴵˊ */
    public String f8464;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f8465;

    public C2361(ʽ r1, ʽﹳ r2, CharSequence r3) {
        this.f8463 = r1;
        this.f8460 = 2;
        this.f8465 = 0;
        this.f8461 = (AbstractC2369) r2.ʽʽ;
        this.f8462 = r2.ᴵˊ;
        this.f8459 = r3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.f8460;
        if (r0 == 4) goto L53;
        int r02 = AbstractC1327.m3729(r0);
        if (r02 != 0) goto L7;
        return true;
    L7:
        if (r02 == 2) goto L49;
        this.f8460 = 4;
        int r03 = this.f8465;
    L9:
        int r1 = this.f8465;
        if (r1 == (-1)) goto L44;
        C2360 r5 = (C2360) this.f8463.ʾˋ;
        CharSequence r6 = this.f8459;
        int r7 = r6.length();
        י.ʼˎ(r1, r7);
    L12:
        if (r1 >= r7) goto L17;
        if (r5.mo5525(r6.charAt(r1)) == true) goto L18;
        r1 = r1 + 1;
    L18:
        if (r1 != (-1)) goto L20;
        r1 = r6.length();
        this.f8465 = -1;
    L21:
        int r52 = this.f8465;
        if (r52 != r03) goto L26;
        int r53 = r52 + 1;
        this.f8465 = r53;
        if (r53 <= r6.length()) goto L9;
        this.f8465 = -1;
    L26:
        AbstractC2369 r54 = this.f8461;
        if (r03 >= r1) goto L31;
        if (r54.mo5525(r6.charAt(r03)) == false) goto L31;
        r03 = r03 + 1;
    L31:
        if (r1 <= r03) goto L35;
        if (r54.mo5525(r6.charAt(r1 - 1)) == false) goto L35;
        r1 = r1 - 1;
    L35:
        int r72 = this.f8462;
        if (r72 != 1) goto L42;
        r1 = r6.length();
        this.f8465 = -1;
    L38:
        if (r1 <= r03) goto L43;
        if (r54.mo5525(r6.charAt(r1 - 1)) == false) goto L43;
        r1 = r1 - 1;
    L43:
        String r04 = r6.subSequence(r03, r1).toString();
    L45:
        this.f8464 = r04;
        if (this.f8460 == 3) goto L69;
        this.f8460 = 1;
        return true;
    L69:
        return false;
    L42:
        this.f8462 = r72 - 1;
        goto L43
    L20:
        this.f8465 = r1 + 1;
        goto L21
    L17:
        r1 = -1;
        goto L18
    L44:
        this.f8460 = 3;
        r04 = null;
        goto L45
    L49:
        return false;
    L53:
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.f8460 = 2;
        String r0 = this.f8464;
        this.f8464 = null;
        return r0;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
