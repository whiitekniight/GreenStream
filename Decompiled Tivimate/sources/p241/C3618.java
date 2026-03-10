package p241;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import ˋˋ.ᵎˊ;

/* JADX INFO: renamed from: ˑʼ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3618 implements Parcelable {
    public static final Parcelable.Creator<C3618> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final int[] f12920;

    /* JADX INFO: renamed from: ʾˋ */
    public final int[] f12921;

    /* JADX INFO: renamed from: ˆﾞ */
    public final ArrayList f12922;

    /* JADX INFO: renamed from: ˈٴ */
    public final int[] f12923;

    /* JADX INFO: renamed from: ˉٴ */
    public final int f12924;

    /* JADX INFO: renamed from: ˊʻ */
    public final String f12925;

    /* JADX INFO: renamed from: ٴʼ */
    public final int f12926;

    /* JADX INFO: renamed from: ٴᵢ */
    public final int f12927;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ArrayList f12928;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f12929;

    /* JADX INFO: renamed from: ᵎˊ */
    public final CharSequence f12930;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final CharSequence f12931;

    /* JADX INFO: renamed from: ᵔי */
    public final ArrayList f12932;

    /* JADX INFO: renamed from: ᵔٴ */
    public final boolean f12933;

    static {
        CREATOR = new ᵎˊ(4);
    }

    public C3618(Parcel r3) {
        this.f12921 = r3.createIntArray();
        this.f12928 = r3.createStringArrayList();
        this.f12920 = r3.createIntArray();
        this.f12923 = r3.createIntArray();
        this.f12929 = r3.readInt();
        this.f12925 = r3.readString();
        this.f12927 = r3.readInt();
        this.f12924 = r3.readInt();
        Parcelable.Creator r0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f12931 = (CharSequence) r0.createFromParcel(r3);
        this.f12926 = r3.readInt();
        this.f12930 = (CharSequence) r0.createFromParcel(r3);
        this.f12932 = r3.createStringArrayList();
        this.f12922 = r3.createStringArrayList();
        if (r3.readInt() == 0) goto L5;
        boolean r32 = true;
    L6:
        this.f12933 = r32;
        return;
    L5:
        r32 = false;
        goto L6
    }

    public C3618(C3620 r9) {
        int r0 = r9.f12953.size();
        this.f12921 = new int[r0 * 6];
        if (r9.f12948 == false) goto L14;
        this.f12928 = new ArrayList(r0);
        this.f12920 = new int[r0];
        this.f12923 = new int[r0];
        int r1 = 0;
        int r2 = 0;
    L5:
        if (r1 >= r0) goto L11;
        C3557 r3 = (C3557) r9.f12953.get(r1);
        int r5 = r2 + 1;
        this.f12921[r2] = r3.f12631;
        ArrayList r4 = this.f12928;
        AbstractComponentCallbacksC3606 r6 = r3.f12630;
        if (r6 == null) goto L9;
        String r62 = r6.f12871;
    L10:
        r4.add(r62);
        int[] r42 = this.f12921;
        r42[r5] = r3.f12625 ? 1 : 0;
        r42[r2 + 2] = r3.f12626;
        r42[r2 + 3] = r3.f12627;
        int r52 = r2 + 5;
        r42[r2 + 4] = r3.f12632;
        r2 = r2 + 6;
        r42[r52] = r3.f12628;
        this.f12920[r1] = r3.f12629.ordinal();
        this.f12923[r1] = r3.f12624.ordinal();
        r1 = r1 + 1;
        goto L5
    L9:
        r62 = null;
        goto L10
    L11:
        this.f12929 = r9.f12956;
        this.f12925 = r9.f12937;
        this.f12927 = r9.f12944;
        this.f12924 = r9.f12940;
        this.f12931 = r9.f12947;
        this.f12926 = r9.f12955;
        this.f12930 = r9.f12942;
        this.f12932 = r9.f12949;
        this.f12922 = r9.f12943;
        this.f12933 = r9.f12938;
        return;
    L14:
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeIntArray(this.f12921);
        r2.writeStringList(this.f12928);
        r2.writeIntArray(this.f12920);
        r2.writeIntArray(this.f12923);
        r2.writeInt(this.f12929);
        r2.writeString(this.f12925);
        r2.writeInt(this.f12927);
        r2.writeInt(this.f12924);
        TextUtils.writeToParcel(this.f12931, r2, 0);
        r2.writeInt(this.f12926);
        TextUtils.writeToParcel(this.f12930, r2, 0);
        r2.writeStringList(this.f12932);
        r2.writeStringList(this.f12922);
        r2.writeInt(this.f12933 ? 1 : 0);
    }
}
