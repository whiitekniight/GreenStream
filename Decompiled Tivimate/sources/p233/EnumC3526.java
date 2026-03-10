package p233;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ˏᐧ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3526 extends Enum implements Executor {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ EnumC3526[] f12527 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC3526 f12528 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final Handler f12529 = null;

    static {
        EnumC3526 r0 = new EnumC3526("INSTANCE", 0);
        f12528 = r0;
        f12527 = new EnumC3526[]{r0};
        f12529 = new Handler(Looper.getMainLooper());
    }

    public static EnumC3526 valueOf(String r1) {
        return (EnumC3526) Enum.valueOf(EnumC3526.class, r1);
    }

    public static EnumC3526[] values() {
        return (EnumC3526[]) f12527.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        f12529.post(r2);
    }
}
