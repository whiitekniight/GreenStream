package p315;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᐧˊ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4190 extends Enum {

    /* JADX INFO: renamed from: ʽʽ */
    public static final EnumC4190 f15399 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public static final EnumC4190 f15400 = null;

    /* JADX INFO: renamed from: ˉٴ */
    public static final /* synthetic */ EnumC4190[] f15401 = null;

    /* JADX INFO: renamed from: ˊʻ */
    public static final EnumC4190 f15402 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final EnumC4190 f15403 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final EnumC4190 f15404 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final EnumC4190 f15405 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final TimeUnit f15406;

    static {
        EnumC4190 r0 = new EnumC4190("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f15404 = r0;
        EnumC4190 r1 = new EnumC4190("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC4190 r2 = new EnumC4190("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f15399 = r2;
        EnumC4190 r4 = new EnumC4190("SECONDS", 3, TimeUnit.SECONDS);
        f15400 = r4;
        EnumC4190 r6 = new EnumC4190("MINUTES", 4, TimeUnit.MINUTES);
        f15405 = r6;
        EnumC4190 r8 = new EnumC4190("HOURS", 5, TimeUnit.HOURS);
        f15402 = r8;
        EnumC4190 r10 = new EnumC4190("DAYS", 6, TimeUnit.DAYS);
        f15403 = r10;
        f15401 = new EnumC4190[]{r0, r1, r2, r4, r6, r8, r10};
    }

    EnumC4190(String r1, int r2, TimeUnit r3) {
        this.f15406 = r3;
    }

    public static EnumC4190 valueOf(String r1) {
        return (EnumC4190) Enum.valueOf(EnumC4190.class, r1);
    }

    public static EnumC4190[] values() {
        return (EnumC4190[]) f15401.clone();
    }
}
