package p029;

import com.google.android.gms.internal.play_billing.י;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ʼʻ.ˑٴ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1458 extends Enum implements Iterator {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1458 f4880 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1458[] f4881 = null;

    static {
        EnumC1458 r0 = new EnumC1458("INSTANCE", 0);
        f4880 = r0;
        f4881 = new EnumC1458[]{r0};
    }

    public static EnumC1458 valueOf(String r1) {
        return (EnumC1458) Enum.valueOf(EnumC1458.class, r1);
    }

    public static EnumC1458[] values() {
        return (EnumC1458[]) f4881.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        י.ٴﹶ("no calls to next() since the last call to remove()", false);
    }
}
