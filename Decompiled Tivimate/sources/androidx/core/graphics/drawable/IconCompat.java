package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p040.AbstractC1599;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: ٴﹶ */
    public static final PorterDuff.Mode f308 = null;

    /* JADX INFO: renamed from: ʼˎ */
    public String f309;

    /* JADX INFO: renamed from: ʽ */
    public byte[] f310;

    /* JADX INFO: renamed from: ˆʾ */
    public String f311;

    /* JADX INFO: renamed from: ˈ */
    public Parcelable f312;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f313;

    /* JADX INFO: renamed from: ᵎﹶ */
    public ColorStateList f314;

    /* JADX INFO: renamed from: ᵔᵢ */
    public PorterDuff.Mode f315;

    /* JADX INFO: renamed from: ⁱˊ */
    public Object f316;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f317;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f318;

    static {
        f308 = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.f317 = -1;
        this.f310 = null;
        this.f312 = null;
        this.f313 = 0;
        this.f318 = 0;
        this.f314 = null;
        this.f315 = f308;
        this.f309 = null;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static IconCompat m117(int r3) {
        if (r3 == 0) goto L6;
        IconCompat r0 = new IconCompat();
        r0.f310 = null;
        r0.f312 = null;
        r0.f318 = 0;
        r0.f314 = null;
        r0.f315 = f308;
        r0.f309 = null;
        r0.f317 = 2;
        r0.f313 = r3;
        r0.f316 = "";
        r0.f311 = "";
        return r0;
    L6:
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final String toString() {
        if (this.f317 == (-1)) goto L5;
        StringBuilder r0 = new StringBuilder("Icon(typ=");
        switch(this.f317) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            default: goto L8;
        };
    L8:
        String r1 = "UNKNOWN";
    L15:
        r0.append(r1);
        switch(this.f317) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L23;
            case 6: goto L18;
            default: goto L25;
        };
    L18:
        r0.append(" uri=");
        r0.append(this.f316);
        goto L25
    L19:
        r0.append(" len=");
        r0.append(this.f313);
        if (this.f318 == 0) goto L25;
        r0.append(" off=");
        r0.append(this.f318);
        goto L25
    L22:
        r0.append(" pkg=");
        r0.append(this.f311);
        r0.append(" id=");
        r0.append(String.format("0x%08x", new Object[]{Integer.valueOf(m119())}));
        goto L25
    L23:
        r0.append(" size=");
        r0.append(((Bitmap) this.f316).getWidth());
        r0.append("x");
        r0.append(((Bitmap) this.f316).getHeight());
    L25:
        if (this.f314 == null) goto L28;
        r0.append(" tint=");
        r0.append(this.f314);
    L28:
        if (this.f315 == f308) goto L30;
        r0.append(" mode=");
        r0.append(this.f315);
    L30:
        r0.append(")");
        return r0.toString();
    L9:
        r1 = "URI_MASKABLE";
        goto L15
    L10:
        r1 = "BITMAP_MASKABLE";
        goto L15
    L11:
        r1 = "URI";
        goto L15
    L12:
        r1 = "DATA";
        goto L15
    L13:
        r1 = "RESOURCE";
        goto L15
    L14:
        r1 = "BITMAP";
        goto L15
    L5:
        return String.valueOf(this.f316);
    }

    /* JADX INFO: renamed from: ʽ */
    public final Uri m118() {
        int r0 = this.f317;
        if (r0 != (-1)) goto L22;
        int r02 = Build.VERSION.SDK_INT;
        Object r1 = this.f316;
        if (r02 < 28) goto L30;
        return AbstractC1599.m4249(r1);
    L30:
        return (Uri) r1.getClass().getMethod("getUri", null).invoke(r1, null);
    L20:
        return null;
    L22:
        if (r0 == 4) goto L29;
        if (r0 == 6) goto L29;
        throw new IllegalStateException("called getUri() on " + this);
    L29:
        return Uri.parse((String) this.f316);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m119() {
        int r0 = this.f317;
        if (r0 != (-1)) goto L22;
        int r02 = Build.VERSION.SDK_INT;
        Object r1 = this.f316;
        if (r02 >= 28) goto L7;
        return ((Integer) r1.getClass().getMethod("getResId", null).invoke(r1, null)).intValue();
    L19:
        return 0;
    L7:
        return AbstractC1599.m4246(r1);
    L22:
        if (r0 != 2) goto L26;
        return this.f313;
    L26:
        throw new IllegalStateException("called getResId() on " + this);
    }
}
