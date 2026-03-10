package p191;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p022.AbstractC1327;
import p198.AbstractC3306;

/* JADX INFO: renamed from: ˋˋ.ʼـ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3156 {

    /* JADX INFO: renamed from: ـˏ */
    public static final List f11115 = null;

    /* JADX INFO: renamed from: ʼˈ */
    public AbstractC3210 f11116;

    /* JADX INFO: renamed from: ʽʽ */
    public int f11117;

    /* JADX INFO: renamed from: ʾˋ */
    public final View f11118;

    /* JADX INFO: renamed from: ˆﾞ */
    public int f11119;

    /* JADX INFO: renamed from: ˈʿ */
    public boolean f11120;

    /* JADX INFO: renamed from: ˈٴ */
    public int f11121;

    /* JADX INFO: renamed from: ˉٴ */
    public AbstractC3156 f11122;

    /* JADX INFO: renamed from: ˊʻ */
    public int f11123;

    /* JADX INFO: renamed from: ˊˋ */
    public RecyclerView f11124;

    /* JADX INFO: renamed from: ˋᵔ */
    public int f11125;

    /* JADX INFO: renamed from: ˑٴ */
    public int f11126;

    /* JADX INFO: renamed from: ٴʼ */
    public int f11127;

    /* JADX INFO: renamed from: ٴᵢ */
    public int f11128;

    /* JADX INFO: renamed from: ᴵˊ */
    public WeakReference f11129;

    /* JADX INFO: renamed from: ᴵᵔ */
    public long f11130;

    /* JADX INFO: renamed from: ᵎˊ */
    public ArrayList f11131;

    /* JADX INFO: renamed from: ᵎⁱ */
    public AbstractC3156 f11132;

    /* JADX INFO: renamed from: ᵔי */
    public List f11133;

    /* JADX INFO: renamed from: ᵔٴ */
    public C3149 f11134;

    static {
        f11115 = Collections.EMPTY_LIST;
    }

    public AbstractC3156(View r4) {
        this.f11117 = -1;
        this.f11121 = -1;
        this.f11130 = -1;
        this.f11123 = -1;
        this.f11128 = -1;
        this.f11122 = null;
        this.f11132 = null;
        this.f11131 = null;
        this.f11133 = null;
        this.f11119 = 0;
        this.f11134 = null;
        this.f11120 = false;
        this.f11126 = 0;
        this.f11125 = -1;
        if (r4 == null) goto L7;
        this.f11118 = r4;
        return;
    L7:
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final String toString() {
        if (getClass().isAnonymousClass() == false) goto L5;
        String r0 = "ViewHolder";
    L6:
        StringBuilder r02 = AbstractC1327.m3728(r0, "{");
        r02.append(Integer.toHexString(hashCode()));
        r02.append(" position=");
        r02.append(this.f11117);
        r02.append(" id=");
        r02.append(this.f11130);
        r02.append(", oldPos=");
        r02.append(this.f11121);
        r02.append(", pLpos:");
        r02.append(this.f11128);
        StringBuilder r1 = new StringBuilder(r02.toString());
        if (m6723() == false) goto L14;
        r1.append(" scrap ");
        if (this.f11120 == false) goto L11;
        String r03 = "[changeScrap]";
    L12:
        r1.append(r03);
        goto L14
    L11:
        r03 = "[attachedScrap]";
    L14:
        if (m6726() == false) goto L17;
        r1.append(" invalid");
    L17:
        if (m6724() == true) goto L20;
        r1.append(" unbound");
    L20:
        if ((this.f11127 & 2) == 0) goto L23;
        r1.append(" update");
    L23:
        if (m6718() == false) goto L26;
        r1.append(" removed");
    L26:
        if (m6727() == false) goto L29;
        r1.append(" ignored");
    L29:
        if (m6731() == false) goto L32;
        r1.append(" tmpDetached");
    L32:
        if (m6715() == true) goto L35;
        r1.append(" not recyclable(" + this.f11119 + ")");
    L35:
        if ((this.f11127 & 512) == 0) goto L37;
    L38:
        r1.append(" undefined adapter position");
    L40:
        if (this.f11118.getParent() != null) goto L42;
        r1.append(" no parent");
    L42:
        r1.append("}");
        return r1.toString();
    L37:
        if (m6726() == false) goto L40;
    L5:
        r0 = getClass().getSimpleName();
        goto L6
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final boolean m6715() {
        if ((this.f11127 & 16) != 0) goto L8;
        WeakHashMap r0 = AbstractC3306.f11545;
        if (this.f11118.hasTransientState() == true) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final void m6716(boolean r3) {
        int r1 = this.f11119;
        if (r3 == false) goto L5;
        int r12 = r1 - 1;
    L6:
        this.f11119 = r12;
        if (r12 >= 0) goto L13;
        this.f11119 = 0;
        if (RecyclerView.f1450 == true) goto L12;
        String r0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
    L20:
        if (RecyclerView.f1455 == false) goto L23;
        String r02 = "setIsRecyclable val:" + r3 + ":" + this;
        return;
    L23:
        return;
    L12:
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    L13:
        if (r3 == true) goto L16;
        if (r12 != 1) goto L16;
        this.f11127 |= 16;
    L16:
        if (r3 == false) goto L20;
        if (r12 != 0) goto L20;
        this.f11127 &= -17;
        goto L20
    L5:
        r12 = r1 + 1;
        goto L6
    }

    /* JADX INFO: renamed from: ʽ */
    public final int m6717() {
        if (this.f11116 != null) goto L5;
        return -1;
    L5:
        RecyclerView r0 = this.f11124;
        if (r0 != null) goto L8;
        return -1;
    L8:
        AbstractC3210 r02 = r0.getAdapter();
        if (r02 != null) goto L11;
        return -1;
    L11:
        int r2 = this.f11124.m977(this);
        if (r2 != (-1)) goto L15;
        return -1;
    L15:
        if (this.f11116 != r02) goto L17;
        return r2;
    L17:
        return -1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final boolean m6718() {
        if ((this.f11127 & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m6719() {
        int r0 = this.f11128;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return this.f11117;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final boolean m6720() {
        if ((this.f11127 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public final void m6721() {
        if (RecyclerView.f1450 == true) goto L5;
    L9:
        this.f11127 = 0;
        this.f11117 = -1;
        this.f11121 = -1;
        this.f11130 = -1;
        this.f11128 = -1;
        this.f11119 = 0;
        this.f11122 = null;
        this.f11132 = null;
        ArrayList r2 = this.f11131;
        if (r2 == null) goto L12;
        r2.clear();
    L12:
        this.f11127 &= -1025;
        this.f11126 = 0;
        this.f11125 = -1;
        RecyclerView.m929(this);
        return;
    L5:
        if (m6731() == false) goto L9;
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final List m6722() {
        if ((this.f11127 & 1024) != 0) goto L12;
        ArrayList r0 = this.f11131;
        if (r0 == null) goto L12;
        if (r0.size() == 0) goto L12;
        return this.f11133;
    L12:
        return f11115;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final boolean m6723() {
        if (this.f11134 == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean m6724() {
        if ((this.f11127 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m6725(int r3, boolean r4) {
        if (this.f11121 != (-1)) goto L6;
        this.f11121 = this.f11117;
    L6:
        if (this.f11128 != (-1)) goto L8;
        this.f11128 = this.f11117;
    L8:
        if (r4 == false) goto L10;
        this.f11128 += r3;
    L10:
        this.f11117 += r3;
        View r32 = this.f11118;
        if (r32.getLayoutParams() == null) goto L14;
        ((C3183) r32.getLayoutParams()).f11222 = true;
        return;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean m6726() {
        if ((this.f11127 & 4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final boolean m6727() {
        if ((this.f11127 & 128) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m6728() {
        RecyclerView r0 = this.f11124;
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.m977(this);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6729(int r2) {
        this.f11127 = r2 | this.f11127;
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public final boolean m6730() {
        if ((this.f11127 & 32) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final boolean m6731() {
        if ((this.f11127 & 256) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean m6732() {
        View r0 = this.f11118;
        if (r0.getParent() != null) goto L5;
        return false;
    L5:
        if (r0.getParent() == this.f11124) goto L10;
        return true;
    L10:
        return false;
    }
}
