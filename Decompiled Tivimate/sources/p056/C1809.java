package p056;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p051.C1771;
import p335.AbstractC4468;

/* JADX INFO: renamed from: ʽˊ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 extends AbstractC4468 {
    public static final Parcelable.Creator<C1809> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public CharSequence f6049;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f6050;

    static {
        CREATOR = new C1771(1);
    }

    public C1809(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f6049 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r1);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f6050 = r22;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f6049 + "}";
    }

    @Override // p335.AbstractC4468, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        TextUtils.writeToParcel(this.f6049, r2, r3);
        r2.writeInt(this.f6050 ? 1 : 0);
    }
}
