package p023;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.ﹳٴ;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: ʻᐧ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1334 extends C1362 {
    public static final Parcelable.Creator<C1334> CREATOR = null;

    /* JADX INFO: renamed from: ʾˋ */
    public HashSet f4588;

    static {
        CREATOR = new ﹳٴ(14);
    }

    public C1334() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public C1334(Parcel r3) {
        super(r3);
        int r0 = r3.readInt();
        this.f4588 = new HashSet();
        String[] r02 = new String[r0];
        r3.readStringArray(r02);
        Collections.addAll(this.f4588, r02);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeInt(this.f4588.size());
        HashSet r32 = this.f4588;
        r2.writeStringArray((String[]) r32.toArray(new String[r32.size()]));
    }
}
